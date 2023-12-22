import java.util.Scanner;

public class Main {
	static long X;
	static int m=0;
	static long a=100;
	static boolean n=true;
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		X=sc.nextLong();
		while(X>a) {
			m=m+1;
			a=a/100+a;
		}
		System.out.println(m);
	}
}
