import java.util.*;
import java.io.*;
class Main{
  public static void main(String arg[])throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String inps[] = br.readLine().split(" ");
    int n = Integer.parseInt(inps[0]);
    int m = Integer.parseInt(inps[1]);
    String grid[] = new String[n];
    for(int i=0;i<n;i++)
      grid[i] = br.readLine();
    int curr = 1;
    long dp[][] = new long[n][m];
    for(int i=0;i<n;i++){
      if(grid[i].charAt(0) == '#')
        curr = 0;
      dp[i][0] = curr;
    }
    curr = 1;
    for(int i=0;i<grid[0].length();i++){
      if(grid[0].charAt(i) == '#')
        curr = 0;
      dp[0][i] = curr;
    }
    long md = (long)1e9 + 7;
    for(int i=1;i<n;i++){
      for(int j=1;j<m;j++){
        if(grid[i].charAt(j)!='#')
          dp[i][j] = (dp[i-1][j] + dp[i][j-1]) % md;
        else
          dp[i][j] = 0;
      }
    }
    System.out.println(dp[n-1][m-1]);
  }
}
      
    	