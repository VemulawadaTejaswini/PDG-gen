import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int N = scn.nextInt();
    HashMap<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < N; i++) {
      int a = scn.nextInt();
      if (map.containsKey(a)) {
        map.put(a, map.get(a) + 1);
      } else {
        map.put(a, 1);
      }
    }

    int shouldChangeCount = 0;
    for (int key : map.keySet()) {
      if (key > map.get(key)) {
        shouldChangeCount += map.get(key);
      } else if (key < map.get(key)) {
        shouldChangeCount += map.get(key) - key;
      }
    }

    System.out.println(shouldChangeCount);
  }
}