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
        char[][] fill = new char[n + 1][m + 1];
        for(int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                dp[i][j] = Integer.MIN_VALUE;
                dp[i][0] = 0;
                dp[0][j] = 0;
                fill[i][j] = 'F';
                prev[i][j][0] = -1;
                prev[i][j][1] = -1;
            }
        }

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= m; j++) {
                char left = s.charAt(i - 1);
                char right = t.charAt(j - 1);
                if (left == right && dp[i - 1][j - 1] != Integer.MIN_VALUE) {
                    fill[i][j] = left;
                    int val = dp[i - 1][j - 1] + 1;
                    if (val >= dp[i][j]) {
                        dp[i][j] = val;
                        prev[i][j][0] = i - 1;
                        prev[i][j][1] = j - 1;
                    }
                }
                if (left != right) {
                    if (dp[i][j - 1] != Integer.MIN_VALUE) {
                        int val = dp[i][j - 1];
                        if (val >= dp[i][j]) {
                            dp[i][j] = val;
                            prev[i][j][0] = i;
                            prev[i][j][1] = j - 1;
                        }
                    }
                    if (dp[i - 1][j] != Integer.MIN_VALUE) {
                        int val = dp[i - 1][j];
                        if (val >= dp[i][j]) {
                            dp[i][j] = val;
                            prev[i][j][0] = i - 1;
                            prev[i][j][1] = j;
                        }
                    }
                }
            }
        }
        int x = n;
        int y = m;
        String ans = "";
        while(x != -1) {
            if (fill[x][y] != 'F') ans = fill[x][y] + ans;
            int temp = x;
            x = prev[x][y][0];
            y = prev[temp][y][1];
        }
        print(ans);
    }
}
