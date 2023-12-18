import java.io.*;
import java.util.*;

class Main{
  public static void main(String args[]){
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    double p[] = new double[n];
    for(int i=0;i<n;i++) p[i] = in.nextDouble();
    double dp[][]=  new double[n][n+2];
    dp[0][1] = 1-p[0];
    dp[0][2] = p[0];
    for(int i=1;i<dp.length;i++)
      for(int j=1;j<dp[i].length;j++)
        dp[i][j] = dp[i-1][j-1]*p[i] + dp[i-1][j]*(1-p[i]);
    double ans = 0;
    for(int i=(int)Math.ceil(n/2) + 2;i<=n+1;i++)
      ans += dp[n-1][i];
 
    System.out.println(ans);
  }

  public static void print(double a[][]){
    for(int i=0;i<a.length;i++)
      System.out.println(Arrays.toString(a[i]));
  }
}