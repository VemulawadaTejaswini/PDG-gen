import java.io.IOException;
import java.util.InputMismatchException;

public class Main {
	int[][] encode;
	char[] decode;

	void init() {
		encode = new int['9']['9'];
		encode['0']['1'] = 1;
		encode['0']['2'] = 2;
		encode['0']['4'] = 3;
		encode['0']['8'] = 4;
		encode['1']['0'] = 5;
		encode['2']['0'] = 6;
		encode['4']['0'] = 7;
		encode['8']['0'] = 8;
		decode = new char[20];
		for (int i = '0'; i <= '9'; i++) {
			decode[i - '0'] = (char) i;
		}
		for (int i = 'A'; i <= 'F'; i++) {
			decode[i - 'A' + 10] = (char) i;
		}
	}

	int gcd(int x, int y) {
		while (x != 0 && y != 0) {
			if (x > y) {
				x %= y;
			} else {
				y %= x;
			}
		}
		if (x == 0) {
			return y;
		} else {
			return x;
		}
	}

	int lcm(int x, int y) {
		return x * y / gcd(x, y);
	}

	int[] make(char[] c) {
		int n = c.length;
		int gcd = 0;
		int len = 0;
		for (int i = 0; i < n; i += 2) {
			if (encode[c[i]][c[i + 1]] == 0) {
				continue;
			}
			gcd++;
		}
		if (gcd == 0) {
			return new int[] { 0 };
		}
		for (int i = 0; i < n; i += 2) {
			if (encode[c[i]][c[i + 1]] == 0) {
				continue;
			}
			gcd = gcd(gcd, i / 2);
		}
		for (int i = 0; i < n; i += 2) {
			if (encode[c[i]][c[i + 1]] == 0) {
				continue;
			}
			len = Math.max(len, i / 2 / gcd);
		}
		// int[] res = new int[len + 1];
		int[] res = new int[n / 2 / gcd];
		for (int i = 0; i < n; i += 2) {
			if (encode[c[i]][c[i + 1]] == 0) {
				continue;
			}
			int k = i / 2 / gcd;
			res[k] = encode[c[i]][c[i + 1]];
		}
		return res;
	}

	void run() {
		MyScanner sc = new MyScanner();
		init();

		// StringBuilder s = new StringBuilder();
		L: for (int T = sc.nextInt() - 1; 0 <= T; T--) {
			int n = sc.nextInt();
			int[][] rithm = new int[n][];
			for (int i = 0; i < n; i++) {
				rithm[i] = make(sc.next().toCharArray());
				// System.out.println(rithm[i].length + " " +
				// Arrays.toString(rithm[i]));
			}

			int lcm = 1;
			for (int i = 0; i < n; i++) {
				lcm = lcm(lcm, rithm[i].length);
				if (1024 < lcm) {
					// s.append("Too complex.\r\n");
					System.out.println("Too complex.");
					continue L;
				}
			}

			int[] ans = new int[lcm];
			for (int i = 0; i < n; i++) {
				int m = rithm[i].length;
				int d = lcm / m;
				for (int j = 0; j < m; j++) {
					if (rithm[i][j] == 0) {
						continue;
					}
					ans[j * d] |= 1 << --rithm[i][j];
				}
			}
			for (int i = 0; i < lcm; i++) {
				// s.append(decode[ans[i] / 16]);
				// s.append(decode[ans[i] % 16]);
				System.out.print(decode[ans[i] / 16]);
				System.out.print(decode[ans[i] % 16]);
			}
			// s.append("\r\n");
			System.out.println();
		}
		// System.out.print(s);
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