import java.io.*;
import java.util.*;

public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		int n = sc.nextInt();

		int[] l = new int[n];
		int[] r = new int[n];
		for (int i = 0; i < n; i++) {
			l[i] = sc.nextInt();
			r[i] = sc.nextInt();
		}

		if (n > 400) {
			throw new RuntimeException();
		}

		int[][] dp = new int[n][400 + 2];
		final int INF = Integer.MAX_VALUE / 2;
		Arrays.fill(dp[0], INF);
		for (int i = 1; i <= 400; i++) {
			if (i >= l[0] && i <= r[0]) {
				dp[0][i] = 0;
			} else if (i < l[0]) {
				dp[0][i] = l[0] - i;
			} else {
				dp[0][i] = i - r[0];
			}
		}

		for (int i = 1; i < n; i++) {
			Arrays.fill(dp[i], INF);
			for (int j = 1; j < l[i]; j++) {
				int prev = INF;
				for (int k = j; k <= Math.min(j + r[i] - l[i], 400); k++) {
					prev = Math.min(prev, dp[i - 1][k]);
				}
				dp[i][j] = Math.min(dp[i][j], l[i] - j + prev);
//				dp[i][j] = Math.min(dp[i][j], dp[i][j - 1]);
			}
			for (int j = 400; j > r[i]; j--) {
				int prev = INF;
				for (int k = j; k >= Math.max(j - (r[i] - l[i]), 0); k--) {
					prev = Math.min(prev, dp[i - 1][k]);
				}
				dp[i][j] = Math.min(dp[i][j], j - r[i] + prev);
//				dp[i][j] = Math.min(dp[i][j], dp[i][j + 1]);
			}
			int prev = INF;
			for (int k = l[i]; k <= r[i]; k++) {
				prev = Math.min(prev, dp[i - 1][k]);
			}
			for (int j = l[i]; j <= r[i]; j++) {
//				dp[i][j] = Math.min(dp[i][j], dp[i][l[i] - 1]);
//				dp[i][j] = Math.min(dp[i][j], dp[i][r[i] + 1]);
				dp[i][j] = Math.min(dp[i][j], prev);
			}
		}

		int ret = INF;
		for (int i = 1; i <= 400; i++) {
			ret = Math.min(ret, dp[n - 1][i]);
		}

		pr.println(ret);
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
