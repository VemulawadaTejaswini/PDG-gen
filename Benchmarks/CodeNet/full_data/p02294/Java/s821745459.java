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

	}

	static class Point {
		long x, y;
		int id;

		public Point(long x, long y) {
			this.x = x;
			this.y = y;
		}

		long norm2() {
			return x * x + y * y;
		}
	}

	static boolean linesIntersect(Point s1, Point d1, Point s2, Point d2) {
		long prd1 = ccw(s1, d1, d2) * ccw(s1, d1, s2);
		long prd2 = ccw(s2, d2, s1) * crossProduct(s2, d2, s2, d1);
		return prd1 <= 0 && prd2 <= 0;
	}

	static long ccw(Point s, Point d, Point p) {
		long cp = crossProduct(s, d, s, p);
		if (cp != 0)
			return Long.compare(cp, 0);
		else {
			if (dotProduct(s, d, s, p) < 0)
				return -2;
			else if (dotProduct(d, s, d, p) < 0)
				return 2;
			else
				return 0;
		}
	}

	static long crossProduct(Point s1, Point d1, Point s2, Point d2) {
		return (d1.x - s1.x) * (d2.y - s2.y) - (d1.y - s1.y) * (d2.x - s2.x);
	}

	static long dotProduct(Point s1, Point d1, Point s2, Point d2) {
		return (d1.x - s1.x) * (d2.x - s2.x) + (d1.y - s1.y) * (d2.y - s2.y);
	}

	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}