import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      long a = Long.parseLong(sc.next());
      double b = Double.parseDouble(sc.next());

      System.out.println(new BigDecimal(Math.floor(a * b)).toPlainString());
    }
  }
}