import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		double a;
		double b;

		a = 2 * 3.1415926 * x;
		b = 3.1415926 * x * x;

		System.out.printf("%.6f %.6f", a, b);

	}
}