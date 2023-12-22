import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n + 1];
		int total = 0;
		for (int i = 0; i < n; i++) {
		    arr[i] = sc.nextInt();
		    total += arr[i];
		}
		boolean[][][] dp = new boolean[n + 1][900][900];
		dp[0][0][0] = true;
		for (int i = 1; i <= n; i++) {
		    for (int j = 0; j < 900; j++) {
		        for (int k = 0; k < 900; k++) {
		            if ((j >= arr[i] && dp[i - 1][j - arr[i]][k]) ||
		                (k >= arr[i] && dp[i - 1][j][k - arr[i]]) || 
		                dp[i - 1][j][k]) {
		                dp[i][j][k] = true;
		            }
		        }
		    }
		}
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < 900; i++) {
		    for (int j = 0; j < 900; j++) {
		        if (!dp[n][i][j]) {
		            continue;
		        }
		        int max = Math.max(i, Math.max(j, total - i - j));
		        min = Math.min(min, max);
		    }
		}
		System.out.println(min);
	}
}

