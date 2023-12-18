import java.util.Scanner;

public class Main{

	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);

		long a=sc.nextLong();
		long b=sc.nextLong();
		long c=sc.nextLong();
		long d=sc.nextLong();

		long cc=b/c-(a-1)/c; //cで割り切れるもの
		long dd=b/d-(a-1)/d; //dで割り切れるもの
		long abcd=b/lcm(c,d)-(a-1)/lcm(c,d); //cとdで割り切れるもの
		System.out.println(b-a+1-cc-dd+abcd);
	}

	public static long lcm(long a,long b){
		long c=a*b;
		long temp;
		while((temp=a%b)!=0){
			a=b;
			b=temp;
		}
		return c/b;
	}
}
