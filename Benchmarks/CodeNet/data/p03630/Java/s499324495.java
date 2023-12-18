import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int w = sc.nextInt();
    String[] s = String[h];
    for(int i = 0; i < h; i++) {
      s[i] = sc.next();
    }
    int[][] diff = new int[h - 1][w];
    for(int i = 0; i < h - 1; i++) {
      for(int j = 0; j < w; j++) {
        if(s[i].charAt(j) != s[i + 1].charAt(j)) diff[i][j] = 1;
      }
    }
    int[][] len = new int[h - 1][w];
    for(int i = 0; i < h - 1; i++) {
      len[i][w - 1] = 1;
      for(int j = w - 2; j >= 0; j--) {
        if(diff[i][j] == diff[i][j + 1]) {
          len[i][j] = len[i][j + 1] + 1;
        } else {
          len[i][j] = 1;
        }
      }
    }
    int ans = 0;
    int[][] dp = new int[h - 1][w];
    int[][] lendp = new int[h - 1][w];
    for(int i = h - 2; i >= 0; i--) {
      for(int j = w - 1; j >= 0; j--) {
        if(i == h - 2) {
          if(j == w - 1) {
            dp[i][j] = 2;
            lendp[i][j] = 1;
          } else {
            
          }
        } else {
          if(len[i][j] ) {
          }
        }
        ans = Math.max(ans, dp[i][j]);
      }
    }
    System.out.println(ans);
  }
}