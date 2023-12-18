// Vacation

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main {
	public static int vacation(int[][] arr, int n) {
		int[][] dp = new int[n][3];
		// System.out.println();
		for(int i = 0; i < 3; i++) {
			dp[0][i] = arr[0][i];
			// System.out.print(arr[0][i] + " ");
		}
		// System.out.println();

		for(int i = 1; i < n; i++) {
			for(int j = 0; j < 3; j++) {
				if(j == 0)
					dp[i][j] = max(arr[i][j]+dp[i-1][1], arr[i][j]+dp[i-1][2]);
				else if(j == 1)
					dp[i][j] = max(arr[i][j]+dp[i-1][0], arr[i][j]+dp[i-1][2]);
				else if(j == 2)
					dp[i][j] = max(arr[i][j]+dp[i-1][0], arr[i][j]+dp[i-1][1]);
				// System.out.print(dp[i][j] + " ");
			}
			// System.out.println();
		}
		// System.out.println();

		return max(dp[n-1][0], dp[n-1][1], dp[n-1][2]);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[][] arr = new int[n][3];

		for(int i = 0; i < n; i++) {
			String[] s = br.readLine().split(" ");
			for(int j = 0; j < 3; j++) {
				arr[i][j] = Integer.parseInt(s[j]);
			}
		}
		System.out.println(vacation(arr, n));
	}
	public static int min(int...arr) {
		int min = Integer.MAX_VALUE;
		for(int i: arr) {
			if(i < min)
				min = i;
		}
		return min;
	}

	public static int max(int...arr) {
		int max = Integer.MIN_VALUE;
		for(int i: arr) {
			if(i > max)
				max = i;
		}
		return max;	
	}
}