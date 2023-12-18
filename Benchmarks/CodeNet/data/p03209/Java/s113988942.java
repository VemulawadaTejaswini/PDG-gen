import java.util.Scanner;

public class Main {

  public static long heightOfBurger(long level) {
    if (level == 0) {
      return 1;
    } else {
      return heightOfBurger(level - 1) * 2 + 3;
    }
  }

  public static long numberOfPatty(long level) {
    if (level == 0) {
      return 1;
    } else {
      return numberOfPatty(level - 1) * 2 + 1;
    }
  }

  public static long answer(long level, long layer) {
    if (layer == 1) {
      return 0;
    } else if (layer <= heightOfBurger(level - 1) + 1) {
      return answer(level - 1, layer - 1);
    } else if (layer == heightOfBurger(level - 1) + 2) {
      return numberOfPatty(level - 1) + 1;
    } else if (layer <= heightOfBurger(level) - 1) {
      return numberOfPatty(level - 1) + 1 + answer(level - 1, layer - heightOfBurger(level - 1) - 2);
    } else {
      return numberOfPatty(level);
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long level = sc.nextLong();
    long layer = sc.nextLong();
    System.out.println(answer(level, layer));
  }
}
