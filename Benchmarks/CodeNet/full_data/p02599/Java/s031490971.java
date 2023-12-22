import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int q = sc.nextInt();
    List<Integer> c = new ArrayList<>();
    List<Map<Integer, Integer>> mapList = new ArrayList<>();
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < n; i++) {
      int newC = sc.nextInt();
      c.add(newC);
      map = new HashMap<>(map);
      Integer count = map.get(newC);
      map.put(newC, count == null ? 1 : count + 1);
      mapList.add(map);
    }
    int d = n / 2;
    for (int i = 0; i < q; i++) {
      int l = sc.nextInt();
      int r = sc.nextInt();
      Map<Integer, Integer> rMap = mapList.get(r - 1);
      Map<Integer, Integer> lMap = mapList.get(l - 1);
      int count = rMap.keySet().size();
      for (Integer integer : lMap.keySet()) {
        if (rMap.get(integer).equals(lMap.get(integer))) {
          count--;
        }
      }
      System.out.println(count);
    }
  }
}
