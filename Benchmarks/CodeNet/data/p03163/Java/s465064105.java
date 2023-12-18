import java.util.*;
import java.io.*;
 
 
class Main{
  public static void main(String args[]) throws IOException
  {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(reader.readLine());
    int w[] = new int[N];
    int v[] = new int[N];
    for(int i=0; i<N; i++)
    {
      String str[] = reader.readLine().split(" ");
      w[i] = Integer.parseInt(str[0]);
      v[i] = Integer.parseInt(str[1]);
    }
    
    int res = Solution(w, v, N);
  }
  
  public static int Solution(int w[], int v[], int N)
  {
     int tw =0;
    for(int i=0; i<N; i++) tw = tw + w[i];
    
    int dp[][] = new int[N+1][tw + 1];
    
    for(int i=0; i<=N; i++)
    {
      for(int j = 0; j<=tw; j++)
      {
         if(i==0 ||j==0)
           dp[i][j] = 0;
         else
         {
             if(v[j] <=j)
                dp[i][j] = Math.max(dp[i-1][j], v[i] + dp[i-1][j-w[i]]);
              else
                 dp[i][j] = dp[i-1][j];
                                                               
        }                                                            
     }                                                      
                                                               
   }
       return dp[N][tw];
  }  
}
                   
