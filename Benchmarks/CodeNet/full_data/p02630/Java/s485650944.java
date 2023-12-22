import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Map<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < n; i++) {
      int key = sc.nextInt();
      Integer mapVal = map.get(key);
      map.put(key, mapVal == null ? 1 : ++mapVal);
    }

    long sum = map.entrySet().stream().mapToLong(v -> v.getKey() * v.getValue()).sum();

    int q = sc.nextInt();
    for (int j = 0; j < q; j++) {
      int b = sc.nextInt();
      int c = sc.nextInt();

      Integer bVal = map.get(b);
      Integer cVal = map.get(c);

      map.remove(b);

      if (bVal != null) {
        map.put(c, cVal == null ? bVal : cVal + bVal);
        sum += (long) (c-b) * bVal;
      }

      System.out.println(sum);
    }
  }
}
