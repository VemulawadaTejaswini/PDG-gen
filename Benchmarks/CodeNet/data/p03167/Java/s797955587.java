import java.util.Scanner;

class Main {
    static Scanner sc;
    static int mod = (int)Math.pow(10, 9) + 7;

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
        int h = sc.nextInt();
        int w = sc.nextInt();
        boolean[][] grid = new boolean[h][w];
        for(int i = 0; i < h; i++) {
            String line = sc.next();
            for(int j = 0; j < w; j++) {
                if(line.charAt(j) == '#') grid[i][j] = true;
            }
        }
        int[][] dp = new int[h][w];
        dp[0][0] = 1;
        for(int i = 1; i < w; i++) {
            if(grid[0][i]) dp[0][i] = 0;
            else dp[0][i] = dp[0][i - 1];
        }
        for(int i = 1; i < h; i++) {
            if(grid[i][0]) dp[i][0] = 0;
            else dp[i][0] = dp[i - 1][0];
        }
        for(int i = 1; i < h; i++) {
            for(int j = 1; j < w; j++) {
                if(grid[i][j]) dp[i][j] = 0;
                else dp[i][j] = (dp[i - 1][j] % mod + dp[i][j - 1] % mod) % mod;
            }
        }
        print(dp[h - 1][w - 1]);
    }
}
