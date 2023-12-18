import java.util.*;
import java.lang.Math;

public class scratch {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    // 整数の入力
    int n = sc.nextInt();
    List<Long> a = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      a.add(sc.nextLong());
    }
    if (n % 2 == 0) {
      long even = 0;
      long odd = 0;
      for (int i = 0; i < n / 2; i++) {
        even += a.get(2 * i);
        odd += a.get(2 * i + 1);
      }
      if (even > odd) {
        System.out.println(even);
      } else {
        System.out.println(odd);
      }
      return;
    }
    System.out.println(Math.max(culc(a, n - 1, true, 2), culc(a, n - 1, false, 2));
  }

  static Map<Integer, Map<Boolean, Map<Integer, Long>>> map = new HashMap<>();

  static long culc(List<Long> list, int i, boolean choice, int remainBlank) {
    Map<Boolean, Map<Integer, Long>> booleanMapMap = map.get(i);
    if (booleanMapMap != null) {
      Map<Integer, Long> integerLongMap = booleanMapMap.get(choice);
      Long aLong = integerLongMap.get(remainBlank);
      if (aLong != null) {
        return aLong;
      }
    } else {
      booleanMapMap = new HashMap<>();
      booleanMapMap.put(true, new HashMap<>());
      booleanMapMap.put(false, new HashMap<>());
      map.put(i, booleanMapMap);
    }
    Map<Integer, Long> integerLongMap = booleanMapMap.get(choice);
    if (choice) {
      long t = list.get(i) + culc(list, i - 1, false, remainBlank);
      integerLongMap.put(remainBlank, t);
      return t;
    } else {
      long t = 0;
      if (remainBlank > 0) {
        t = Math.max(culc(list, i - 1, true, remainBlank), culc(list, i - 1, true, remainBlank - 1));
      } else {
        t = culc(list, i - 1, true, remainBlank);
      }
      integerLongMap.put(remainBlank, t);
      return t;
    }
  }
}
