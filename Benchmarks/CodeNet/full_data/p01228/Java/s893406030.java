import java.io.IOException;
import java.util.InputMismatchException;

public class Main {
	int n;
	char[][] c;
	int[] power;
	int[][] encode;
	char[] decode;

	void init() {
		power = new int[20];
		power[0] = 1;
		for (int i = 1; i < 20; i++) {
			power[i] = power[i - 1] * 2;
		}
		encode = new int['9']['9'];
		encode['0']['1'] = 1;
		encode['0']['2'] = 2;
		encode['0']['4'] = 3;
		encode['0']['8'] = 4;
		encode['1']['0'] = 5;
		encode['2']['0'] = 6;
		encode['4']['0'] = 7;
		encode['8']['0'] = 8;
		decode = new char['Z'];
		for (int i = 0; i < 10; i++) {
			decode[i] = (char) ('0' + i);
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

	void run() {
		MyScanner sc = new MyScanner();
		init();

		for (int T = sc.nextInt() - 1; 0 <= T; T--) {
			n = sc.nextInt();
			c = new char[n][];
			int lcm = 1;
			for (int i = 0; i < n; i++) {
				c[i] = sc.next().toCharArray();
				int k = c[i].length / 2;
				lcm = lcm(lcm, k);
			}
			char[] ans = new char[lcm];
			for (int i = 0; i < n; i++) {
				int m = c[i].length / 2;
				int d = lcm / m;
				for (int j = 0; j < m; j++) {
					int k1 = 2 * j;
					int k2 = 2 * j + 1;
					int tmp = encode[c[i][k1]][c[i][k2]];
					tmp--;
					ans[j * d] |= (1 << tmp);
				}
			}
			while (true) {
				if (ans.length == 1) {
					break;
				}
				boolean f = true;
				int length = ans.length;
				char[] tmp = new char[length / 2];
				for (int i = 0; i + 1 < length; i += 2) {
					if (ans[i + 1] != 0) {
						f = false;
					}
					tmp[i / 2] = ans[i];
				}
				if (!f) {
					break;
				}
				ans = tmp;
			}

			if (ans.length <= 2048) {
				for (int i = 0; i < ans.length; i++) {
					System.out.print(decode[ans[i] / 16]);
					System.out.print(decode[ans[i] % 16]);
				}
				System.out.println();
			} else {
				System.out.println("Too complex.");
			}
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