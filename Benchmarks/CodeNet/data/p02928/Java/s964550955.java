import java.io.*;
import java.util.Scanner;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		final int MOD = 1_000_000_007;

		int n = sc.nextInt();
		int k = sc.nextInt();

		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		long[] tt = new long[n];
		long[] t = new long[n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (a[j] > a[i]) {
					tt[i]++;
					if (j < i) {
						t[i]++;
					}
				}
			}
		}

		long inv2 = modPow(2, MOD - 2, MOD);
		long ans = 0;
		for (int i = 0; i < n; i++) {
			long tmp = (t[i] + t[i] + (k - 1) * tt[i]) % MOD * (k) % MOD * inv2 % MOD;
			ans += tmp;
			ans %= MOD;
		}
		
		pr.println(ans);
	}
	
	static long modPow(long a, long n, int MOD) {
		long loop = n;
		long ret = 1;
		long x = a % MOD;
		while (loop > 0) {
			if (loop % 2 == 1) {
				ret = ret * x % MOD;
			}
			x = x * x % MOD;
			loop /= 2;
		}

		return ret;
	}

	// ---------------------------------------------------
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		pr = new Printer(System.out);
			
		solve();
			
		pr.close();
		sc.close();
	}

	static class Printer extends PrintWriter {
		Printer(OutputStream out) {
			super(out);
		}
	}
}
