import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt(), w = sc.nextInt();
        boolean[][] a = new boolean[h + 2][w + 2];
        for (int i = 1; i <= h; i++) {
            String s = sc.next();
            for (int j = 1; j <= w; j++) {
                if ('.' == s.charAt(j - 1)) {
                    a[i][j] = true;
                }
            }
        }
        long[][] dp = new long[h + 2][w + 2];

        dp[1][1] = 1;
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= w; j++) {
                if (a[i + 1][j]) dp[i + 1][j] += dp[i][j];
                if (a[i][j + 1]) dp[i][j + 1] += dp[i][j];
            }
        }

        System.out.println(dp[h][w] % (1000000007));
    }
}