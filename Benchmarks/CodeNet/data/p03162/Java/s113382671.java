import java.util.Arrays;
import java.util.Scanner;

public class Main {

    //https://atcoder.jp/contests/dp/tasks/dp_c
    public static void main( String[] args ) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[][] arr = new int[n][3];
        for (int i = 0; i < n; i++) {
            arr[i][0] = scanner.nextInt();
            arr[i][1] = scanner.nextInt();
            arr[i][2] = scanner.nextInt();
        }

        int[][] dp = new int[n][3];

        for (int[] ay : dp)
            Arrays.fill(ay, -1);

        solveBottomUp(arr, dp);
    }
  
  private static void solveBottomUp( int[][] arr, int[][] dp ) {
        dp[0][0] = arr[0][0];
        dp[0][1] = arr[0][1];
        dp[0][2] = arr[0][2];

        for (int i = 1; i < arr.length; i++) {

            //At each day Taro can do 3 activities...
            for (int j = 0; j < 3; j++) {

                //Next day activity should be different from Cur-selected Activity
                if (j == 0) {
                    dp[i][0] = Math.max(dp[i - 1][1] + arr[i][0], dp[i - 1][2] + arr[i][0]);
                } else if (j == 1) {
                    dp[i][1] = Math.max(dp[i - 1][2] + arr[i][1], dp[i - 1][0] + arr[i][1]);
                } else {
                    dp[i][2] = Math.max(dp[i - 1][1] + arr[i][2], dp[i - 1][0] + arr[i][2]);
                }
            }
        }

        System.out.println(Math.max(dp[arr.length - 1][2], Math.max(dp[arr.length - 1][0], dp[arr.length - 1][1])));
    }
}