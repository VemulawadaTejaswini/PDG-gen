import java.io.*;
import java.util.*;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		int n = sc.nextInt();
		int q = sc.nextInt();

		LazySegmentTree rmq = new LazySegmentTree(new long[n]);

		for (int i = 0; i < q; i++) {
			int cmd = sc.nextInt();

			if (cmd == 0) {
				int s = sc.nextInt();
				int t = sc.nextInt();
				int x = sc.nextInt();

				rmq.update(s, t + 1, x);
			} else if (cmd == 1) {
				int s = sc.nextInt();
				int t = sc.nextInt();

				pr.println(rmq.query(s, t + 1));
				pr.flush();
			}
		}
	}

	/**
	 * 遅延評価 Segment Tree
	 * 区間更新(update)
	 */
	static class LazySegmentTree {
		long[] st; // データ用SegmentTree
		long[] lazy; // 遅延評価用
		int n; // dataの要素数(2のべき乗に補正)
		
		private static final int RSumQ = 0;
		private static final int RMinQ = 1;
		private static final int RMaxQ = 2;

		final static int QueryType = RSumQ;

		final static long NULL = Long.MIN_VALUE; // 遅延評価不要を表す
		static long INIT; // 初期値

		public LazySegmentTree(long[] data) {
			n = 1;
			while (n < data.length) {
				n *= 2;
			}
			
			switch (QueryType) {
			case RSumQ:
				INIT = 0;
				break;
			case RMinQ:
				INIT = Long.MAX_VALUE;
				break;
			case RMaxQ:
				INIT = Long.MIN_VALUE;
				break;
			}

			lazy = new long[2 * n - 1];
			Arrays.fill(lazy, NULL);

			st = new long[2 * n - 1];
			for (int k = 0, size = data.length; k < n; k++) {
				if (k < size) {
					st[n - 1 + k] = data[k];
				} else {
					st[n - 1 + k] = INIT;
				}
			}
			for (int k = n - 2; k >= 0; k--) {
				long q1 = st[2 * k + 1];
				long q2 = st[2 * k + 2];
				
				switch (QueryType) {
				case RSumQ:
					st[k] = q1 + q2; // RSumQ
					break;
				case RMinQ:
					st[k] = Math.min(q1, q2); // RMinQ
					break;
				case RMaxQ:
					st[k] = Math.max(q1, q2); // RMaxQ
					break;
				}
			}
		}

		// l,r:0-indexed
		// [l,r)の値をupdate
		void update(int l, int r, int x) {
			update(l, r, x, 0, 0, n);
		}

		private void update(int l, int r, int x, int k, int ll, int rr) {
			if (ll >= l && rr <= r) {
				lazy[k] = x;
				
				switch (QueryType) {
				case RSumQ:
					st[k] = x * (rr -ll); // RSumQ
					break;
				case RMinQ:
				case RMaxQ:
					st[k] = x; // RMinQ, RMaxQ
					break;
				}
			} else if (ll >= r || rr <= l) {
				// 交差なし
			} else {
				int mm = (ll + rr) / 2;

				propagate(k, ll, rr);
				update(l, r, x, 2 * k + 1, ll, mm);
				update(l, r, x, 2 * k + 2, mm, rr);

				long q1 = st[2 * k + 1];
				long q2 = st[2 * k + 2];
				
				switch (QueryType) {
				case RSumQ:
					st[k] = q1 + q2; // RSumQ
					break;
				case RMinQ:
					st[k] = Math.min(q1, q2); // RMinQ
					break;
				case RMaxQ:
					st[k] = Math.max(q1, q2); // RMaxQ
					break;
				}
			}
		}

		private void propagate(int k, int ll, int rr) {
			if (lazy[k] != NULL) {
				int mm = (ll + rr) / 2;
				
				lazy[2 * k + 1] = lazy[k];
				lazy[2 * k + 2] = lazy[k];

				switch (QueryType) {
				case RSumQ:
					st[2 * k + 1] = lazy[k] * (mm - ll); // RSumQ
					st[2 * k + 2] = lazy[k] * (rr - mm); // RSumQ
					break;
				case RMinQ:
				case RMaxQ:
					st[2 * k + 1] = lazy[k]; // RMinQ, RMaxQ
					st[2 * k + 2] = lazy[k]; // RMinQ, RMaxQ
					break;
				}

				lazy[k] = NULL;
			}
		}

		// l,r:0-indexed
		// [l,r)に対するクエリ
		long query(int l, int r) {
			return query(l, r, 0, 0, n);
		}

		private long query(int l, int r, int k, int ll, int rr) {
			long ret = 0;

			if (ll >= l && rr <= r) {
				ret = st[k];
			} else if (ll >= r || rr <= l) {
				// 交差なし
				ret = INIT;
			} else {
				int mm = (ll + rr) / 2;

				propagate(k, ll, rr);
				long q1 = query(l, r, 2 * k + 1, ll, mm);
				long q2 = query(l, r, 2 * k + 2, mm, rr);

				switch (QueryType) {
				case RSumQ:
					ret = q1 + q2; // RSumQ
					break;
				case RMinQ:
					ret = Math.min(q1, q2); // RMinQ
					break;
				case RMaxQ:
					ret = Math.max(q1, q2); // RMaxQ
					break;
				}
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

		long[] nextLongArray(int n) {
			long[] ret = new long[n];
			for (int i = 0; i < n; i++) {
				ret[i] = sc.nextLong();
			}
			
			return ret;
		}

		int[][] nextIntArrays(int m, int n) {
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

