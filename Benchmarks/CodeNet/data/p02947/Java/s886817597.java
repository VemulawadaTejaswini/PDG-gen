import java.io.InputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    int n = Integer.parseInt(sc.next());
    Map<Map<Character, Integer>, AtomicInteger> count = new HashMap<>();
    for (int i = 0; i < n; i++) {
      Map<Character, Integer> map = toMap(sc.next());
      count.computeIfAbsent(map, k -> new AtomicInteger()).incrementAndGet();
    }
    pw.println(
      count.entrySet().stream().mapToInt(e -> e.getValue().get()).filter(i -> i > 1).mapToLong(
        i -> i * (i - 1) / 2
      ).sum());
  }

  static Map<Character, Integer> toMap(String s) {
    Map<Character, AtomicInteger> map = new HashMap<>();
    for (int i = 0; i < s.length(); i++) {
      map.computeIfAbsent(s.charAt(i), k -> new AtomicInteger()).incrementAndGet();
    }
    return map.entrySet().stream()
      .collect(Collectors.toMap(Map.Entry::getKey, e -> e.getValue().get()));
  }
}
