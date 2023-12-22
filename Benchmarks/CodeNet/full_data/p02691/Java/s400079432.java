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
    int a[] = new int[n + 1];
    for (int i = 0; i < n; i++) {
      a[i + 1] = Integer.parseInt(sc.next());
    }
    long ans = 0;
    for (int i = 1; i <= n; i++) {
      for (int j = i + 1; j <= n; j++) {
        if (j - i == a[i] + a[j]) {
          ans++;
        }
      }
    }
    pw.println(ans);
  }
}
