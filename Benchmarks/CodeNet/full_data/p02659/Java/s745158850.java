import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long n =sc.nextLong();
		double f= sc.nextDouble();
		long f2=(long)(f*100);
		long temp=(long)n*f2;
		System.out.println((long)(temp/100));
	}
}
