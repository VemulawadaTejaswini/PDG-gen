package Videoshop;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args){

    }
}

//ビデオクラス
class Video{
    /** 新作値段 */
    private int newVideoPrice = 0;
    /** 新作本数 */
    private int newVideoCount = 0;
    /** 準新作値段 */
    private int normalVideoPrice = 0;
    /** 準新作本数 */
    private int normalVideoCount = 0;
    /** 旧作 */
    private int oldVideoPrice = 0;
    /** 旧作本数 */
    private int oldVideoCount = 0;

    /** セット料金を適用したとき一本あたりの値段 */
    int setPrice = 0;
    /** セット料金が適用されるときの最低本数 */
    int setCount = 0;

    /** コンストラクタ */
    Video(int newvp,int norvp,int oldvp,int newvn,int norvn,int oldvn,int sP,int sC){
        newVideoPrice = newvp;
        normalVideoPrice = norvp;
        oldVideoPrice = oldvp;
        newVideoCount = newvn;
        normalVideoCount = norvn;
        oldVideoCount = oldvn;
        setPrice = sP;
        setCount = sC;
    }

    /**
     * 借りられたビデオの種類、本数から、最適な本数にセット料金を適応する
     * @param video
     */
    public void judgeSetCase(){

        //新作の料金だけがセット料金より高い場合


    }


    /** ゲッター */
    public int getNewVideoPrice(){
    	return newVideoPrice;
    }
    public int getNewVideoCount(){
    	return newVideoCount;
    }
    public int getNormalVideoPrice(){
    	return normalVideoPrice;
    }
    public int getNormalVideoCount(){
    	return normalVideoCount;
    }
    public int getOldVideoPrice(){
    	return oldVideoPrice;
    }
    public int getOldVideoCount(){
    	return oldVideoCount;
    }

}