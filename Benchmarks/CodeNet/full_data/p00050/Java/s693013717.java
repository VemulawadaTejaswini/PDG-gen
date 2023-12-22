//the cost of one peach is higher than that of one apple.等と入力したとき、
//apple.がappleと判定出来ていない

import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		String text = stdIn.nextLine();
		String[] textArray = text.split(" ");
		String appleIndex = "";
		String peachIndex = "";

		//textArrayの中で、appleとpeachの格納されているインデックスを取得する
		for(int i = 0;i < textArray.length; i++){
			if(textArray[i].equals("apple")){
				appleIndex += i + " ";
			}else if(textArray[i].equals("peach")){
				peachIndex += i + " ";
			}
		}
		String[] appleIndexArray = appleIndex.split(" ");
		String[] peachIndexArray = peachIndex.split(" ");
		for(String i:appleIndexArray){
			if(i.equals(""))break;
			textArray[Integer.valueOf(i)] = "peach";
		}
		for(String i:peachIndexArray){
			if(i.equals(""))break;
			textArray[Integer.valueOf(i)] = "apple";
		}
		for(int i = 0;i < textArray.length; i++){
			if(i == textArray.length -1){
				System.out.print(textArray[i] +".");
			}else{
				System.out.print(textArray[i] + " ");
			}
		}
	}
}