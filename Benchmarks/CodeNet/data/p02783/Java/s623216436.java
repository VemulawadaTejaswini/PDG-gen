import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws Exception {
    try (final var stdin = new InputStreamReader(System.in);
         final var br = new BufferedReader(stdin)) {
      final var s = br.readLine().split(" ");
      final var h = Integer.parseInt(s[0]);
      final var a = Integer.parseInt(s[1]);

      System.out.println(h % a == 0 ? h / a : (h / a) + 1);
    }
  }
}
