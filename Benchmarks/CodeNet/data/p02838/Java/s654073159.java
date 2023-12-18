
import java.util.Arrays;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	final long MOD = (long) (1e9 + 7);

	void run() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] A = new long[N];
		for (int i = 0; i < N; ++i) {
			A[i] = sc.nextLong();
		}
		int[] c = new int[62];
		for (int i = 0; i < N; ++i) {
			for (int shift = 0; shift < 62; ++shift) {
				if ((A[i] >> shift) % 2 == 1) {
					c[shift]++;
				}
			}
		}
		long ans = 0;
		for (int shift = 0; shift < 62; ++shift) {
			long one = c[shift];
			long zero = N - c[shift];
			ans += one * zero % MOD * ((1L << shift) % MOD) % MOD;
			ans %= MOD;
		}
		System.out.println(ans);
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}

}
