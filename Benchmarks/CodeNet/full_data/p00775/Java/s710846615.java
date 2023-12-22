import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	int r;
	Set<Point> list;

	class Point implements Comparable<Point>{
		int x, y;

		Point(int x, int y) {
			this.x = x;
			this.y = y;
		}

		@Override
		public int compareTo(Point o) {
			return this.x != o.x ? this.x - o.x : this.y - o.y;
		}
	}

	boolean check(double h) {
		for (Point P: list) {
			double dx = Math.abs(1.0 * P.x - 20);
			double dy = Math.abs(1.0 * P.y - h);
			double len = Math.hypot(dx, dy);
			if (len < r) return false;
		}
		return true;
	}

	void makePointSet(int[] f) {
		list = new TreeSet<Point>();
		if (f[0] != 0) {
			list.add(new Point(0, f[0]));
			list.add(new Point(0, 0));
		}
		for (int i = 1; i < 50; i++) {
			if (f[i] == f[i - 1]) continue;
			list.add(new Point(i, f[i - 1]));
			list.add(new Point(i, f[i]));
			//			list.add(new Point(i, 0));
		}

		/*
		for (Point P: list) {
			System.out.println((P.x - 20) + ", " + P.y);
		}
		System.out.println();
		 */
	}

	void run() {
		MyScanner sc = new MyScanner();

		while (true) {
			r = sc.nextInt();
			int n = sc.nextInt();
			if ((r | n) == 0) {
				break;
			}
			int[] f = new int[50];
			for (int i = 0; i < n; i++) {
				int xl = sc.nextInt() + 20;
				int xr = sc.nextInt() + 20;
				int h = sc.nextInt();
				for (int j = xl; j < xr; j++) {
					f[j] = Math.max(f[j], h);
				}
			}

			makePointSet(f);

			double low = -r, high = Math.max(f[19], f[20]) - r;
			double EPS = 1E-10;
			while (EPS < high - low) {
				double mid = (low + high) / 2;
				if (check(mid)) {
					low = mid;
				} else {
					high = mid;
				}
			}
			System.out.println(low + r);
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