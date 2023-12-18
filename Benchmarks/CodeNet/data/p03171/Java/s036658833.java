import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long[] a = new long[n];
    for(int i=0;i<n;i++)a[i]=sc.nextInt();
    long[][] dp = new long[n][n];
    for(int i=0;i<n;i++)dp[i][i]=a[i];
    for(int i=n-2;i>=0;i--){
      for(int j=i+1;j<n;j++)
        dp[i][j]=Math.max(a[i]-dp[i+1][j],a[j]-dp[i][j-1]);
    }
    System.out.println(dp[0][n-1]);
  }
}