import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int H[] = new int[N];

		// DPの作成と初期化
		int dp[] = new int[N];
		dp[0] = 0;
		final int INF = 1000000000;

		for (int i = 0; i < N; i++) {
			H[i] = sc.nextInt();

			if (i > 0) {
				dp[i] = INF; // DPをMAXで埋めておく
			}
		}

		for (int i = 1; i < N; i++) {
			// INF, i+1の移動で比較 => 必ずi+1
			dp[i] = chmin(dp[i], dp[i - 1] + Math.abs(H[i] - H[i - 1]));

			if (i > 1) {
				// i+1とi+2で比較してDPを更新
				dp[i] = chmin(dp[i], dp[i - 2] + Math.abs(H[i] - H[i - 2]));
			}
		}

		System.out.println(dp[N - 1]);

		sc.close();
	}

	public static int chmin(int a, int b) {
		if (a > b) {
			return b;
		} else {
			return a;
		}
	}
}
