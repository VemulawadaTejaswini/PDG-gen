import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int targets = sc.nextInt();
    int skills = sc.nextInt();

    if (skills >= targets) {
      System.out.println("0");
      return;
    }

    List<BigDecimal> enemies = new ArrayList<>();
    for (int i = 0; i < targets; i++) {
      enemies.add(new BigDecimal(sc.nextInt()));
    }

    enemies.sort(Collections.reverseOrder());

    if (skills > 0) {
      enemies.subList(0, skills).clear();
    }

    BigDecimal total = new BigDecimal(0);
    for (BigDecimal enemy : enemies) {
      total = total.add(enemy);
    }

    System.out.println(total.longValue());
  }
}
