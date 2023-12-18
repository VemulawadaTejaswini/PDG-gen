import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n=sc.nextInt();
		int[] a=new int[n];
		int sum=0;
		int x=0;
		for(int i=0;i<n;i++)
		a[i] = sc.nextInt();
		for(int k=0;k<n+1;k++){
		    sum=k+3;
		    x=sum%1000000007;
		    System.out.println(x);
		}
		// スペース区切りの整数の入力
		//int b = sc.nextInt();
		//int c = sc.nextInt();
		// 文字列の入力
	//	String s = sc.next();
		// 出力
	//	System.out.println((a+b+c) + " " + s);
	}
}
