// Grid-1

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

class Main {
	public static void Grid1(char[][] arr, int m, int n) {
		long[][] dp = new long[m+1][n+1];
		long mod = 1000000007l;
		for(int i = 0; i <= m; i++)
			dp[i][0] = 0;;

		for(int i = 0; i <= n; i++)
			dp[0][i] = 0l;

		for(int i = 1; i <= m; i++) {
			for(int j = 1; j <= n; j++) {
				if(i == 1 && j == 1) {
					dp[i][j] = 1l;
				}
				else if(arr[i-1][j-1] == '.') {
					dp[i][j] = (dp[i-1][j]+dp[i][j-1])%mod;
				}
				else {
					dp[i][j] = 0l;
				}
			}
		}
		System.out.println((dp[m][n]%mod));
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");

		int m = Integer.parseInt(s[0]);
		int n = Integer.parseInt(s[1]);

		char[][] arr = new char[m][n];
		for(int i = 0; i < m; i++) {
			String temp = br.readLine();
			for(int j = 0; j < n; j++) {
				arr[i][j] = temp.charAt(j);
			}
		}
		Grid1(arr, m, n);
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
