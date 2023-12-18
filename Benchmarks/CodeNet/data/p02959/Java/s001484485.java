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
    int[] a = new int[n + 1];
    int[] b = new int[n + 1];
    for (int i = 0; i < n + 1; i++) {
      a[i] = Integer.parseInt(sc.next());
    }
    for (int i = 0; i < n; i++) {
      b[i] = Integer.parseInt(sc.next());
    }
    b[n] = 0;
    long count = 0;
    int remainB = 0;
    for (int i = 0; i < n + 1; i++) {
      int remainA = Math.max(a[i] - remainB, 0);
      count += Math.min(a[i], remainB);
      remainB = Math.max(b[i] - remainA, 0);
      count += Math.min(remainA, b[i]);
    }
    pw.println(count);
  }
}
