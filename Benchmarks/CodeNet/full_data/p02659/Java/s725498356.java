import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {

  public static void main(final String[] args) {
    final var scanner = new Scanner(System.in);

    final BigDecimal A = scanner.nextBigDecimal();
    final BigDecimal B = scanner.nextBigDecimal();

    final BigDecimal C = A.multiply(B)
        .setScale(2, RoundingMode.DOWN);
    final String result = C.toPlainString()
        .replaceAll("\\.\\d*$", "");

    System.out.println(result);
  }
}
