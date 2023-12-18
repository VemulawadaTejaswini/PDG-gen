import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] c = new int[n];
		for (int i = 0; i < n; i++) {
			c[i] = sc.nextInt();
		}
		sc.close();

		int mod = 1000000007;
		int m2 = 1000000008 / 2;
		Arrays.sort(c);
		long ans = 0;
		long base = 0;
		long d = 1;
		long time = power(2, n, mod);
		long total = time;
		for (int i = 0; i < n; i++) {
			base = base * 2 + d;
			base %= mod;
			if (i != 0) {
				d *= 2;
				d %= mod;
			}
			time *= m2;
			time %= mod;
			long val = base * time % mod;
			val = val * c[n - 1 - i] % mod * total % mod;
			ans += val;
			ans %= mod;
		}
		System.out.println(ans);
	}

	static long power(long x, long n, int m) {
		if (n == 0) {
			return 1;
		}
		long val = power(x, n / 2, m);
		val = val * val % m;
		if (n % 2 == 1) {
			val = val * x % m;
		}
		return val;
	}
}
