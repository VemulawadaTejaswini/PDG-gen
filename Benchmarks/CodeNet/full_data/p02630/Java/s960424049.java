import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long ans = 0;
    HashMap<Long, Long> map = new HashMap<Long, Long>();
    for(int i = 0; i < n; i++) {
      long a = sc.nextLong();
      ans += a;
      if(map.containsKey(a)) {
        map.put(a, map.get(a) + 1);
      } else {
        map.put(a, (long)1);
      }
    }
    int q = sc.nextInt();
    for(int i = 0; i < q; i++) {
      long b = sc.nextLong();
      long c = sc.nextLong();
      if(map.containsKey(b)) {
        long g = map.get(b);
        ans += (g * (c - b));
        map.put(b, (long)0);
        if(map.containsKey(c)) {
          map.put(c, map.get(c) + g);
        } else {
          map.put(c, g);
        }
      } else {

      }
      System.out.println(ans);
    }
  }
}