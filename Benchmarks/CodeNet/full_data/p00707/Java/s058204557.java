import java.io.IOException;
import java.util.InputMismatchException;

public class Main {
	StringBuilder max(StringBuilder a, StringBuilder b) {
		int n = a.length();
		if (n < b.length()) {
			return b;
		} else if (b.length() < n) {
			return a;
		}
		char[] ca = a.toString().toCharArray();
		char[] cb = b.toString().toCharArray();
		for (int i = 0; i < n; i++) {
			if (ca[i] > cb[i]) {
				return a;
			} else if (ca[i] < cb[i]) {
				return b;
			}
		}
		return a;
	}

	StringBuilder leadZero(StringBuilder a) {
		while (1 < a.length() && a.charAt(0) == '0') {
			a = a.deleteCharAt(0);
		}
		return a;
	}

	void run() {
		MyScanner sc = new MyScanner();

		while (true) {
			int w = sc.nextInt();
			int h = sc.nextInt();
			if ((w | h) == 0) {
				break;
			}
			char[][] c = new char[h][];
			StringBuilder[][] a = new StringBuilder[h][w];
			for (int i = 0; i < h; i++) {
				c[i] = sc.next().toCharArray();
			}

			a[0][0] = ('0' <= c[0][0] && c[0][0] <= '9') ? new StringBuilder("" + c[0][0]) : new StringBuilder("0");
			for (int i = 1; i < h; i++) {
				if ('0' <= c[i][0] && c[i][0] <= '9') {
					a[i][0] = new StringBuilder("0").append(a[i - 1][0]).append(c[i][0]);
					a[i][0] = leadZero(a[i][0]);
				} else {
					a[i][0] = new StringBuilder("0");
				}
			}
			for (int j = 1; j < w; j++) {
				if ('0' <= c[0][j] && c[0][j] <= '9') {
					a[0][j] = new StringBuilder("0").append(a[0][j - 1]).append(c[0][j]);
					a[0][j] = leadZero(a[0][j]);
				} else {
					a[0][j] = new StringBuilder("0");
				}
			}
			for (int i = 1; i < h; i++) {
				for (int j = 1; j < w; j++) {
					if ('0' <= c[i][j] && c[i][j] <= '9') {
						StringBuilder pre = max(a[i - 1][j], a[i][j - 1]);
						a[i][j] = new StringBuilder("").append(pre).append(c[i][j]);
						a[i][j] = leadZero(a[i][j]);
					} else {
						a[i][j] = new StringBuilder("0");
					}
				}
			}

			StringBuilder max = new StringBuilder("0");
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					max = max(max, a[i][j]);
				}
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