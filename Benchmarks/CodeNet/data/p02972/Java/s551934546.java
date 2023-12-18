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
    int[] a = new int[n];
    int[] ans = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = Integer.parseInt(sc.next());
    }

    int m = 0;
    for (int i = n; i > 0; i--) {
      int an = a[i - 1];
      int multiplesCount = 0;
      int sum = 0;
      for (int j = 1; i * j <= n; j++) {
        multiplesCount++;
        sum += ans[i * j - 1];
      }
      if (multiplesCount == 1) {
        ans[i - 1] = an;
        if (ans[i - 1] == 1) {
          m++;
        }
        continue;
      }
      int remain = sum % 2;
      if (remain == an) {
        // OK
        if (ans[i - 1] == 1) {
          m++;
        }
        continue;
      }
      ans[i - 1] = (ans[i - 1] + 1) % 2;
      if (ans[i - 1] == 1) {
        m++;
      }
    }

    pw.println(m);
    if (m == 0) {
      return;
    }
    boolean first = true;
    for (int i = 0; i < n; i++) {
      if (ans[i] == 1) {
        if (first) {
          pw.print(i + 1);
          first = false;
        } else {
          pw.print(" " + (i + 1));
        }
      }
    }
  }
}
