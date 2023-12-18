import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main() {
    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();
    List<Integer> values = new ArrayList<>();

    for (int valueCount = 1; valueCount <= n; n++) {
      values.add(scanner.nextInt());
    }

    values.sort((a, b) -> {
      return a - b;
    });

    int alice = 0;
    int bob = 0;
    boolean isAlice = true;
    for (int value : values) {
      if (isAlice) {
        alice += value;
      } else {
        bob += value;
      }

      isAlice = !isAlice;
    }

    System.out.println(alice - bob);

    scanner.close();
  }
}