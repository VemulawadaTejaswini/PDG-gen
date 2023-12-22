import java.io.IOException;
import java.util.InputMismatchException;

public class Main {
	int n;
	Point[] p;
	int max;

	class Point implements Comparable<Point> {
		int id;
		double x, y;

		Point(double x, double y) {
			this.x = x;
			this.y = y;
		}

		Point(int id, double x, double y) {
			this.id = id;
			this.x = x;
			this.y = y;
		}

		@Override
		public int compareTo(Point o) {
			if (this.x != o.x) {
				double diff = this.x - o.x;
				if (diff > 0) {
					return 1;
				} else {
					return -1;
				}
			}
			double diff = this.y - o.y;
			if (diff > 0) {
				return 1;
			} else {
				return -1;
			}
		}

		@Override
		public String toString() {
			return "" + id;
		}
	}

	Point[] neighborSet(int k) {
		int cnt = 0;
		for (int i = 0; i < n; i++) {
			double dx = Math.abs(p[i].x - p[k].x);
			double dy = Math.abs(p[i].y - p[k].y);
			double length = Math.hypot(dx, dy);
			if (length <= 2) {
				cnt++;
			}
		}
		Point[] neighbor = new Point[cnt];
		int id = 0;
		for (int i = 0; i < n; i++) {
			double dx = Math.abs(p[i].x - p[k].x);
			double dy = Math.abs(p[i].y - p[k].y);
			double length = Math.hypot(dx, dy);
			if (length <= 2) {
				neighbor[id++] = p[i];
			}
		}
		return neighbor;
	}

	void backtrack(int k, boolean[] use, Point[] p, int cnt) {
		if (p.length <= k) {
			if (calc(use, p)) {
				max = Math.max(max, cnt);
			}
		} else {
			use[k] = true;
			backtrack(k + 1, use, p, cnt + 1);
			use[k] = false;
			backtrack(k + 1, use, p, cnt);
		}
	}

	boolean calc(boolean[] use, Point[] p) {
		int n = p.length;
		for (int i = 0; i < n; i++) {
			if (!use[i])
				continue;
			for (int j = 0; j < n; j++) {
				if (!use[j])
					continue;
				double dx = Math.abs(p[i].x - p[j].x);
				double dy = Math.abs(p[i].y - p[j].y);
				double length = Math.hypot(dx, dy);
				if (2 < length) {
					return false;
				}
			}
		}
		return true;
	}

	void run() {
		MyScanner sc = new MyScanner();

		n = sc.nextInt();
		p = new Point[n];
		for (int i = 0; i < n; i++) {
			String[] s = sc.next().split(",");
			double x = Double.parseDouble(s[0]);
			double y = Double.parseDouble(s[1]);
			p[i] = new Point(i + 1, x, y);
		}

		max = 0;
		for (int i = 0; i < n; i++) {
			Point[] neighbor = neighborSet(i);
			backtrack(0, new boolean[neighbor.length], neighbor, 0);
		}
		System.out.println(max);
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