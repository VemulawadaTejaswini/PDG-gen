import java.io.*;
import java.util.*;
import java.util.Map.*;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		int n = sc.nextInt();
		int m = sc.nextInt();

		int[] x = new int[n];
		Map<Integer, Map<Integer, Integer>> hm = new HashMap<>();
		for (int i = 0; i < n; i++) {
			x[i] = sc.nextInt();

			int mod = x[i] % m;

			if (!hm.containsKey(mod)) {
				hm.put(mod, new HashMap<>());
			}

			Map<Integer, Integer> hmtmp = hm.get(mod);
			if (!hmtmp.containsKey(x[i])) {
				hmtmp.put(x[i], 0);
			}
			hmtmp.put(x[i], hmtmp.get(x[i]) + 1);
		}

		int ret = 0;
		for (Entry<Integer, Map<Integer, Integer>> e : hm.entrySet()) {
			int mod = e.getKey();
			int mod2 = (m - mod) % m;
			Map<Integer, Integer> hmtmp = e.getValue();

			if (mod == mod2) {
				int tmp = 0;
				for (int ee : hmtmp.values()) {
					tmp += ee;
				}

				ret += tmp / 2;
			} else if (mod < mod2) {
				Map<Integer, Integer> hmtmp2 = hm.get(mod2);

				int tmp = 0;
				int ecnt = 0;
				for (int ee : hmtmp.values()) {
					tmp += ee;
					if (ee % 2 == 1) {
						ecnt++;
					}
				}

				int tmp2 = 0;
				int ecnt2 = 0;
				for (int ee : hmtmp2.values()) {
					tmp2 += ee;
					if (ee % 2 == 1) {
						ecnt2++;
					}
				}

				if (ecnt >= ecnt2) {
					ret += ecnt2;
					tmp2 -= ecnt2;
					tmp -= ecnt2;
					ecnt -= ecnt2;
					ecnt2 = 0;

					int tmptmp = Math.min(ecnt, tmp2);
					ret += tmptmp;
					ecnt -= tmptmp;
					tmp -= tmptmp;
					tmp2 -= tmptmp;

					ret += tmp / 2 + tmp2 / 2;
				} else {
					ret += ecnt;
					tmp -= ecnt;
					tmp2 -= ecnt;
					ecnt2 -= ecnt;
					ecnt = 0;

					int tmptmp = Math.min(ecnt2, tmp);
					ret += tmptmp;
					ecnt2 -= tmptmp;
					tmp -= tmptmp;
					tmp2 -= tmptmp;

					ret += tmp / 2 + tmp2 / 2;
				}
			} else {
				break;
			}

		}

		pr.println(ret);
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
