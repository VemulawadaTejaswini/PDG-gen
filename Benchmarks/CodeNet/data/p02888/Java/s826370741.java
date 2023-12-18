import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static int dp[][];
	static boolean done[][];

	static int L[];

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		String str[] = br.readLine().split(" ");
		L = new int[n];
		for (int i = 0; i < n; i++) {
			L[i] = Integer.parseInt(str[i]);
		}

		dp = new int[n][n];
		done = new boolean[n][n];

		int ans = 0;

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				for (int k = j + 1; k < n; k++) {
					if (isTriangle(i, j, k))
						ans++;
				}
			}
		}
		System.out.println(ans);
	}

	static boolean isTriangle(int a, int b, int c) {
		int sum1, sum2, sum3;

		if (done[a][b]) {
			sum1 = dp[a][b];
		} else {
			sum1 = L[a] + L[b];
			dp[a][b] = sum1;
			done[a][b] = true;
		}
		if (done[a][c]) {
			sum2 = dp[a][c];
		} else {
			sum2 = L[a] + L[c];
			dp[a][c] = sum2;
			done[a][c] = true;
		}
		if (done[b][c]) {
			sum3 = dp[b][c];
		} else {
			sum3 = L[c] + L[b];
			dp[b][c] = sum3;
			done[b][c] = true;
		}

		if (sum1 > L[c] && sum2 > L[b] && sum3 > L[a]) {
			return true;
		}
		return false;
	}
}