import java.io.*;
import java.util.NoSuchElementException;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		int n = sc.nextInt();

		int[] x = new int[n];
		int[] y = new int[n];
		char[] d = new char[n];
		for (int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
			d[i] = sc.next().toCharArray()[0];
		}

		for (int i = 0; i < n; i++) {
			if (d[i] == 'R') {
				maxy = Math.max(maxy, y[i]);
				miny = Math.min(miny, y[i]);
				maxxr = Math.max(maxxr, x[i]);
				minxr = Math.min(minxr, x[i]);
			} else if (d[i] == 'L') {
				maxy = Math.max(maxy, y[i]);
				miny = Math.min(miny, y[i]);
				maxxl = Math.max(maxxl, x[i]);
				minxl = Math.min(minxl, x[i]);
			} else if (d[i] == 'U') {
				maxx = Math.max(maxx, x[i]);
				minx = Math.min(minx, x[i]);
				maxyu = Math.max(maxyu, y[i]);
				minyu = Math.min(minyu, y[i]);
			} else if (d[i] == 'D') {
				maxx = Math.max(maxx, x[i]);
				minx = Math.min(minx, x[i]);
				maxyd = Math.max(maxyd, y[i]);
				minyd = Math.min(minyd, y[i]);
			}
		}

		long min = Long.MAX_VALUE;
		for (int i = 0; i <= 100_000_000 * 2; i++) {
			long tmp = (fmaxx(i) - fminx(i)) * (fmaxy(i) - fminy(i));
			min = Math.min(min, tmp);
		}
		
		pr.printf("%.10f%n", (double)min / 4);
	}
	
	private static long fmaxx(int i) {
		long max = 2L * maxx;
		max = Math.max(max, 2L * maxxl - i);
		max = Math.max(max, 2L * maxxr + i);
		
		return max;
	}

	private static long fminx(int i) {
		long min = 2L * minx;
		min = Math.min(min, 2L * minxl - i);
		min = Math.min(min, 2L * minxr + i);
		
		return min;
	}

	private static long fmaxy(int i) {
		long max = 2L * maxy;
		max = Math.max(max, 2L * maxyd - i);
		max = Math.max(max, 2L * maxyu + i);
		
		return max;
	}

	private static long fminy(int i) {
		long min = 2L * miny;
		min = Math.min(min, 2L * minyd - i);
		min = Math.min(min, 2L * minyu + i);
		
		return min;
	}

	static final int INF = Integer.MAX_VALUE;

	private static int maxx = -INF;
	private static int minx = INF;
	private static int maxxr = -INF;
	private static int minxr = INF;
	private static int maxxl = -INF;
	private static int minxl = INF;
	private static int maxy = -INF;
	private static int miny = INF;
	private static int maxyu = -INF;
	private static int minyu = INF;
	private static int maxyd = -INF;
	private static int minyd = INF;

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
