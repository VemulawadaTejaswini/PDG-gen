import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		// 入力
		Scanner sc = new Scanner(System.in);
		String atcoder = sc.next();
		String S = sc.next();
		String contest = sc.next();
		
		// 略称を決定
		String ryaku = "A" + getPos(S, 0) + "C";
		
		// 出力
		System.out.println(ryaku);
	}

	// 文字列のx文字目を取得する関数
	public static String getPos(String str, int pos){
		return String.valueOf(str.charAt(pos));
	}

}
