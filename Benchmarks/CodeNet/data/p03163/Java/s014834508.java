import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int W = sc.nextInt();
    long[] v = new long[n+1];
    int[] w = new int[n+1];
    long[][] dp = new long[n+1][W+1];
    for(int i=0;i<n;i++){
      w[i]=sc.nextInt();
      v[i]=sc.nextLong();
    }
    for(int i=0;i<n;i++){
      for(int j=0;j<=W;j++){
        if(j<w[i])dp[i+1][j]=dp[i][j];
        else dp[i+1][j]=Math.max(dp[i][j],dp[i][j-w[i]]+v[i]);
      }
    }
    System.out.println(dp[n][W]);
  }
}