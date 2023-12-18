import java.util.*;
class Main{
  static long mod = (long)1e9+7;
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int m = scan.nextInt();
    long[][][] dp = new long[m+1][n+1][2];
    dp[0][0][1]=1;
    for(int i=1;i<=n;++i)dp[0][i][0]=1;
    for(int i=0;i<m;++i){
      for(int j=0;j<=n;++j){
        if(j>0){
          if(j==1){
            dp[i+1][j][0] = (dp[i+1][j][0] + dp[i][j][0])%mod;
            dp[i+1][j][1] = (dp[i+1][j][1] + (dp[i][j][0] + dp[i][j][1]*2%mod)%mod)%mod;
          }else{
            // j+1 <=n ?
           	dp[i+1][j][0] = (dp[i+1][j][0] + dp[i][j][0]*2%mod)%mod;
          	dp[i+1][j][1] = (dp[i+1][j][1] + dp[i][j][1]*2%mod)%mod;
          }
          if(j-2>0){
            dp[i+1][j-2][0] = (dp[i+1][j-2][0] + dp[i][j][0])%mod;
            dp[i+1][j-2][1] = (dp[i+1][j-2][1] + dp[i][j][1])%mod;
          }else if(j-2==0){
            dp[i+1][j-2][1] = (dp[i+1][j-2][1] + (dp[i][j][0]+dp[i][j][1])%mod)%mod;
          }
          if(j+2<=n){
            dp[i+1][j+2][0] = (dp[i+1][j+2][0] + dp[i][j][0])%mod;
            dp[i+1][j+2][1] = (dp[i+1][j+2][1] + dp[i][j][1])%mod;
          }
        }else{
          dp[i+1][j][1] = (dp[i+1][j][1] + (dp[i][j][1] + (dp[i][j+2][0]+dp[i][j+2][1])%mod)%mod)%mod;
        }
      }
    }
    long ans = 0;
    for(int i=0;i<=n;++i)ans = (ans + dp[m][i][1])%mod;
    System.out.println(ans);
  }
}