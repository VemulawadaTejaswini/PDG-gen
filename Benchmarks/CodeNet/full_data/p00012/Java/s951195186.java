import java.util.Scanner;

public class Main {

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		while (scanner.hasNext()) {

			double x1 = input();
			double y1 = input();
			double x2 = input();
			double y2 = input();
			double x3 = input();
			double y3 = input();
			double xp = input();
			double yp = input();

			double area1 = getArea(x1, y1, x2, y2, xp, yp);
			double area2 = getArea(x1, y1, x3, y3, xp, yp);
			double area3 = getArea(x2, y2, x3, y3, xp, yp);
			double area4 = area1 + area2 + area3;
			double area5 = getArea(x1, y1, x2, y2, x3, y3);

			if (area4 - area5 < 0.001) {

				System.out.println("YES");

			} else {

				System.out.println("NO");

			}
		}

		close();

	}

	public static double getDistance(double x1, double y1, double x2, double y2) {

		return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

	}

	public static double getArea(double x1, double y1, double x2, double y2, double x3, double y3) {

		double a = getDistance(x1, y1, x2, y2);
		double b = getDistance(x1, y1, x3, y3);
		double c = getDistance(x2, y2, x3, y3);
		double s = (a + b + c) / 2;

		return Math.sqrt(s * (s - a) * (s - b) * (s - c));

	}

	public static double input() {

		return scanner.nextDouble();

	}

	public static void close() {

		if (scanner != null) {

			scanner.close();

		}
	}
}