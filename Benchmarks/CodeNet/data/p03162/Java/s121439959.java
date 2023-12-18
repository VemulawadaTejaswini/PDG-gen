import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] happiness = new int[n][3];
        int[][] dp = new int[3][n];
        int[] cal = new int[n];
        for (int i = 0; i < n; i++) {
            cal[i] = -1;
            for (int i1 = 0; i1 < 3; i1++) {
                happiness[i][i1] = scanner.nextInt();
            }
        }
        System.out.println(maxHappiness(happiness, dp, cal, n));
        System.out.println(1);
    }

    public static int maxHappiness(int[][] happiness, int[][] dp, int[] cal,int n) {

        dp[0][0] = happiness[0][0];
        dp[1][0] = happiness[0][1];
        dp[2][0] = happiness[0][2];

        for (int i = 1; i < n; i++) {
            dp[0][i] = Math.max(dp[1][i - 1], dp[2][i - 1]) + happiness[i][0];
            dp[1][i] = Math.max(dp[0][i - 1], dp[2][i - 1]) + happiness[i][1];
            dp[2][i] = Math.max(dp[1][i - 1], dp[0][i - 1]) + happiness[i][2];
        }


        return Math.max(Math.max(dp[0][n-1], dp[1][n-1]), dp[2][n-1]);
    }
}