import java.io.*;
import java.util.*;

class Main {

  public static void main(String[] args) {
  
  	try {
    
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      String strLine = br.readLine();
      String[] nwInput = strLine.split(" ");
      int n = Integer.parseInt(nwInput[0]);
      int w = Integer.parseInt(nwInput[1]);
      int[][] wv = new int[n][2];
      for(int i = 0 ; i < n ; i++) {
      	strLine = br.readLine();
        wv[i][0] = Integer.parseInt(strLine.split(" ")[0]);
        wv[i][1] = Integer.parseInt(strLine.split(" ")[1]);
      }
      int[][] dp = new int[w+1][n+1];
      for(int i = 0 ; i <= n ; i++) {
      	dp[0][i] = 0;
      }
      for(int i = 0; i <= w; i++) {
      	dp[i][0] = 0;
      }
      for(int i = 1 ; i <= w; i++) {
        for(int j = 1 ; j <= n; j++) {
          dp[i][j] = dp[i][j-1];
          if(i >= wv[j-1][0]) {
          	dp[i][j] = Math.max(dp[i][j], dp[i-wv[j-1][0]][j-1] + wv[j-1][1]);
          }
          //System.out.print(dp[i][j] + " ");
        }
        //System.out.println();
      }
      //System.out.println("final " + dp[w][n]);
    } catch(Exception ex) {
    
    }
  }
}