import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

  public static void main(String[] args) throws Exception {
    try (final var stdin = new InputStreamReader(System.in);
         final var br = new BufferedReader(stdin)) {
      final var n = Integer.parseInt(br.readLine());

      var result = pow(10, n) % modulo;

      result = result - pow(9, n);
      if (result < 0) result += modulo;
      result = result % modulo;

      result = result - pow(9, n);
      if (result < 0) result += modulo;
      result = result % modulo;

      result = result + pow(8, n) % modulo;
      if (result < 0) result += modulo;
      result = result % modulo;

      System.out.println(result);
    }
  }

  private static Map<Integer, Map<Integer, Long>> cache = new HashMap<>();
  private static final long modulo = (long) Math.pow(10, 9) + 7;

  private static long pow(int a, int n) {
    if (n == 1) {
      return a;
    }

    cache.computeIfAbsent(a, t -> new HashMap<>());
    final var c = cache.get(a);
    if (c.containsKey(n)) {
      return c.get(n);
    }

    if (n % 2 == 0) {
      final var result = (pow(a, n / 2) * pow(a, n / 2)) % modulo;
      c.put(n, result);

      return result;
    } else {
      final var result = (((pow(a, n / 2) * pow(a, n / 2)) % modulo) * a) % modulo;
      c.put(n, result);

      return result;
    }
  }
}
