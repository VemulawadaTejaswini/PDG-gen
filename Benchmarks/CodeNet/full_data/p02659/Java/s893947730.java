import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		long a = scan.nextLong();
		double b = scan.nextDouble() + 0.001;

		System.out.println((double)a);
		System.out.println(a * b);

		System.out.println((long)(a * b));
	}
}
