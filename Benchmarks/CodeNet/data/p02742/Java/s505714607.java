import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    long h = sc.nextLong();
    long w = sc.nextLong();

    long ret;
    if (h == 1 || w == 1) {
      System.out.println(1);
      return;
    }

    if (h % 2 == 0 || w % 2 == 0) {
      ret = (h * w) / 2;
    } else {
      ret = new BigDecimal(h).multiply(new BigDecimal(w)).divide(new BigDecimal(2), RoundingMode.UP).longValue();
    }
    System.out.println(ret);
  }
}
