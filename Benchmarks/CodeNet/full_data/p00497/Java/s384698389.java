
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		StringTokenizer to = new StringTokenizer(reader.readLine());
		int n = Integer.parseInt(to.nextToken());
		int m = Integer.parseInt(to.nextToken());
		int[][] dp = new int[n + 1][n + 1];
		while (m-- > 0) {
			to = new StringTokenizer(reader.readLine());
			int a = Integer.parseInt(to.nextToken());
			int b = Integer.parseInt(to.nextToken());
			int x = Integer.parseInt(to.nextToken()) + 1;
			dp[a][b] = x;
		}
		int ans = 0;
		for (int i = 1; i <= n; i++)
			for (int j = 1; j <= i; j++) {
				dp[i][j] = Math.max(dp[i][j],
						Math.max(dp[i - 1][j], dp[i - 1][j - 1]) - 1);
				if (dp[i][j] > 0)
					ans++;
			}
		System.out.println(ans);
	}
}