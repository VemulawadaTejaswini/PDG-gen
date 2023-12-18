import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int MOD = 1000000007;

        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();

        long[] dp = new long[c2 + 1];
        long[] dp2 = new long[c2 + 1];
  
        for(int i = 0; i <= c2; i++)
        	dp[i] = 1;
        	
        dp2[0] = 1;
        long sum = 0;
        for(int i = 1; i <= r2; i++) {
        	for(int j = 1; j <= c2; j++) {
        	    
        		dp2[j] = (dp[j] + dp2[j-1]) % MOD;
        		if(i >= r1 && i <= r2 && j >= c1 && j <= c2)
        		    sum = (sum + dp2[j]) % MOD;
        	}
        	dp = dp2.clone();
        }

        System.out.println(sum % MOD);
    }
}
