import java.util.*;
import java.io.*;


public class Main{
	public static void main(String[] args) throws Exception{
		//入力
		String[][] in_data=input();
		

		String A[]=new String[2];
		for(int k=0;k<=in_data.length-1;k++){
		//出力	
			A[0]=in_data[k][0];
			A[1]=in_data[k][1];	
			outPut(A);
		}
	}
	//入力inut関数を用意a
	public static String[][] input() throws Exception{
		
		int s=0;
		String str="";
		String text="";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while((str=br.readLine())!=null){
		        text=text+str+"\n";
			s=s+1;
			}
		
		String[] tempArray=text.split("\n");

		String twoArray[][]=new String[s][1];
		for(int k=0;k<=s-1;k++){
			twoArray[k]=tempArray[k].split(" ");	
		}
		return twoArray;
	}
	
	//出力処理関数
	public static void outPut(String[] data) throws Exception{
	
	//描写クラスからインスタンス化
		Draw rec=new Draw();
		rec.draw(data,"frame");
	}


}

class Draw{
	public void draw(String[] drawArray, String type) throws Exception{
		String mark="";
		String mark2="";
		int W;
		int H;
		int i=1;
		int j=1;
		int k=1;
		
		H=Integer.parseInt(drawArray[0]);
		W=Integer.parseInt(drawArray[1]);

		if(W==0 && H==0){
			
		}else{
			if(type=="rec"){
		
				while(j<=W){
					mark=mark+"#";
					j=j+1;}
				while(i<=H){
					System.out.println(mark);
					i=i+1;}
			System.out.println("");

			}else if(type=="frame"){
				while(j<=W){
					mark=mark+"#";
					j=j+1;	
				}
				while(k<=W-2){
					mark2=mark2+".";
					k=k+1;	
				}
				while(i<=H){
					if (i==1 || i==H){
					System.out.println(mark);
					i=i+1;
					}else{
					System.out.println("#"+mark2+"#");
					i=i+1;
					}
				}
			System.out.println("");
			}
		}
	}


}
