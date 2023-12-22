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
      int N, A, B, C, X;
      N = ni();
      A = ni();
      B = ni();
      C = ni();
      X = ni();

      if ( (N | A | B | C | X) == 0 ) {
        break;
      }

      int[] Y = new int[ N ];
      for ( int i = 0; i < N; ++i ) {
        Y[ i ] = ni();
      }

      int f = 0;
      for ( int i = 0; i < N; ++i ) {
        for (; ; ) {
          int X_ = ((A % C) * (X % C) + (B % C)) % C;

          if ( f > 10000 || X == Y[ i ] ) {
            X = X_;
            ++f;
            break;
          }

          X = X_;
          ++f;
        }
      }
      --f;

      System.out.println(f <= 10000 ? f : -1);
    }
  }

  public static void main(String[] args) {
    new Main().run();
  }

  void debug(Object... os) {
    System.err.println(Arrays.deepToString(os));
  }
}