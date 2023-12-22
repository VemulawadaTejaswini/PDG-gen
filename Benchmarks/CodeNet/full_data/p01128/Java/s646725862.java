import java.io.IOException;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.List;

public class Main {
	double EPS = 1e-12;

	class Point implements Comparable<Point> {
		double x, y;
		int f;

		Point(double x, double y, int f) {
			this.x = x;
			this.y = y;
			this.f = f;
		}

		@Override
		public int compareTo(Point o) {
			if (this.x != o.x) {
				double diff = this.x - o.x;
				return diff > 0 ? 1 : diff < 0 ? -1 : 0;
			}
			if (this.y != o.y) {
				double diff = this.y - o.y;
				return diff > 0 ? 1 : diff < 0 ? -1 : 0;
			}
			return 0;
		}
	}

	double norm(double[] a) {
		return Math.hypot(a[0], a[1]);
	}

	double[] sub(double[] a, double[] b) {
		return new double[] { a[0] - b[0], a[1] - b[1] };
	}

	double dot(double[] a, double[] b) {
		return a[0] * b[0] + a[1] * b[1];
	}

	double cross(double[] a, double[] b) {
		return a[0] * b[1] - a[1] * b[0];
	}

	int ccw(double[] a, double[] b, double[] c) {
		double[] d = sub(b, a), e = sub(c, a);
		if (cross(d, e) > 0)
			return +1;
		if (cross(d, e) < 0)
			return -1;
		if (dot(d, e) < 0)
			return +2;
		if (norm(d) < norm(e))
			return -2;
		return 0;
	}

	boolean isIntersectSS(double[] a1, double[] a2, double[] b1, double[] b2) {
		return ccw(a1, a2, b1) * ccw(a1, a2, b2) <= 0 && ccw(b1, b2, a1) * ccw(b1, b2, a2) <= 0;
	}

	boolean isIntersectLL(double[] a1, double[] a2, double[] b1, double[] b2) {
		return !isParallel(a1, a2, b1, b2) || isSameLine(a1, a2, b1, b2);
	}

	boolean isSameLine(double[] a1, double[] a2, double[] b1, double[] b2) {
		return abs(cross(sub(a1, a2), sub(a1, b1))) < EPS && abs(cross(sub(a1, a2), sub(a1, b2))) < EPS;
	}

	double abs(double a) {
		return 0 < a ? a : -a;
	}

	boolean isParallel(double[] a1, double[] a2, double[] b1, double[] b2) {
		return abs(cross(sub(a2, a1), sub(b2, b1))) < EPS;
	}

	double[] crosspoint(double[] a1, double[] a2, double[] b1, double[] b2) {
		if (!isIntersectLL(a1, a2, b1, b2))
			return null;
		if (isSameLine(a1, a2, b1, b2))
			return b1;
		double A = cross(sub(a2, a1), sub(b2, b1));
		double B = cross(sub(a2, a1), sub(a2, b1));
		return new double[] { b1[0] + B / A * (b2[0] - b1[0]), b1[1] + B / A * (b2[1] - b1[1]) };
	}

	void run() {
		MyScanner sc = new MyScanner();

		int T = sc.nextInt();
		while (T-- > 0) {
			double[][] l = new double[2][2];
			for (int i = 0; i < 2; i++) {
				for (int j = 0; j < 2; j++) {
					l[i][j] = sc.nextDouble();
				}
			}

			int n = sc.nextInt();
			double[][] s = new double[n][2];
			double[][] t = new double[n][2];
			int[] o = new int[n];
			int[] p = new int[n];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < 2; j++) {
					s[i][j] = sc.nextDouble();
				}
				for (int j = 0; j < 2; j++) {
					t[i][j] = sc.nextDouble();
				}
				o[i] = sc.nextInt();
				p[i] = sc.nextInt();
			}

			List<Point> list = new LinkedList<Point>();
			for (int i = 0; i < n; i++) {
				boolean f = isIntersectSS(l[0], l[1], s[i], t[i]);
				if (f) {
					double[] x = crosspoint(l[0], l[1], s[i], t[i]);
					list.add(new Point(x[0], x[1], (o[i] + p[i]) % 2));
				}
			}
			Collections.sort(list);
			Point[] ans = list.toArray(new Point[0]);
			int cnt = 0;
			for (int i = 1; i < ans.length; i++) {
				if (ans[i - 1].f != ans[i].f) {
					cnt++;
				}
			}
			System.out.println(cnt);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	public void mapDebug(int[][] a) {
		System.out.println("--------map display---------");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.printf("%3d ", a[i][j]);
			}
			System.out.println();
		}
		System.out.println("----------------------------" + '\n');
	}

	class MyScanner {
		int read() {
			try {
				return System.in.read();
			} catch (IOException e) {
				throw new InputMismatchException();
			}
		}

		boolean isSpaceChar(int c) {
			return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
		}

		boolean isEndline(int c) {
			return c == '\n' || c == '\r' || c == -1;
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		int[] nextIntArray(int n) {
			int[] array = new int[n];
			for (int i = 0; i < n; i++)
				array[i] = nextInt();
			return array;
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		long[] nextLongArray(int n) {
			long[] array = new long[n];
			for (int i = 0; i < n; i++)
				array[i] = nextLong();
			return array;
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		double[] nextDoubleArray(int n) {
			double[] array = new double[n];
			for (int i = 0; i < n; i++)
				array[i] = nextDouble();
			return array;
		}

		String next() {
			int c = read();
			while (isSpaceChar(c))
				c = read();
			StringBuilder res = new StringBuilder();
			do {
				res.appendCodePoint(c);
				c = read();
			} while (!isSpaceChar(c));
			return res.toString();
		}

		String[] nextStringArray(int n) {
			String[] array = new String[n];
			for (int i = 0; i < n; i++)
				array[i] = next();

			return array;
		}

		String nextLine() {
			int c = read();
			while (isEndline(c))
				c = read();
			StringBuilder res = new StringBuilder();
			do {
				res.appendCodePoint(c);
				c = read();
			} while (!isEndline(c));
			return res.toString();
		}
	}
}