import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();
			double d = sc.nextDouble();
			double e = sc.nextDouble();
			double f = sc.nextDouble();
			double a2 = a;
			double d2 = d;
			double x = 0;
			double y = 0;

			if (a < d && a > 0) {
				y = (c * d - f) / (b * d - e);
			} else if (a < d && a < 0) {
				y = (c * d * -1 - f) / (b * d * -1 - e);
			} else if (a > d && d > 0) {
				y = (c - f * a) / (b - e * a);
			} else {
				y = (c - f * a * -1) / (b - e * a * -1);
			}

			x = (c - b * y) / a;
			y = Math.ceil(y);
			x = Math.ceil(x);
			String x2 = String.format("%.3f", x);
			String y2 = String.format("%.3f", y);

			System.out.println(x2 + " " + y2);
		}

	}

}