import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    long[] mod = new long[s.length()];
    mod[0] = 1;
    for(int i = 1; i < s.length(); i++) {
      mod[i] = (mod[i - 1] * 10) % 13;
    }
    long M = (long)Math.pow(10, 9) + 7;
    long[][] dp = new long[s.length()][13];
    for(int i = 0; i < s.length(); i++) {
      String str = String.valueOf(s.charAt(s.length() - 1 - i));
      if(i == 0) {
        if(str.equals("?")) {
          for(int j = 0; j < 10; j++) {
            dp[i][j] = 1;
          }
        } else {
          int d = Integer.parseInt(str);
          dp[i][d] = 1;
        }
      } else {
        if(str.equals("?")) {
          for(int j = 0; j < 10; j++) {
            for(int k = 0; k < 13; k++) {
              dp[i][(k + mod[i] * j) % 13] = (dp[i][(k + mod[i - 1] * j) % 13] + dp[i - 1][k]) % M;
            }
          }          
        } else {
          int d = Integer.parseInt(str);
          for(int j = 0; j < 13; j++) {
            dp[i][(j + mod[i] * d) % 13] = (dp[i][(j + mod[i] * d) % 13] + dp[i - 1][j]) % M;
          }          
        }        
      }
    }
    System.out.println(dp[s.length() - 1][5]);
  }
}