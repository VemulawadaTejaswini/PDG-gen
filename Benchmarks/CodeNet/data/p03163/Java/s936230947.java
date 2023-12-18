import java.io.*;
import java.util.*;

class Main{
  public static void main(String args[]){
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int W = in.nextInt();

    int w[] = new int[n];
    long v[] = new long[n];

    for(int i=0;i<n;i++){
      w[i] = in.nextInt();
      v[i] = in.nextLong();
    }

    long dp[][] = new long[n+1][W+1];

    for(int i=1;i<=n;i++){
      for(int j=1;j<=W;j++){
        dp[i][j] = Math.max(dp[i-1][j], (j-w[i-1] >= 0 ) ? dp[i-1][j-w[i-1]] + v[i-1] : 0);
      }
    }
    System.out.println(dp[n][W]);
  }
}