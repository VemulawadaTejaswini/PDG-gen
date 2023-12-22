import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) throws Exception {
    try (final var stdin = new InputStreamReader(System.in);
         final var br = new BufferedReader(stdin)) {
      final var n = Integer.parseInt(br.readLine());
      final var a = Arrays
        .stream(br.readLine().split(" "))
        .mapToInt(Integer::parseInt)
        .toArray();
      Arrays.sort(a);

      var sum = 0;
      for (int i = 1; i <= n - 1; i++) {
        sum += a[n - 1 - (i / 2)];
      }

      System.out.println(sum);
    }
  }
}
