import java.io.*;
import java.util.*;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		int n = sc.nextInt();
		int k = sc.nextInt();

		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		
		BitSet bs[] = new BitSet[n + 1];
		BitSet bsr[] = new BitSet[n + 1];
		BitSet bstmp = new BitSet(k + 1);
		bstmp.set(0);
		bs[0] = (BitSet)bstmp.clone();
		for (int i = 0; i < n; i++) {
			for (int j = k - 1 - a[i]; j >= 0; j--) {
				if (bstmp.get(j)) {
					bstmp.set(j + a[i]);
				}
			}

			bs[i + 1] = (BitSet)bstmp.clone();
		}

		bstmp.clear();
		bstmp.set(0);
		bsr[n] = (BitSet) bstmp.clone();
		for (int i = n - 1; i >= 0; i--) {
			for (int j = k - 1 - a[i]; j >= 0; j--) {
				if (bstmp.get(j)) {
					bstmp.set(j + a[i]);
				}
			}

			bsr[i] = (BitSet)bstmp.clone();
		}

		int ans = 0;
		out:
		for (int i = 0; i < n; i++) {
			BitSet l = bs[i];
			BitSet r = bsr[i + 1];

			int ls = 0;
			int rs = 0;
			for (int ll = ls, rr = r.previousSetBit(k - 1); ll >= 0; ll = l.nextSetBit(ll + 1)) {
//				int nrr;
//				while ((nrr = r.previousSetBit(rr - 1)) >= rs && ll + nrr >= k - a[i]) {
				for (int nrr; (nrr = r.previousSetBit(rr - 1)) >= rs && ll + nrr >= k - a[i]; rr = nrr) {
//				while (rr >= rs) {
//					int nrr = r.previousSetBit(rr - 1);
//					if (nrr < rs || ll + nrr < k - a[i]) {
//						break;
//					}
					
//					rr = nrr;
				}

				if (ll + rr >= k - a[i] && ll + rr < k) {
					continue out;
				}
			}

			ans++;
//			pr.println(a[i]);
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
	}
}
