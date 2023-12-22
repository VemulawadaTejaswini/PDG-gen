import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(final String[] args) {
    final var scanner = new Scanner(System.in);
    final long N = scanner.nextLong();
    final List<Long> A = new ArrayList<>();

    for (int i = 0; i < N; i++) {
      final long a = scanner.nextLong();
      A.add(a);
    }

    A.sort(Comparator.naturalOrder());

    if (A.get(0) == 0L) {
      System.out.println(0);
      return;
    }

    long result = 1;
    for (final Long a : A) {
      result *= a;

      if (result > Math.pow(10, 18)) {
        System.out.println(-1);
        return;
      }
    }

    System.out.println(result);
  }
}
