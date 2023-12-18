import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double a = scanner.nextInt();
		double b = scanner.nextInt();
		double c = scanner.nextInt();

		double x = c - a - b;
		double y = 0;

		if (x < 0) {
			System.out.println("No");
		} else {
			y = x * x / 4 - a * b;
			if (y > 0) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}
}