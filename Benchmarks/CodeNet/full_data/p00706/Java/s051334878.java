import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
  Scanner sc;

  Main() {
    sc = new Scanner(System.in);
  }

  int ni() {
    return sc.nextInt();
  }

  void run() {
    for(;;){
      int N = ni();

      if( N == 0 ) {
        break;
      }

      int W, H;
      W = ni();
      H = ni();
      int[][] field = new int[W][H];
      for(int i = 0; i < N; ++i) {
        int x = ni() - 1;
        int y = ni() - 1;

        field[x][y] |= 1;
      }

      int S, T;
      S = ni();
      T = ni();

      int max = 0;
      for(int i = 0; i <= W - S; ++i) {
        for(int j = 0; j <= H - T; ++j) {
          int cnt = 0;
          for(int x = 0; x < S; ++x) {
            for(int y = 0; y < T; ++y ) {
              cnt += field[i + x][j + y];
            }
          }
          max = Math.max(cnt, max);
        }
      }

      System.out.println(max);
    }
  }

  public static void main(String[] args) {
    new Main().run();
  }

  void debug(Object... os) {
    System.err.println(Arrays.deepToString(os));
  }
}