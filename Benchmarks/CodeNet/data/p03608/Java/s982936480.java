import java.io.*;
import java.util.*;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		int n = sc.nextInt();
		int m = sc.nextInt();
		int r = sc.nextInt();

		int[] rr = new int[r];
		for (int i = 0; i < r; i++) {
			rr[i] = sc.nextInt() - 1;
		}

		FloydWarshall fw = new FloydWarshall(n);
		for (int i = 0; i < m; i++) {
			int s = sc.nextInt() - 1;
			int t = sc.nextInt() - 1;
			int d = sc.nextInt();
			fw.addEdge(s, t, d);
			fw.addEdge(t, s, d);
		}

		Permutation np = new Permutation(r);
		long min = Long.MAX_VALUE;
		for (List<Integer> perm : np) {
			if (perm == null) {
				break;
			}

			long dist = 0;
			for (int i = 0, size = perm.size(); i < size - 1; i++) {
				dist += fw.getShortestPath(rr[perm.get(i)], rr[perm.get(i + 1)]);
			}

			min = Math.min(min, dist);
		}

		pr.println(min);
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

	private static class Permutation implements Iterable<List<Integer>>{
		int n;

		boolean[] used;
		List<Integer> perm;
		Deque<Integer> ist;
		PermutationIterator it;

		Permutation(int n) {
			this.n = n;
			used = new boolean[n];
			perm = new ArrayList<Integer>();
			ist = new ArrayDeque<Integer>();
			ist.add(-1);
			it = new PermutationIterator(this);
		}

		List<Integer> next() {
			out:
			while (!ist.isEmpty()) {
				int k = ist.pop();

				if (k != -1) {
					// ループ途中での戻り
					used[k] = false;
					perm.remove(perm.size() - 1);
				} else {
					// 最初から
					int pos = perm.size();

					if (pos == n) {
						// perm に対する操作 =========================
						return perm;
						// perm に対する操作 =========================
					}
				}

				for (int i = k + 1; i < n; i++) {
					if (!used[i]) {
						ist.push(i);

						used[i] = true;
						perm.add(i);
						ist.push(-1);
						continue out;
					}
				}
			}

		return null;
		}

		@Override
		public Iterator<List<Integer>> iterator() {
			return it;
		}

		private static class PermutationIterator implements Iterator<List<Integer>> {

			Permutation p;
			PermutationIterator(Permutation p) {
				this.p = p;
			}

			@Override
			public boolean hasNext() {
				return !p.ist.isEmpty();
			}

			@Override
			public List<Integer> next() {
				return p.next();
			}

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
