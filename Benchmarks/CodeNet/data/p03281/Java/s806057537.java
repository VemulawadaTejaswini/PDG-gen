import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws Exception {
    try (final var stdin = new InputStreamReader(System.in);
         final var br = new BufferedReader(stdin)) {
      final var n = Integer.parseInt(br.readLine());

      var allCount = 0;
      for (int i = 1; i <= n; i++) {
        if (i % 2 == 0) continue;

        int count = 0;
        for (int j = 1; j <= i; j++) {
          if (i % j == 0) count++;
        }

        if (count == 8) {
          allCount++;
        }
      }

      System.out.println(allCount);
    }
  }
}
