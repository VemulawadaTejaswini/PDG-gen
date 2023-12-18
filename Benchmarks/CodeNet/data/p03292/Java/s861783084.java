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
		//s.charAt(i); for String
		// 出力
		//System.out.println("");
		//int count=0;
		int count=0;
		int A1=sc.nextInt();
		int A2=sc.nextInt();
		int A3=sc.nextInt();
	
	
		int sum1=Math.abs(A1-A2)+Math.abs(A2-A3);//1
		int sum2=Math.abs(A1-A3)+Math.abs(A3-A2);//2
		int sum3=Math.abs(A2-A1)+Math.abs(A1-A3);//3
		
		if(sum1<sum2){
			if(sum3<sum1){
				System.out.println(sum3);
			}else{
				System.out.println(sum1);
			}
		}else{
			if(sum3<sum2){
				System.out.println(sum3);
			}else{
				System.out.println(sum2);
			}
		}
		
		//int sum4=Math.abs(A2-A3)+Math.abs(A3-A1);
		//int sum5=Math.abs(A3-A1)+Math.abs(A1-A2);
		//int sum6=Math.abs(A3-A2)+Math.abs(A2-A1);
	}
	
}
	