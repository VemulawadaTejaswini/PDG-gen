import java.util.Arrays;
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
    for (; ; ) {
      int N, Q;
      N = ni();
      Q = ni();

      if ( (N | Q) == 0 ) {
        break;
      }

      int[] nums = new int[ 101 ];
      int range = 0;
      int max = 0;
      int max_idx = 101;
      for ( int i = 0; i < N; ++i ) {
        int M = ni();
        for ( int j = 0; j < M; ++j ) {
          int d = ni();
          range = Math.max(range, d);
          if ( max < ++nums[ d ] ) {
            max = nums[ d ];
            max_idx = d;
          }
        }
      }

      if ( max < Q ) {
        System.out.println("0");
      } else {
        System.out.println(max_idx);
      }
    }
  }

  public static void main(String[] args) {
    new Main().run();
  }

  void debug(Object... os) {
    System.err.println(Arrays.deepToString(os));
  }
}