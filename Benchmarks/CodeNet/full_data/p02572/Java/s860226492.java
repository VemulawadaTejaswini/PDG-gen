import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    int mod = 1000000000 + 7;
    int n = Integer.parseInt(sc.next());
    int a[] = new int[n];
    long ans = 0;
    for (int i = 0; i < n; i++) {
      a[i] = Integer.parseInt(sc.next());
    }
    for (int i = 0; i < n - 1; i++) {
      for (int j = i + 1; j < n; j++) {
        long multi = (long) a[i] * a[j];
        ans += multi;
        ans = ans % mod;
      }
    }
    pw.println(ans);
  }
}
