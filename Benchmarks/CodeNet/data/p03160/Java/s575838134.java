import java.util.*;
import java.lang.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) 
        	arr[i] = sc.nextInt();
        long ans = solve(n,arr);
        System.out.println(ans);
        sc.close();
        }
        static long solve(int n, int[] num) {
        	int i = 0;
        	long[] dp = new int[n];
        	Arrays.fill(dp, 100000);
        	dp[0] = 0;
        	for(i = 0; i < n-2; i++) {
				dp[i+1] = Math.min(dp[i+1], (long)Math.abs(num[i+1]-num[i])+dp[i]);
				dp[i+2] = Math.min(dp[i+2], (long)Math.abs(num[i+2]-num[i])+dp[i]);
			}
			dp[n-1] = Math.min(dp[n-1], (long)Math.abs(num[n-2]-num[n-1])+dp[n-2]);
        	return dp[n-1];
        }
    }
