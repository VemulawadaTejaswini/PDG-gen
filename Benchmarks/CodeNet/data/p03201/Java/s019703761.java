import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    TreeMap<Integer, Integer> map = new TreeMap<>();
    for (int i = 0; i < N; i++) {
      int a = scanner.nextInt();
      map.put(a, map.getOrDefault(a, 0) + 1);
    }

    int cnt = 0;
    while (!map.isEmpty()) {
      Map.Entry<Integer, Integer> entry = map.lastEntry();
      int a = entry.getKey();
      int va = entry.getValue() - 1;
      if (va == 0) map.remove(a);
      else map.put(a, va);
      int b = (Integer.highestOneBit(a) << 1) - a;
      if (map.containsKey(b) && map.get(b) > 0) {
        int vb = map.get(b) - 1;
        if (vb == 0) map.remove(b);
        else map.put(b, vb);
        cnt++;
      }
    }
    System.out.println(cnt);
  }
}
