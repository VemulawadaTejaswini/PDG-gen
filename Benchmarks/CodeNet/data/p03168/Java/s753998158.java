import java.util.*;

public class Main {
    public static void main(String[] args) {
        ProblemI.main();
    }
}

class ProblemI {
    /*
    * Idea: build DP of prob of having j heads using first i coins (i=1,...,N, j=0,...,i)
    * DP[i][j] = DP[i-1][j]*(1-P[i]) + DP[i-1][j-1]* P[i]
    * Time & space complexity = 2+3+...+(n+1) = O(n^2)
     * */
    static int N;
    static double[] p;
    static double[][] dp;

    static void main() {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        dp = new double[N + 1][N + 1];
        p = new double[N + 1];
        for (int i = 1; i <= N; i++) {
            p[i] = sc.nextDouble();
        }

        // initial condition
        dp[1][1] = p[1];
        dp[0][0] = 1;
        for (int i = 1; i <= N; i++) dp[i][0] = dp[i-1][0] * (1 - p[i]);


        // implement dp
        for (int i = 2; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                dp[i][j] = dp[i-1][j]*(1-p[i]) + dp[i-1][j-1] * p[i];
            }
        }

        // get ans
        double ans = 0;
        for (int j = N/2 + 1; j<=N; j++) {
            ans+=dp[N][j];
        }
        System.out.println(ans);
    }
}