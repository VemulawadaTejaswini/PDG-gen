import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		sc.close();

		double v = a + b + 2 * (Math.sqrt(a * b));
		if (v < c) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}
}
