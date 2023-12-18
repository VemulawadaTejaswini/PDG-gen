import java.util.*;

public class Main {
	static final int r = 1000000007;
	static int n;
	static long fact[], finv[], inv[];

	public static long modinv(long a) {
		long b = r, u = 1, v = 0;
		while (b != 0) {
			long t = a / b;
			a -= t * b;
			long tmp = a;
			a = b;
			b = tmp;
			u -= t * v;
			tmp = u;
			u = v;
			v = tmp;
		}
		u %= r;
		if (u < 0)
			u += r;
		return u;
	}

	public static void cominit() {
		fact[0] = fact[1] = 1;
		finv[0] = finv[1] = 1;
		inv[1] = 1;
		for (int i = 2; i < n + 2; ++i) {
			fact[i] = fact[i - 1] * i % r;
			inv[i] = r - inv[r % i] * (r / i) % r;
			finv[i] = finv[i - 1] * inv[i] % r;
		}
	}

	public static long comb(int n, int k) {
		if (n < k)
			return 0;
		if (k < 0 || n < 0)
			return 0;
		if (k == 0)
			return 1;

		return fact[n] * (finv[k] * finv[n - k] % r) % r;
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int k = sc.nextInt();
		fact = new long[n + 2];
		finv = new long[n + 2];
		inv = new long[n + 2];
		cominit();
 		sc.close();
		for(int i = 1; i <= k; ++i) {
			long ans = comb(n - k + 1, i);
			long t = comb(k - 1, i - 1);
			ans *= t;
			ans %= r;
			System.out.println(ans);
		}

	}
}
