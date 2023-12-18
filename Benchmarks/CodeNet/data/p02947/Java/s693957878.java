import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

  private static Map<String, Long> map = new HashMap<>();

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    scan.nextLine();

    for (int i = 0; i < N; i++) {
      String s = sortStr(scan.nextLine());
      counter(s);
    }
    long count = 0;
    for (Map.Entry<String, Long> entry : map.entrySet()) {
      long i = entry.getValue();
      count += i * (i + 1) / 2;
    }
    System.out.println(count);
  }

  private static String sortStr(String str) {
    byte[] b = str.getBytes();
    Arrays.sort(b);
    return new String(b, StandardCharsets.UTF_8);
  }

  private static void counter(String key) {
    if (map.computeIfPresent(key, (k, s) -> s + 1) == null) {
      map.put(key, 0L);
    }
  }

}
