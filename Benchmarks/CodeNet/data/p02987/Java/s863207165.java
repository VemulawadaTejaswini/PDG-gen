import java.io.InputStream;
import java.io.PrintStream;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    String s = sc.next();
    Map<String, List<String>> map = IntStream.range(0, s.length())
      .mapToObj(i -> String.valueOf(s.charAt(i))).collect(
        Collectors.groupingBy(Function.identity()));
    if (map.size() == 2 && map.values().stream().allMatch(l -> l.size() == 2)) {
      pw.println("Yes");
    } else {
      pw.println("No");
    }
  }
}
