import java.util.*;

public class Main {

    private static  Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // write your code here

        int n = sc.nextInt();

        int[][] dp = new int[n + 1][3];

        for (int i = 1; i <= n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            dp[i][0] = Math.max(dp[i - 1][1], dp[i - 1][2])  + a;
            dp[i][1] = Math.max(dp[i - 1][0], dp[i - 1][2])  + b;
            dp[i][2] = Math.max(dp[i - 1][0], dp[i - 1][1])  + c;
        }

        System.out.println(Math.max(Math.max(dp[n][0], dp[n][1]), dp[n][2]));
    }
}