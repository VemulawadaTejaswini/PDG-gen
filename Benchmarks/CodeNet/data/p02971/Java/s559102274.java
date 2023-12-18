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
    int max = Integer.MIN_VALUE;
    int secondMax = Integer.MIN_VALUE;
    for (int i = 0; i < n; i++) {
      int v = Integer.parseInt(sc.next());
      a[i] = v;
      if (max < v) {
        max = v;
      } else if (secondMax < v) {
        secondMax = v;
      }
    }
    for (int i = 0; i < n; i++) {
      int v = a[i];
      if (v == max) {
        pw.println(secondMax);
      } else {
        pw.println(max);
      }
    }
  }
}
