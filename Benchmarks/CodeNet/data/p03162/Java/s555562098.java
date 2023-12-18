import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] a = new int[n][3];

        for (int i = 0; i < n; i++) {
            a[i][0] = sc.nextInt();
            a[i][1] = sc.nextInt();
            a[i][2] = sc.nextInt();
        }

        int[][] dp = new int[n][3];
        dp[0][0] = a[0][0];
        dp[0][1] = a[0][1];
        dp[0][2] = a[0][2];

        for (int i = 1; i < n; i++) {
            dp[i][0] = a[i][0] + Math.max(dp[i-1][1], dp[i-1][2]);
            dp[i][1] = a[i][1] + Math.max(dp[i-1][0], dp[i-1][2]);
            dp[i][2] = a[i][2] + Math.max(dp[i-1][0], dp[i-1][1]);
        }
        
        int max = Math.max(dp[n-1][0], dp[n-1][1]);
        max = Math.max(dp[n-1][2], max);
        
        System.out.println(max);
    }
}
