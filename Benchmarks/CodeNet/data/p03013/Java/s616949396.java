import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    private static long[] dp;
    private static int goal;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

//        dp = new BigInteger[n];
//        for (int i = 0; i < n; i++) {
//            dp[i] = BigInteger.ZERO;
//        }
        dp = new long[n];

        goal = n;

//        BigInteger minusOne = new BigInteger("-1");

        for (int i = 0; i < m; i++) {
            dp[sc.nextInt()] = -1;
        }

        solve(0);

        System.out.println(dp[0]);
    }

    private static long solve(int step) {
        if (step == goal) {
            return 0;
        } else if (step > goal || dp[step] < 0) {
            return 1;
        } else if (dp[step] > 0) {
            return dp[step];
        }

        return dp[step] = (solve(step + 1) + solve(step + 2)) % 1000000007L;
    }
}