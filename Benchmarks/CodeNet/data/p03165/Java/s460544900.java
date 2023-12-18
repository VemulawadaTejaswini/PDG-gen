import java.io.*;
import java.util.*;

class Main{
  public static void main(String args[]){
    Scanner in = new Scanner(System.in);
    String a = in.next();
    String b = in.next();
    System.out.println(lcs(a,b));
  }

  public static String lcs(String a, String b){
    int dp[][] = new int[a.length()+1][b.length()+1];
    for(int i=1;i<dp.length;i++)
      for(int j=1;j<dp[i].length;j++){
        int max = Math.max(Math.max(dp[i-1][j], dp[i][j-1]),dp[i-1][j-1]);
        dp[i][j] = a.charAt(i-1)==b.charAt(j-1) ? dp[i-1][j-1]+ 1 : max;
      }
      StringBuilder ans= new StringBuilder();
      int i=a.length(),j=b.length();
      while(i>=1 && j>=1){
        if(dp[i-1][j] == dp[i][j]) i--;
        else if(dp[i][j-1]==dp[i][j]) j--;
        else{ ans.append(a.charAt(i-1)); i--;j--;}
      }
      return ans.reverse().toString();
  }

}
