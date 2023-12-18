import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Atcoder {

	static int n, k;
	static int[][] arr;
	static long[][] memo;
	static boolean f = false;
	static boolean t = false;
	static int OO = (int) 1e18;

	static long dp(int i, int k) {
		if (k < 0)
			return -OO;
		if (i == n) {
			return 0;
		}

		if (memo[k][i] != -1)
			return memo[k][i];

		long take = arr[i][1] + dp(i + 1, k - arr[i][0]);
		long leave = dp(i + 1, k);

		return memo[k][i] = Math.max(take, leave);
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);

		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());

		arr = new int[n + 1][2];
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		memo = new long[k+1][n+1];

		for (int i = 0; i < k+1; i++)
			Arrays.fill(memo[i], -1);
		long ans = -1;

		for(int i = 0;i<n;i++)
			ans= Math.max(ans, dp(i, k));
		pw.print(ans);
		pw.close();
	}
}
