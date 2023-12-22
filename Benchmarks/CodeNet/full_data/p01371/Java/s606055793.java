import java.io.IOException;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		while (true) {
			int N = nextInt();// ステージの数
			if (N == 0) {
				break;
			}
			int[][] stages = new int[N][N + 1];// ステージ攻略にかかる時間
			for (int i = 0; i < stages.length; i++) {
				for (int j = 0; j < stages[i].length; j++) {
					stages[i][j] = nextInt();
				}
			}

			int[] dp = new int[1 << N];// 全パターン数は2のN乗通り。
			Arrays.fill(dp, Integer.MAX_VALUE);
			dp[0] = 0;

			for (int bit = 0; bit < dp.length; bit++) {
				for (int j = 0; j < N; j++) {
					if (((bit >> j) & 1) == 0) {
						// jステージをクリアしていない時、jステージ攻略の最速タイムを考える。
						int min = stages[j][0];// とりあえずまずは装備無しを考えておく。
						for (int k = 0; k < N; k++) {
							if (((bit >> k) & 1) == 1) {
								// kステージをクリアしてる時のjステージ攻略タイムと比べて短い方をもっておく
								min = Math.min(min, stages[j][k + 1]);
							}
						}
						dp[bit + (1 << j)] = Math.min(dp[bit + (1 << j)],
								dp[bit] + min);
					}
				}
			}
			System.out.println(dp[dp.length - 1]);
		}

	}

	static int nextInt() {
		int c;
		try {
			c = System.in.read();
			while (c != '-' && (c < '0' || c > '9'))
				c = System.in.read();
			if (c == '-')
				return -nextInt();
			int res = 0;
			while (c >= '0' && c <= '9') {
				res = res * 10 + c - '0';
				c = System.in.read();
			}
			return res;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return -1;
	}

	static char nextChar() {
		try {
			int b = System.in.read();
			while (b != -1 && (b == ' ' || b == '\r' || b == '\n'))
				;
			if (b == -1)
				return 0;
			return (char) b;
		} catch (IOException e) {
		}
		return 0;
	}

}