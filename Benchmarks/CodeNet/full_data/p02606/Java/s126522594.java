import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    int l = Integer.parseInt(sc.next());
    int r = Integer.parseInt(sc.next());
    int d = Integer.parseInt(sc.next());
    int ans = 0;
    for (int i = l; i <= r; i++) {
      if (i % d == 0) {
        ans++;
      }
    }
    pw.println(ans);
  }
}
