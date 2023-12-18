import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int a[][] = new int[100010][3];

		for (int i = 0; i < n; i++) {
			String str[] = br.readLine().split(" ");
			a[i][0] = Integer.parseInt(str[0]);
			a[i][1] = Integer.parseInt(str[1]);
			a[i][2] = Integer.parseInt(str[2]);
		}

		int dp[][] = new int[100010][3];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < 3; k++) {
					if (j == k)
						continue;
					dp[i + 1][k] = Math.max(dp[i + 1][k], dp[i][j] + a[i][k]);
				}
			}
		}

		int max = 0;
		for (int i = 0; i < 3; i++) {
			max = Math.max(max, dp[n][i]);
		}

		System.out.println(max);
	}
}
