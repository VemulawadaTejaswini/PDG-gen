import java.util.Arrays;
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
    for(;;) {
      int N=ni();
      if(N==0)break;

      int n = 1;
      int min = 1;
      int max = 1;
      int cnt = 0;
      while(true) {
        if(max > N)break;

        if(n==N){
          ++cnt;
          n += ++max;
        } else if (n < N) {
          n += ++max;
        } else {
          n -= min++;
        }
      }

      System.out.println(cnt-1);
    }
  }

  int ni() {
    return sc.nextInt();
  }

  void debug(Object... os) {
    System.err.println( Arrays.deepToString( os ) );
  }
}