import java.io.*;
import java.util.*;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		final int MOD = 998_244_353;

		int n = sc.nextInt();
		char[] s = sc.next().toCharArray();
		
		PC pc = new PC(n, MOD);

		List<Integer> r = new ArrayList<>(n);
		List<Integer> g = new ArrayList<>(n);
		List<Integer> b = new ArrayList<>(n);
		for (int i = 0; i < 3 * n; i++) {
			if (s[i] == 'R') {
				r.add(i);
			} else if (s[i] == 'G') {
				g.add(i);
			} else if (s[i] == 'B') {
				b.add(i);
			}
		}
		
		int[] t = new int[3 * n];
		for (int i = 0; i < n; i++) {
			int rr = r.get(i);
			int gg = g.get(i);
			int bb = b.get(i);
			
			int max = Math.max(rr, Math.max(gg, bb));
			int min = Math.min(rr, Math.min(gg, bb));
			
			t[max] = 1;
			t[min] = -1;
		}

		long[] cnt = new long[3];
		long ans = 1;
		for (int i = 0; i < 3 * n; i++) {
			if (t[i] == -1) {
			} else if (t[i] == 0) {
				ans *= cnt[0] - cnt[1];
			} else if (t[i] == 1) {
				ans *= cnt[1] - cnt[2];
			}
			cnt[t[i] + 1]++;
			
			ans %= MOD;
			
			long min = Math.min(cnt[0], Math.min(cnt[1], cnt[2]));
			for (int j = 0; j < 3; j++) {
				cnt[j] -= min;
			}
		}

		ans *= pc.fact[n];
		ans %= MOD;

		pr.println(ans);
	}

	/**
	 * 組合せの数、順列、重複組み合わせなどを求める
	 * MOD による剰余を返す
	 */
    static class PC {
    	/** 除数。素数であることが基本的に必要(逆元をフェルマーの小定理で求めているため) */
    	int MOD;
    	/** 階乗 {@code fact[i]=i! % MOD} */
    	long[] fact;
    	/** 階乗の逆元 {@code ifact[i]=1/i! % MOD} */
    	long[] ifact;

    	/**
    	 * size を引数の上限とし、MOD を除数として剰余を取るインスタンスを返す
    	 * O(size) の事前処理が必要
    	 * 
    	 * @param size 主なメソッドの引数の上限値
    	 * @param MOD 除数
    	 */
    	PC(int size, int MOD) {
    		this.MOD = MOD;

    		fact = new long[size + 1];
    		fact[0] = 1;
    		for (int i = 1; i <= size; i++) {
    			fact[i] = fact[i - 1] * i % MOD;
    		}

    		ifact = new long[size + 1];

    		int loop = MOD - 2;
    		long x = fact[size];
    		ifact[size] = 1;
    		while (loop > 0) {
    			if (loop % 2 == 1) {
    				ifact[size] = ifact[size] * x % MOD;
    			}
    			x = x * x % MOD;
    			loop /= 2;
    		}

    		for (int i = size - 1; i >= 0; i--) {
    			ifact[i] = ifact[i + 1] * (i + 1) % MOD;
    		}

    	}

    	/**
    	 * 組合せの数 nCr を返す
    	 * O(1)
    	 * 
    	 * @param n {@literal 0<=n<=size}
    	 * @param r {@literal r>=0}
    	 * @return nCr の値(MOD による剰余)
    	 */
    	int C(int n, int r) {
    		if (r > n) {
    			return 0;
    		}

    		return (int)(((fact[n] * ifact[n - r]) % MOD) * ifact[r] % MOD);
    	}

    	// 
    	/**
    	 * 順列 nPr を返す
    	 * O(1)
    	 * 
    	 * @param n {@literal 0<=n<=size}
    	 * @param r {@literal r>=0}
    	 * @return nPr の値(MOD による剰余)
    	 */
    	int P(int n, int r) {
    		if (r > n) {
    			return 0;
    		}

    		return (int)((fact[n] * ifact[n -r]) % MOD);
    	}

    	/**
    	 * 重複組み合わせ nHr を返す
    	 * 異なるn種のものから重複を許してr個を選ぶ場合の数
    	 * 0個の種類もあり得る
    	 * O(1)
    	 * 
    	 * @param n {@literal 0<=n+r-1<=size}(他と上限が異なる)
    	 * @param r {@literal r>=0}
    	 * @return nHr の値(MOD による剰余)
    	 */
    	int H(int n, int r) {
    		if (n == 0 && r == 0) {
    			return 1;
    		}

    		return C(n + r - 1, r);
    	}

    	/**
    	 * 組合せの数 nCr を返す(nが大きいとき)
    	 * O(r)
    	 * 
    	 * @param n {@literal n>=0}(上限はなくlongの範囲内であればよい)
    	 * @param r {@literal 0<=r<=size}
    	 * @return nCr の値(MOD による剰余)
    	 */
    	int C2(long n, int r) {
    		long ret = ifact[r];
    		for (int i = 1; i <= r; i++) {
    			long tmp = (n - r + i) % MOD;
    			ret = (ret * tmp) % MOD;
    		}

    		return (int)ret;
    	}

    	/**
    	 * 第2種スターリング数 S(n,r) を返す
    	 * n人をちょうどr個のグループに分ける(グループの区別はなし)
    	 * グループの区別をする場合はr!S(n,r)。全射の場合の数と同義
    	 * O(r log n)
    	 * 
    	 * @param n {@literal n>=0}(上限はなくlongの範囲内であればよい)
    	 * @param r {@literal 0<=r<=size}
    	 * @return S(n,r) の値(MOD による剰余)
    	 */
    	int S(long n, int r) {
    		//全射の場合の数を包除原理を使って求めて、1/r!をかける。
    		long ret = 0;
    		for (int i = 1; i <= r; i++) {
    			long tmp = (r - i) % 2 == 0 ? 1 : -1;
    			tmp *= pow(i, n) * C(r, i) % MOD;
    			ret = (ret + tmp + MOD) % MOD;
    		}
    		ret = ret * ifact[r] % MOD;

    		return (int)ret;
    	}

    	/**
    	 * 繰り返し二乗法によるべき乗 {@code a^n % MOD} を返す
    	 * O(log n)
    	 * 
    	 * @param a 底
    	 * @param n べき指数
    	 * @return a^n の値(MOD による剰余)
    	 */
    	long pow(int a, long n) {
    		long loop = n;
    		long ret = 1;
    		long x = a;
    		while (loop > 0) {
    			if (loop % 2 == 1) {
    				ret = ret * x % MOD;
    			}
    			x = x * x % MOD;
    			loop /= 2;
    		}

    		return ret;
    	}

    	private final static int LIMIT = 66;
    	private static int to;
    	private static long[][] cache;

    	/**
    	 * 組合せの数 nCr を返す(MODによる剰余なし)
    	 * パスカルの三角形によって求める
    	 * 限界：n=66 : 66C33=7_219_428_434_016_265_740
    	 * O(n^2)
    	 * 
    	 * @param n {@literal 0<=n<=66}
    	 * @param r {@literal 0<=r}
    	 * @return nCr の値
    	 * @throws IllegalArgumentException {@literal n>66}の場合
    	 */
    	static long CLong(int n, int r) {
    		if (r > n) {
    			return 0;
    		}

    		if (n > LIMIT) {
    			throw new IllegalArgumentException(Integer.toString(n));
    		}

    		if (cache == null) {
    			cache = new long[LIMIT + 1][];
    			cache[0] = new long[1];
    			cache[0][0] = 1;
    			to = 0;
    		}

    		if (cache[n] == null) {
    			for (int i = to + 1; i <= n; i++) {
    				cache[i] = new long[i + 1];
    				for (int j = 0; j <= i; j++) {
    					if (j == 0 || j == i) {
    						cache[i][j] = 1;
    					} else {
    						if (Long.MAX_VALUE - cache[i - 1][j - 1] < cache[i - 1][j]) {
    			    			throw new IllegalArgumentException("Overflow");
    						} else {
    							cache[i][j] = cache[i - 1][j - 1] + cache[i - 1][j];
    						}
    					}
    				}
    			}
    			to = n;
    		}

    		return cache[n][r];
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
