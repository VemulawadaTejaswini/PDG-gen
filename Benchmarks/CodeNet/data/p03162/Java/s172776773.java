import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[][] a = new long[n + 10][3];
        long[][] dp = new long[n + 10][3];

        for(int i = 0; i < n; i++)
            for(int j = 0; j < 3; j++) a[i][j] = Integer.parseInt(sc.next());

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < 3; j++) {
                for(int k = 0; k < 3; k++) {
                    if(j == k) continue;
                    dp[i + 1][k] = Math.max(dp[i + 1][k], dp[i][j] + a[i][k]);
                }
            }
        }
        long ans = 0;
        for(int i = 0; i < 3; i++) ans = Math.max(ans, dp[n][i]);
        System.out.println(ans);
    }
}
