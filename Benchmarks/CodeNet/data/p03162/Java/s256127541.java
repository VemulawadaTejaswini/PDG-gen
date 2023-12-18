import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] happiness = new int[n][3];
        int[] dp = new int[n];
        int[] cal = new int[n];
        for (int i = 0; i < n; i++) {
            cal[i] = -1;
            for (int i1 = 0; i1 < 3; i1++) {
                happiness[i][i1] = scanner.nextInt();
            }
        }
        System.out.println(maxHappiness(happiness, dp, cal, n - 1));
        System.out.println(1);
    }

    public static int maxHappiness(int[][] happiness, int[] dp, int cal[], int n) {
        if (n == 0) {
            return Math.max(Math.max(happiness[0][0], happiness[0][1]), happiness[0][2]);
        }


        if (cal[n] >= 0) {
            return dp[n];
        }

        if (cal[n - 1] == -1) {
            dp[n - 1] = maxHappiness(happiness, dp, cal, n - 1);
        }


        if (cal[n - 1] == 0) {
            if (happiness[n][1] >= happiness[n][2]) {
                dp[n] = dp[n - 1] + happiness[n][1];
                cal[n] = 1;
            } else {
                dp[n] = dp[n - 1] + happiness[n][2];
                cal[n] = 2;
            }
        } else if (cal[n - 1] == 1) {
            if (happiness[n][0] >= happiness[n][2]) {
                dp[n] = dp[n - 1] + happiness[n][0];
                cal[n] = 0;
            } else {
                dp[n] = dp[n - 1] + happiness[n][2];
                cal[n] = 2;
            }
        } else {
            if (happiness[n][0] >= happiness[n][1]) {
                dp[n] = dp[n - 1] + happiness[n][0];
                cal[n] = 0;
            } else {
                dp[n] = dp[n - 1] + happiness[n][1];
                cal[n] = 1;
            }
        }

        return dp[n];
    }
}