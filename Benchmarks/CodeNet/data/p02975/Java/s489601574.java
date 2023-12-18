import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    Map<Integer, Integer> freq = new HashMap<>();
    for (int i = 0; i < N; i++) {
      int v = scanner.nextInt();
      freq.put(v, freq.getOrDefault(v, 0) + 1);
    }
    Integer[] keys = freq.keySet().toArray(new Integer[0]);
    if (keys.length == 1 && keys[0] == 0) {
      System.out.println("Yes");
      return;
    }
    if (N % 3 == 0
        && keys.length == 3
        && (keys[0] ^ keys[1]) == keys[2]
        && freq.get(keys[0]).equals(freq.get(keys[1]))
        && freq.get(keys[1]).equals(freq.get(keys[2]))) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
