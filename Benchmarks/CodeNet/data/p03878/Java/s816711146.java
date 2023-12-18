import java.util.Arrays;
import java.util.Scanner;

class Main {
	int n;
	final long MOD = 1_000_000_000 + 7;

	void run() {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		long[] c = new long[2 * n];
		for (int i = 0; i < n; ++i) {
			c[2 * i] = 2 * sc.nextInt();
			c[2 * i + 1] = 2 * sc.nextInt() + 1;
		}
		Arrays.sort(c);
		int out = 0, in = 0;
		long ans = 1;
		for (int i = 0; i < 2 * n; ++i) {
			if (c[i] % 2 == 1) {// outlet
				++out;
			} else {// pc
				++in;
			}
			while (out > 0 && in > 0) {
				ans = ans * Math.max(out, in) % MOD;
				--out;
				--in;
			}
		}
		if (out != 0 || in != 0)
			throw new AssertionError();
		System.out.println(ans);
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}