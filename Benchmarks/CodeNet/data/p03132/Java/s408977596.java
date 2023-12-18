import java.util.Scanner;

public class Main {

    private static long costEven(long A) {
        if (A == 0) return 2;
        return A % 2 == 0 ? 0 : 1;
    }

    private static long costOdd(long A) {
        if (A == 0) return 1;
        return A % 2 == 0 ? 1 : 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int L = sc.nextInt();
        final long[][] dp = new long[5][L];

        long A = sc.nextInt();
        dp[0][0] = A;
        dp[1][0] = costEven(A);
        dp[2][0] = costOdd(A);
        dp[3][0] = costEven(A);
        dp[4][0] = A;


        for(int i = 1; i < L; i++) {
            long min = dp[0][i-1];

            A = sc.nextInt();

            dp[0][i] = min + A;
            min = Math.min(min, dp[1][i-1]);
            dp[1][i] = min + costEven(A);
            min = Math.min(min, dp[2][i-1]);
            dp[2][i] = min + costOdd(A);
            min = Math.min(min, dp[3][i-1]);
            dp[3][i] = min + costEven(A);
            min = Math.min(min, dp[4][i-1]);
            dp[4][i] = min + A;
        }

        long ans = dp[0][L-1];
        for (int i = 1; i <= 4; i++) {
            ans = Math.min(dp[i][L-1], ans);
        }

        System.out.println(ans);
    }
}
