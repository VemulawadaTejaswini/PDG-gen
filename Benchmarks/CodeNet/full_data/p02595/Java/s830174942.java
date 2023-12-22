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
    long d = Integer.parseInt(sc.next());
    long d2 = d * d;
    int ans = 0;
    for (int i = 0; i < n; i++) {
      long x = Integer.parseInt(sc.next());
      long y = Integer.parseInt(sc.next());
      if (d2 >= x * x + y * y) {
        ans++;
      }
    }
    pw.println(ans);
  }
}
