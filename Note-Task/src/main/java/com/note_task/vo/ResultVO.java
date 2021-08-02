package com.note_task.vo;

import com.note_task.model.HotelIn;

public class ResultVO extends HotelIn {

    private int state;

    private String msg;

    public ResultVO() {
    }

    public ResultVO(int state, String msg) {
        this.state = state;
        this.msg = msg;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
