import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    Map<Character, List<Integer>> map = new HasMap<>();
    for (int i = 0; S.length(); i++) {
      char c = S.charAt(i);
      List<Integer> list = map.get(c);
      if (list == null) {
        list = new ArrayList();
        map.put(c, list);
      }
      list.add(i);
    }
    
    int ans = 1000;
    for (List<Integer> list : map.values()) {
      int diffMax = 0;
      int prev = -1;
      for (int idx : list) {
        diffMax = Math.max(diffMax, idx-prev-1);
        prev = idx;
      }
      ans = Math.min(ans, diffMax);
    }
    System.out.println(ans);
  }
}