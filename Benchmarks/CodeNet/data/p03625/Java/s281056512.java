import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < N; i++) {
      int tmp = sc.nextInt();
      if (map.containsKey(tmp)) {
        map.put(tmp, map.get(tmp) + 1);
      } else {
        map.put(tmp, 1);
      }
    }
    ArrayList<Integer> list = new ArrayList<>();
    Set keys = map.keySet();
    for (Object key : keys) {
      if (map.get(key) >= 2) {
        list.add((Integer)key);
      }
    }
    Collections.sort(list);
    int size = list.size();
    if (size >= 2) {
      System.out.println(list.get(size - 1) * list.get(size - 2));
    } else {
      System.out.println(0);
    }
  }
}