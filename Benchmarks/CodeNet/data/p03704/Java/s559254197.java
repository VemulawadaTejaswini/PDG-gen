import java.util.Arrays;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	long[] p10 = new long[19];

	void run() {
		p10[0] = 1;
		for (int i = 1; i < p10.length; ++i) {
			p10[i] = p10[i - 1] * 10;
		}
		Scanner sc = new Scanner(System.in);
		long d = sc.nextLong();
//		while (true) {
//			tr(d);
			long ans = 0;
			for (int i = 1; i <= 17; ++i) {
				ans += solve(d, i);
			}
			System.out.println(ans);
//			d = (long) (Math.random() * 1_000_000_000);
//		}
	}

	// Nがlen桁でrev(N)=N+Dを満たすNの数を数えたい。
	// dcba=abcd+D
	// D=999*(d-a)+90*(c-d)
	long solve(long d, int len) {
		int comb = 1;
		boolean f = true;

		while (len > 0) {
			int x = -999999;
			boolean update = false;
			if (len != 1)
				for (int i = -9; i <= 9; ++i) {
					if (d % 10 == i * (p10[len - 1] - 1) % 10
							&& Math.abs(d - i * (p10[len - 1] - 1)) <= p10[len - 1] - 1) {
						x = i;
						update = true;
						break;
					}
				}
			else {
				x = (int) d;
				if (d > 9 || d < 0)
					return 0;
				update = true;
			}
			// ba=ab+D
			// (ba-ab)=D
			// 9*(b-a)=D
			if (!update) {
				return 0;
			}
			if (len == 1) {
				d -= x;
			} else {
				d -= x * (p10[len - 1] - 1);
			}
			int cnt = 0;
			for (int i = 0; i <= 9; ++i) {
				if (f && i == 0)
					continue;
				if (i + x >= 0 && i + x <= 9) {
					++cnt;
				}
			}
			comb *= cnt;
			f = false;
			len -= 2;
			if (d % 10 != 0) {
				tr(len);
				throw new AssertionError();
			}
			if (len > 1)
				d /= 10;
		}
		if (d != 0) {
			return 0;
		} else {
			return comb;
		}
	}

	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}