import java.util.*;

public class Main {
    public static void main(String[] args)  {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] h = new int[n];
        int[] dp = new int[n];
        for(int i=0;i<n;i++)    h[i] = in.nextInt();
        dp[1] = Math.abs(h[1] - h[0]);
        solve(n-1, h, dp);
        System.out.println(dp[n-1]);
        in.close();
    }

    static int solve(int n, int[] h, int[] dp) {
        if(n<2)         return dp[n];
        if(dp[n]!=0)    return dp[n];
        int s1 = Math.abs(h[n]-h[n-1]) + solve(n-1, h, dp);
        int s2 = Math.abs(h[n]-h[n-2]) + solve(n-2, h, dp);
        return dp[n] = Math.min(s1, s2);
    }
}