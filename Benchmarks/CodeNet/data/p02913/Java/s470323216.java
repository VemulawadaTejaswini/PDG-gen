import java.io.*;
import java.util.*;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		int n = sc.nextInt();
		String s = sc.next();
		char[] ss = s.toCharArray();

//		long stime = System.currentTimeMillis();

		MOD = 1_000_000_007;
//		MOD = 987_653_201;
		MOD2 = 987_653_209;
//		int b = 1_009;
		int b = 1_009;
		int b2 = 1_007;
		h = new long[n + 1];
		h2 = new long[n + 1];
//		long invb = modPow(b, MOD - 2, MOD);
		bb = new long[n + 1];
		bb2 = new long[n + 1];
		bb[0] = 1;
		bb2[0] = 1;
		for (int i = 0; i < n; i++) {
			bb[i + 1] = bb[i] * b;
			bb[i + 1] %= MOD;
			bb2[i + 1] = bb2[i] * b2;
			bb2[i + 1] %= MOD2;
		}
		for (int i = 0; i < n; i++) {
			h[i + 1] = (h[i] * b + ss[i]) % MOD;
			h2[i + 1] = (h2[i] * b2 + ss[i]) % MOD2;
		}
		
//		pr.println(System.currentTimeMillis() - stime);

		for (int d = n / 2; d > 0; d--) {
			long[] hlist = new long[n];
			int j = 0;
			for (int i = 0; i + d <= n; i++) {
				long hash = h(i, i + d);

				hlist[j++] = hash;
			}

			PairLong[] list = new PairLong[j];
			for (int i = 0; i < j; i++) {
				list[i] = new PairLong(hlist[i], i);
			}
			Arrays.sort(list);
			
			for (int i = 0, k = 0; i < j; ) {
				while (k < j && list[i].a == list[k].a) {
					k++;
				}
				
				if (list[k - 1].b - list[i].b >= d) {
					pr.println(d);
					return;
				}
				
				i = k;
			}
		}

		pr.println(0);

//		pr.println(System.currentTimeMillis() - stime);
	}
	
	private static long h(int i, int j) {
		long tmp = h[j] - bb[j - i] * h[i];
		tmp %= MOD;
//		tmp += MOD;
//		tmp %= MOD;
		if (tmp < 0) {
			tmp += MOD;
		}

		long tmp2 = h2[j] - bb2[j - i] * h2[i];
		tmp2 %= MOD2;
//		tmp += MOD;
//		tmp %= MOD;
		if (tmp2 < 0) {
			tmp2 += MOD2;
		}

		return tmp | tmp2 << 32;
	}

	static long[] h;
	static long[] bb;
	static int MOD;
	static long[] h2;
	static long[] bb2;
	static int MOD2;
	
	static long modPow(long a, long n, int MOD) {
		long loop = n;
		long ret = 1;
		long x = a % MOD;
		while (loop > 0) {
			if (loop % 2 == 1) {
				ret = ret * x % MOD;
			}
			x = x * x % MOD;
			loop /= 2;
		}

		return ret;
	}
	
	static class PairLong implements Comparable<PairLong> {
		long a;
		long b;

		PairLong(long a, long b) {
			this.a = a;
			this.b = b;
		}

		@Override
		public int compareTo(PairLong o) {
			int result = Long.compare(a, o.a);
			if (result == 0) {
				result = Long.compare(b, o.b);
			}
			return result;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = (int) (a ^ (a >>> 32));
			;
			result = prime * result + (int) (b ^ (b >>> 32));
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (!(obj instanceof PairLong))
				return false;

			PairLong o = (PairLong) obj;
			return a == o.a && b == o.b;
		}

		@Override
		public String toString() {
			//			Pair [xxx, xxxx]
			StringBuilder stmp = new StringBuilder(64);
			stmp.append("PairLong [");
			stmp.append(a);
			stmp.append(',');
			stmp.append(' ');
			stmp.append(b);
			stmp.append(']');

			return stmp.toString();
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

		int[][] nextIntArrays(int n, int m) {
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
