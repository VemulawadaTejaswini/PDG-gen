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
    String[] l = new String[]{ "Closed by ", "Opened by " };
    int N = ni();
    HashSet<String> set = new HashSet<String>();

    for ( int i = 0; i < N; ++i ) {
      set.add(sc.next());
    }

    int M = ni();
    int flag = 0;
    for ( int i = 0; i < M; ++i ) {
      String str = sc.next();
      if ( set.contains(str) ) {
        flag = 1 - flag;
        System.out.println(l[ flag ] + str);
      } else {
        System.out.println("Unknown " + str);
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