import java.util.Scanner;

public class Main {

    static int rec(int x, int y, int[][] dp) {
        if (dp[x][y] != 0) {
            return dp[x][y];
        }

        int a = (x >= 1 && y >= 2) ? rec(x - 1, y - 2, dp) : 0;
        int b = (x >= 2 && y >= 1) ? rec(x - 2, y - 1, dp) : 0;

        int mod = 1000000007;
        dp[x][y] += (a + b) % mod;

        return dp[x][y];
    }

    public static void main(String[] args) {

        Scanner std = new Scanner(System.in);
        int x = std.nextInt();
        int y = std.nextInt();
        int[][] dp = new int[x + 1][y + 1];
        dp[0][0] = 1;
        rec(x, y, dp);

        System.out.println(dp[x][y]);
    }
}
