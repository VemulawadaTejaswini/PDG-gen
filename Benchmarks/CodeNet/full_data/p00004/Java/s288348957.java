

import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (scan.hasNext()) {
			double a = scan.nextDouble();
			double b = scan.nextDouble();
			double c = scan.nextDouble();
			double d = scan.nextDouble();
			double e = scan.nextDouble();
			double f = scan.nextDouble();

			double y = (c * d - a * f) / (b * d - a * e);
			double x = (c - b * y) / a;
			System.out.printf("%4.3f %4.3f\n", x, y);

		}

	}
}