import java.util.*;
import java.io.*;

public class Main {

	public static final int mod = 1000000007;

	public static int count(int k) { // count number of ones in binary
		int c = 0;
		while (k > 0) {
			k &= k - 1;
			c++;
		}
		return c;
	}

	public static String pad(String s, int n) {
		for (int i = s.length(); i < n; i++) {
			s = "0" + s;
		}
		return s;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] s;
		boolean[][] matches = new boolean[n][n];
		for (int i = 0; i < n; i++) {
			s = br.readLine().split(" ");
			for (int j = 0; j < n; j++)
				matches[i][j] = Integer.parseInt(s[j]) == 1;
		}

		int[][] dp = new int[n][(1 << n)];

		for (int i = 0; i < n; i++)
			dp[0][(1 << i)] = matches[i][0] ? 1 : 0; //last man left
	
		// i is women left, j is women bitmask
		
		for (int i = 1; i < n; i++) {
			for (int j = 0; j < (1 << n); j++) {
				if (count(j) != i)
					continue;
				for (int k = 0; k < n; k++) { //for every possible man
					if (matches[k][i]) { //if the man and woman are compatible
						if (((1<<k) & j) == 0) { //and if the woman has not been taken in this bitmask
							dp[i][j^(1<<k)] += dp[i-1][j]; //the case where this woman is taken + current ways
							dp[i][j^(1<<k)] %= mod;
						}
					}				
				}
			}
		}
		
//		for (int i = 0; i <n; i++) {
//
//			for (int j = 0; j < (1 << n); j++) {
//				System.out.print(dp[i][j] + " ");
//			}System.out.println();
//		}
//		
		int ans = 0;
		for (int i = 0 ; i < (1<<n); i++)
			ans = ans + dp[n-1][i] % mod;
		System.out.println(ans);

	}

}
