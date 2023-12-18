import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n+1][3];
        int[][] dp = new int[n+1][3];
        for (int i=0; i<n; i++) {
            for (int j=0; j<3; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for (int i=0; i<n; i++) {
            for (int j=0; j<3; j++) {
                for (int k = 0; k < 3; k++) {
                    if (j==k) continue;
                    dp[i+1][k] = Math.max(dp[i+1][k], dp[i][j] + a[i][k]);
                }
            }
        }
        int ans = 0;
        for (int j=0; j<3; j++) {
            ans = Math.max(ans, dp[n][j]);
        }
        System.out.println(ans);
    }
}
