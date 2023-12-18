import java.io.*;
import java.util.*;

public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		pc = new PC(1000, MOD);

		n = sc.nextInt();
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();

		pr.println(rec(n, a));
	}

	private static Map<Integer, Long> hm = new HashMap<>();

	private static long rec(int n, int m) {
		if (n == 0) {
			return 1;
		}

		if (m > b || n < 0) {
			return 0;
		}

		int enc = n * 1024 + m;
		if (hm.containsKey(enc)) {
			return hm.get(enc);
		}

		int min = Math.min(d, n / m + 1) + 1;
		long[] tmp = new long[min];
		tmp[0] = pc.C(n, m);
		for (int j = 1; j < min; j++) {
			tmp[j] = tmp[j - 1] * pc.C(n - m * j, m) / (j + 1) % MOD;
//			tmp[j] %= MOD;
		}

		long ret = rec(n, m + 1);
		for (int i = c; m * i <= n && i <= d; i++) {
//			long tmp = 1;
//			for (int j = 0; j < i; j++) {
//				tmp *= pc.C(n - m * j, m) / (j + 1);
//				tmp %= MOD;
//			}
//			long tmp = CC(n, m, i);
//			ret += tmp * rec(n - m * i, m + 1) % MOD;
			ret += tmp[i - 1] * rec(n - m * i, m + 1) % MOD;
			ret %= MOD;
		}

		hm.put(enc, ret);
		return ret;
	}

	private static int n;
	private static int a;
	private static int b;
	private static int c;
	private static int d;

	private static PC pc;
	private static final int MOD = 1_000_000_007;

	@SuppressWarnings("unused")
    private static class PC {
    	// MOD must be prime number.
    	int MOD;
    	// fact[i] : i! % MOD
    	long[] fact;
    	// ifact[i] : 1/i! % MOD
    	long[] ifact;

    	PC(int size, int MOD) {
    		// O(size)
    		// n=sizeまでのnCrを求める。
    		// nHrはn+r-1Crになってしまうので注意

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

    	// 組合せの数
    	int C(int n, int r) {
    		if (r > n) {
    			return 0;
    		}

    		return (int)(((fact[n] * ifact[n - r]) % MOD) * ifact[r] % MOD);
    	}

    	// 順列
    	int P(int n, int r) {
    		if (r > n) {
    			return 0;
    		}

    		return (int)((fact[n] * ifact[n -r]) % MOD);
    	}

    	// 重複組み合わせ
    	// 異なるn種のものから重複を許してr個を選ぶ場合の数
    	// 0個の種類もあり得る
    	int H(int n, int r) {
    		if (n == 0 && r == 0) {
    			return 1;
    		}

    		return C(n + r - 1, r);
    	}

    	// 組合せの数(nが大きいとき)
    	//   O(r)で求めることができる。rはsizeの大きさまで
    	int C2(long n, int r) {
    		long ret = ifact[r];
    		for (int i = 1; i <= r; i++) {
    			long tmp = (n - r + i) % MOD;
    			ret = (ret * tmp) % MOD;
    		}

    		return (int)ret;
    	}

    	// 第2種スターリング数
    	// n人をちょうどr個のグループに分ける(グループの区別はなし)
    	// グループの区別をする場合はr!S(n,r)。全射の場合の数と同義
    	// O(r log n)
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

    	// 組合せの数
    	// パスカルの三角形MODなし
		// 限界：n=66 : 66C33=7219428434016265740
    	private final static int LIMIT = 66;
    	private static int to;
    	private static long[][] cache;

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
