import java.io.*;
import java.util.*;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		int n = sc.nextInt();
		x = sc.nextInt();

		a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		PriorityQueue<Integer> pq = new PriorityQueue<>(11, new MyComparator());
		for (int i = 1; i < n - 1; i++) {
			int sum1 = a[i - 1] + a[i];
			int sum2 = a[i] + a[i + 1];
			if (sum1 > x && sum2 > x && a[i] > 0) {
				pq.add(i);
			}
		}

		long ret = 0;
		Set<Integer> hs = new HashSet<Integer>();
		while (!pq.isEmpty()) {
			int e = pq.remove();
			if (hs.contains(e)) {
				int sum1 = a[e - 1] + a[e];
				int sum2 = a[e] + a[e + 1];
				if (sum1 > x && sum2 > x && a[e] > 0) {
					pq.add(e);
					hs.remove(e);
				}
				continue;
			}

			int sum1 = a[e - 1] + a[e];
			int sum2 = a[e] + a[e + 1];
			int tmp = Math.min(a[e], Math.max(sum1 - x, sum2 - x));

			a[e] -= tmp;
			ret += tmp;
			hs.add(e - 1);
			hs.add(e + 1);
		}

		for (int i = 0; i < n; i++) {
			ret += Math.max(0, a[i] - x);
		}

		pr.println(ret);
	}

	private static int[] a;
	private static int x;

	private static class MyComparator implements Comparator<Integer>{
		@Override
		public int
		compare(Integer o1, Integer o2) {
			int sum1 = a[o1 - 1] + a[o1];
			int sum2 = a[o1] + a[o1 + 1];
			int tmp1 = Math.min(a[o1], Math.max(sum1 - x, sum2 - x));

			sum1 = a[o2 - 1] + a[o2];
			sum2 = a[o2] + a[o2 + 1];
			int tmp2 = Math.min(a[o2], Math.max(sum1 - x, sum2 - x));

			return Integer.compare(tmp1, tmp2);
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
