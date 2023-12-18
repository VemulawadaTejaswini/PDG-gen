import java.util.*;
import java.io.*;
public class Main {
    static void printArr(int dp[][])
    {
        for(int i=0;i<dp.length;i++)
        {
            for(int j=0;j<dp[i].length;j++)
            {
                if(dp[i][j]==Integer.MAX_VALUE)
                {
                    System.out.print(-1+" ");
                }
                else
                {
                    System.out.print(dp[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
    
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      //PrintWriter w = new PrintWriter(System.out);
      
      int n = sc.nextInt();
      int W = sc.nextInt();
      int wei[] = new int[n+1];
      int val[] = new int[n+1];
      int tot_val = 0;
      for(int i=1;i<=n;i++)
      {
          wei[i] = sc.nextInt();
          val[i] = sc.nextInt();
          tot_val+=val[i];
      }
      //w.println(tot_val);
      int dp[][]=new int[n+1][tot_val+1];
      for(int i=0;i<=n;i++)
      {
          Arrays.fill(dp[i],Integer.MAX_VALUE);
      }
      for(int i=0;i<=n;i++)
      {
          dp[i][0] = 0;
      }
      for(int i=1;i<=n;i++)
      {
          for(int j=1;j<=tot_val;j++)
          {
              dp[i][j]=dp[i-1][j];
              if(val[i]<=j && dp[i-1][j-val[i]] != Integer.MAX_VALUE)
              {
                  dp[i][j]=Math.min(dp[i-1][j],wei[i]+dp[i-1][j-val[i]]);
              }
          }
      }
      
      //printArr(dp);
      
      int ans = 0;
      for(int i=tot_val;i>=0;i--)
      {
          if(dp[n][i]<=W)
          {
              ans=i;
              break;
          }
      }
      System.out.println(ans);
      //w.close();
    }
}