import static java.lang.System.out;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class IPA1_1_B {
  public static void main(String...args) throws Exception {
    BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

    stdin.lines()
      .mapToInt(Integer::parseInt)
      .mapToDouble(v -> Math.pow(v, 3d))
      .forEach(out::println);
  }
}