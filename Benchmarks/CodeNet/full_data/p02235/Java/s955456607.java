import java.util.*;
import java.io.*;

class Main{
  public static void main(String[] args){
    int i,j,n,num=0;
    try{
      BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
      n = Integer.parseInt(buffer.readLine());
      for(i=0;i<n;i++){
        String strx = buffer.readLine();
        String stry = buffer.readLine();
        num = solve(strx,stry);
        System.out.println(num);
      }
    }catch (IOException e) {
      System.out.println("error");
    }
  }
  private static int solve(String x, String y) {
        int[][] dp = new int[x.length()+1][y.length()+1];
        for(int i=1; i<=x.length(); i++) {
            for(int j=1; j<=y.length(); j++) {
                if(x.charAt(i-1) == y.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
                }
            }
        }
        return dp[x.length()][y.length()];
    }
}

