import java.io.*;
import java.util.*;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		int n = sc.nextInt();
		int cc = sc.nextInt();

		List<List<Integer>> stc = new ArrayList<>(cc);
		for (int i = 0; i < cc; i++) {
			stc.add(new ArrayList<>());
		}

		int[] s = new int[n];
		int[] t = new int[n];
		int[] c = new int[n];
		for (int i = 0; i < n; i++) {
			s[i] = sc.nextInt();
			t[i] = sc.nextInt();
			c[i] = sc.nextInt() - 1;

			stc.get(c[i]).add(i);
		}

		List<Integer> list = new ArrayList<>(n);
		for (int i = 0; i < cc; i++) {
			Collections.sort(stc.get(i), (o1, o2) -> {return Integer.compare(t[o1], t[o2]);});

			for (int j = 0, pre = 0; j < stc.get(i).size(); j++) {
				int now = stc.get(i).get(j);
				if (j == 0) {
					list.add(now);
					pre = now;
				} else {
					if (t[pre] == s[now]) {
						t[pre] = t[now];
						t[now] = -1;
					} else if (t[pre] > s[now] || c[pre] != c[now]) {
//						pr.printf("%d %d %d %d\n", pre, now, c[pre], c[now]);
//						pr.flush();
						throw new RuntimeException();
					} else {
						list.add(now);
						pre = now;
					}
				}
			}
		}

		Collections.sort(list, (o1, o2) -> {if (t[o1] == t[o2]) return Integer.compare(s[o1], s[o2]); else return Integer.compare(t[o1], t[o2]);});

		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		pq.add(0);
		out:
		for (int e : list) {
			List<Integer> tmp = new ArrayList<>();
			while (!pq.isEmpty()) {
				int ee = pq.remove();

				if (ee > s[e] * 2 - 1) {
					tmp.add(ee);
				} else {
					pq.add(t[e] * 2);
					pq.addAll(tmp);
					continue out;
				}
			}

			pq.addAll(tmp);
			pq.add(t[e] * 2);
		}

		pr.println(pq.size());
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
