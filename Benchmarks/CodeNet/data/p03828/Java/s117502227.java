import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	//java11

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		long insuu = -1;
		Map<Long, Long> map = new HashMap<>();

		for(int i=2; i<=N; i++) {
			long n = i;
			while(true) {

				insuu = fact(n);
				if(insuu != -1) {
					if(map.containsKey(insuu)) {
						map.put(insuu, add(map.get(insuu), 1));
					}else {
						map.put(insuu, 1L);
					}
					n = div(n, insuu);
				}
				else
					break;

			}
		}

		long count = 1;
		if(map.size() > 0) {
			count = 1;
			for(Long value : map.values()) {
				count = mul(count, value+1);
//				System.out.println(value+1);
			}
		}

		System.out.println(count);
	}


	//最小の約数を返す(素因数分解用)
	public static long fact(long n){
		if(n < 2)
			return -1;

		for(int i=2; i<=Math.sqrt(n); i++) {
			if(n % i == 0)
				return i;
		}

		return n;
	}

	//modを指定するパターン
	public static final int MOD = 1000000007;
	public static final int MAX = 510000;

	public static long[] fac;
	public static long[] finv;
	public static long[] inv;

	public static long[] com;

	//負の数に対応したあまり
	public static long mod(long a) {
		long res = a % MOD;
		if(res < 0)
			res += MOD;

		return res;
	}

	//MODの足し算
	public static long add(long a, long b) {
		long res = a + b;
		if(res > MOD)
			res %= MOD;

		return res;
	}

	//MODの引き算
	public static long sub(long a, long b) {
		return mod(a - b);
	}

	//MODの掛け算
	public static long mul(long a, long b) {
		return a * b % MOD;
	}

	//MODの割り算
	public static long div(long a, long b) {
		return a * modinv(b) % MOD;
	}

	//MODの累乗(二分累乗法)
	public static long modpow(long a, long n) {
		long res = 1;
		while (n > 0) {
			if ((n & 1) == 1)
				res = res * a % MOD;

			a = a * a % MOD;
			n >>= 1;
	    }

	    return res;
	}

	//逆元（拡張ユークリッドの互除法）
	public static long modinv(long a) {
		long b = MOD;
		long u = 1;
		long v = 0;

		long tmp;
		while(b != 0) {
			long t = a / b;
			a -= t * b;
			//swap
			tmp = a;
			a = b;
			b = tmp;

			u -= t * v;
			//swap
			tmp = u;
			u = v;
			v = tmp;
		}

		u %= MOD;
		if(u < 0)
			u += MOD;
		return u;
	}

	//MODのnCr計算の前処理(nCrを計算するとき必ず前に入れる)
	public static void ComInit() {
		fac = new long[MAX];
		finv = new long[MAX];
		inv = new long[MAX];

		fac[0] = 1;
		fac[1] = 1;
		finv[0] = 1;
		finv[1] = 1;
		inv[1] = 1;

		for(int i=2; i<MAX; i++) {
			fac[i] = fac[i - 1] * i % MOD;
	        inv[i] = MOD - inv[MOD % i] * (MOD / i) % MOD;
	        finv[i] = finv[i - 1] * inv[i] % MOD;
		}
	}

	//MODのnCr計算(r,n <= 10^7)
	public static long Com(int n, int r) {
		if(n < r)
			return 0;

		if(n < 0 || r < 0)
			return 0;

		return fac[n] * (finv[r] * finv[n - r] % MOD) % MOD;
	}

	//MODのnCr計算の前処理(nCrを計算するとき必ず前に入れる)(n <= 10^9の場合)
	public static void ComInit_bign(int n, int r) {
		com = new long[r+1];

		com[0] = 1;
		com[1] = n;

		for(int i=2; i<=r; i++) {
			com[i] = com[i-1] * div(n-i+1, i) % MOD;
		}
	}

	//MODのnCr計算(r <= 10^7 n <= 10^9)
	public static long Com_bign(int n, int r) {
		if(n < r)
			return 0;

		if(n < 0 || r < 0)
			return 0;

		if(r > n / 2)
			return com[n-r];
		else
			return com[r];
	}

}
