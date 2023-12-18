import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
	MyScanner sc = new MyScanner();
	Scanner sc2 = new Scanner(System.in);
	long start = System.currentTimeMillis();
	long fin = System.currentTimeMillis();
	final int MOD = 1000000007;
	int[] dx = { 1, 0, 0, -1 };
	int[] dy = { 0, 1, -1, 0 };

	void run() {
		String T = sc.next();
		int N = T.length();
		if(N>50) return;
		int res = 0;
		for (int k = 0; k < N; k++) {
			List<String> l = new ArrayList<>();
			for (int i = N - k; i >= 1; i--) {
				for (int j = 0; j + i <= N; j++) {
					String sub = T.substring(j, j + i);
					boolean f = true;
					for (int s = 0; s < l.size(); s++) {
						if(getLcs(sub.toCharArray(), l.get(s).toCharArray()) == sub.length()) {
							f = false;
							break;
						}
					}
					if(f) l.add(sub);
				}
			}
			res = Math.max(res, l.size());
		}
		System.out.println(res);
	}

	int getLcs(char[] s, char[] t) {
		int n = s.length;
		int m = t.length;
		int[][] dp = new int[n + 1][m + 1];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (s[i] == t[j]) {
					dp[i + 1][j + 1] = dp[i][j] + 1;
				} else {
					dp[i + 1][j + 1] = Math.max(dp[i + 1][j], dp[i][j + 1]);
				}
			}
		}
		return dp[n][m];
	}

	class SuffixArray {
		int n, k;
		char[] s;

		Integer[] sa;
		int[] rank;
		int[] tmp;
		int[] lcp;

		public SuffixArray(char[] c) {
			s = c;
			n = c.length;
		}

		int compare_sa(int i, int j, int k) {
			if (rank[i] != rank[j]) {
				return rank[i] - rank[j];
			}
			int ri = i + k <= n ? rank[i + k] : -1;
			int rj = j + k <= n ? rank[j + k] : -1;
			return ri - rj;
		}

		void construct_sa() {
			sa = new Integer[n + 1];
			rank = new int[n + 1];
			tmp = new int[n + 1];

			for (int i = 0; i <= n; i++) {
				sa[i] = i;
				rank[i] = (i < n) ? s[i] : -1;
			}

			for (k = 1; k <= n; k *= 2) {
				Arrays.sort(sa, new Comparator<Integer>() {
					@Override
					public int compare(Integer i, Integer j) {
						return compare_sa(i, j, k);
					}
				});
				tmp[sa[0]] = 0;
				for (int i = 1; i <= n; i++) {
					tmp[sa[i]] = tmp[sa[i - 1]] + (compare_sa(sa[i - 1], sa[i], k) < 0 ? 1 : 0);
				}
				for (int i = 0; i <= n; i++) {
					rank[i] = tmp[i];
				}
			}
		}

		void construct_lcp() {
			for (int i = 0; i <= n; i++) {
				rank[sa[i]] = i;
			}
			lcp = new int[n];
			int h = 0;
			for (int i = 0; i < n; i++) {
				int j = sa[rank[i] - 1];
				if (h > 0) {
					h--;
				}
				for (; j + h < n && i + h < n; h++) {
					if (s[j + h] != s[i + h]) {
						break;
					}
				}
				lcp[rank[i] - 1] = h;
			}
		}

		long getSubStringCnt() {
			long res = n - sa[n];
			for (int i = 1; i < n; i++) {
				res += (n - sa[i]) - lcp[i];
			}
			return res;
		}

		long getAllSubStringLen() {
			long res = 0;
			for (int i = 1; i <= n; i++) {
				long len = (n - sa[i]);
				long dup = (i < n) ? lcp[i] : 0;
				res += len * (len + 1) / 2 - dup * (dup + 1) / 2;
			}
			return res;
		}

		void dump() {
			StringBuilder sb = new StringBuilder();
			sb.append("i | sa[i] | lcp[i] | S[sa[i]]...]\n");
			for (int i = 0; i <= n; i++) {
				sb.append(i + " | ");
				sb.append(sa[i] + " | ");
				sb.append((i < n ? lcp[i] : "-") + " | ");
				for (int j = sa[i]; j < n; j++) {
					sb.append(s[j]);
				}
				sb.append("\n");
			}
			System.out.println(sb);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}

	void debug2(char[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j]);
			}
			System.out.println();
		}
	}

	boolean inner(int h, int w, int limH, int limW) {
		return 0 <= h && h < limH && 0 <= w && w < limW;
	}

	void swap(int[] x, int a, int b) {
		int tmp = x[a];
		x[a] = x[b];
		x[b] = tmp;
	}

	// find minimum i (k <= a[i])
	int lower_bound(int a[], int k) {
		int l = -1;
		int r = a.length;
		while (r - l > 1) {
			int mid = (l + r) / 2;
			if (k <= a[mid])
				r = mid;
			else
				l = mid;
		}
		// r = l + 1
		return r;
	}

	// find minimum i (k < a[i])
	int upper_bound(int a[], int k) {
		int l = -1;
		int r = a.length;
		while (r - l > 1) {
			int mid = (l + r) / 2;
			if (k < a[mid])
				r = mid;
			else
				l = mid;
		}
		// r = l + 1
		return r;
	}

	long gcd(long a, long b) {
		return a % b == 0 ? b : gcd(b, a % b);
	}

	long lcm(long a, long b) {
		return a * b / gcd(a, b);
	}

	boolean palindrome(String s) {
		for (int i = 0; i < s.length() / 2; i++) {
			if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
				return false;
			}
		}
		return true;
	}

	class MyScanner {
		int nextInt() {
			try {
				int c = System.in.read();
				while (c != '-' && (c < '0' || '9' < c))
					c = System.in.read();
				if (c == '-')
					return -nextInt();
				int res = 0;
				do {
					res *= 10;
					res += c - '0';
					c = System.in.read();
				} while ('0' <= c && c <= '9');
				return res;
			} catch (Exception e) {
				return -1;
			}
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		String next() {
			try {
				StringBuilder res = new StringBuilder("");
				int c = System.in.read();
				while (Character.isWhitespace(c))
					c = System.in.read();
				do {
					res.append((char) c);
				} while (!Character.isWhitespace(c = System.in.read()));
				return res.toString();
			} catch (Exception e) {
				return null;
			}
		}

		int[] nextIntArray(int n) {
			int[] in = new int[n];
			for (int i = 0; i < n; i++) {
				in[i] = nextInt();
			}
			return in;
		}

		int[][] nextInt2dArray(int n, int m) {
			int[][] in = new int[n][m];
			for (int i = 0; i < n; i++) {
				in[i] = nextIntArray(m);
			}
			return in;
		}

		double[] nextDoubleArray(int n) {
			double[] in = new double[n];
			for (int i = 0; i < n; i++) {
				in[i] = nextDouble();
			}
			return in;
		}

		long[] nextLongArray(int n) {
			long[] in = new long[n];
			for (int i = 0; i < n; i++) {
				in[i] = nextLong();
			}
			return in;
		}

		char[][] nextCharField(int n, int m) {
			char[][] in = new char[n][m];
			for (int i = 0; i < n; i++) {
				String s = sc.next();
				for (int j = 0; j < m; j++) {
					in[i][j] = s.charAt(j);
				}
			}
			return in;
		}
	}
}