import java.util.Scanner;

public class Main {
	public static void main(final String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = n / 500;
		int b = n % 500 / 5;
		long r = a * 1000 + b * 5;
		System.out.println(r);
	}
}
