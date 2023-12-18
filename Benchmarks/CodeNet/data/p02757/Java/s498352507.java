import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int P = scanner.nextInt();
    char[] S = scanner.next().toCharArray();
    Map<Integer, Integer> prev = new HashMap<>();
    Map<Integer, Integer> current = new HashMap<>();
    long res = 0;
    for (int i = 0; i < N; i++) {
      int a = S[i] - '0';
      current.put(a % P, 1);
      for (Map.Entry<Integer, Integer> e : prev.entrySet()) {
        int k = (10 * e.getKey() + a) % P;
        current.put(k, current.getOrDefault(k, 0) + e.getValue());
      }
      res += current.getOrDefault(0, 0);
      prev.clear();
      prev.putAll(current);
      current.clear();
    }
    System.out.println(res);
  }
}
