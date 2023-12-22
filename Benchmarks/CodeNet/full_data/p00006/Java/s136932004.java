import java.io.*;

class Main{
public static void main(String[] args)
			throws java.io.IOException{
		reverse();

		// TODO 自動生成されたメソッド・スタブ
		
	}
	
	public static void reverse()throws IOException{
		BufferedReader input =
	            new BufferedReader (new InputStreamReader (System.in));
		String str = input.readLine();
		String[] strs =str.split("\\B"); //文字列を文字単位に分割
		String restr="";

		for(int i=(strs.length) - 1;i>=0;i--){
			restr+=strs[i]; //逆順に再結合
		}
		System.out.println( restr);

	}}