import java.util.Scanner;

public class Main {
	static int X;
	static int m=-1;
	static int a=100;
	static boolean n=true;
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		X=sc.nextInt();
		while(X>=a) {
			m=m+1;
			a=a/100+a;
		}
		System.out.println(m);
	}
}
