
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		while (true) {
			double a = scanner.nextDouble();
			if (a == -1) {
				break;
			}
			double x = a / 2;
			while (Math.abs(x * x * x - a) >= 0.00001 * a) {
				x -= (x * x * x - a) / (3 * x * x);
			}
			System.out.println(x);
		}

	}
}