import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Main {

    public static int vacation(int[][] arr) {
        if(arr == null || arr.length == 0) {
            return 0;
        }

        int n = arr.length;
        int m = arr[0].length;
        int[][] dp = new int[n][m];

        for(int j = 0; j < m; j++) {
            dp[0][j] = arr[0][j];
        }

        for(int i = 1; i < n; i++) {
            for(int j = 0; j < m; j++) {
                int max = 0;
                for(int k = 0; k < m; k++) {
                    if(k != j) {
                        max = Math.max(max, dp[i - 1][k]);
                    }
                }
                dp[i][j] = max + arr[i][j];
            }
        }
        
        int result = 0;
        for(int j = 0; j < m; j++) {
            result = Math.max(result, dp[n - 1][j]);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[][] arr = new int[n][3];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        
        System.out.println(vacation(arr));
  }
}
