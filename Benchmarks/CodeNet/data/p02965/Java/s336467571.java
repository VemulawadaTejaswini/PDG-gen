import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		prepareFact();
		int n = sc.nextInt();
		int m = sc.nextInt();
		int sum = m * 3;
		long ans = combi(n - 1 + sum, n - 1);
		for(int i = m * 2 + 1; i <= sum; i ++) {
			long tmp = combi(n - 2 + (sum - i), n - 2);
			tmp = mod(tmp * (long)n);
			ans = mod(ans - tmp);
		}

		long minus = 0;
		for(int i = m + 2; i <= n; i += 2) {
			long tmp = perm(n - 1 + (sum - i) / 2, n - 1);
			tmp = mod(tmp * combi(n, i));
			minus = mod(minus + tmp);
		}
		minus = mod(minus * inv(fact[n - 1]));
		ans = mod(ans - minus);
		System.out.println(ans);
	}

	static long MOD = 998244353;
	public static long mod(long i) {
		return i % MOD + ((i % MOD) < 0 ? MOD : 0);
	}
	
	static long pow(long x, long y) {
		if (y == 0) {
			return 1;
		} else if (y == 1) {
			return x;
		} else if (y % 2 == 0) {
			long tmp = pow(x, y / 2);
			return mod(tmp * tmp);
		} else {
			long tmp = pow(x, y / 2);
			return mod(mod(tmp * tmp) * x);
		}
	}
	
	static long inv(long x) {
		return pow(x, MOD - 2);
	}
	
	static int MAX_FACT = 2_500_100;
	static long fact[] = new long[MAX_FACT];
	static void prepareFact() {
		fact[0] = 1;
		for(int i = 1; i < MAX_FACT; i ++) {
			fact[i] = mod(fact[i - 1] * i);
		}
	}
	
	static long combi(int n, int r) {
		if(n < 0 || n < r) { return 0; }
		return mod(perm(n, r) * inv(fact[r]));
	}

	static long perm(int n, int r) {
		if(n < 0 || n < r) { return 0; }
		return mod(fact[n] * inv(fact[n - r]));
	}
}