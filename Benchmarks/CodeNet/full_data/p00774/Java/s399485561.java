import java.util.Arrays;
import java.util.HashMap;
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
      int h = ni();

      if(h == 0)break;

      int[][] puz = new int[h][5];

      for(int i = 0; i < h; ++i) {
        for(int j = 0; j < 5; ++j) {
          puz[i][j] = ni();
        }
      }

      int point = 0;
      for(;;) {
        boolean con = false;
        boolean[][] rem = new boolean[h][5];
        for(int i = 0; i < h; ++i) {
          int[] sums = new int[10];
          boolean flag = false;
          int idx = 0;
          for(int j = 0; j < 5; ++j) {
            if(puz[i][j] == 0) continue;
            if( ++sums[puz[i][j]] >= 3 ) {
              flag |= true;
              idx = puz[i][j];
            }
          }
          con |= flag;
          if(flag) {
            for(int j = 0; j < 5; ++j) {
              if(puz[i][j] == idx) {
                puz[i][j] = 0;
                rem[i][j] |= true;
                point += idx;
              }
            }
          }
        }

        for(int i = h - 1; 0 <= i; --i) {
          for(int j = 0; j < 5; ++j) {
            if(rem[i][j]) {
              for(int k = i - 1; 0 <= k; --k) {
                if(!rem[k][j]) {
                  puz[i][j] = puz[k][j];
                  rem[k][j] |= true;
                  puz[k][j] = 0;
                }
              }
            }
          }
        }

        if(!con) {
          break;
        }
      }

      System.out.println(point);
    }

  }

  public static void main(String[] args) {
    new Main().run();
  }

  void debug(Object... os) {
    System.err.println(Arrays.deepToString(os));
  }
}