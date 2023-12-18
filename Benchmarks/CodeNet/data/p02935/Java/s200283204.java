import static java.math.BigDecimal.ROUND_HALF_DOWN;

import java.io.InputStream;
import java.io.PrintStream;
import java.math.BigDecimal;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    int n = Integer.parseInt(sc.next());
    int[] v = new int[n];
    for (int i = 0; i < n; i++) {
      v[i] = Integer.parseInt(sc.next());
    }
    pw.println(
      IntStream.of(v).sorted().mapToObj(vi -> BigDecimal.valueOf(vi)).
        reduce(
          (va, vb) -> va.add(vb).divide(BigDecimal.valueOf(2), 10, ROUND_HALF_DOWN)
        ).get().doubleValue()
    );
  }
}
