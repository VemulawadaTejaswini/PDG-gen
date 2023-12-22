import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long n =sc.nextLong();
		double f = sc.nextDouble();
		System.out.println((long)Math.floor(f*n));
	}
}