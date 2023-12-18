import java.util.*;

public class Main {
    static long[][] dp;
    static int[] arr;
 	public static void main (String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		dp = new long[k + 1][n + 2];
		arr = new int[n + 2];
		for (int i = 1; i <= n; i++) {
		    arr[i] = sc.nextInt();
		}
		System.out.println(dfw(k, n + 1));
	}
	
	static long dfw(int count, int idx) {
	    if (idx < 1) {
	        return 0;
	    }
	    if (dp[count][idx] != 0) {
	        return dp[count][idx];
	    }
	    long ans = Long.MAX_VALUE;
	    for (int i = 0; i <= count && i <= idx - 1; i++) {
	        ans = Math.min(ans, dfw(count - i, idx - 1 - i) + Math.max(0, arr[idx] - arr[idx - 1 - i]));
	    }
	    dp[count][idx] = ans;
	    return ans;
	}
}


