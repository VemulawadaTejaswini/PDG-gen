import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int ma = Integer.parseInt(sc.next());
        int mb = Integer.parseInt(sc.next());
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(sc.next());
            b[i] = Integer.parseInt(sc.next());
            c[i] = Integer.parseInt(sc.next());
        }
        int[][][] dp = new int[n + 1][401][401];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= 400; j++) {
                for (int k = 0; k <= 400; k++) {
                    dp[i][j][k] = Integer.MAX_VALUE;
                }
            }
        }
        dp[0][0][0] = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= 400; j++) {
                for (int k = 0; k <= 400; k++) {
                    if (dp[i][j][k] == Integer.MAX_VALUE) {
                        continue;
                    }
                    dp[i + 1][j][k] = Math.min(dp[i][j][k], dp[i + 1][j][k]);
                    dp[i + 1][j + a[i]][k + b[i]] = Math.min(dp[i + 1][j + a[i]][k + b[i]], dp[i][j][k] + c[i]);
                }
            }
        }
        int ans = Integer.MAX_VALUE;
        for (int i = 1; i <= 400; i++) {
            for (int j = 1; j <= 400; j++) {
                if (i * ma == j * mb) {
                    ans = Math.min(ans, dp[n][i][j]);
                }
            }
        }
        if (ans == Integer.MAX_VALUE) {
            ans = -1;
        }
        System.out.println(ans);
    }
}