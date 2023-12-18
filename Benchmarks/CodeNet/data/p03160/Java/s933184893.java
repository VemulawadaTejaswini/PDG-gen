import java.util.Arrays;
import java.util.Scanner;

public class Main {

    //https://atcoder.jp/contests/dp/tasks/dp_a

   private static int[] dp = null;

    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        dp = new int[n + 1];
        Arrays.fill(dp, -1);

       /* int value = dfs(arr, n, 0);
        System.out.println(value);*/

        int val = solveTopDown(n - 1, arr);
        System.out.println(val);

    }

    private static int dfs( int[] arr, int n, int temp ) {

       /* if (dp[temp] != -1)
            return dp[temp];*/

        if (temp == n) //if no element in an array then
            return 0;

        if (temp == n - 1) //if no element in an array then
            return arr[n - 1];

        if (temp == n - 2) //if only element in array then difference of two will be the cost.
            return Math.abs(arr[temp] - arr[temp - 1]);

        for (int i = temp; i < n; i++) {

            if (i + 2 < n) {

                dp[i] = Math.min(Math.abs(arr[i] - arr[i + 1]) + dfs(arr, n, i + 1)
                        , Math.abs(arr[i] - arr[i + 2]) + dfs(arr, n, i + 2));
            }
        }

        return dp[n];
    }

    private static int solveTopDown( int i, int[] arr ) {
        if (dp[i] != -1) {
            return dp[i];
        }

        if (i == 0) { //if one element left
            dp[i] = 0;
            return dp[i];
        } else if (i == 1) { //if two left
            dp[i] = Math.abs(arr[i] - arr[i - 1]);
            return dp[i];
        }

        dp[i] = Math.min(Math.abs(arr[i] - arr[i - 1]) + solveTopDown(i - 1, arr)
                , Math.abs(arr[i] - arr[i - 2]) + solveTopDown(i - 2, arr));

        return dp[i];
    }
}