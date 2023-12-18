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
		int count = 0;
		for (int l = 0; l < 3; l++) {
			int sum;
			if (l == 0) {
				if (done[a][b]) {
					sum = dp[a][b];
				} else {
					sum = L[a] + L[b];
					dp[a][b] = sum;
					done[a][b] = true;
				}
				if (sum > L[c]) {
					count++;
				}
			} else if (l == 1) {
				if (done[a][c]) {
					sum = dp[a][c];
				} else {
					sum = L[a] + L[c];
					dp[a][c] = sum;
					done[a][c] = true;
				}
				if (sum > L[b]) {
					count++;
				}
			} else {
				if (done[b][c]) {
					sum = dp[b][c];
				} else {
					sum = L[c] + L[b];
					dp[b][c] = sum;
					done[b][c] = true;
				}
				if (sum > L[a]) {
					count++;
				}
			}
		}
		if (count == 3)
			return true;
		return false;
	}
}