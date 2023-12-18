import java.util.Scanner;

public class Main {
    static int N;
    static int[][] act;
    static int[][] dp;
    static int r;

    static int a = 0;
    static int b = 1;
    static int c = 2;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        act = new int[N+1][3];
        dp = new int[N+1][3];
        for(int i=1; i<=N; ++i) {
            act[i][a] = sc.nextInt();
            act[i][b] = sc.nextInt();
            act[i][c] = sc.nextInt();
        }

        for(int i=1; i<=N; ++i) {
            dp[i][a] = Math.max(dp[i-1][b], dp[i-1][c]) + act[i][a];
            dp[i][b] = Math.max(dp[i-1][a], dp[i-1][c]) + act[i][b];
            dp[i][c] = Math.max(dp[i-1][a], dp[i-1][b]) + act[i][c];
        }

        r = Math.max(dp[N][a], dp[N][b]);
        r = Math.max(r, dp[N][c]);
        System.out.println(r);
    }
}
