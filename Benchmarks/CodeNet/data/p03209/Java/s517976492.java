import java.util.Scanner;

public class Main {

  public static long heightOfBurger(int level) {
    if (level == 0) {
      return 1;
    } else {
      return heightOfBurger(level - 1) * 2 + 3;
    }
  }

  public static long numberOfPatty(int level) {
    if (level == 0) {
      return 1;
    } else {
      return numberOfPatty(level - 1) * 2 + 1;
    }
  }

  public static long answer(int level, long layer) {
    if (layer == 1) {
      return 0;
    } else if (layer <= heightOfBurger(level - 1) + 1) {
      return answer(level - 1, layer - 1);
    } else if (layer == heightOfBurger(level - 1) + 2) {
      return numberOfPatty(level - 1) + 1;
    } else if (layer < heightOfBurger(level - 1) * 2 + 2) {
      return numberOfPatty(level - 1) + 1 + answer(level - 1, layer - heightOfBurger(level - 1) - 2);
    } else {
      return numberOfPatty(level);
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int level = sc.nextInt();
    long layer = sc.nextLong();
    System.out.println(answer(level, layer));
  }
}
