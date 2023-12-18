import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] s = br.readLine().split(" ");
    int n = Integer.parseInt(s[0]);
    int W = Integer.parseInt(s[1]);
    int[] val = new int[n];
    int[] wt = new int[n];
    for(int i=0;i<n;i++){
      String[] str = br.readLine().split(" ");
      wt[i] = Integer.parseInt(str[0]);
      val[i] = Integer.parseInt(str[1]);
    }
    int[][] dp = new int[n+1][W+1];
    
    for(int i=0;i<=n;i++){
      for(int j=0;j<=W;j++){
        if(i==0 || j==0)
          dp[i][j] = 0;
        else if(j>=wt[i-1])
          dp[i][j] = Math.max(dp[i-1][j], val[i-1] + dp[i-1][j-wt[i-1]]);
        else
          dp[i][j] = dp[i-1][j];
      }
    }
    System.out.println(dp[n][W]);
  }
}
