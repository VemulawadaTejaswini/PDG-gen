import java.util.Scanner;

public class Main {

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int N = Integer.parseInt(input());

		for (int i = 0; i < N; i++) {

			double x1 = Double.parseDouble(input());
			double y1 = Double.parseDouble(input());
			double x2 = Double.parseDouble(input());
			double y2 = Double.parseDouble(input());
			double x3 = Double.parseDouble(input());
			double y3 = Double.parseDouble(input());

			double a1 = 2 * (x2 - x1);
			double b1 = 2 * (y2 - y1);
			double c1 = Math.pow(x1, 2) - Math.pow(x2, 2) + Math.pow(y1, 2) - Math.pow(y2, 2);
			double a2 = 2 * (x3 - x1);
			double b2 = 2 * (y3 - y1);
			double c2 = Math.pow(x1, 2) - Math.pow(x3, 2) + Math.pow(y1, 2) - Math.pow(y3, 2);

			double px = (b1 * c2 - b2 * c1) / (a1 * b2 - a2 * b1);
			double py = (c1 * a2 - c2 * a1) / (a1 * b2 - a2 * b1);
			double r = Math.sqrt(Math.pow((px - x1), 2) + Math.pow((py - y1), 2));

			System.out.println(String.format("%.3f %.3f %.3f", px, py, r));

		}

		close();

	}

	public static String input() {

		return scanner.next();

	}

	public static void close() {

		if (scanner != null) {

			scanner.close();

		}
	}
}