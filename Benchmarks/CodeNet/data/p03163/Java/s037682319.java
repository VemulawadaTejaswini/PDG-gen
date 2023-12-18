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

        long[][] dp = new long[n][w + 1];
        for(int j = 0; j <= w; j++) dp[0][j] = j >= item[0][0] ? item[0][1] : 0;
        for(int i = 1; i < n; i++) {
            for(int j = 0; j <= w; j++) {
                dp[i][j] = Math.max(dp[i][j], dp[i - 1][j]);
                if (j - item[i][0] >= 0) {
                    dp[i][j] = Math.max(dp[i][j], dp[i - 1][j - item[i][0]] + item[i][1]);
                }
            }
        }
        print(dp[n - 1][w]);

    }
}
