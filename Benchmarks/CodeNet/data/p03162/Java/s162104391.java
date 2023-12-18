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
 
       /* int[] dp = new int[3];
 
        Arrays.fill(dp, -1);
        int val = dfs(arr, 1, dp);
 
        System.out.println(val);*/
 
        int[][] dp = new int[n][3];
        for (int[] ay : dp)
            Arrays.fill(ay, -1);
 
        int ans = Math.max(solveTopDown(0, 0, arr, dp)
                , Math.max(solveTopDown(0, 1, arr, dp)
                        , solveTopDown(0, 2, arr, dp)));
 
        System.out.println(ans);
 
    }
 
private static int solveTopDown( int row, int curSelection, int[][] arr, int[][] dp ) {
        if (row >= arr.length)
            return 0;
 
        if (dp[row][curSelection] == -1) {
 
            int max = Integer.MIN_VALUE;
 
            //At each day Taro can do 3 activities...
            for (int j = 0; j < 3; j++) {
 
                //Next day activity should be different from Cur-selected Activity
                //For eg: during first function call we did : solveTopDown(0, 0, arr, dp)
                //here curSelection=0, so Taro can only choose from {1,2} activities to gain Max happiness.
                if (curSelection != j) {
 
                    int choice = solveTopDown(row + 1, j, arr, dp) + arr[row][j];
 
                    if (max < choice)
                        max = choice;
                }
            }
 
            dp[row][curSelection] = max;
        }
 
        return dp[row][curSelection];
    }
}