import java.util.Scanner;

public class Main {
    static long[] V;
    static long[] dp;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        V = new long[n + 1];
        dp = new long[n + 1];
        for (int i = 0; i <= n; i++) {
            dp[i] = -1;
        }
        for (int i = 1; i <= n; i++) {
            V[i] = sc.nextLong();
        }
        long ans = solve(n);
        System.out.println(ans);
    }

    private static long solve(int n) {
        if (dp[n] != -1){
            return dp[n];
        }

        if (n == 1){
            return 0;
        }
        if (n == 2){
            return dp[n] = Math.abs(V[2] - V[1]);
        }
        long option1 = Math.abs((V[n] - V[n - 1])) + solve(n - 1);
        long option2 = Math.abs((V[n] - V[n - 2])) + solve(n - 2);
        return dp[n] = Math.min(option1, option2);
    }
}
