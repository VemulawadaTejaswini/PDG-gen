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
		for(int k=0;k<2;++k){
          if(j==0){
            if(k==0)continue;
            dp[i+1][0][1] = (dp[i][0][1] + (dp[i][1][0] + dp[i][1][1])%mod)%mod;
          }else if(j==1){
            if(k==0){
              if(n<2)continue;
              dp[i+1][1][0] = (dp[i][1][0]+dp[i][2][0])%mod;
            }else{
              if(n<2)dp[i+1][1][1] = (dp[i][1][0] + (dp[i][1][1]+dp[i][0][1])%mod)%mod;
              else dp[i+1][1][1] = (((dp[i][1][0]+dp[i][0][1])%mod + dp[i][1][1]*2%mod)%mod + dp[i][2][1])%mod;
            }
          }else{
            dp[i+1][j][k] = (dp[i][j][k]+dp[i][j-1][k])%mod;
            if(j+1<=n)dp[i+1][j][k] = (dp[i+1][j][k] + (dp[i][j][k]+dp[i][j+1][k])%mod)%mod;
          }
        }
      }
    }
    long ans = 0;
    for(int i=0;i<=n;++i)ans = (ans + dp[m][i][1])%mod;
    System.out.println(ans);
  }
}