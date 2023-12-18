import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    Map<String, Integer> map = new HashMap<>();
    int max = 0;
    for (int i = 0; i < n; i++) {
      String t = in.next();
      map.put(t, map.get(t) == null ? 1 : map.get(t) + 1);
      max = Math.max(max, map.get(t));
    }
    List<String> list = new ArrayList<>();
    for (Map.Entry<String, Integer> entry : map.entrySet()) {
      if (entry.getValue() == max) {
        list.add(entry.getKey());
      }
    }
    Collections.sort(list);
    for (String e : list) {
      System.out.println(e);
    }
  }
}
