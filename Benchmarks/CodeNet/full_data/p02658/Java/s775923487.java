import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

  private static final long MAX = (long) Math.pow(10, 18);

  public static void main(final String[] args) {
    final var scanner = new Scanner(System.in);
    final long N = scanner.nextLong();
    final List<Long> A = new ArrayList<>();

    for (long i = 0; i < N; i++) {
      final long a = scanner.nextLong();
      if (a == 0L) {
        System.out.println(0L);
        return;
      }

      A.add(a);
    }

    A.sort(Comparator.naturalOrder());

    long result = 1;
    for (final Long a : A) {
      result *= a;

      if (result > MAX || result < 0) {
        System.out.println(-1L);
        return;
      }
    }

    System.out.println(result);
  }
}
