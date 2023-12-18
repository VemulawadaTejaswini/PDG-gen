import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.rmi.server.ExportException;
import java.util.Arrays;
        import java.util.Scanner;

class Main {
    static Scanner sc;

    private static void nextArr(int[] h) {
        for(int i = 0; i < h.length; i++) h[i] = sc.nextInt();
    }

    private static int nextInt() {
        return sc.nextInt();
    }

    private static void print(Object... vals) {
        for(int i = 0; i < vals.length; i++) {
            if (i != vals.length - 1) {
                System.out.print(vals[i] + ",");
            } else {
                System.out.print(vals[i]);
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        int n = s.length();
        int m = t.length();

        int[][] dp = new int[n + 1][m + 1];
        int[][][] prev = new int[n + 1][m + 1][2];
        for(int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                dp[i][j] = Integer.MIN_VALUE;
                dp[i][0] = 0;
                dp[0][j] = 0;
                prev[i][j][0] = -1;
                prev[i][j][1] = -1;
            }
        }

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= m; j++) {
                char left = s.charAt(i - 1);
                char right = t.charAt(j - 1);
                if (left == right) {
                    dp[i][j] = fn(i, j, i - 1, j - 1, dp[i - 1][j - 1] + 1, dp, prev);
                }
                dp[i][j] = fn(i, j, i, j - 1, dp[i][j - 1], dp, prev);
                dp[i][j] = fn(i, j, i - 1, j, dp[i - 1][j], dp, prev);
            }
        }
        int x = n;
        int y = m;
        StringBuffer ans = new StringBuffer();
        while(x > 0 && y > 0) {
            int px = x;
            int py = y;
            x = prev[px][py][0];
            y = prev[px][py][1];
            if (x == px - 1 && y == py - 1) {
                ans.append(s.charAt(px - 1));
            }
        }
        print(ans.reverse().toString());
    }

    private static int fn(int i, int j, int i1, int j1, int val, int[][] dp, int[][][] prev) {
        if (val >= dp[i][j]) {
            prev[i][j][0] = i1;
            prev[i][j][1] = j1;
            return val;
        }
        return dp[i][j];
    }
}
