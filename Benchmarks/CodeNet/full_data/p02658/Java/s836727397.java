import java.util.Scanner;
import java.math.BigDecimal;
import java.util.List;
import java.util.ArrayList;
public class Main {
  public static final long max = (long)Math.pow(10,18);

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    sc.next();
    List<Long> longList = new ArrayList<>();

    while (sc.hasNext()) {
      long next = sc.nextLong();
      longList.add(next);
    }
    sc.close();

    if (longList.contains(0L)) {
      System.out.println("0");
      return;
    }

    long result = 1L;
    for (long v : longList) {
      result = result * v;
    }
    if (result > max || result < 1L) {
        System.out.println("-1");
    } else {
      System.out.println(String.valueOf(result));
    }
  }
}
