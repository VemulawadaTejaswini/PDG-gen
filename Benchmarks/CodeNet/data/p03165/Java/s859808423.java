import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {

      
 public static void main(String[] args) {
    
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    String T = in.nextLine();
    String S = in.nextLine();
    int slen = S.length();
    int tlen = T.length();
    int[][] dp = new int[slen+1][tlen+1];
    char[][] ch = new char[slen+1][tlen+1];
    
    StringBuilder sb = new StringBuilder();
    
    for(int i = 1 ; i <= slen; i++) {
        for(int j = 1; j <= tlen; j++) {
            if(S.charAt(i-1) == T.charAt(j-1)) {
                ch[i][j] = 'd';
                dp[i][j] = dp[i-1][j-1]+1;
            } else if(dp[i-1][j] >= dp[i][j-1]){
                ch[i][j] = 'u';
                dp[i][j] = dp[i-1][j];
            } else {
                ch[i][j] = 'l';
                dp[i][j] = dp[i][j-1];
            }
        }
    }
    dfs(ch, slen, tlen, slen+1, tlen+1, sb, S);
    System.out.println(sb.reverse().toString());
  }
  
  private static void dfs(char[][] ch, int r, int c, int nr, int nc, StringBuilder sb, String S) {
      if(r <= 0 || c <= 0 || r >= nr || c >= nc) return ;
      
      if(ch[r][c] == 'd')  {
          sb.append(S.charAt(r-1));
          dfs(ch, r-1, c-1, nr, nc, sb, S);
      }
      else if(ch[r][c] == 'u') {
          dfs(ch, r-1,c, nr, nc, sb, S);
      }
      else if(ch[r][c] == 'l') {
          dfs(ch, r, c-1, nr, nc, sb, S);
      }
  }
  
}