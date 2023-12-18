import java.util.Scanner;
import java.util.*;

public class Main{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		String s = sc.next();	//入力された文字列
		StringBuilder sb = new StringBuilder();	//sbを用意

		//キーによって挿入される文字を変化
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)=='0') sb.append("0");
			else if(s.charAt(i)=='1') sb.append("1");
			else if(s.charAt(i)=='B'){
				//sbに要素が入っている時だけ文字をdelete
				if(sb.length()!=0) sb.deleteCharAt(sb.length()-1);
			}
		}
		
		//結果を出力
		System.out.println(sb.toString());
	}
} 