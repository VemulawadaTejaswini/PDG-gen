import java.util.Scanner;
import java.math.*;

public class Main {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		//int a = sc.nextInt();
		// スペース区切りの整数の入力
		//int b = sc.nextInt();
		//int c = sc.nextInt();
		// 文字列の入力
		//String s = sc.next();
		//1文字ずつ
		//s.atChar(i);
		// 出力
		//System.out.println("");
		//double countx=0;
		//int T=sc.nextInt();
		String s = sc.next();
		String t = sc.next();
		int leng =s.length();
		
		for(int i=0;i<leng;i++){
			if(s.equals(t)){
				System.out.println("Yes");
				
				System.exit(0);
			}
			
			String a=t.substring(leng-1,leng);
			//System.out.println("a:"+a);
			String b=t.substring(0, leng-1);
			//System.out.println("b:"+b);
			t=a+b;
			//System.out.println(t.length());
			//System.out.println(t);
		}
		System.out.println("No");
		//System.out.println(t.charAt(0));
		
	}
}