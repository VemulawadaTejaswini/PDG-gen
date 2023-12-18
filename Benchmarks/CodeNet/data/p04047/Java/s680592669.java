import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author seki
 *
 */
public class EasyBbq {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      scanner.hasNextInt();
      final int n = scanner.nextInt();
      int[] l = new int[n * 2];
      for (int i = 0; i < l.length; i++) {
        l[i] = scanner.nextInt();
      }
      final AtomicInteger index = new AtomicInteger();
      int sum = Arrays.stream(l).sorted().filter(i -> index.incrementAndGet() % 2 == 1).sum();
      System.out.println(sum);
    }
  }
}
