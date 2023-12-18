import java.util.Scanner;
import java.math.BigDecimal;

public class Main {
  public static void main(String[] args) {
    B(args);
  }
  public static void A(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String line = scanner.nextLine().trim();
    String[] fields = line.split("/");
    if (10000 * Integer.parseInt(fields[0]) + 100 * Integer.parseInt(fields[1]) + Integer.parseInt(fields[2]) <= 20190430) {
      System.out.println("Heisei");
    } else {
      System.out.println("TBD");
    }
  }
  public static void B(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = Integer.parseInt(scanner.nextLine().trim());
    BigDecimal res = new BigDecimal(0);
    for (int i = 0; i < n; i++) {
      String[] line = scanner.nextLine().trim().split(" ");
      res = res.add(new BigDecimal(line[0]).multiply(line[1].equals("JPY") ? new BigDecimal(1) : new BigDecimal(380000.0)));
    }
    System.out.println(res.toString());
  }
}
