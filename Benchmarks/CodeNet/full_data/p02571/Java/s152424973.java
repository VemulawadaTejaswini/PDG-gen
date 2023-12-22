import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws Exception {
    try (final var stdin = new InputStreamReader(System.in);
         final var br = new BufferedReader(stdin)) {
      final var s = br.readLine();
      final var t = br.readLine();

      var maxValue = Integer.MAX_VALUE;
      for (int i = 0; i < s.length() - t.length() + 1; i++) {
        final var sub = s.substring(i, i + t.length());

        var diffCount = 0;
        for (int j = 0; j < sub.length(); j++) {
          if (sub.charAt(j) != t.charAt(j)) {
            diffCount++;
          }
        }
        maxValue = Math.min(diffCount, maxValue);
      }

      System.out.println(maxValue);
    }
  }
}
