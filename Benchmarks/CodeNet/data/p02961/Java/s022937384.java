import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	final long MOD = (long) 1e9 + 7;

	void run() {
		Scanner sc = new Scanner(System.in);
		long K = sc.nextLong();
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int signX = X == 0 ? 1 : X / Math.abs(X);
		int signY = Y == 0 ? 1 : Y / Math.abs(Y);
		X = Math.abs(X);
		Y = Math.abs(Y);
		if (K % 2 == 0 && (X + Y) % 2 == 1) {
			System.out.println(-1);
			return;
		}
		if (X + Y == K) {
			System.out.println(1);
			System.out.println(X * signX + " " + Y * signY);
			return;
		}
		boolean flip = X > Y;
		if (X > Y) {
			X ^= Y;
			Y ^= X;
			X ^= Y;
			signX ^= signY;
			signY ^= signX;
			signX ^= signY;
		}
		if (X < K && Y < K) {
			if ((X + Y) % 2 == 0) {
				long n = 2;
				go(X, Y, K, n, signX, signY, flip);
			} else {
				if (X + Y >= K) {
					long n = 3;
					go(X, Y, K, n, signX, signY, flip);
				} else {
					System.out.println(3);
					long[][] ans = new long[3][2];
					ans[0] = new long[] { X, K - X };
					ans[1] = new long[] { (K + X + Y) / 2, -(K - (K + X + Y) / 2) };
					ans[2] = new long[] { -ans[1][0], ans[1][1] };
					int curX = 0;
					int curY = 0;
					for (int i = 0; i < ans.length; ++i) {
						ans[i][0] *= signX;
						ans[i][1] *= signY;
						if (flip) {
							ans[i][0] ^= ans[i][1];
							ans[i][1] ^= ans[i][0];
							ans[i][0] ^= ans[i][1];
						}
						curX += ans[i][0];
						curY += ans[i][1];
						System.out.println(curX + " " + curY);
					}
				}
			}
			return;
		}
		long n = (X + Y + K - 1) / K;
		if (K % 2 == 1 && n % 2 != (X + Y) % 2) {
			++n;
		}
		go(X, Y, K, n, signX, signY, flip);
	}

	void go(long X, long Y, long K, long n, int signX, int signY, boolean flip) {
		System.out.println(n);
		long[][] ans = new long[(int) n][2];
		int p = 0;
		long delta = (n * K - X - Y) / 2;
		long cnt1 = X + delta;
		long cnt2 = Y;
		long cnt3 = delta;
		for (int i = 0; i < cnt1 / K; ++i) {
			ans[p++] = new long[] { K, 0 };
		}
		cnt1 %= K;
		if (cnt1 != 0) {
			ans[p++] = new long[] { cnt1, K - cnt1 };
			cnt2 -= K - cnt1;
			cnt1 = 0;
		}
		for (int i = 0; i < cnt2 / K; ++i) {
			ans[p++] = new long[] { 0, K };
		}
		cnt2 %= K;
		ans[p++] = new long[] { -(K - cnt2), cnt2 };
		cnt3 -= (K - cnt2);
		if (cnt3 % K != 0) {
			tr("err", cnt3, K);
			throw new AssertionError();
		}

		for (int i = 0; i < cnt3 / K; ++i) {
			ans[p++] = new long[] { K, 0 };
		}
		int curX = 0;
		int curY = 0;
		for (int i = 0; i < ans.length; ++i) {
			ans[i][0] *= signX;
			ans[i][1] *= signY;
			if (flip) {
				ans[i][0] ^= ans[i][1];
				ans[i][1] ^= ans[i][0];
				ans[i][0] ^= ans[i][1];
			}
			curX += ans[i][0];
			curY += ans[i][1];
			System.out.println(curX + " " + curY);
		}
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}

}