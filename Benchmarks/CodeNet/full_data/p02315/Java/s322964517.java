import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	static long n;

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// n = Long.parseLong(br.readLine());

		String str[] = br.readLine().split(" ");

		int N = Integer.parseInt(str[0]);
		int W = Integer.parseInt(str[1]);

		int n[] = new int[N];
		int weight[] = new int[N];

		for (int i = 0; i < N; i++) {
			str = br.readLine().split(" ");
			n[i] = Integer.parseInt(str[0]);
			weight[i] = Integer.parseInt(str[1]);
		}

		int dp[][] = new int[110][10010];

		for (int i = 0; i < N; i++) {
			for (int w = 0; w <= W; ++w) {
				if (weight[i] <= w) {
					dp[i + 1][w] = Math.max(dp[i][w], dp[i][w - weight[i]] + n[i]);
				} else {
					dp[i + 1][w] = dp[i][w];
				}
			}
		}
		System.out.println(dp[N][W]);
	}
}

