import java.util.Scanner;

public class Main {
    static long[] V;
    static long[] dp;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),k = sc.nextInt();
        V = new long[n + 1];
        dp = new long[n + 1];
        for (int i = 1; i <= n; i++) {
            V[i] = sc.nextLong();
            dp[i] = Integer.MAX_VALUE;
        }
        long ans = solve(n,k);
        System.out.println(ans);
    }

    private static long solve(int n,int k) {
        dp[1] = 0;
        for (int j = 2; j <= n; j++) {
            for (int i = 1; i <= k; i++) {
                if (j-i >= 1)
                    dp[j] = Math.min(dp[j],dp[j-i] + Math.abs(V[j-i]-V[j]));
                else
                    break;
            }
        }
        return dp[n];
    }
}
