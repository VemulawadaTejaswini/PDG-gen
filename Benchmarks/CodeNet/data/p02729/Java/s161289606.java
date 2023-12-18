import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws Exception {
    try (final var stdin = new InputStreamReader(System.in);
         final var br = new BufferedReader(stdin)) {
      final var s = br.readLine().split(" ");
      final var n = Integer.parseInt(s[0]);
      final var m = Integer.parseInt(s[1]);

      var sum = 0;
      if (n >= 2) {
        sum += (n * (n - 1)) / 2;
      }
      if (m >= 2) {
        sum += (m * (m - 1)) / 2;
      }
      System.out.println(sum);
    }
  }
}
