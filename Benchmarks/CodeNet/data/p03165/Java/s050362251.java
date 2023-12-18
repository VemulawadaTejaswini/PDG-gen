import java.util.*;
import java.io.*;

class Main {

  

  public static void main(String[] args) {
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    String s = in.next();
    String t = in.next();
    int sn = s.length();
    int tn = t.length();

    int[][] p = new int[sn + 1][tn + 1];
    // up, i - 1, j : -1
    // left, i, j - 1: -2; 
    //upleft, i - 1, j - 1: -3;

    int[][] dp = new int[sn + 1][tn + 1];
    for (int i = 1; i <= sn; i++) {
      for (int j = 1; j <= tn; j++) {
        if (s.charAt(i - 1) == t.charAt(j - 1)) {
          dp[i][j] = dp[i - 1][j - 1] + 1;
          p[i][j] = -3;
        } else {
          if (dp[i - 1][j] > dp[i][j - 1]) {
            dp[i][j] = dp[i - 1][j];
            p[i][j] = -1;
          } else {
            dp[i][j] = dp[i][j - 1];
            p[i][j] = -2;
          }
        }
      }
    }

  StringBuilder sb = new StringBuilder();
    int i = sn, j = tn;
    while (p[i][j] != 0) {
      if (p[i][j] == -3) {sb.append(s.charAt(i - 1)); i--; j--;}
      else if (p[i][j] == -1) {i--;}
      else {j--;}
    }




    

    System.out.println(sb);
  }

}