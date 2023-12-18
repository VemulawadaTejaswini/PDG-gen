import java.util.*;
public class Main{
  static double[][][] dp;
  static int n;
  static double solve(int i,int j,int k){
    if(dp[i][j][k]!=-1)return dp[i][j][k];
    if(i<0||j<0||k<0)return 0;
    if(i==0&&j==0&&k==0)return 0;
    double d = n;
    if(i>0)d+=solve(i-1,j,k)*(double)i;
    if(j>0)d+=solve(i+1,j-1,k)*(double)j;
    if(k>0)d+=solve(i,j+1,k-1)*(double)k;
    d/=(double)(i+j+k);
    return dp[i][j][k]=d;
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    dp = new double[301][301][301];
    for(int i=0;i<=300;i++)
      for(int j=0;j<=300;j++)Arrays.fill(dp[i][j],-1);
    int one = 0;
    int two = 0;
    int three = 0;
    for(int i=1;i<=n;i++){
      int a = sc.nextInt();
      if(a==1)one++;
      if(a==2)two++;
      if(a==3)three++;
    }
    System.out.println(solve(one,two,three));
  }
}