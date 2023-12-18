import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    if (M == 0) {
      System.out.println("Yes");
      return;
    }
    Set<Map<Integer, Integer>> x = new HashSet<>();
    for (int i = 0; i < M; i++) {
      int L = sc.nextInt();
      int R = sc.nextInt();
      int D = sc.nextInt();
      Map<Integer, Integer> mapL = x.stream().filter(m -> m.containsKey(L)).findAny().orElse(null);
      Map<Integer, Integer> mapR = x.stream().filter(m -> m.containsKey(R)).findAny().orElse(null);
      if (mapL == null) {
        if (mapR == null) {
          mapL = new HashMap<>();
          mapL.put(L, 0);
          mapL.put(R, D);
          x.add(mapL);
        } else {
          mapR.put(L, mapR.get(R) - D);
        }
      } else {
        if (mapR == null) {
          mapL.put(R, mapL.get(L) + D);
        } else {
          if (mapL == mapR) {
            if (mapL.get(L) + D != mapR.get(R)) {
              System.out.println("No");
              return;
            }
          } else {
            for (Integer r : mapR.keySet()) {
              mapL.put(r, mapR.get(r) - mapR.get(R) + mapL.get(L) + D);
            }
            x.remove(mapR);
          }
        }
      }
    }
    System.out.println("Yes");
  }

}