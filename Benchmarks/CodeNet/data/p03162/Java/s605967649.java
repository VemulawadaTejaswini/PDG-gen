import java.util.Scanner;

class Main {
    // C - Vacation
    public static int vacation(int[][] points) {
        int n = points.length;
        int[][] dp = new int[n][3];
        dp[0][0] = points[0][0];
        dp[0][1] = points[0][1];
        dp[0][2] = points[0][2];

        for (int i = 1; i < n; i++) {
            dp[i][0] = points[i][0] + Math.max(dp[i-1][1], dp[i-1][2]);
            dp[i][1] = points[i][1] + Math.max(dp[i-1][0], dp[i-1][2]);
            dp[i][2] = points[i][2] + Math.max(dp[i-1][0], dp[i-1][1]);
        }

        return Math.max(dp[n-1][0], Math.max(dp[n-1][1], dp[n-1][2]));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        int[][] arr = new int[N][3];
        for (int i = 0; i < N; i++) {
            arr[i][0] = in.nextInt();
            arr[i][1] = in.nextInt();
            arr[i][2] = in.nextInt();
        }
        in.close();

        // call function hear
        int ret = vacation(arr);
        System.out.println(ret);
    }
}