import java.io.*;
import java.util.*;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		int n = sc.nextInt();
		int m = sc.nextInt();

		FloydWarshall fw = new FloydWarshall(n);
		int[] a = new int[m];
		int[] b = new int[m];
		int[] c = new int[m];
		for (int i = 0; i < m; i++) {
			a[i] = sc.nextInt() - 1;
			b[i] = sc.nextInt() - 1;
			c[i] = sc.nextInt();
			fw.addEdge(a[i], b[i], c[i]);
			fw.addEdge(b[i], a[i], c[i]);
		}

		int ret = 0;
		for (int i = 0; i < m; i++) {
			if (c[i] > fw.getShortestPath(a[i], b[i])) {
				ret++;
			}
		}

		pr.println(ret);
	}

	private static class FloydWarshall {
		long[][] d;
		int n;
		long[][] result;
		boolean nf; // NEGATIVE CYCLE flag

		final long INF = Long.MAX_VALUE;

		FloydWarshall(int n) {
			this.n = n;
			d = new long[n][n];
			for (int i = 0; i < n; i++) {
				Arrays.fill(d[i], INF);
				d[i][i] = 0;
			}
			nf = false;
		}

		// i, j:0-indexed
		public void addEdge(int i, int j, int c) {
			d[i][j] = c;
		}

		public long getShortestPath(int i, int j) {
			if (nf) {
				return -INF;
			}

			if (result == null) {
				for (int kk = 0; kk < n; kk++) {
					for (int ii = 0; ii < n; ii++) {
						for (int jj = 0; jj < n; jj++) {
//							d[ii][jj] = Math.min(d[ii][jj], d[ii][kk] + d[kk][jj]);
							if (d[ii][kk] != INF && d[kk][jj] != INF && d[ii][jj] > d[ii][kk] + d[kk][jj]) {
								d[ii][jj] = d[ii][kk] + d[kk][jj];
							}
						}
					}
				}

				for (int k = 0; k < n; k++) {
					if (d[k][k] < 0) {
						nf = true;
						return -INF;
					}
				}

				result = d;
			}

			return result[i][j];
		}
	}

	// ---------------------------------------------------
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		pr = new Printer(System.out);

		solve();

		pr.close();
		sc.close();
	}

	@SuppressWarnings("unused")
	private static class Scanner {
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

		void close() {
			try {
				br.close();
			} catch (IOException e) {
//				throw new NoSuchElementException();
			}
		}
	}

	private static class Printer extends PrintWriter {
		Printer(PrintStream out) {
			super(out);
		}
	}
}
