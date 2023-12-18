import java.util.*;

class Main {
  public static void main(String[] args) {
    int h, w;
    Scanner sc = new Scanner(System.in);
    Scanner sc1 = new Scanner(System.in);
    h = sc.nextInt();
    w = sc.nextInt();
    sc.nextLine();
    char[][] grid = new char[h][w];
    long[][] dp = new long[h+1][w+1];

    for(int i = 0; i < h; i++) {
      String s = sc.nextLine();

      for(int j = 0; j < w; j++) {
         grid[i][j] = s.charAt(j);
      }
    }
    long mod = 10^9 + 7;
    dp[0][0] = 1;
    for(int i = 0; i < h; i++) {
      for(int j = 0; j < w; j++) {
          if(i+1 < h && grid[i+1][j] == '.' )
            dp[i+1][j] += dp[i][j]%mod;
          if(j+1 < w && grid[i][j+1] == '.')
            dp[i][j+1] += dp[i][j]%mod;
      }
      
    }
    System.out.println(dp[h-1][w-1]);
 }
}
