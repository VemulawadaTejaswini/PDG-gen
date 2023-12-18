import java.util.Arrays;
import java.util.Scanner;

public class Main {
  Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    new Main().run();
  }

  void run() {
    int n = ni();
    int a = ni();
    int b = ni();
    String str = sc.next();

    int x = 0;
    int y = 0;
    for (char c : str.toCharArray()) {
      if (c == 'a') {
        // kokunai
        if (x + y < a + b) {
          System.out.println("Yes");
          ++x;
        } else {
          System.out.println("No");
        }
      } else if(c == 'b') {
        // kaigai
        if (x + y < a + b && y < b) {
          System.out.println("Yes");
          ++y;
        } else {
          System.out.println("No");
        }
      } else {
        System.out.println("No");
      }
    }
  }

  int ni() {
    return Integer.parseInt(sc.next());
  }

  void debug(Object... os) {
    System.err.println(Arrays.deepToString(os));
  }
}