import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long ans = 0;
    HashMap<Long, Long> map = new HashMap<Long, Long>();
    long a = sc.nextLong();
    map.put(a, (long)1);
    for(int i = 1; i < n; i++) {
      long b = sc.nextLong();
      if(map.containsKey(i - b)) ans += map.get(i - b);
      if(map.containsKey(i + b)) {
        map.put(i + b, map.get(i + b) + 1);
      } else {
        map.put(i + b, (long)1);
      }
    }
    System.out.println(ans);
  }
}