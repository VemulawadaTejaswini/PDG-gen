import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] header = br.readLine().split(" ");
    long ans = 0;
    int r = Integer.parseInt(header[0]);
    int c = Integer.parseInt(header[1]);
    int k = Integer.parseInt(header[2]);

    long[][] map = new long[r + 1][c + 1];

    for (int i = 0; i < k; i++) {
      String[] line = br.readLine().split(" ");
      int ri = Integer.parseInt(line[0]);
      int ci = Integer.parseInt(line[1]);
      long vi = Long.parseLong(line[2]);
      map[ri][ci] = vi;
    }
    br.close();

    long[][][] dp = new long[r + 1][c + 1][4];
    for (int i = 1; i <= r; i++) {
      for (int j = 1; j <= c; j++) {
        dp[i][j][0] = Math.max(dp[i][j][0], dp[i - 1][j][0]);
        dp[i][j][0] = Math.max(dp[i][j][0], dp[i - 1][j][1]);
        dp[i][j][0] = Math.max(dp[i][j][0], dp[i - 1][j][2]);
        dp[i][j][0] = Math.max(dp[i][j][0], dp[i - 1][j][3]);
        dp[i][j][0] = Math.max(dp[i][j][0], dp[i][j - 1][0]);

        dp[i][j][1] = Math.max(dp[i][j][1], dp[i][j][0] + map[i][j]);
        dp[i][j][1] = Math.max(dp[i][j][1], dp[i][j - 1][0] + map[i][j]);
        dp[i][j][1] = Math.max(dp[i][j][1], dp[i][j - 1][1]);


        dp[i][j][2] = Math.max(dp[i][j - 1][2], dp[i][j - 1][1] + map[i][j]);
        dp[i][j][3] = Math.max(dp[i][j - 1][3], dp[i][j - 1][2] + map[i][j]);
      }
    }
    for(int i = 0; i <= 3; i++){
      ans = Math.max(ans, dp[r][c][i]);
    }
    System.out.println(ans);
  }
}