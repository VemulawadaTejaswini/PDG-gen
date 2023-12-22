import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
  Scanner sc;

  void run() {
    for(;;) {
      int n = ni();
      if(n==0) {
        break;
      }
      boolean[][] src = new boolean[n + 1][n + 1];
      int[] map = new int[n + 1];
      int[] cnt = new int[n + 1];
      for(int i = 1; i <= n; ++i) {
        int m = ni();
        for(int j = 0; j < m; ++j) {
          int p = ni();
          map[p] = i;
          ++cnt[p];
          src[i][p] = true;
        }
      }
//      for(boolean[] ite : src) debug(ite);
//      debug(map);
      
      int k = ni();
      int[] dst = new int[k];
      HashSet<Integer> list = new HashSet<Integer>();
      for(int i = 0; i < k; ++i) {
        int l = ni();
        dst[i] = l;
        if(cnt[l] == 1) {
          list.add( map[l] );
        }
      }
//      debug(list);
      if( list.size() > 0 ) {
        boolean fin = false;
        for(int ite : list) {
          boolean flag = true;
          for(int v : dst) {
//            debug(v, src[ite][v]);
            flag &= src[ite][v];
          }
          if(flag) {
            System.out.println(ite);
            fin = true;
            break;
          }
        }
        if(!fin) {
          System.out.println(-1);
        }
      } else {
        System.out.println(-1);
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