import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int targets = sc.nextInt();
    int skills = sc.nextInt();

    long totalAttacks = 0;

    List<Integer> enemies = new ArrayList<>();
    for (int i = 0; i < targets; i++) {
      enemies.add(sc.nextInt());
    }

    enemies.sort(Collections.reverseOrder());

    if (skills > 0) {
      enemies.subList(0, skills - 1).clear();
    }

    for (Integer enemy : enemies) {
      totalAttacks += enemy;
    }

    System.out.println(totalAttacks);
  }
}
