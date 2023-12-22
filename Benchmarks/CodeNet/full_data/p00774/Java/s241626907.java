import java.util.Arrays;
import java.util.Scanner;

public class Main {
  Scanner sc;

  int ex(int src, int ratio) {
    return (src * (100 + ratio))/100;
  }

  void run() {
    for (; ; ) {
      int h = ni();
      if(h==0) {
        break;
      }

      int[][] f = new int[h][5];
      for(int i = 0; i < h; ++i) {
        for(int j = 0; j < 5; ++j) {
          f[i][j] = ni();
        }
      }

      int score = 0;
      for(;;) {
        int cnt = 0;

        for(int i = 0; i < h; ++i) {
          for(int j = 0; j < 3; ++j) {
            int v = f[i][j];
            boolean flag = true;
            for(int k = 0; k < 3; ++k) {
              flag &= f[i][j + k] == v;
            }
            if(flag) {
              for(int k = j; k < 5; ++k) {
                if(f[i][k] != v) {
                  break;
                }
                cnt += v;
                for(int l = i; l > 0; --l) {
                  f[l][k] = f[l-1][k];
                }
                f[0][k] = 0;
              }
              break;
            }
          }
        }
        if(cnt == 0) {
          break;
        }
        score += cnt;
      }

      System.out.println(score);
    }
  }

  Main() {
    sc = new Scanner(System.in);
  }

  int ni() {
    return sc.nextInt();
  }

  public static void main(String[] args) {
    new Main().run();
  }

  void debug(Object... os) {
    System.err.println(Arrays.deepToString(os));
  }
}