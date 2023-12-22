import java.util.*;
import java.io.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(in);
    int[][] t = new int[1000][1000];
    int n = 0;

    for(int j=0;sc.hasNext();j++){
      String[] s = sc.next().split(",");
      n = Math.max(n,s.length);
      for(int i=0;i<s.length;i++){
        t[j][i] = Integer.parseInt(s[i]);
      }
    }

    int[][] dp = new int[1000][1000];
    dp[0][0] = t[0][0];
    for(int i=0;i<n-1;i++){
      for(int j=0;j<=i;j++){
        dp[i+1][j] = max(dp[i+1][j],dp[i][j]+t[i+1][j]);
        dp[i+1][j+1] = max(dp[i+1][j+1],dp[i][j]+t[i+1][j+1]);
      }
    }

    int[][] dp2 = new int[1000][1000];
    for(int i=0;i<n;i++) dp2[0][i] = dp[n-1][i];
    for(int i=0;i<n-1;i++){
      for(int j=0;j<=n-i-1;j++){
        if(j-1>=0) dp2[i+1][j-1] = max(dp2[i+1][j-1],dp2[i][j]+t[n+i][j-1]);
        dp2[i+1][j] = max(dp2[i+1][j],dp2[i][j]+t[n+i][j]);
      }
    }

    /*
    for(int i=0;i<n;i++){
      for(int j=0;j<=i;j++){
      }
    }
    */

    out.println(dp2[n-1][0]);
  }
}