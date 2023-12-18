import java.io.*;
import java.util.*;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		int n = sc.nextInt();
		char[] s = sc.next().toCharArray();

		int max = 0;
		int cnt = 0;
		for (int i = 0; i < n; i++) {
			if (i == 0 || s[i - 1] == s[i]) {
				cnt++;
			} else {
				max = Math.max(max, cnt / 2);
				cnt = 1;
			}
		}
		max = Math.max(max, cnt / 2);

		SuffixArray sa = new SuffixArray(s);
		for (int i = 0; i < n; i++) {
			int len = Math.min(n - sa.sa[i], n - sa.sa[i + 1]);
			len = Math.min(len, Math.abs(sa.sa[i] - sa.sa[i + 1]));
			
			int i1 = sa.sa[i];
			int i2 = sa.sa[i + 1];
			int j;
			for (j = 0; j < len; j++) {
				if (s[i1 + j] != s[i2 + j]) {
					break;
				}
			}
			max = Math.max(max, j);
		}
		
		pr.println(max);
	}

	static class SuffixArray {
		char[] s;
		int n;

		Integer[] sa;
		int[] rank;
		int[] rtmp;
		SaComparator sac;

		int k;

		// 蟻本より。Manber&Myersアルゴリズム。
		// SAの構築にO(nlog^2n)
		// 検索にO(|T|log|S|)
		SuffixArray(char[] str) {
			this.s = str;
			n = s.length;

			sa = new Integer[n + 1];
			rank = new int[n + 1];
			rtmp = new int[n + 1];
			for (int i = 0; i <= n; i++) {
				sa[i] = i;
				if (i < n) {
					rank[i] = s[i];
				} else {
					rank[i] = 0;
				}
			}

			sac = new SaComparator();

			for (k = 1; k < n; k *= 2) {
				Arrays.sort(sa, sac);

				rtmp[sa[0]] = rank[sa[0]];
				for (int i = 1; i <= n; i++) {
					if (sac.compare(sa[i - 1], sa[i]) == 0) {
						rtmp[sa[i]] = rtmp[sa[i - 1]];
					} else {
						rtmp[sa[i]] = rtmp[sa[i - 1]] + 1;
					}
				}

				int[] tmp = rtmp;
				rtmp = rank;
				rank = tmp;
			}
		}

		boolean contains(char[] t) {
			int l = 0;
			int r = n;
			while (r > l) {
				int mid = l + (r - l) / 2;
				int res = compare(s, mid, t);

				if (res >= 0) {
					r = mid;
				} else {
					l = mid + 1;
				}
			}

			return compare(s, l, t) == 0;
		}

		int compare(char[] s, int mid, char[] t) {
			int m = t.length;

			for (int i = 0; sa[mid] + i < n && i < m; i++) {
				int res = s[sa[mid] + i] - t[i];

				if (res != 0) {
					return res;
				}
			}

			if (sa[mid] + m > n) {
				return -1;
			} else {
				return 0;
			}
		}

		private class SaComparator implements Comparator<Integer> {

			@Override
			public int compare(Integer i, Integer j) {
				if (rank[i] != rank[j]) {
					return Integer.compare(rank[i], rank[j]);
				}

				int ri = i + k <= n ? rank[i + k] : -1;
				int rj = j + k <= n ? rank[j + k] : -1;
				return Integer.compare(ri, rj);
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
