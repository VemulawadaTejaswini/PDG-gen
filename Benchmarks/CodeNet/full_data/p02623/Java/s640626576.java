import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws Exception {
    try (final var stdin = new InputStreamReader(System.in);
      final var br = new BufferedReader(stdin)) {
      final var line0 = br.readLine().split(" ");
      final var n = Integer.parseInt(line0[0]);
      final var m = Integer.parseInt(line0[1]);
      final var k = Long.parseLong(line0[2]);

      final var aLine = br.readLine().split(" ");
      final var a = new long[n + 1];
      for (int i = 0; i < n; i++) {
        a[i] = Long.parseLong(aLine[i]);
      }
      a[n] = Long.MAX_VALUE;

      final var bLine = br.readLine().split(" ");
      final var b = new long[m + 1];
      for (int i = 0; i < m; i++) {
        b[i] = Long.parseLong(bLine[i]);
      }
      b[m] = Long.MAX_VALUE;

      var aIndex = 0;
      var bIndex = 0;
      var sum = 0L;
      var count = 0;

      while (sum <= k) {
        if (aIndex == n && bIndex == m) {
          count++;
          break;
        }

        if (a[aIndex] <= b[bIndex]) {
          sum += a[aIndex];
          aIndex++;
        } else {
          sum += b[bIndex];
          bIndex++;
        }
        count++;
      }

      System.out.println(count - 1);
    }
  }
}
