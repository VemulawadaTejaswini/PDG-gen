import java.util.Scanner;

import static java.lang.Math.max;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int A[] = new int[N+1];

        for (int i = 1; i < N+1; i++) {
            A[i] = sc.nextInt();
        }

        int dp[][] = new int[N+1][2];
        dp[0][0] = 0;
        dp[0][1] = -1000000000;

        for (int i = 0; i < N; i++) {
            dp[i + 1][0] = max(dp[i][0] + A[i+1], dp[i][1] - A[i+1]);
            dp[i + 1][1] = max(dp[i][0] - A[i+1], dp[i][1] + A[i+1]);
            System.out.println("dp[" + (i+1) + "][0] = " + dp[i + 1][0]);
            System.out.println("dp[" + (i+1) + "][1] = " + dp[i + 1][1]);
        }

        System.out.println(dp[N][0]);
    }
}
