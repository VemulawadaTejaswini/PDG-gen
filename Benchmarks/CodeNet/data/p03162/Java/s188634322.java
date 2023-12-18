import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[][] gain = new int[3][n];

        for (int i = 0; i < n; i++) {

            String[] abc = sc.nextLine().split(" ");
            gain[0][i] = Integer.parseInt(abc[0]);
            gain[1][i] = Integer.parseInt(abc[1]);
            gain[2][i] = Integer.parseInt(abc[2]);
        }

        System.out.println(Arrays.deepToString(gain));

        // dp[i][j] := j - 1番目でiを選んだときの最適解
        int[][] dp = new int[3][n + 1];

        dp[0][0] = 0;
        dp[1][0] = 0;
        dp[2][0] = 0;

        for (int j = 1; j <= n; j++) {
            dp[0][j] = max(dp[1][j - 1], dp[2][j - 1]) + gain[0][j - 1];
            dp[1][j] = max(dp[2][j - 1], dp[0][j - 1]) + gain[1][j - 1];
            dp[2][j] = max(dp[0][j - 1], dp[1][j - 1]) + gain[2][j - 1];
        }

        System.out.println(Arrays.deepToString(dp));

        System.out.println(max(max(dp[0][n], dp[1][n]), dp[2][n]));


    }
}