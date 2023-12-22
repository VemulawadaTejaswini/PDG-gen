import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void dp (int lim, int[] value, int[] weight) {
		int[][] dp = new int[value.length + 1][lim + 1];

		for (int i = 0; i < dp.length; i++)
			Arrays.fill(dp[i], -1);

		dp[0][0] = 0;

		for (int i = 0; i < value.length; i++) {
			for (int j = 0; j < dp[i].length; j++) {
				if (dp[i][j] == -1) continue;
				dp[i + 1][j] = Math.max(dp[i + 1][j], dp[i][j]);
				if (j + weight[i] > lim) continue;
				dp[i + 1][j + weight[i]] = Math.max(dp[i + 1][j + weight[i]], dp[i][j] +value[i] );
			}
		}

		int retValue = 0, retWeight = 0;;
		for (int i = 0; i < dp[0].length; i++) {
			if (retValue < dp[dp.length - 1][i]) {
				retWeight = i;
				retValue = dp[dp.length - 1][i];
			}
		}

		System.out.println(retValue + "\n" + retWeight);

	}

	public static void main(String[] args) throws IOException {

		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));

		for (int i = 1; ; i++) {
			int lim = Integer.parseInt(br.readLine());
			if (lim == 0) break;
			int cnt = Integer.parseInt(br.readLine());
			int[] value = new int[cnt];
			int[] weight = new int[cnt];
			for (int j = 0; j < cnt; j++) {
				String[] str = br.readLine().split(",");
				value[j] = Integer.parseInt(str[0]);
				weight[j] = Integer.parseInt(str[1]);
			}
			System.out.println("Case " + i + ":");
			dp(lim, value, weight);
		}

	}

}