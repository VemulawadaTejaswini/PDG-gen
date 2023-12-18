import java.io.IOException;
import java.math.BigDecimal;
import java.util.Scanner;

/**
 * @author takahiro 問題文 √a+√b<√c ですか？<br>
 *     制約 1 ≤ a,b,c ≤ 10^9 入力は全て整数である。
 */
public class Main {

  public static void main(final String[] args) throws IOException {
    try (final Scanner scanner = new Scanner(System.in)) {
      final Input input = new Input(scanner);
      execute(input);
    }
  }

  private static void execute(final Input input) {
    Result.toResult(calculate(input)).answer();
  }

  /**
   * √a+√b<√c = a + 2√ab + b < c <br>
   * = 2√ab < c - a - b <br>
   * = 2√ab < minused <br>
   * = 4 * a * b < minused^2
   */
  private static boolean calculate(final Input input) {
    final int a = input.getA();
    final int b = input.getB();
    final int c = input.getC();
    final int minused = c - a - b;
    if (minused < 0) {
      return false;
    }
    return 4 * a * b < minused * minused;
  }

  private static class Input {

    private Input(final Scanner scanner) {
      a = scanner.nextInt();
      b = scanner.nextInt();
      c = scanner.nextInt();
    }

    public int getA() {
      return a;
    }

    public int getB() {
      return b;
    }

    public int getC() {
      return c;
    }

    private final int a, b, c;
  }

  private enum Result {
    Yes,
    No;

    private static Result toResult(final boolean calculate) {
      return calculate ? Yes : No;
    }

    private void answer() {
      System.out.println(this.toString());
    }
  }
}
