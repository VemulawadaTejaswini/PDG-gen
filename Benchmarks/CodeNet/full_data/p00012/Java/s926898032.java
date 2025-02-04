import java.util.Scanner;

public class Main {

	void run() {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			double x1 = sc.nextDouble();
			double y1 = sc.nextDouble();
			double x2 = sc.nextDouble();
			double y2 = sc.nextDouble();
			double x3 = sc.nextDouble();
			double y3 = sc.nextDouble();
			double xp = sc.nextDouble();
			double yp = sc.nextDouble();

			// 三角形ABCの面積
			double s = TriangleArea(x3 - x1, y3 - y1, x2 - x1, y2 - y1);
			double s1 = TriangleArea(xp - x1, yp - y1, x2 - x1, y2 - y1);
			double s2 = TriangleArea(xp - x1, yp - y1, x3 - x1, y3 - y1);
			double s3 = TriangleArea(xp - x2, yp - y2, x3 - x2, y3 - y2);

			// System.out.println((xp - x2) + " " + (yp - y2) + " " + (x3 - x2)
			// + " " + (y3 - x2));

			if (s - (s1 + s2 + s3) == 0) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
		sc.close();

	}

	double TriangleArea(double x1, double y1, double x2, double y2) {

		double s = ((x1 * y2) - (x2 * y1)) * 0.5;
		if (s <= 0) {
			s *= -1;
		}

		return s;
	}

	public static void main(String[] args) {
		new Main().run();
	}

}