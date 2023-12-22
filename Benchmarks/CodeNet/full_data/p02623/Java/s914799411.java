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
      final var a = new long[n];
      for (int i = 0; i < n; i++) {
        a[i] = Long.parseLong(aLine[i]);
      }

      final var bLine = br.readLine().split(" ");
      final var b = new long[m];
      for (int i = 0; i < m; i++) {
        b[i] = Long.parseLong(bLine[i]);
      }

      var aIndex = 0;
      var bIndex = 0;
      long sum = 0L;
      var count = 0;

      while (true) {
        if (aIndex == a.length && bIndex == b.length) {
          break;
        }

        if (aIndex == a.length) {
          sum += b[bIndex];
          bIndex++;
        } else if (bIndex == b.length) {
          sum += a[aIndex];
          aIndex++;
        } else {
          if (a[aIndex] < b[bIndex]) {
            sum += a[aIndex];
            aIndex++;
          } else {
            sum += b[bIndex];
            bIndex++;
          }
        }

        if (sum > k) {
          break;
        }

        count++;
      }

      System.out.println(count);
    }
  }
}
