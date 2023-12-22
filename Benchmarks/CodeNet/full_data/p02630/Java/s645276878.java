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
    long count[] = new long[100000 + 1];
    long ans = 0;
    for (int i = 0; i < n; i++) {
      int a = Integer.parseInt(sc.next());
      ans += a;
      count[a]++;
    }
    int q = Integer.parseInt(sc.next());
    for (int i = 0; i < q; i++) {
      int b = Integer.parseInt(sc.next());
      int c = Integer.parseInt(sc.next());
      int diff = c - b;
      ans += count[b] * diff;
      count[c] += count[b];
      count[b] = 0;
      pw.println(ans);
    }
  }
}
