import java.math.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    List<Integer> list = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      list.add(sc.nextInt());
    }
    System.out.println(culc(list, n - 1, k));
  }

  static final Map<Integer, Integer> map = new HashMap<>();

  static int culc(List<Integer> list, int i, int limit) {
    return map.computeIfAbsent(i, k -> {
      if (i == 0) {
        return 1;
      }
      int v = list.get(i);
      int max = 0;
      for (int j = 0; j < i; j++) {
        int newV = culc(list, j, limit);
        if (Math.abs(v - list.get(j)) <= limit) {
          newV++;
        }
        if (max < newV) {
          max = newV;
        }
      }
      return max;
    });
  }
}
