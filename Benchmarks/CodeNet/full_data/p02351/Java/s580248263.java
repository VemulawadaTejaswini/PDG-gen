import java.io.*;
import java.util.*;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		int n = sc.nextInt();
		int[] data = new int[n];
		RSQ_RAQ_SegmentTree rsq = new RSQ_RAQ_SegmentTree(data);

		int q = sc.nextInt();
		for (int i = 0; i < q; i++) {
			int cmd = sc.nextInt();

			if (cmd == 0) {
				int s = sc.nextInt() - 1;
				int t = sc.nextInt() - 1;
				int x = sc.nextInt();

				rsq.add(s, t + 1, x);
			} else if (cmd == 1) {
				int s = sc.nextInt() - 1;
				int t = sc.nextInt() - 1;

				pr.println(rsq.getSum(s, t + 1));
				pr.flush();
			}
		}
	}

	private static class RSQ_RAQ_SegmentTree {
		long[] stAdd;
		// ?????°????????????????????????????¶???????
		long[] stSum;
		// ?????°???????????????????¨????(??????????¨?????????????????¶???????)
		int n; // data???????´???°(2????????????????£???£)

		// ???????´???????????????????????¨??????????????????????????????¨???
		public RSQ_RAQ_SegmentTree(int[] data) {
			n = 1;
			while (n < data.length) {
				n *= 2;
			}

			stAdd = new long[2 * n - 1];

			stSum = new long[2 * n - 1];
			for (int i = 0, size = data.length; i < size; i++) {
				stSum[n - 1 + i] = data[i];
			}
			for (int i = n - 2; i >= 0; i--) {
				stSum[i] = stSum[2 * i + 1] + stSum[2 * i + 2];
			}
		}

		// l,r:0-indexed
		// [l,r)?????????add
		void add(int l, int r, int x) {
			add(l, r, x, 0, 0, n);
		}

		void add(int l, int r, int x, int k, int ll, int rr) {
			if (ll >= l && rr <= r) {
				stAdd[k] += x;
			} else if (ll >= r || rr <= l) {
				// ????????????
			} else {
				stSum[k] += (Math.min(r, rr) - Math.max(l, ll)) * x;

				int mm = (ll + rr) / 2;
				add(l, r, x, 2 * k + 1, ll, mm);
				add(l, r, x, 2 * k + 2, mm, rr);
			}
		}

		// l,r:0-indexed
		// [l,r)??????
		long getSum(int l, int r) {
			return getSum(l, r, 0, 0, n);
		}

		long getSum(int l, int r, int k, int ll, int rr) {
			long ret;

			if (ll >= l && rr <= r) {
				ret = stSum[k] + (rr - ll) * stAdd[k];
			} else if (ll >= r || rr <= l) {
				// ????????????
				ret = 0;
			} else {
				ret = (Math.min(r, rr) - Math.max(l, ll)) * stAdd[k];

				int mm = (ll + rr) / 2;
				ret += getSum(l, r, 2 * k + 1, ll, mm);
				ret += getSum(l, r, 2 * k + 2, mm, rr);
			}

			return ret;
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