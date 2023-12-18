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
		int A1=sc.nextInt();
		int A2=sc.nextInt();
		int A3=sc.nextInt();
	
		int sum1=Math.abs(A1-A2)+Math.abs(A2-A3);
		int sum2=Math.abs(A1-A3)+Math.abs(A3-A2);
		
		if(sum1>=sum2){
			System.out.println(sum2);
		}else{
			System.out.println(sum1);
		}
		
	}
}