import java.util.*;

public class Main {
    static final int MOD = 1000000007;
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] arr = sc.next().toCharArray();
		int length = arr.length;
		long[][] dp = new long[length + 1][4];
		dp[0][0] = 1;
 		for (int i = 1; i <= length; i++) {
		    char c = arr[i - 1];
		    if (c == '?') {
		        dp[i][0] = dp[i - 1][0] * 3;
		        dp[i][0] %= MOD;
		    } else {
		        dp[i][0] = dp[i - 1][0];
		    }
		    for (int j = 1; j <= 3; j++) {
		        if (c == '?') {
		            dp[i][j] += dp[i - 1][j] * 3;
		            dp[i][j] += dp[i - 1][j - 1];
		        } else {
		            dp[i][j] += dp[i - 1][j];
		            if (c - 'A' + 1 == j) {
		                dp[i][j] += dp[i - 1][j - 1];
		            }
		        }
               dp[i][j] %= MOD;
		    }
		}
		System.out.println(dp[length][3]);
    }
}

