import java.util.*;

public class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int n = Integer.parseInt(sc.next());
      int k = Integer.parseInt(sc.next());

      long[] dp = new long[n];

      long[] h = new long[n];
      for(int i=0;i<n;i++){
        h[i] = Long.parseLong(sc.next());
        dp[i] = 999999999;
      }


      dp[0] = 0;
      for(int i=1;i<n;i++){
        for(int j=1;j<=k;j++){
          if(i-j>=0){
            long costj = Math.abs(h[i]-h[i-j]);
            dp[i] = Math.min(dp[i-j]+costj,dp[i]);
          }
        }
      }

      System.out.println(dp[n-1]);

    }
}
