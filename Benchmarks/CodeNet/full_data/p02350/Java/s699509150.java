import java.io.*;
import java.util.*;

// AOJ DSL_2_F RMQ and Range Update Query by Segment Tree
public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		int n = sc.nextInt();
		int[] data = new int[n];
		Arrays.fill(data, Integer.MAX_VALUE);
		RMQ_RUQ ruq = new RMQ_RUQ(data);

		int q = sc.nextInt();
		for (int i = 0; i < q; i++) {
			int cmd = sc.nextInt();

			if (cmd == 0) {
				int s = sc.nextInt();
				int t = sc.nextInt();
				int x = sc.nextInt();

				ruq.update(s, t + 1, x);
			} else if (cmd == 1) {
				int s = sc.nextInt();
				int t = sc.nextInt();

				pr.println(ruq.query(s, t + 1));
//				pr.flush();
			}
		}
	}

	// RMQ and RUQ by Segment Tree
	private static class RMQ_RUQ {
		int[] stUpdate;
		// セグメント内の要素が同一の場合の値。そうでなければNULL
		int[] stMin;
		// セグメント内の最小値
		int n; // dataの要素数(2のべき乗に補正)

		// stUpdate[] が意味を持たない場合の値
		// x>=0の時のは-1など
		final static int NULL = -1;
		final static int INF = Integer.MAX_VALUE;

		public RMQ_RUQ(int[] data) {
			n = 1;
			while (n < data.length) {
				n *= 2;
			}

			stUpdate = new int[2 * n - 1];
			Arrays.fill(stUpdate, NULL);

			stMin = new int[2 * n - 1];
			for (int i = 0, size = data.length; i < size; i++) {
				stMin[n - 1 + i] = data[i];
			}
			for (int i = data.length; i < n; i++) {
				stMin[n - 1 + i] = INF;
			}
			for (int i = n - 2; i >= 0; i--) {
				stMin[i] = Math.min(stMin[2 * i + 1], stMin[2 * i + 2]);
			}
		}

		// l,r:0-indexed
		// [l,r)の値をupdate
		void update(int l, int r, int x) {
			update(l, r, x, 0, 0, n);
		}

		void update(int l, int r, int x, int k, int ll, int rr) {
			if (ll >= l && rr <= r) {
				stUpdate[k] = x;
				stMin[k] = x;
			} else if (ll >= r || rr <= l) {
				// 交差なし
			} else {
				if (stUpdate[k] != NULL) {
					stUpdate[2 * k + 1] = stUpdate[k];
					stUpdate[2 * k + 2] = stUpdate[k];
					stMin[2 * k + 1] = stUpdate[k];
					stMin[2 * k + 2] = stUpdate[k];

					stUpdate[k] = NULL;
//					st2[k] = Math.min(st2[k], x);
				}

				int mm = (ll + rr) / 2;
				update(l, r, x, 2 * k + 1, ll, mm);
				update(l, r, x, 2 * k + 2, mm, rr);

				stMin[k] = Math.min(stMin[2 * k + 1], stMin[2 * k + 2]);
			}
		}

		// l,r:0-indexed
		// [l,r)の値をupdate
		int query(int l, int r) {
			return query(l, r, 0, 0, n);
		}

		int query(int l, int r, int k, int ll, int rr) {
			int ret;

			if (ll >= l && rr <= r) {
				ret = stMin[k];
			} else if (ll >= r || rr <= l) {
				// 交差なし
				ret = INF;
			} else {
				if (stUpdate[k] != NULL) {
					ret = stMin[k];
				} else {
					int mm = (ll + rr) / 2;
					ret = Math.min(query(l, r, 2 * k + 1, ll, mm), query(l, r, 2 * k + 2, mm, rr));
				}
			}

			return ret;
		}
	}

	// ---------------------------------------------------
	public static void main(String[] args) {
		sc = new Scanner(INPUT == null ? System.in : new ByteArrayInputStream(INPUT.getBytes()));
		pr = new Printer(System.out);

		solve();

//		pr.close();
		pr.flush();
//		sc.close();
	}

	static String INPUT = null;

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
		Printer(OutputStream out) {
			super(out);
		}
	}
}

