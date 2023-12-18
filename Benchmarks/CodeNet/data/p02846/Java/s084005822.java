import java.util.*;
import java.io.*;

class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	final long MOD = (long) (1e9 + 7);
	int NMAX = 100000;
	long[] fac = new long[NMAX];
	long[] ifac = new long[NMAX];
	long[] inv = new long[NMAX];
	{
		fac[0] = fac[1] = ifac[0] = ifac[1] = inv[0] = inv[1] = 1;
		for (int i = 2; i < NMAX; ++i) {
			fac[i] = fac[i - 1] * i % MOD;
			inv[i] = MOD - inv[(int) (MOD % i)] * (MOD / i) % MOD;
			ifac[i] = ifac[i - 1] * inv[i] % MOD;
		}
	}

	long comb(int n, int k) {
		if (n >= k) {
			return fac[n] * ifac[k] % MOD * ifac[n - k] % MOD;
		} else {
			return 0;
		}
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		long T1 = sc.nextLong();
		long T2 = sc.nextLong();
		long A1 = sc.nextLong();
		long A2 = sc.nextLong();
		long B1 = sc.nextLong();
		long B2 = sc.nextLong();
		A1 -= B1;
		A2 -= B2;
		B1 = 0;
		B2 = 0;
		// 何回原点に戻ってくるか？

		if (A1 < 0) {
			A1 *= -1;
			A2 *= -1;
		}
		if (A1 * T1 + A2 * T2 == 0) {
			System.out.println("infinity");
			return;
		}
		long d = A1 * T1 + A2 * T2;
		if (d > 0) {
			System.out.println(0);
			return;
		}
		d = Math.abs(d);
		A2 = Math.abs(A2);
		// A1*T1 > m*dなるdについて2d-1が答え。
		long ans = A2 * T2 / d;
		if (A2 * T2 > (ans + 1) * d)
			++ans;
		int bonus = 0;
		if (A2 * T2 == (ans + 1) * d)
			++bonus;
		System.out.println(2 * ans - 1 + bonus);
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}

}
