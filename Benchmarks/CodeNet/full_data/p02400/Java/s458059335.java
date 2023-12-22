import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		double a;
		double b;

		a = 2 * 3.14159265359 * x;
		b = 3.14159265359 * x * x;

		System.out.printf("%.6f %.6f", b, a);
	}
}