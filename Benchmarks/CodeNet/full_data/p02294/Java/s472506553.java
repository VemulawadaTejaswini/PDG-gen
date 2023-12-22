import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Main {

	static int n;
	static double[] x1, y1, x2, y2;
	static double sx, sy, gx, gy;
	static ArrayList<Integer>[] g;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		while (q-- > 0) {
			long x0, y0, x1, y1, x2, y2, x3, y3;
			x0 = sc.nextLong();
			y0 = sc.nextLong();
			x1 = sc.nextLong();
			y1 = sc.nextLong();
			x2 = sc.nextLong();
			y2 = sc.nextLong();
			x3 = sc.nextLong();
			y3 = sc.nextLong();
			Point p0 = new Point(x0, y0);
			Point p1 = new Point(x1, y1);
			Point p2 = new Point(x2, y2);
			Point p3 = new Point(x3, y3);
			if (linesIntersect(p0, p1, p2, p3)) {
				System.out.println(1);
			} else {
				System.out.println(0);
			}
		}
		// ArrayList<Point> ps = new ArrayList<>();
		// n = sc.nextInt();
		// x1 = new double[n];
		// y1 = new double[n];
		// x2 = new double[n];
		// y2 = new double[n];
		// for (int i = 0; i < n; ++i) {
		// x1[i] = sc.nextDouble();
		// y1[i] = sc.nextDouble();
		// x2[i] = sc.nextDouble();
		// y2[i] = sc.nextDouble();
		// ps.add(new Point(x1[i], y1[i]));
		// ps.add(new Point(x2[i], y2[i]));
		// }
		//
		// for (int i = 0; i < n; ++i) {
		// for (int j = i + 1; j < n; ++j) {
		//
		// }
		// }

	}

	static class Point {
		long x, y;
		int id;

		public Point(long x, long y) {
			this.x = x;
			this.y = y;
		}
	}

	static boolean linesIntersect(Point s1, Point d1, Point s2, Point d2) {
		long prd1 = crossProduct(s1, d1, s1, d2) * crossProduct(s1, d1, s1, s2);
		long prd2 = crossProduct(s2, d2, s2, s1) * crossProduct(s2, d2, s2, d1);
		if (prd1 == 0 && prd2 == 0) {
			if ((s1.x <= s2.x && s2.x <= d1.x) && (s1.x <= d2.x && d2.x <= d1.x)) {
				return true;
			} else
				return false;
		} else
			return ((crossProduct(s1, d1, s1, d2) * crossProduct(s1, d1, s1, s2)) <= 0)
					&& ((crossProduct(s2, d2, s2, s1) * crossProduct(s2, d2, s2, d1) <= 0));
	}

	static long crossProduct(Point s1, Point d1, Point s2, Point d2) {
		return (d1.x - s1.x) * (d2.y - s2.y) - (d1.y - s1.y) * (d2.x - s2.x);
	}

	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}