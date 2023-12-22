import java.io.*;
import java.util.*;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		int h = sc.nextInt();
		int w = sc.nextInt();
		char[][] hw = new char[h][];
		for (int i = 0; i < h; i++) {
			hw[i] = sc.next().toCharArray();
		}

		int r = sc.nextInt();
		int c = sc.nextInt();
		char[][] rc = new char[h][];
		for (int i = 0; i < r; i++) {
			rc[i] = sc.next().toCharArray();
		}

		if (r > h || c > w) {
			return;
		}

		final long B1 = 10_000;
		final long B2 = 10_000;
		final long MOD = 1_000_000_009;
		long Bmr = 1;
		long Bmc = 1;
		for (int i = 0; i < r - 1; i++) {
			Bmr *= B1;
			Bmr %= MOD;
		}
		for (int i = 0; i < c - 1; i++) {
			Bmc *= B2;
			Bmc %= MOD;
		}


		long hs = 0;
		for (int i = 0; i < r; i++) {
			long tmp = 0;
			for (int j = 0; j < c; j++) {
				tmp = tmp * B2 + rc[i][j];
				tmp %= MOD;
			}
			hs = hs * B1 + tmp;
			hs %= MOD;
		}


		List<Pair> ans = new ArrayList<>();
		long[] ht = new long[h];
		for (int j = 0; j + c - 1 < w; j++) {
			if (j == 0) {
				for (int i = 0; i < h; i++) {
					for (int k = 0; k < c; k++) {
						ht[i] = ht[i] * B2 + hw[i][k];
						ht[i] %= MOD;
					}
				}
			} else {
				for (int i = 0; i < h; i++) {
					ht[i] -= Bmc * hw[i][j - 1];
					ht[i] %= MOD;
					if (ht[i] < 0) {
						ht[i] += MOD;
					}
					ht[i] = ht[i] * B2 + hw[i][j + c - 1];
					ht[i] %= MOD;
				}
			}

			long hash = 0;
			for (int i = 0; i + r - 1 < h; i++) {
				if (i == 0) {
					for (int k = 0; k < r; k++) {
						hash = hash * B1 + ht[k];
						hash %= MOD;
					}
				} else {
					hash -= Bmr * ht[i - 1];
					hash %= MOD;
					if (hash < 0) {
						hash += MOD;
					}
					hash = hash * B2 + ht[i + r - 1];
					hash %= MOD;
				}

				if (hash == hs) {
//					pr.printf("%d %d\n", i, j);
					ans.add(new Pair(i, j));
				}
			}
		}

		Collections.sort(ans);

		for (Pair e : ans) {
			pr.printf("%d %d\n", e.a, e.b);
		}
	}

	private static class Pair implements Comparable<Pair> {
		int a;
		int b;

		Pair(int a, int b) {
			this.a = a;
			this.b = b;
		}

		@Override
		public int compareTo(Pair o) {
			if (a == o.a) {
				return Integer.compare(b, o.b);
			}
			return Integer.compare(a, o.a);
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