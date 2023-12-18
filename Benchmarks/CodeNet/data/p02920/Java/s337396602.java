import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = 5;
    main:
    while (t-- > 0) {
      int n = sc.nextInt();
      TreeMap<Integer, Integer> map = new TreeMap<>();
      for (int i = 0; i < 1 << n; i++) {
        final int num = sc.nextInt();
        map.put(num, map.getOrDefault(num, 0) + 1);
      }
      List<Integer> slime = new ArrayList<>();
      slime.add(map.lastKey());
      for (int i = 0; i < n; i++) {
        for (int j = 0; j < 1 << i; j++) {
          final Entry<Integer, Integer> integerIntegerEntry = map.lowerEntry(slime.get(j));
          if (integerIntegerEntry == null) {
            System.out.println("No");
            continue main;
          }
          final Integer value = integerIntegerEntry.getValue();
          final Integer key = integerIntegerEntry.getKey();
          if (value == 1) {
            map.remove(key);
          } else {
            map.replace(key, value - 1);
          }
          slime.add(key);
        }
      }
      System.out.println("Yes");
    }
  }
}