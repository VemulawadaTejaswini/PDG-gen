import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        boolean[][] grid = new boolean[H][W];

        for (int i = 0; i < H; i++) {
            String row = sc.next();
            for (int j = 0; j < W; j++) {
                grid[i][j] = (row.charAt(j) == '#');
            }
        }

        int[][] dp = new int[H][W];
        int m = (int) 1e9 + 7;

        for (int j = 0; j < W; j++) {
            if (!grid[0][j]) {
                dp[0][j] = 1;
            } else {
                break;
            }
        }

        for (int i = 0; i < H; i++) {
            if (!grid[i][0]) {
                dp[i][0] = 1;
            } else {
                break;
            }
        }

        for (int i = 1; i < H; i++) {
            for (int j = 1; j < W; j++) {
                if (!grid[i][j]) {
                    dp[i][j] = (dp[i - 1][j] + dp[i][j - 1]) % m;
                }
            }
        }

        System.out.println(dp[H - 1][W - 1]);
    }
}