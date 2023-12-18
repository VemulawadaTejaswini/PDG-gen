import java.util.Scanner;

public class Main {
	static int X;
	static int m=0;
	static int a=100;
	static boolean n=true;
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		X=sc.nextInt();
		while(X<=a) {
			m++;
			a=a/100+a;
		}
}
}
