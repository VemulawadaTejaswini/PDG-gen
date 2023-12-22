import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
  Scanner sc;

  Main() {
    sc = new Scanner( System.in );
  }

  public static void main(String[] args) {
    new Main().run();
  }

  void run() {
    while(true) {
      int N = ni();
      int M = ni();
      int P = ni();

      if((N|M|P) == 0)break;

      int[] X = new int[N];
      int sum = 0;
      for(int i = 0; i < N; ++i) {
        sum += X[i] = ni();
      }
      int ans = 0;
      if(X[M-1] > 0) {
        ans = sum;
        ans *= 100 - P;
        ans /= X[M-1];
      }

      System.out.println(ans);
    }
  }

  int ni() {
    return sc.nextInt();
  }

  void debug(Object... os) {
    System.err.println( Arrays.deepToString( os ) );
  }
}