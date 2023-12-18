import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	long pow(long a, long n, long mod) {
		long ret = 1;
		for (; n > 0; n >>= 1, a = a * a % mod) {
			if (n % 2 == 1) {
				ret = ret * a % mod;
			}
		}
		return ret;
	}

	long inv(long a, long mod) {
		return pow(a, mod - 2, mod);
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
		long[] a = new long[p];
		for (int i = 0; i < p; ++i) {
			a[i] = sc.nextLong();
		}
		long[] fac = new long[p];
		long[] ifac = new long[p];
		{
			fac[0] = fac[1] = ifac[0] = ifac[1] = 1;
			for (int i = 2; i < fac.length; ++i) {
				fac[i] = i * fac[i - 1] % p;
				ifac[i] = inv(fac[i], p);
			}
		}
		long[] c = new long[p];
		for (int i = 0; i < p; ++i) {
			long res = 0;
			for (int j = 0; j < i; ++j) {
				res = res + c[j] * fac[i] % p * ifac[i - j] % p;
				res %= p;
			}
			c[i] = (a[i] - res + p) % p * inv(fac[i], p) % p;
		}

		long[] b = new long[p];
		long[][] coe = new long[2][p];
		coe[0][0] = 1;
		for (int i = 0; i < p; ++i) {
			for (int j = 0; j < p; ++j) {
				b[j] = (b[j] + coe[i % 2][j] * c[i] % p) % p;
			}
			for (int j = 0; j < p; ++j) {
				coe[(i + 1) % 2][j] = 0;
			}
			for (int j = 0; j + 1 < p; ++j) {
				coe[(i + 1) % 2][j + 1] = coe[i % 2][j];
			}

			for (int j = 0; j + 1 < p; ++j) {
				coe[(i + 1) % 2][j] += coe[i % 2][j] * (p - i) % p;
				coe[(i + 1) % 2][j] %= p;
			}
		}
		for (int i = 0; i < p; ++i) {
			System.out.print(b[i] + (i == p - 1 ? "\n" : " "));
		}

	}

	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}
