import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Main {

    public static int MOD = 1000000007;

    public static int totalPaths(char[][] grid) {
        int h = grid.length;
        int w = grid[0].length;

        int[][] dp = new int[h][w];
        dp[0][0] = 1;
        for(int i = 0; i < h; i++) {
            for(int j = 0; j < w; j++) {
                if(grid[i][j] == '.') {
                    if(j >= 1) dp[i][j] = (dp[i][j] + dp[i][j - 1]) % MOD;
                    if(i >= 1) dp[i][j] = (dp[i][j] + dp[i - 1][j]) % MOD;
                }
            }
        }
        return dp[h - 1][w - 1] % MOD;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();

        sc.nextLine();

        char[][] grid = new char[h][w];
        for(int i = 0; i < h; i++) {
            grid[i] = sc.nextLine().toCharArray();
        }
        System.out.println(totalPaths(grid));
  }
}
