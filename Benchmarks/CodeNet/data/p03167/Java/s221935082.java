import java.util.*;
import java.lang.*;
import java.io.*;
 
public final class Main
{
    public static void main (String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m =  in.nextInt();
        int[][] arr= new int[n][m];
        for(int i =0; i< n; i++) {
           String s = in.nextLine();
           for(int j =0; j< m ; j++) {
              if(s.charAt(j)=='#'){
                arr[i][j]  =-1;
              } else {
                arr[i][j] =0;
              }
           }
        }
        
      int[][] dp = new int[n][m];
      dp[0][0] = 1;
      
      for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
          if (arr[i][j] == -1) {
            continue;
          }
          if (i > 0) {
            dp[i][j] = (dp[i][j] + dp[i - 1][j])%1000000007;
          }
          if (j > 0) {
            dp[i][j] = (dp[i][j]+dp[i][j - 1])%1000000007;
          }
        }
      }
      System.out.println(dp[n-1][m-1]); 
        
    }
}
