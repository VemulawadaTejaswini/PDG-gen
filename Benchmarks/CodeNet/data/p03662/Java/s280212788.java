import java.io.*;
import java.util.*;

public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		int n = sc.nextInt();

		List<List<Integer>> edges = new ArrayList<>(n);
		for (int i = 0; i < n; i++) {
			edges.add(new ArrayList<>());
		}

		for (int i = 0; i < n - 1; i++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;

			edges.get(a).add(b);
			edges.get(b).add(a);
		}

		int[] cnt = new int[n];
		int[] p = new int[n];
		boolean[] f = new boolean[n];
		Arrays.fill(p, -1);
		boolean[] used = new boolean[n];
		boolean[] used2 = new boolean[n];
		Deque<Integer> st = new ArrayDeque<>();
		st.push(0);
		p[0] = 0;
		while (!st.isEmpty()) {
			int e = st.peek();

			if (used[e]) {
				st.pop();
			} else if (used2[e]) {
				st.pop();
				used[e] = true;

				cnt[e]++;
				cnt[p[e]] += cnt[e];
				f[p[e]] |= f[e];
			} else {
				used2[e] = true;
				for (int next : edges.get(e)) {
					if (used[next]) {
						continue;
					}
					if (used2[next]) {
						// 後退辺
						continue;
					}
					if (next == n - 1) {
						f[e] = true;
						continue;
					}

					st.push(next);
					p[next] = e;
				}
			}
		}

		final int OFFSET = 1_000_000;
		Arrays.fill(used, false);
		PriorityQueue<Integer> fq = new PriorityQueue<Integer>();
		PriorityQueue<Integer> sq = new PriorityQueue<Integer>();
//		used[0] = true;
		fq.add(0);
//		used[n - 1] = true;
		sq.add(n - 1);

		while (true) {
			while (!fq.isEmpty() && used[fq.peek() % OFFSET]) {
				fq.remove();
			}

			if (fq.isEmpty()) {
				pr.println("Snuke");
				return;
			} else {
				int fe = fq.remove() % OFFSET;
				used[fe] = true;
				for (int next : edges.get(fe)) {
					if (!used[next]) {
						if (!f[next]) {
							fq.add(next + OFFSET);
						} else {
							fq.add(next);
						}
//						used[next] = true;
					}
				}
			}

			while (!sq.isEmpty() && used[sq.peek() % OFFSET]) {
				sq.remove();
			}

			if (sq.isEmpty()) {
				pr.println("Fennec");
				return;
			} else {
				int se = sq.remove() % OFFSET;
				used[se] = true;
				for (int next : edges.get(se)) {
					if (!used[next]) {
						if (!f[next]) {
							sq.add(next + OFFSET);
						} else {
							sq.add(next);
						}
//						used[next] = true;
					}
				}
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
