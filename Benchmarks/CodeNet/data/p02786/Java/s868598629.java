import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    BigDecimal a = new BigDecimal(sc.nextLong());

    if (a.intValue() == 1) {
      System.out.println(1);
    }

    int i = 0;
    BigDecimal divider = new BigDecimal(2);
    while (a.divide(divider, RoundingMode.DOWN).longValue() >= 1) {
      a = a.divide(divider, RoundingMode.DOWN);
      i++;
    }

    int j;
    long count = 0;
    for (j = 0; j <= i; j++) {
      count += Math.pow(2, j);
    }

    System.out.println(count);
  }
}
