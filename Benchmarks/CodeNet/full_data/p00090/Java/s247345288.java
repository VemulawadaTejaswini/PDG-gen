import java.io.IOException;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.List;

public class Main {
	int n;
	Point[] p;

	class Point {
		double x, y;

		Point(double x, double y) {
			this.x = x;
			this.y = y;
		}
	}

	Point[] neighborSet(int k) {
		List<Point> res = new LinkedList<Point>();
		for (int i = 0; i < n; i++) {
			if (isLapped(p[k], p[i])) {
				res.add(p[i]);
			}
		}
		return res.toArray(new Point[0]);
	}

	int backtrack(int k, boolean[] use, Point[] neighbor, int cnt) {
		if (neighbor.length <= k) {
			if (isClique(use, neighbor)) {
				return cnt;
			} else {
				return 1;
			}
		} else {
			int res = 1;
			use[k] = true;
			res = Math.max(res, backtrack(k + 1, use, neighbor, cnt + 1));
			use[k] = false;
			res = Math.max(res, backtrack(k + 1, use, neighbor, cnt));
			return res;
		}
	}

	boolean isClique(boolean[] use, Point[] sub) {
		int n = sub.length;
		for (int i = 0; i < n; i++) {
			if (!use[i])
				continue;
			for (int j = 0; j < n; j++) {
				if (!use[j])
					continue;
				if (!isLapped(p[i], p[j])) {
					return false;
				}
			}
		}
		return true;
	}

	boolean isLapped(Point a, Point b) {
		double dx = Math.abs(a.x - b.x);
		double dy = Math.abs(a.y - b.y);
		double length = Math.hypot(dx, dy);
		return length <= 2;
	}

	void run() {
		MyScanner sc = new MyScanner();

		while (true) {
			n = sc.nextInt();
			if (n == 0) {
				break;
			}
			p = new Point[n];
			for (int i = 0; i < n; i++) {
				String[] s = sc.next().split(",");
				double x = Double.parseDouble(s[0]);
				double y = Double.parseDouble(s[1]);
				p[i] = new Point(x, y);
			}

			int max = 1;
			for (int i = 0; i < n; i++) {
				Point[] neighbor = neighborSet(i);
				int tmp = backtrack(0, new boolean[neighbor.length], neighbor, 0);
				max = Math.max(max, tmp);
			}
			System.out.println(max);
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