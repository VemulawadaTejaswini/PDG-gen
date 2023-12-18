import java.util.Scanner;

public class Main{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		long a=sc.nextLong();	//a以上
		long b=sc.nextLong();	//b以下
		long x=sc.nextLong();	//xで割り切れる

		long num=0;	//求める個数

		if(a%x==0) num=(b/x)-(a/x)+1;
		else num=(b/x)-(a/x);

		//答えを出力
		System.out.println(num);
	}
} 