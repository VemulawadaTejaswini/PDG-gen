import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

  private static final BigInteger MAX = BigInteger.valueOf((long) Math.pow(10, 18));

  public static void main(final String[] args) {
    final var scanner = new Scanner(System.in);
    final long N = scanner.nextLong();
    final List<Long> A = new ArrayList<>();

    for (long i = 0; i < N; i++) {
      final long a = scanner.nextLong();
      if (a == 0L) {
        System.out.println(0);
        return;
      }

      A.add(a);
    }

    var result = BigInteger.valueOf(1);
    for (final Long a : A) {
      result = result.multiply(BigInteger.valueOf(a));
    }

    if (result.compareTo(MAX) > 0) {
      System.out.println(-1);
      return;
    }

    System.out.println(result);
  }
}
