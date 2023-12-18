import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long ans = 0;
    HashMap<Long, Long> map = new HashMap<Long, Long>();
    long a = sc.nextLong();
    map.put(a, 1);
    for(int i = 1; i < n; i++) {
      long a = sc.nextLong();
      if(map.containsKey(i - a)) ans += map.get(i - a);
      if(map.containsKey(i + a)) {
        map.put(i + a, map.get(i + a) + 1);
      } else {
        map.put(i + a, 1);
      }
    }
    System.out.println(ans);
  }
}