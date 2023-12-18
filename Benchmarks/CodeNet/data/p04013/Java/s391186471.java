import java.util.HashMap;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int A = sc.nextInt();
    HashMap<Integer, Long> tmpSum = new HashMap<>();
    for (int i = 0; i < N; i++) {
      int diff = sc.nextInt() - A;
      HashMap<Integer, Long> prevMap = new HashMap<>(tmpSum);
      for (int key : prevMap.keySet()) {
        addCountMap(tmpSum, key + diff, prevMap.get(key));
      }
      addCountMap(tmpSum, diff, 1);
    }
    sc.close();

    long result;
    if (tmpSum.get(0) != null) {
      result = tmpSum.get(0);
    } else {
      result = 0;
    }
    System.out.println(result);
  }

  private static void addCountMap(HashMap<Integer, Long> map, int key, long count) {
    if (map.get(key) == null) {
      map.put(key, count);
    } else {
      map.put(key, map.get(key) + count);
    }
  }
}
