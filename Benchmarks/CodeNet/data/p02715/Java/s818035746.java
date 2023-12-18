import java.util.*;

public class Main {
	static final int r = 1000000000 + 7;
	static int prime[];
	static List<Integer> primes;

	/*
	 * a: 基数, b: 指数, r: 剰余数 a^b % rを繰り返し二乗法で求めるもの
	 */
	public static int binarypow(long a, long b, int r) {
		if (b == 0)
			return 1;
		if (b == 1)
			return (int) (a % (long) r);
		if (b % 2 == 1)
			return (int) ((a * binarypow(a, b - 1, r)) % (long) r);
		long tmp = binarypow(a, b / 2, r);
		return (int) ((tmp * tmp) % (long) r);
	}

	public static void initprime(int n) {
		prime = new int[n + 1];
		primes = new ArrayList<Integer>();
		prime[0] = prime[1] = -1;
		for (int i = 2; i <= n; ++i) {
			if (prime[i] == 0) {
				prime[i] = 1;
				primes.add(i);
				for (int j = 2; i * j <= n; ++j) {
					prime[i * j] = -1;
				}
			}
		}
	}

	public static boolean isPrime(int t) {
		return prime[t] == 1;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), k = sc.nextInt();
		initprime(k);
		sc.close();
		long ans = 0;
		int dp[] = new int[k + 1];
		for (int i = 1; i <= k; ++i) {
			dp[i] = binarypow((long) (k / i), (long) n, r);
			dp[i] %= r;
		}
		for(int p : primes){
			for(int i = p; i <= k; i += p){
				dp[i / p] -= dp[i];
				dp[i / p] %= r;
			}
		}

		for(int i = 1; i <= k; ++i){
			ans += (long)dp[i] * (long)i;
			ans %= (long)r;
		}

		System.out.println(ans);
	}
}
