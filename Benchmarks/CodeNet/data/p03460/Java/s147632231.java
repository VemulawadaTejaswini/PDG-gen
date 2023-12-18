import java.io.*;
import java.util.NoSuchElementException;

public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		int n = sc.nextInt();
		int k = sc.nextInt();
		int k2 = 2 * k;

		int[] x = new int[n];
		int[] y = new int[n];
		char[] c = new char[n];
		int[][][] xyc = new int[2][k2][k2];
		for (int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
			c[i] = sc.next().toCharArray()[0];

			xyc[c[i] == 'B' ? 1 : 0][y[i] % k2][x[i] % k2]++;
		}

		int[][][] cumsum = new int[2][k2 + 1][k2 + 1];
		for (int i = 0; i < 2; i++) {
			for (int yy = 0; yy < k2; yy++) {
				for (int xx = 0; xx < k2; xx++) {
					cumsum[i][yy + 1][xx + 1] = cumsum[i][yy + 1][xx] + xyc[i][yy][xx] + cumsum[i][yy][xx + 1] - cumsum[i][yy][xx];
				}
			}
		}

		int max = 0;
		for (int yy = 0; yy < k; yy++) {
			for (int xx = 0; xx < k; xx++) {
				{
					int tmp = 0;
					// B
					tmp += f(1, cumsum, yy, xx, k);
					tmp += f(1, cumsum, yy + k, xx + k, k);
					tmp += f(1, cumsum, yy - k, xx - k, k);
					tmp += f(1, cumsum, yy - k, xx + k, k);
					tmp += f(1, cumsum, yy + k, xx - k, k);
					tmp += f(0, cumsum, yy, xx + k, k);
					tmp += f(0, cumsum, yy + k, xx, k);
					tmp += f(0, cumsum, yy - k, xx, k);
					tmp += f(0, cumsum, yy, xx - k, k);
					
					max = Math.max(max, tmp);
				}
				{
					int tmp = 0;
					// W
					tmp += f(0, cumsum, yy, xx, k);
					tmp += f(0, cumsum, yy + k, xx + k, k);
					tmp += f(0, cumsum, yy - k, xx - k, k);
					tmp += f(0, cumsum, yy - k, xx + k, k);
					tmp += f(0, cumsum, yy + k, xx - k, k);
					tmp += f(1, cumsum, yy, xx + k, k);
					tmp += f(1, cumsum, yy + k, xx, k);
					tmp += f(1, cumsum, yy - k, xx, k);
					tmp += f(1, cumsum, yy, xx - k, k);

					max = Math.max(max, tmp);
				}
			}
		}

		pr.println(max);
	}

	private static int f(int i, int[][][] cumsum, int yy, int xx, int k) {
		int k2 = k * 2;
		
		if (yy >= k2 || xx >= k2) {
			return 0;
		}
		if (yy + k - 1 < 0 || xx + k - 1 < 0) {
			return 0;
		}

		int x0 = Math.max(0, xx);
		int y0 = Math.max(0, yy);
		int x1 = Math.min(k2 - 1, xx + k - 1);
		int y1 = Math.min(k2 - 1, yy + k - 1);
		
		return cumsum[i][y1 + 1][x1 + 1] - cumsum[i][y0][x1 + 1] - cumsum[i][y1 + 1][x0] + cumsum[i][y0][x0];
	}

	// ---------------------------------------------------
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		pr = new Printer(System.out);
			
		solve();
			
		pr.close();
		sc.close();
	}

	static class Scanner {
		BufferedReader br;

		Scanner (InputStream in) {
			br = new BufferedReader(new InputStreamReader(in));
		}

		private boolean isPrintable(int ch) {
			return ch >= '!' && ch <= '~';
		}

		private boolean isCRLF(int ch) {
			return ch == '\n' || ch == '\r' || ch == -1;
		}

		private int nextPrintable() {
			try {
				int ch;
				while (!isPrintable(ch = br.read())) {
					if (ch == -1) {
						throw new NoSuchElementException();
					}
				}

				return ch;
			} catch (IOException e) {
				throw new NoSuchElementException();
			}
		}

		String next() {
			try {
				int ch = nextPrintable();
				StringBuilder sb = new StringBuilder();
				do {
					sb.appendCodePoint(ch);
				} while (isPrintable(ch = br.read()));

				return sb.toString();
			} catch (IOException e) {
				throw new NoSuchElementException();
			}
		}

		int nextInt() {
			try {
				// parseInt from Integer.parseInt()
				boolean negative = false;
				int res = 0;
				int limit = -Integer.MAX_VALUE;
				int radix = 10;

				int fc = nextPrintable();
				if (fc < '0') {
					if (fc == '-') {
						negative = true;
						limit = Integer.MIN_VALUE;
					} else if (fc != '+') {
						throw new NumberFormatException();
					}
					fc = br.read();
				}
				int multmin = limit / radix;

				int ch = fc;
				do {
					int digit = ch - '0';
					if (digit < 0 || digit >= radix) {
						throw new NumberFormatException();
					}
					if (res < multmin) {
						throw new NumberFormatException();
					}
					res *= radix;
					if (res < limit + digit) {
						throw new NumberFormatException();
					}
					res -= digit;

				} while (isPrintable(ch = br.read()));

				return negative ? res : -res;
			} catch (IOException e) {
				throw new NoSuchElementException();
			}
		}

		long nextLong() {
			try {
				// parseLong from Long.parseLong()
				boolean negative = false;
				long res = 0;
				long limit = -Long.MAX_VALUE;
				int radix = 10;

				int fc = nextPrintable();
				if (fc < '0') {
					if (fc == '-') {
						negative = true;
						limit = Long.MIN_VALUE;
					} else if (fc != '+') {
						throw new NumberFormatException();
					}
					fc = br.read();
				}
				long multmin = limit / radix;

				int ch = fc;
				do {
					int digit = ch - '0';
					if (digit < 0 || digit >= radix) {
						throw new NumberFormatException();
					}
					if (res < multmin) {
						throw new NumberFormatException();
					}
					res *= radix;
					if (res < limit + digit) {
						throw new NumberFormatException();
					}
					res -= digit;

				} while (isPrintable(ch = br.read()));

				return negative ? res : -res;
			} catch (IOException e) {
				throw new NoSuchElementException();
			}
		}

		float nextFloat() {
			return Float.parseFloat(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String nextLine() {
			try {
				int ch;
				while (isCRLF(ch = br.read())) {
					if (ch == -1) {
						throw new NoSuchElementException();
					}
				}
				StringBuilder sb = new StringBuilder();
				do {
					sb.appendCodePoint(ch);
				} while (!isCRLF(ch = br.read()));

				return sb.toString();
			} catch (IOException e) {
				throw new NoSuchElementException();
			}
		}
		
		int[] nextIntArray(int n) {
			int[] ret = new int[n];
			for (int i = 0; i < n; i++) {
				ret[i] = sc.nextInt();
			}
			
			return ret;
		}

		int[][] nextIntArrays(int n, int m) {
			int[][] ret = new int[m][n];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					ret[j][i] = sc.nextInt();
				}
			}
			
			return ret;
		}

		void close() {
			try {
				br.close();
			} catch (IOException e) {
//				throw new NoSuchElementException();
			}
		}
	}

	static class Printer extends PrintWriter {
		Printer(OutputStream out) {
			super(out);
		}
		
		void printInts(int... a) {
			StringBuilder sb = new StringBuilder(32);
			for (int i = 0, size = a.length; i < size; i++) {
				if (i > 0) {
					sb.append(' ');
				}
				sb.append(a[i]);
			}

			println(sb);
		}
		
		void printLongs(long... a) {
			StringBuilder sb = new StringBuilder(64);
			for (int i = 0, size = a.length; i < size; i++) {
				if (i > 0) {
					sb.append(' ');
				}
				sb.append(a[i]);
			}

			println(sb);
		}
		
		void printStrings(String... a) {
			StringBuilder sb = new StringBuilder(32);
			for (int i = 0, size = a.length; i < size; i++) {
				if (i > 0) {
					sb.append(' ');
				}
				sb.append(a[i]);
			}

			println(sb);
		}
	}
}
