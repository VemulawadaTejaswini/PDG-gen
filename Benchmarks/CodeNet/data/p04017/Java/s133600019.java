import java.util.*;

public class Main {
 	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n + 1];
		for (int i = 1; i <= n; i++) {
		    arr[i] = sc.nextInt();
		}
		int l = sc.nextInt();
		int[][] dp = new int[18][n + 1];
		for (int i = 1; i <= n; i++) {
		    if (arr[n] - arr[i] <= l) {
		        dp[0][i] = n;
		        continue;
		    }
		    int left = i;
		    int right = n;
		    while (right - left > 1) {
		        int m = (left + right) / 2;
		        if (arr[m] - arr[i] == l) {
		            left = m;
		            break;
		        } else if (arr[m] - arr[i] < l) {
		            left = m;
		        } else {
		            right = m;
		        }
		    }
		    dp[0][i] = left;
		}
		for (int i = 1; i < 18; i++) {
		    for (int j = 1; j <= n; j++) {
		        dp[i][j] = dp[i - 1][dp[i - 1][j]];
		    }
		}
		int q = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < q; i++) {
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int start = Math.min(a, b);
		    int end = Math.max(a, b);
		    int days = 0;
		    for (int j = 17; j >= 0; j--) {
		        if (j == 0) {
		            if (dp[j][start] >= end) {
		                days++;
		                break;
		            } else {
		                days += 2;
		                break;
		            }
		        }
		        if (dp[j][start] < end) {
		            days += (int)Math.pow(2, j);
		            start = dp[j][start];
		        }
		    }
		    sb.append(days).append("\n");
		}
	    System.out.print(sb);
	}
}
