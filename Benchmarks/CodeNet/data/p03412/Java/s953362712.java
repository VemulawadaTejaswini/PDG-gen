import java.io.*;
import java.util.*;

public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		int n = sc.nextInt();

		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int[] b = new int[n];
		for (int i = 0; i < n; i++) {
			b[i] = sc.nextInt();
		}

		int ans = 0;
		long ca = 0;
		for (int i = 0; i < 30; i++) {
			int mask = 0x1 << i;

			long a1 = 0;
			for (int j = 0; j < n; j++) {
				if ((a[j] & mask) != 0) {
					a1++;
				}
			}
			long a0 = n - a1;

			long b1 = 0;
			for (int j = 0; j < n; j++) {
				if ((b[j] & mask) != 0) {
					b1++;
				}
			}
			long b0 = n - b1;

			if ((a1 * b0 + a0 * b1 + ca) % 2 == 1) {
				ans |= mask;
			}

			int mask1 = 0x1 << i;
			int mask2 = 0x1 << i;
			int[] cnt0a = new int[i + 1];
			int[] cnt1a = new int[i + 1];
			int[] cnt0b = new int[i + 1];
			int[] cnt1b = new int[i + 1];
			for (int j = 0; j <= i; j++) {
				for (int k = 0; k < n; k++) {
					if ((a[k] & mask2) == mask1) {
						cnt0a[j]++;
					}
					if ((a[k] & mask2) == mask2) {
						cnt1a[j]++;
					}
				}
				for (int k = 0; k < n; k++) {
					if ((b[k] & mask2) == mask1) {
						cnt0b[j]++;
					}
					if ((b[k] & mask2) == mask2) {
						cnt1b[j]++;
					}
				}

				mask1 >>= 1;
				mask2 >>= 1;
				mask2 |= 0x1 << i;
			}

			ca = (long)cnt1a[0] * cnt1b[0];
			for (int j = 1; j <= i; j++) {
				ca += (long)cnt0a[j] * cnt1b[j];
				ca += (long)cnt0b[j] * cnt1a[j];
//				for (int k = j; k <= i; k++) {
//					ca += (long)cnt0a[j] * cnt1b[k];
//					ca += (long)cnt0b[j] * cnt1a[k];
//				}
			}
		}

		pr.println(ans);
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
