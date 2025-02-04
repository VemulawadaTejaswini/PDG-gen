import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    int n = Integer.parseInt(sc.next());
    int m = Integer.parseInt(sc.next());
    if (m % 2 == 1) {
      for (int i = 1; i <= m; i++) {
        pw.println(i + " " + (n - i));
      }
      return;
    } else {
      for (int i = 1; i <= m; i++) {
        pw.println(i + " " + (n - i + 1));
      }
      return;
    }
  }
}
