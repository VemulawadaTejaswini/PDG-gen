import java.io.*;
import java.util.*;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		final int MOD = 1_000_000_007;

		int n = sc.nextInt();
		int m = sc.nextInt();

		Prime prime = new Prime((int)Math.sqrt(m));
		PC pc = new PC(n + 32, MOD);
		
		Map<Long, Integer> pf = prime.primeFactorize(m);
		
		long ans = 1;
		for (int e : pf.values()) {
			ans *= pc.C(n - 1 + e, e);
			ans %= MOD;
		}

		pr.println(ans);
	}

	static class Prime implements Iterable<Integer> {
		private int n;
		private BitSet p;

		Prime(int n) {
			this.n = n;

			p = new BitSet(n / 2);
			int m = (int)Math.sqrt(n);

//			for (int i = 1; i <= m; i++) {
			for (int bi = p.nextClearBit(0); 2 * (bi + 1) + 1 <= m; bi = p.nextClearBit(bi + 1)) {
				long i = bi + 1;
//				if (p.get(i - 1)) {
//					continue;
//				}

				for (long j = 2 * i * (i + 1); 2 * j + 1 <= n; j += 2 * i + 1) {
					p.set((int)(j - 1));
				}
			}
		}

		boolean isPrime(int n) {
			if (n == 2) {
				return true;
			}

			if (n == 1 || (n & 0x1) == 0) {
				return false;
			}

			return !p.get(n / 2 - 1);
		}

		List<Integer> getPrimeList() {
			List<Integer> ret = new ArrayList<>();
			for (int p : this) {
				ret.add(p);
			}

			return ret;
		}

		Map<Long, Integer> primeFactorize(long x) {
			Map<Long, Integer> hm = new TreeMap<>();
			long n = x;
			for (int p : this) {
				if ((long)p * p > n) {
					break;
				}
				int cnt = 0;
				while (n % p == 0) {
					cnt++;
					n /= p;
				}
				if (cnt > 0) {
					hm.put((long)p, cnt);
				}
			}
			if (n != 1) {
				hm.put(n, 1);
			}

			return hm;
		}

		@Override
		public Iterator<Integer> iterator() {
			return new PrimeIterator();
		}

		private class PrimeIterator implements Iterator<Integer> {
			int index;

			PrimeIterator() {
				index = -1;
			}

			@Override
			public boolean hasNext() {
				if (index == -1) {
					return n >= 2;
				} else {
					return 2 * (index + 1) + 1 <= n;
				}
			}

			@Override
			public Integer next() {
				if (index == -1) {
					if (n >= 2) {
						index = p.nextClearBit(0);
						return 2;
					} else {
						throw new NoSuchElementException();
					}
				} else {
					int ret = 2 * (index + 1) + 1;

					if (ret <= n) {
						index = p.nextClearBit(index + 1);

						return ret;
					} else {
						throw new NoSuchElementException();
					}
				}
			}
		}

		static boolean isPrime(long n) {
			if (n == 2) {
				return true;
			}

			if (n == 1 || (n & 0x1) == 0) {
				return false;
			}

			for (long i = 3; i * i <= n; i += 2) {
				if (n % i == 0) {
					return false;
				}
			}

			return true;
		}
	}

    static class PC {
    	// MOD must be a prime number.
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
		sc = new Scanner(INPUT == null ? System.in : new ByteArrayInputStream(INPUT.getBytes()));
		pr = new Printer(System.out);

		solve();

//		pr.close();
		pr.flush();
//		sc.close();
	}

	static String INPUT = null;

	private static class Printer extends PrintWriter {
		Printer(OutputStream out) {
			super(out);
		}
	}
}
