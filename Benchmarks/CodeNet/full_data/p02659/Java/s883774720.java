import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long n =sc.nextLong();
		long f = (long)Math.floor(100*sc.nextDouble());
		long temp = n*f;
		System.out.println((long)temp/100);
	}
}