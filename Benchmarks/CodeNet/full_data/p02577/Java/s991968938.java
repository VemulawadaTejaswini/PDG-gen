import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws Exception {
    try (final var stdin = new InputStreamReader(System.in);
         final var br = new BufferedReader(stdin)) {
      final var s = br.readLine();
      int sum = 0;
      for (int i = 0; i < s.length(); i++) {
        final var n = s.charAt(i) - '0';
        sum += n;
      }

      System.out.println(sum % 9 == 0 ? "Yes" : "No");
    }
  }
}
