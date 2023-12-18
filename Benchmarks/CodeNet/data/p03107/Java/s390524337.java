import java.util.Scanner;

/**
 * Unification
 *
 */
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String target = scanner.nextLine();
    int removedNum = 0;
    while (target.contains("01") || target.contains("10")) {
      if (target.contains("01")) {
        target = target.replaceFirst("01", "");
        removedNum += 2;
      } else if (target.contains("10")) {
        target = target.replaceFirst("10", "");
        removedNum += 2;
      } else {
        break;
      }
    }
    System.out.println(removedNum);
  }
}
