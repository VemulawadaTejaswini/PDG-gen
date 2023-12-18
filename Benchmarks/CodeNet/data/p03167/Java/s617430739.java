import java.util.Scanner;

class Main {
    private static final int MAX = (int) (Math.pow(10, 9) + 7);
    private static int R;
    private static int C;

    public static void main(String[] args) {
        System.out.println(MAX);
        Scanner sc = new Scanner(System.in);
        R = sc.nextInt();
        C = sc.nextInt();

        char[][] arr = new char[R][C];
        for (int i = 0; i < R; i++) {
            String s = sc.next();
            for (int j = 0; j < C; j++) {
                arr[i][j] = s.charAt(j);
            }
        }

        int[][] dp = new int[R][C];

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (i == 0 && j == 0) {
                    dp[i][j] = 1;
                } else if (i == 0) {
                    if (arr[i][j] == '.') {
                        dp[i][j] = dp[i][j - 1];
                    } else if (arr[i][j] == '#') {
                        dp[i][j] = 0;
                    }
                } else if (j == 0) {
                    if (arr[i][j] == '.') {
                        dp[i][j] = dp[i - 1][j];
                    } else if (arr[i][j] == '#') {
                        dp[i][j] = 0;
                    }
                } else {
                    if (arr[i][j] == '.') {
                        dp[i][j] = dp[i][j - 1] + dp[i - 1][j];
                    } else {
                        dp[i][j] = 0;
                    }
                }

                dp[i][j] = dp[i][j] % MAX;
            }
        }

        System.out.println(dp[R - 1][C - 1]);
        sc.close();
    }
}