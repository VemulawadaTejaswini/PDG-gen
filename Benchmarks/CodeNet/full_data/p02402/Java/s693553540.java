import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int n = scanner.nextInt();
      List<Long> lists = new ArrayList<>();
      for (int i = 0; i < n; i++) {
        lists.add(scanner.nextLong());
      }
      long min = lists.stream().mapToLong(Main::toInt).min().getAsLong();
      long max = lists.stream().mapToLong(Main::toInt).max().getAsLong();
      long sum = lists.stream().mapToLong(Main::toInt).sum();
      System.out.printf("%d %d %d\n", min, max, sum);
    }
  }

  private static long toInt(Long integer) {
    return integer;
  }
}