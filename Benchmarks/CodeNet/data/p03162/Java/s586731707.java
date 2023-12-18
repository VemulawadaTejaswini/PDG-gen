import java.util.*;

public class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int n = Integer.parseInt(sc.next());

      long[][] dp = new long[n][3];

      long[][] x = new long[n][3];
      for(int i=0;i<n;i++){
        x[i][0] = Long.parseLong(sc.next());
        x[i][1] = Long.parseLong(sc.next());
        x[i][2] = Long.parseLong(sc.next());
      }
      dp[0][0]= x[0][0];
      dp[0][1]= x[0][1];
      dp[0][2]= x[0][2];

      for(int i=1;i<n;i++){
        for(int j=0;j<3;j++){
          for(int k=0;k<3;k++){
            if(j!=k){
              dp[i][j] = Math.max(dp[i][j],dp[i-1][k]+x[i][j]);
            }
          }
        }
      }

      long ans = 0;

      ans = Math.max(dp[n-1][0],dp[n-1][1]);
      ans = Math.max(ans,dp[n-1][2]);

      System.out.println(ans);

    }
}
