import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) throws Exception {
    try (final var stdin = new InputStreamReader(System.in);
         final var br = new BufferedReader(stdin)) {
      final var s = br.readLine().split(" ");
      final var n = Integer.parseInt(s[0]);
      final var k = Integer.parseInt(s[1]);
      final var p = Arrays.stream(br.readLine().split(" "))
        .mapToInt(Integer::parseInt)
        .toArray();
      final var c = Arrays.stream(br.readLine().split(" "))
        .mapToLong(Long::parseLong)
        .toArray();

      final var nexts = new int[k * k][n];
      var loopCount = 0;
      for (int i = 0; i < n; i++) {
        nexts[0][i] = p[i] - 1;
      }
      for (int j = 1; j < k * k; j++) {
        for (int i = 0; i < n; i++) {
          nexts[j][i] = p[nexts[j - 1][i]] - 1;
        }

        if (Arrays.equals(nexts[0], nexts[j])) {
          loopCount = j;
          break;
        }
      }

      var maxValue = Long.MIN_VALUE;
      final var scores = new long[k][n];
      for (int i = 0; i < n; i++) {
        scores[0][i] = 0;
      }
      for (int j = 1; j < Math.min(loopCount + 1, k); j++) {
        for (int i = 0; i < n; i++) {
          scores[j][i] = c[i] + scores[j - 1][p[i] - 1];
          maxValue = Math.max(scores[j][i], maxValue);
        }
      }
      if (k <= loopCount) {
        System.out.println(maxValue);
        return;
      }

      if (loopCount > 0) {
        final var multiplier = k / loopCount;
        final var mod = k % loopCount;
        final var multiplied = new long[n];
        for (int i = 0; i < n; i++) {
          multiplied[i] = scores[loopCount][i] * multiplier;
        }
        for (int i = 0; i < n; i++) {
          scores[0][i] = multiplied[i];
          maxValue = Math.max(scores[0][i], maxValue);
        }
        for (int j = 1; j < mod + 1; j++) {
          for (int i = 0; i < n; i++) {
            scores[j][i] = c[i] + scores[j - 1][p[i] - 1];
            maxValue = Math.max(scores[j][i], maxValue);
          }
        }
        System.out.println(maxValue);
      } else {
        for (int j = loopCount + 1; j < k; j++) {
          for (int i = 0; i < n; i++) {
            scores[j][i] = c[i] + scores[j - 1][p[i] - 1];
            maxValue = Math.max(scores[j][i], maxValue);
          }
        }
        System.out.println(maxValue);
      }
    }
  }
}
