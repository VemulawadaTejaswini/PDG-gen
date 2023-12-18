import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

public class Main {

	static int count = 0;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");

		int n = Integer.parseInt(str[0]);
		int ma = Integer.parseInt(str[1]);
		int mb = Integer.parseInt(str[2]);

		int a[] = new int[n];
		int b[] = new int[n];
		int c[] = new int[n];

		for (int i = 0; i < n; i++) {
			str = br.readLine().split(" ");

			a[i] = Integer.parseInt(str[0]);
			b[i] = Integer.parseInt(str[1]);
			c[i] = Integer.parseInt(str[2]);
		}

		long dp[][][] = new long[51][510][510];

		for (int i = 0; i < 51; i++) {
			for (int j = 0; j < 510; j++) {
				Arrays.fill(dp[i][j], Integer.MAX_VALUE);
			}
		}

		dp[0][0][0] = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 500; j++) {
				for (int k = 0; k < 500; k++) {
					if (dp[i][j][k] >= Integer.MAX_VALUE)
						continue;

					dp[i + 1][j][k] = Math.min(dp[i + 1][j][k], dp[i][j][k]); // i番目の薬を選ばなかった時
					dp[i + 1][j + a[i]][k + b[i]] = Math.min(dp[i + 1][j + a[i]][k + b[i]], dp[i][j][k] + c[i]); // i番目の薬を選んだ時
				}
			}
		}

		long ans = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < 500; j++) {
				for (int k = 1; k < 500; k++) {
					if (j * mb != k * ma)
						continue;

					ans = Math.min(ans, dp[i][j][k]);
				}
			}
		}

		if (ans < Integer.MAX_VALUE)
			System.out.println(ans);
		else
			System.out.println("-1");
	}
}
