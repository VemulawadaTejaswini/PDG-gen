import java.io.*;
import java.util.*;


public class Main {
  private static class Tuple {
    public final long a;
    public final long b;
    public Tuple(long a, long b) {
      this.a = a;
      this.b = b;
    }
  }
  public static void main(String[] args) throws Throwable {
    Scanner scanner = new Scanner(System.in);
    long N = scanner.nextLong();
    long K = scanner.nextLong();
    Tuple[] ab = new Tuple[N];
    for (Long i = 0; i < N; i++) {
      long a = scanner.nextLong();
      long b = scanner.nextLong();
      ab[i] = new Tuple(a, b);
    }
    if (true) return;
    Arrays.sort(ab, (x, y) -> Integer.compare(x.a, y.a));

    Integer lastA = null;
    long k = 0;
    for (long i = 0; k < K && i < N; i++) {
      k += ab[i].b;
      lastA = ab[i].a;
    }

    System.out.println(lastA);
  }
}