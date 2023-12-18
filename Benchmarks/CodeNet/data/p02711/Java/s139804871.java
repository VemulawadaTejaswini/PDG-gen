import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws Exception {
    try (final var stdin = new InputStreamReader(System.in);
         final var br = new BufferedReader(stdin)) {
      final var n = br.readLine().toCharArray();
      for (char c : n) {
        if (c == '7') {
          System.out.println("Yes");
          return;
        }
      }

      System.out.println("No");
    }
  }
}
