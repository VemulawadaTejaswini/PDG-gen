import java.io.*;
import java.util.*;

class Main {

  public static void main(String[] args) {
  
  	try {
    
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      String s1 = br.readLine();
      String s2 = br.readLine();
      int m = s1.length();
      int n = s2.length();
      int[][] dp = new int[m+1][n+1];
      int[][] trace = new int[m+1][n+1];
      
      for(int i = 0 ; i <= m ; i++) {
      
        for(int j = 0 ; j <= n ; j++) {
        	
          if(i == 0 || j == 0) {
          	dp[i][j] = 0;
          } else if(s1.charAt(i-1) == s2.charAt(j-1)) {
          	dp[i][j] = dp[i-1][j-1] + 1;
            trace[i][j] = 2;
          } else if(dp[i-1][j] > dp[i][j-1]) {
          	dp[i][j] = dp[i-1][j];
            trace[i][j] = 1;
          } else {
          	dp[i][j] = dp[i][j-1];
            trace[i][j] = 0;
          }
          
          //System.out.print(dp[i][j]);
        }
      	//System.out.println();
      }
      
      String str = findLCS(trace, m ,n, s1);              
    
      System.out.println(str);
		                         
    } catch(Exception ex) {
    
    }
  
  }
     
   private static String findLCS(int[][] trace, int i, int j, String s) {
   	
     if(i == 0 || j == 0) {
     	return "";
     }
     
     String str = "";
     if(trace[i][j] == 2) {
       str = findLCS(trace, i-1, j-1, s) + s.charAt(i-1);
     } else if(trace[i][j] == 0) {
     	str = findLCS(trace, i, j-1, s);
     } else {
     	str = findLCS(trace, i-1, j, s);
     }
   	
     //System.out.println("str is " + str);
     return str;
     
   }                                     

}