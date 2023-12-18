import static java.lang.Integer.parseInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.OptionalInt;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String in = reader.readLine();
    String[] params = in.split(" ");
    int n = Integer.parseInt(params[0]);
    int m = Integer.parseInt(params[1]);
    final int min = 1 /(4 * m);
    String inVotes = reader.readLine();
    OptionalInt first = Arrays.stream(inVotes.split(" "))
        .mapToInt(i -> Integer.valueOf(i))
        .filter(i -> i < min)
        .findFirst();
    if (first.isPresent()) {
      System.out.println("No");
    } else {
      System.out.println("Yes");
    }
  }
}
