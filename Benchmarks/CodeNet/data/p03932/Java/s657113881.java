import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	void run() {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		long[][] a = new long[H][W];
		for (int i = 0; i < H; ++i) {
			for (int j = 0; j < W; ++j) {
				a[i][j] = sc.nextLong();
			}
		}

		long[][][] dp = new long[2][200][200];
		dp[0][0][0] = a[0][0];
		for (int t = 0; t < H + W - 2; ++t) {
			int next = (t + 1) % 2;
			int pre = t % 2;
			for (int i = 0; i < 200; ++i) {
				for (int j = 0; j < 200; ++j) {
					if (!(0 <= i && i < H && 0 <= j && j < H && 0 <= t - i && t - i < W && 0 <= t - j && t - j < W))
						continue;
					for (int to1 = 0; to1 <= 1; ++to1) {
						for (int to2 = 0; to2 <= 1; ++to2) {

							if (!(0 <= i + to1 && i + to1 < H && 0 <= j + to2 && j + to2 < H && 0 <= t - i + (to1 ^ 1)
									&& t - i + (to1 ^ 1) < W && 0 <= t - j + (to2 ^ 1) && t - j + (to2 ^ 1) < W))
								continue;

							long get = a[i + to1][t - i + (to1 ^ 1)] + a[j + to2][t - j + (to2 ^ 1)];
							if (i + to1 == j + to2 && t - i + (to1 ^ 1) == t - j + (to2 ^ 1))
								get /= 2;
							dp[next][i + to1][j + to2] = Math.max(dp[next][i + to1][j + to2], dp[pre][i][j] + get);
						}
					}
				}
			}
		}
		System.out.println(dp[(H + W - 2) % 2][H - 1][H - 1]);
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}

}
