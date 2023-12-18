import java.util.*;

class Main {
  public static void main(String[] args) {
    String s, t;
    StringBuilder sb = new StringBuilder();
    Scanner sc = new Scanner(System.in);
    s = sc.nextLine();
    t = sc.nextLine();
    int[][] dp = new int[s.length()+1][t.length()+1];

    for(int i = 1; i <= s.length(); i++) {
      for(int j = 1; j <= t.length(); j++) {
        if(s.charAt(i-1) == t.charAt(j-1))
          dp[i][j] = 1;
      }
    }
    
    for(int i = 1; i <= s.length(); i++) {
      for(int j = 1; j <= t.length(); j++) {
        dp[i][j] += Math.min(dp[i-1][j-1], Math.min(dp[i-1][j], dp[i][j-1]));
        if(s.charAt(i-1) == t.charAt(j-1)) {
          sb.insert(dp[i][j]-1, s.charAt(i-1));
        }
      }
    }
    
    System.out.println(sb.toString());
  }
}
