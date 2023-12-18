import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextInt();
		long m = sc.nextInt();
		long k = sc.nextInt();
		sc.close();

		int mod = 1000000007;
		long a = nCr(n * m - 2, k - 2, mod);

		long n2 = n * n % mod;
		long m2 = m * m % mod;

		long b1 = 0;
		for (int i = 1; i < m; i++) {
			b1 += i * (m - i) % mod;
			b1 %= mod;
		}
		long b2 = 0;
		for (int i = 1; i < n; i++) {
			b2 += i * (n - i) % mod;
			b2 %= mod;
		}

		long ans = 0;
		ans += a * n2 % mod * b1 % mod;
		ans += a * m2 % mod * b2 % mod;
		ans %= mod;
		System.out.println(ans);
	}

	static long nCr(long n, long r, int m) {
		long val = 1;
		for (int i = 1; i <= r; i++) {
			val = val * (n - i + 1) % m;
			val = val * modinv(i, m) % m;
		}
		return val;
	}

	static long modinv(long a, int m) {
		long b = m;
		long u = 1;
		long v = 0;
		long tmp = 0;

		while (b > 0) {
			long t = a / b;
			a -= t * b;
			tmp = a;
			a = b;
			b = tmp;

			u -= t * v;
			tmp = u;
			u = v;
			v = tmp;
		}

		u %= m;
		if (u < 0) u += m;
		return u;
	}
}
