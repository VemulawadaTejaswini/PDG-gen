import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) throws Exception {
    try (final var stdin = new InputStreamReader(System.in);
         final var br = new BufferedReader(stdin)) {
      final var line = Arrays.stream(br.readLine().split(" "))
        .mapToInt(Integer::parseInt)
        .sorted()
        .toArray();

      System.out.println(line[0] == 5 && line[1] == 5 && line[2] == 7 ? "Yes" : "No");
    }
  }
}
