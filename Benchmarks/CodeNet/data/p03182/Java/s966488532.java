import java.io.*;
import java.util.*;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		int n = sc.nextInt();
		int m = sc.nextInt();

		int[][] lra = sc.nextIntArrays(3, m);

		List<List<Integer>> list = new ArrayList<>(n);
		for (int i = 0; i < n; i++) {
			list.add(new ArrayList<>());
		}
		for (int i = 0; i < m; i++) {
//			int l = lra[0][i] - 1;
			int r = lra[1][i] - 1;
//			int a = lra[2][i];
			
			list.get(r).add(i);
		}

		LazySegmentTree lst = new LazySegmentTree(LazySegmentTree.QueryType.RMaxQ_RAdd, new long[n]);
		for (int i = 0; i < n; i++) {
			if (i > 0) {
				long max = lst.query(0, i);
				lst.update(i, i + 1, max);
			}
			
			for (int e : list.get(i)) {
				int l = lra[0][e] - 1;
				int r = lra[1][e] - 1;
				int a = lra[2][e];
				
				lst.update(l, r + 1, a);
			}
		}

		pr.println(Math.max(0, lst.query(0, n)));
	}

	/**
	 * 遅延評価 Segment Tree
	 */
	static class LazySegmentTree {
		enum QueryType {
			RSumQ_RUpdate, RSumQ_RAdd, 
			RMinQ_RUpdate, RMinQ_RAdd, 
			RMaxQ_RUpdate, RMaxQ_RAdd, 
		};

		QueryType qt;

		long INIT; // 要素の単位元
		long NULL; // 作用素の単位元
		long[] st; // 要素用SegmentTree
		long[] lazy; // 作用素用SegmentTree
		int n; // 要素数(2のべき乗に補正)


		public LazySegmentTree(LazySegmentTree.QueryType qt, long[] data) {
			this.qt = qt;
			
			n = 1;
			while (n < data.length) {
				n *= 2;
			}

			init();
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

				st[k] = f(q1, q2);
			}
		}

		// l,r:0-indexed
		// [l,r)の値をupdate
		void update(int l, int r, long x) {
			update(l, r, x, 0, 0, n);
		}

		private void update(int l, int r, long x, int k, int ll, int rr) {
			if (ll >= l && rr <= r) {
				lazy[k] = h(lazy[k], x);

				st[k] = g(st[k], x, ll, rr);
			} else if (ll >= r || rr <= l) {
				// 交差なし
			} else {
				int mm = (ll + rr) / 2;

				propagate(k, ll, rr);
				update(l, r, x, 2 * k + 1, ll, mm);
				update(l, r, x, 2 * k + 2, mm, rr);

				long q1 = st[2 * k + 1];
				long q2 = st[2 * k + 2];

				st[k] = f(q1, q2);
			}
		}

		private void propagate(int k, int ll, int rr) {
			if (lazy[k] != NULL) {
				int mm = (ll + rr) / 2;
				
				lazy[2 * k + 1] = h(lazy[2 * k + 1], lazy[k]);
				lazy[2 * k + 2] = h(lazy[2 * k + 2], lazy[k]);

				st[2 * k + 1] = g(st[2 * k + 1], lazy[k], ll, mm);
				st[2 * k + 2] = g(st[2 * k + 2], lazy[k], mm, rr);

				lazy[k] = NULL;
			}
		}

		// l,r:0-indexed
		// [l,r)に対するクエリ
		long query(int l, int r) {
			return query(l, r, 0, 0, n);
		}

		private long query(int l, int r, int k, int ll, int rr) {
			long ret;

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

				ret = f(q1, q2);
			}

			return ret;
		}

		// 要素、作用素の単位元の設定
		private void init() {
			switch (qt) {
			case RSumQ_RUpdate:
			case RSumQ_RAdd:
				NULL = 0;
				INIT = 0;
				return;
			case RMinQ_RUpdate:
			case RMinQ_RAdd:
				NULL = 0;
				INIT = Long.MAX_VALUE;
				return;
			case RMaxQ_RUpdate:
			case RMaxQ_RAdd:
				NULL = 0;
				INIT = Long.MIN_VALUE;
				return;
			}

			return;
		}

		// 2つの区間の要素をマージする二項演算
		private long f(long st1, long st2) {
			switch (qt) {
			case RSumQ_RUpdate:
			case RSumQ_RAdd:
				return st1 + st2;
			case RMinQ_RUpdate:
			case RMinQ_RAdd:
				return Math.min(st1, st2);
			case RMaxQ_RUpdate:
			case RMaxQ_RAdd:
				return Math.max(st1, st2);
			}

			return 0;
		}

		// 要素と作用素をマージする二項演算
		private long g(long st, long x, int ll, int rr) {
			switch (qt) {
			case RSumQ_RUpdate:
				return x * (rr - ll);
			case RSumQ_RAdd:
				return st + x * (rr - ll);
			case RMinQ_RUpdate:
			case RMaxQ_RUpdate:
				return x;
			case RMinQ_RAdd:
			case RMaxQ_RAdd:
				return st + x;
			}

			return 0;
		}

		// 作用素同士をマージする二項演算
		private long h(long x1, long x2) {
			switch (qt) {
			case RSumQ_RUpdate:
			case RMinQ_RUpdate:
			case RMaxQ_RUpdate:
				return x2;
			case RSumQ_RAdd:
			case RMinQ_RAdd:
			case RMaxQ_RAdd:
				return x1 + x2;
			}

			return 0;
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
