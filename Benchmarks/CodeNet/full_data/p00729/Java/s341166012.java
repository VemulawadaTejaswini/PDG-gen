import java.util.Arrays;
import java.util.Scanner;

public class Main {
  Scanner sc;

  void run() {
    for ( ;; ) {
      int N = ni();
      int M = ni();
      
      if( (N|M) == 0 ) {
        break;
      }
      
      int[][] imos = new int[M + 1][1261];
      int r = ni();
      for(int i = 0; i < r; ++i) {
        int t = ni();
        int n = ni();
        int m = ni();
        int s = ni();
        
        imos[m][t] = s * 2 - 1;
      }
      
      int q = ni();
      for(int i = 0; i < q; ++i) {
        int ts = ni();
        int te = ni();
        int m = ni();
        
        int sum = 0;
        int v = 0;
        for(int t = 540; t <= 1260; ++t) {
          v += imos[m][t];
          if( v > 0 && ts <= t && t < te) {
            ++sum;
          }
        }
        
        System.out.println(sum);
      }
    }
  }

  Main() {
    sc = new Scanner( System.in );
  }

  int ni() {
    return sc.nextInt();
  }

  public static void main(String[] args) {
    new Main().run();
  }

  void debug(Object... os) {
    System.err.println( Arrays.deepToString( os ) );
  }
}