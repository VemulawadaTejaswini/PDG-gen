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
        int n = sc.nextInt();
        int w = sc.nextInt();
        int[][] item = new int[n][2];
        for(int i = 0; i < n; i++) nextArr(item[i]);
        int v = 0;
        for(int i = 0; i < n; i++) v += item[i][1];

        int[][] dp = new int[n][v + 1];
        for(int i = 0; i < n; i++) Arrays.fill(dp[i], Integer.MAX_VALUE);
        for(int i = 0; i < n; i++) dp[i][0] = 0;
        dp[0][item[0][1]] = item[0][0];
        for(int i = 1; i < n; i++) {
            for(int j = 0; j <= v; j++) {
                dp[i][j] = Math.min(dp[i][j], dp[i - 1][j]);
                if (j - item[i][1] >= 0 && dp[i - 1][j - item[i][1]] != Integer.MAX_VALUE) {
                    dp[i][j] = Math.min(dp[i][j], dp[i - 1][j - item[i][1]] + item[i][0]);
                }
            }
        }
        int max = 0;
        for(int i = 0; i <= v; i++) {
            if (dp[n - 1][i] <= w) {
                max = Math.max(max, i);
            }
        }
        print(max);

    }
}
