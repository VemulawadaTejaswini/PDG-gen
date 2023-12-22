import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws Exception {
    try (final var stdin = new InputStreamReader(System.in);
         final var br = new BufferedReader(stdin)) {
      final var s = br.readLine().split(" ");
      final var l = Integer.parseInt(s[0]);
      final var r = Integer.parseInt(s[1]);
      final var d = Integer.parseInt(s[2]);

      int count = 0;
      for (int i = l; i <= r; i++) {
        if (i % d == 0) {
          count++;
        }
      }

      System.out.println(count);
    }
  }
}
