import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    int n = Integer.parseInt(sc.next());
    int[] x = new int[n];
    int min = 100;
    int max = 1;
    for (int i = 0; i < n; i++) {
      int xi = Integer.parseInt(sc.next());
      min = Math.min(min, xi);
      max = Math.max(max, xi);
      x[i] = xi;
    }
    pw.println(
      IntStream.rangeClosed(min, max)
        .map(p -> distance(p, x))
        .min()
        .getAsInt()
    );
  }

  static int distance(int p, int[] x) {
    return Arrays.stream(x)
      .map(xi -> (xi - p) * (xi - p))
      .sum();
  }
}
