import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by Santa.
 */
public class Main {

  static int N;
  static int K;
  static long Q;
  static int A;
  static long B;
  static long C;
  // static int[][] map;
  static double min = 9999999;
  static long ans = 0;

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int H = scanner.nextInt();
    int W = scanner.nextInt();
    int K = scanner.nextInt();
    final long MOD = 1000000007;

    long[][] map = new long[H + 1][W];

    map[0][0] = 1;
    for (int i = 1; i <= H; i++) {
      for (int j = 0; j < W; j++) {
        if(j != 0)  map[i][j] = (map[i - 1][j - 1] + map[i][j]) % MOD;
                    map[i][j] = (map[i - 1][j]  + map[i][j])% MOD;
        if(j != W - 1)map[i][j] = (map[i - 1][j + 1] + map[i][j])% MOD;
      }
    }

    long ans = 0;

    for (int i = K - 1; i < W; i++) {
      ans = (ans + map[H][i]) % MOD;
    }

    System.out.println(ans);


  }
}
