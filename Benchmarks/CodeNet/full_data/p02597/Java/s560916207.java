import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  private static final char RED = 'R';
  private static final char WHITE = 'W';

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    int n = Integer.parseInt(sc.next());
    char c[] = new char[n];
    String s = sc.next();
    for (int i = 0; i < n; i++) {
      c[i] = s.charAt(i);
    }
    int rCount = 0;
    int wCount = 0;
    for (int i = 0; i < n; i++) {
      if (c[i] == RED) {
        rCount++;
      } else {
        wCount++;
      }
    }
    if (rCount == 0 || wCount == 0) {
      pw.println(0);
      return;
    }
    int ans = 0;
    for (int i = 0; i < rCount; i++) {
      if (c[i] == WHITE) {
        ans++;
      }
    }
    pw.println(ans);
  }
}
