import java.util.*;
import java.lang.*;

public class Main{
	static long mod = 1000000007;
	static long[] fac;
	static long[] finv;
	static long[] inv;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		TreeMap<Integer, Integer> map = new TreeMap<>();
		for (int i = 2; i <= m; i++) {
			int count = 0;
			while (m % i == 0) {
				m /= i;
				count++;
			}
			if (count > 0) {
				map.put(i, count);
			}
		}
		COMinit(n + 33);
		long ans = 1;
		for (int key : map.keySet()) {
			ans *= COM(map.get(key) + n - 1, map.get(key));
			ans %= mod;
		}
		System.out.println(ans);
	}

	static void COMinit(int n) {
		fac = new long[n];
		finv = new long[n];
		inv = new long[n];
		fac[0] = 1;
		fac[1] = 1;
		finv[0] = 1;
		finv[1] = 1;
		inv[1] = 1;
		for (int i = 2; i < n; i++) {
			fac[i] = fac[i - 1] * i % mod;
			inv[i] = mod - inv[(int) (mod % i)] * (mod / i) % mod;
			finv[i] = finv[i - 1] * inv[i] % mod;
		}
	}
	static long COM(int n, int k) {
		if (n < k || (n < 0 || k < 0)) {
			return 0;
		}
		return fac[n] * (finv[k] * finv[n - k] % mod) % mod;
	}

}
