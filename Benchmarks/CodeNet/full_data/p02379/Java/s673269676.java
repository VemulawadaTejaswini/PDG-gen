package Rental_DVD_Shop;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args){
		
	}
}

//ビデオクラス
class Video{
	//新作値段
	int newVideoPrice = 0;
	//新作本数
	int newVideoNumber = 0;
	//準新作値段
	int normalVideoPrice = 0;
	//準新作本数
	int normalVideoNumber = 0;
	//旧作
	int oldVideoPrice = 0;
	//旧作本数
	int oldVideoNumber = 0;
	
	//コンストラクタ
	Video(int newvp,int norvp,int oldvp,int newvn,int norvn,int oldvn){
		newVideoPrice = newvp;
		normalVideoPrice = norvp;
		oldVideoPrice = oldvp;
		newVideoNumber = newvn;
		normalVideoNumber = norvn;
		oldVideoNumber = oldvn;
	}
}

//セットに関するクラス
class SetCount{
	//セット料金を適用したとき一本あたりの値段
	int setPrice = 0;
	//セット料金が適用されるときの最低本数
	int setNumber = 0;
	
	//コンストラクタ
	SetCount(int p,int n){
		//料金
		setPrice = p;
		setNumber = n;
	}
	
	//借りられたビデオの種類、本数から、最適な本数にセット料金を適応する
	public void judgeSetCase(ArrayList<Video> video){
		
		//新作の料金だけがセット料金より高い場合
		if
		
	}
	
	
}