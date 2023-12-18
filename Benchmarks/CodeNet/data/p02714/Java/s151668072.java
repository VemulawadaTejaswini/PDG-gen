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
    String s = sc.next();
    char[] c = new char[n + 1];
    for (int i = 0; i < n; i++) {
      c[i + 1] = s.charAt(i);
    }
    long ans = 0;
    int[] rCountCache = new int[4009];
    int[] gCountCache = new int[4009];
    int[] bCountCache = new int[4009];
    for (int i = c.length - 1; i >= 0; i--) {
      int r = c[i] == 'R' ? 1 : 0;
      int g = c[i] == 'G' ? 1 : 0;
      int b = c[i] == 'B' ? 1 : 0;
      rCountCache[i] += rCountCache[i + 1] + r;
      gCountCache[i] += gCountCache[i + 1] + g;
      bCountCache[i] += bCountCache[i + 1] + b;
    }
    for (int i = 1; i < c.length; i++) {
      for (int j = i + 1; j < c.length; j++) {
        if (c[i] == c[j]) {
          continue;
        }
        int exceptionIndex = j + j - i;
        if ((c[i] == 'R' && c[j] == 'G') || (c[i] == 'G' && c[j] == 'R')) {
          ans += bCountCache[j + 1];
          if (exceptionIndex <= n && c[exceptionIndex] == 'B') {
            ans--;
          }
        } else if ((c[i] == 'R' && c[j] == 'B') || (c[i] == 'B' && c[j] == 'R')) {
          ans += gCountCache[j + 1];
          if (exceptionIndex <= n && c[exceptionIndex] == 'G') {
            ans--;
          }
        } else if ((c[i] == 'G' && c[j] == 'B') || (c[i] == 'B' && c[j] == 'G')) {
          ans += rCountCache[j + 1];
          if (exceptionIndex <= n && c[exceptionIndex] == 'R') {
            ans--;
          }
        } else {
          throw new IllegalArgumentException();
        }
      }
    }
    pw.println(ans);
  }
}
