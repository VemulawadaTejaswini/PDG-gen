import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		while (true) {
			int N = scan.nextInt();
			if (N == 0) {
				scan.close();
				break;
			}

			int T = scan.nextInt();
			int L = scan.nextInt();
			int B = scan.nextInt();

			double[][] dp = new double[T + 1][N + 1];// iターン目にjにいる確率
			boolean[] lose = new boolean[N + 1];
			boolean[] back = new boolean[N + 1];

			for (int i = 0; i < L; i++) {
				int l = scan.nextInt();
				lose[l] = true;
			}

			for (int i = 0; i < B; i++) {
				int l = scan.nextInt();
				back[l] = true;
			}

			dp[0][0] = 1;
			for (int turn = 0; turn < T; turn++) {
				for (int n = 0; n < N; n++) {
					for (int dice = 1; dice <= 6; dice++) {
						int end = n + dice;
						if (end > N) {
							end = 2 * N - end;
						}
						if (lose[end]) {
							// 移動先がLの時
							if (turn + 2 <= T) {
								dp[turn + 2][end] += dp[turn][n] / 6;
							} else {
								dp[turn + 1][end] += dp[turn][n] / 6;
							}
						} else if (back[end]) {
							// 移動先がBの時
							dp[turn + 1][0] += dp[turn][n] / 6;
						} else {
							dp[turn + 1][end] += dp[turn][n] / 6;
						}
					}
				}
			}

			double ans = 0;
			for (int i = 0; i < dp.length; i++) {
				ans += dp[i][N];
			}
			System.out.println(ans);
		}

	}
}