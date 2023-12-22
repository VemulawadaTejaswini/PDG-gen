import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    final Scanner scanner = new Scanner(System.in);
    final int N = scanner.nextInt();

    final int[] spf = init(N);
    long sum = 0;
    for (int k = 1; k <= N; k++) {
      sum += k * get(k, spf);
    }

    System.out.println(sum);
  }

  public static int[] init(final int N) {
    final int[] spf = new int[N + 1];
    for (int i = 0; i <= N; i++) {
      spf[i] = i;
    }

    for (int i = 2; i * i <= N; i++) {
      if (spf[i] == i) {
        for (int j = i * i; j <= N; j += i) {
          if (spf[j] == j) {
            spf[j] = i;
          }
        }
      }
    }

    return spf;
  }

  public static long get(final int n, final int[] spf) { // nの素因数分解を求める
    final Map<Integer, Long> m = new HashMap<>();
    int k = n;
    while (k != 1) {
      if (m.containsKey(spf[k])) {
        final long v = m.get(spf[k]);
        m.put(spf[k], v + 1L);
      } else {
        m.put(spf[k], 1L);
      }
      k /= spf[k];
    }

    return m.values()
        .stream()
        .filter(e -> e > 0)
        .mapToLong(e -> e + 1)
        .reduce((a, c) -> a * c)
        .orElse(1L);
  }
}
