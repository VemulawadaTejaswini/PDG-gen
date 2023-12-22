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

      final var scores = new long[k + 1][n];
      for (int i = 0; i < n; i++) {
        scores[0][i] = 0;
      }
      var max = Long.MIN_VALUE;
      for (int j = 1; j < k + 1; j++) {
        for (int i = 0; i < n; i++) {
          scores[j][i] = c[i] + scores[j - 1][p[i] - 1];
          max = Math.max(max, scores[j][i]);
        }
      }

      System.out.println(max);
    }
  }
}
