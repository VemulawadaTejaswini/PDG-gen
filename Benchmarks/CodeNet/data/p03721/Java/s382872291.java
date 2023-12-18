import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long k = sc.nextInt();
    HashMap<Integer, Long> map = new HashMap<Integer, Long>();
    for(int i = 0; i < n; i++) {
      int a = sc.nextInt();
      long b = sc.nextLong();
      if(map.containsKey(a)) {
        map.put(a, map.get(a) + b);
      } else {
        map.put(a, b);
      }
    }
    ArrayList<Integer> list = new ArrayList<Integer>();
    for(int kk : map.keySet()) {
      list.add(kk);
    }
    Collections.sort(list);
    int ans = 0;
    for(int i = 0; i < list.size(); i++) {
      int key = list.get(i);
      k -= map.get(key);
      if(k <= 0) {
        ans = key;
        break;
      }
    }
    System.out.println(ans);
  }
}