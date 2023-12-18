import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    String[] line = br.readLine().split(" ");
    Infant[] infants = new Infant[n];
    long dp[][] = new long[n + 1][n + 1];
    for (int i = 0; i < n; i++) {
      infants[i] = new Infant(i, Long.parseLong(line[i]));
    }
    Arrays.sort(infants, (o1, o2) -> Long.compare(o2.hp, o1.hp));
    for (int i = 0; i < n; i++) {
      Infant infant = infants[i];
      for (int j = 0; j <= i; j++) {
        //left
        long left = Math.abs( i - j - infant.order) * infant.hp;
        dp[i + 1][j] = Math.max(dp[i + 1][j], dp[i][j] + left);
        long right = Math.abs(n - 1 - j - infant.order) * infant.hp;
        dp[i + 1][j + 1] = Math.max(dp[i + 1][j + 1], dp[i][j] + right);
      }
    }
    long answer = 0;
    for(int i = 0; i <= n; i++){
      answer = Math.max(answer, dp[n][i]);
    }
    System.out.println(answer);
  }

  static class Infant {

    public Infant(int order, long hp) {
      this.order = order;
      this.hp = hp;
    }

    int order;
    long hp;
  }
}