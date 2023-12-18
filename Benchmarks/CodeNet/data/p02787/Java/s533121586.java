import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        int h = std.nextInt();
        int n = std.nextInt();
        Integer[] as = new Integer[n];
        Integer[] bs = new Integer[n];

        for (int i = 0; i < n; i++) {
            as[i] = std.nextInt();
            bs[i] = std.nextInt();
        }

        int[][] dp = new int[n+1][h + 10];


        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= h; j++) {
                if (j >= as[i]) {
                    int old = dp[i][j];
                    int newVal = dp[i+1][j - as[i]] + bs[i];
                    dp[i + 1][j] = Math.max(old, newVal);
                } else {
                    dp[i+1][j] = dp[i][j];
                }
            }
        }

        System.out.println(dp[n][h]);
    }
}