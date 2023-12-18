import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long m = sc.nextLong();
    HashMap<Long, Long> map = new HashMap<Long, Long>();
    map.put((long)0, (long)1);
    long sum = 0;
    long ans = 0;
    for(int i = 0; i < n; i++) {
      long a = sc.nextLong();
      sum = (sum + a) % m;
      if(map.containsKey(sum)) ans += map.get(sum);
      if(map.containsKey(sum)) {
        map.put(sum, map.get(sum) + 1);
      } else {
        map.put(sum, (long)1);
      }
    }
    System.out.println(ans);
  }
}