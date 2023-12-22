import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long n =sc.nextLong();
		int f = (int)Math.floor((double)500*sc.nextDouble());
		long temp = n*f;
		temp/=(long)500;
		System.out.println(temp);
	}
}
