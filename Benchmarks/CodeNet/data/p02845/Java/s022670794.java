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
		int N = sc.nextInt();
		int[] A = new int[N];
		for (int i = 0; i < N; ++i)
			A[i] = sc.nextInt();
		long[] v = new long[3];
		long ans = 1;
		for (int i = 0; i < N; ++i) {
			int same = 0;
			for (int j = 0; j < 3; ++j) {
				if (A[i] == v[j])
					++same;
			}
			ans = ans * same % MOD;
			for (int j = 0; j < 3; ++j) {
				if (A[i] == v[j]) {
					++v[j];
					break;
				}
			}
		}
		System.out.println(ans);
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}

}
