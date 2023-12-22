import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {

  static int r, c, k;
  static long ans;
  static long[][] v = new long[3010][3010];
  static long[][][] dp = new long[4][3010][3010];

  public static void main(String[] args) throws Exception {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter out = new PrintWriter(System.out);

    String[] in = br.readLine().split(" ");
    r = Integer.parseInt(in[0]);
    c = Integer.parseInt(in[1]);
    k = Integer.parseInt(in[2]);

    for (int i = 0; i < k; i++) {
      in = br.readLine().split(" ");
      int tr = Integer.parseInt(in[0]) - 1;
      int tc = Integer.parseInt(in[1]) - 1;
      int tv = Integer.parseInt(in[2]);
      v[tr][tc] = tv;
    }

    br.close();

    dp[0][0][0] = 0;
    if (v[0][0] > 0) dp[1][0][0] = v[0][0];

    for (int i = 0; i < r; i++) {
      for (int j = 0; j < c; j++) {

        if (i > 0) {
          long mv = 0;
          for (int l = 0; l < 4; l++) {
            mv = Math.max(mv, dp[l][i - 1][j]);
          }
          dp[0][i][j] = mv;
          //dp[1][i][j] = dp[0][i][j] + v[i][j];
        }

        if (j > 0) {
          for (int l = 0; l < 4; l++) {
            dp[l][i][j] = Math.max(dp[l][i][j], dp[l][i][j - 1]);
          }
          if (v[i][j] > 0) {
            for (int l = 3; l > 0; l--) {
              dp[l][i][j] = Math.max(dp[l][i][j], dp[l - 1][i][j] + v[i][j]);
            }
          }
        }
      }
    }

    for (int i = 0; i < 4; i++) {
      ans = Math.max(ans, dp[i][r - 1][c - 1]);
    }
    out.println(ans);

    out.flush();
  }
}
