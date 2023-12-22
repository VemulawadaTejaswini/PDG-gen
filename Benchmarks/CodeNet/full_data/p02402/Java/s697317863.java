import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int n = scanner.nextInt();
      List<Integer> lists = new ArrayList<>();
      for (int i = 0; i < n; i++) {
        lists.add(scanner.nextInt());
      }
      int min = lists.stream().mapToInt(Main::toInt).min().getAsInt();
      int max = lists.stream().mapToInt(Main::toInt).max().getAsInt();
      int sum = lists.stream().mapToInt(Main::toInt).sum();
      System.out.printf("%d %d %d\n", min, max, sum);
    }
  }

  private static final int toInt(Integer integer) {
    return integer;
  }
}