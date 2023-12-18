import java.util.*;
import java.io.*;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
 
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
 
        int maximumVal = 200;
        int padding = 9;
        int [][][] dp = new int[maximumVal + padding][maximumVal + padding][maximumVal + padding];
        for(int[][] array2d : dp){
            for(int[] array1d : array2d){
                Arrays.fill(array1d, Integer.MAX_VALUE / 2);
            }
        }
 
        dp[a][b][c] = 0;
        for(int i = 0; i <= maximumVal; i++){
            for(int j = 0; j <= maximumVal; j++){
                for(int k = 0; k <= maximumVal; k++){
                    if(i - 1 >= 0 && j - 1 >= 0){
                        dp[i][j][k] = Integer.min(dp[i][j][k], dp[i - 1][j - 1][k] + 1);
                    }
                    if(i - 1 >= 0 && k - 1 >= 0){
                        dp[i][j][k] = Integer.min(dp[i][j][k], dp[i - 1][j][k - 1] + 1);
                    }
                    if(j - 1 >= 0 && k - 1 >= 0){
                        dp[i][j][k] = Integer.min(dp[i][j][k], dp[i][j - 1][k - 1] + 1);
                    }
                    if(i - 2 >= 0){
                        dp[i][j][k] = Integer.min(dp[i][j][k], dp[i - 2][j][k] + 1);
                    }
                    if(j - 2 >= 0){
                        dp[i][j][k] = Integer.min(dp[i][j][k], dp[i][j - 2][k] + 1);
                    }
                    if(k - 2 >= 0){
                        dp[i][j][k] = Integer.min(dp[i][j][k], dp[i][j][k - 2] + 1);
                    }
                }
            }
        }
 
        int ans = Integer.MAX_VALUE;
        for(int i = 0; i <= maximumVal; i++){
            ans = Integer.min(ans, dp[i][i][i]);
        }
 
        System.out.println(ans);
 
    }
}