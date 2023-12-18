import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int r1 = sc.nextInt() - 1;
		int c1 = sc.nextInt() - 1;
		int r2 = sc.nextInt();
		int c2 = sc.nextInt();
		sc.close();

		int mod = 1000000007;
		long a = nCr(r2 + c2 + 2, c2 + 1, mod) - 1;
		long b = nCr(r1 + c2 + 2, c2 + 1, mod) - 1;
		long c = nCr(r2 + c1 + 2, c1 + 1, mod) - 1;
		long d = nCr(r1 + c1 + 2, c1 + 1, mod) - 1;
		long ans = a - b - c + d + mod + mod;
		ans %= mod;
		System.out.println(ans);
	}

	static long nCr(int n, int r, int m) {
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
