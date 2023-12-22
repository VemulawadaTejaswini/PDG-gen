import java.io.IOException;
import java.util.InputMismatchException;

public class Main {
	char[] c;
	int id;
	int[] var;

	int exp() {
		if ('0' <= c[id] && c[id] <= '2') {
			return c[id++] - '0';
		} else if ('P' <= c[id] && c[id] <= 'R') {
			return var[c[id++] - 'P'];
		} else if (c[id] == '-') {
			id++;
			return not(exp());
		} else {
			id++;
			int res = exp();
			if (c[id] == '*') {
				id++;
				res = and(res, exp());
			} else {
				id++;
				res = or(res, exp());
			}
			id++;
			return res;
		}
	}

	int and(int a, int b) {
		if (a == 0 || b == 0)
			return 0;
		if (a == 2 && b == 2)
			return 2;
		return 1;
	}

	int or(int a, int b) {
		if (a == 0 && b == 0)
			return 0;
		if (a == 2 || b == 2)
			return 2;
		return 1;
	}

	int not(int a) {
		if (a == 2)
			return 0;
		if (a == 0)
			return 2;
		return 1;
	}

	void run() {
		MyScanner sc = new MyScanner();

		while (true) {
			c = (sc.next()+"=").toCharArray();
			if (c[0] == '.') {
				break;
			}
			var = new int[3];
			int count = 0;
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					for (int k = 0; k < 3; k++) {
						var[0] = i;
						var[1] = j;
						var[2] = k;
						id = 0;
						//						System.out.print("(P, Q, R) = (" + var[0] + ", " + var[1] + ", " + var[2] + ") -- ");
						//						System.out.println(exp());
						count += exp() == 2 ? 1 : 0;
					}
				}
			}
			System.out.println(count);
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