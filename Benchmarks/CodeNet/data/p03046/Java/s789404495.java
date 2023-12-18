import java.io.*;
import java.util.*;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		int m = sc.nextInt();
		int k = sc.nextInt();

		if (k == 0) {
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < 0x1 << m; i++) {
				if (i > 0) {
					sb.append(' ');
				}
				sb.append(i);
				sb.append(' ');
				sb.append(i);
			}
			
			pr.println(sb);
			return;
		}

		int xor = 0;
		for (int i = 0; i < 0x1 << m; i++) {
			xor ^= i;
		}
		if (xor != 0 || k >= 0x1 << m) {
			pr.println(-1);
			return;
		}

		List<Integer> ans1 = new ArrayList<>();
		List<Integer> ans2 = new ArrayList<>();
		for (int i = 0; i < 0x1 << m; i++) {
			if (Integer.bitCount(i) == 1 && (i & k) != 0) {
				ans1.add(i);
			} else {
				ans2.add(i);
			}
		}
		
		StringBuilder ans = new StringBuilder();
		boolean flag = false;
		for (int e : ans1) {
			if (!flag) {
				flag = true;
			} else {
				ans.append(' ');
			}
			ans.append(e);
		}
		for (int e : ans2) {
			if (!flag) {
				flag = true;
			} else {
				ans.append(' ');
			}
			ans.append(e);
		}
		Collections.reverse(ans1);
		Collections.reverse(ans2);
		for (int e : ans1) {
			if (!flag) {
				flag = true;
			} else {
				ans.append(' ');
			}
			ans.append(e);
		}
		for (int e : ans2) {
			if (!flag) {
				flag = true;
			} else {
				ans.append(' ');
			}
			ans.append(e);
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
