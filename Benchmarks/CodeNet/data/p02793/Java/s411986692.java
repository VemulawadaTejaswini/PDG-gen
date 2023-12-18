import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long MOD = (long)Math.pow(10, 9) + 7;
    long[] a = new long[n];
    HashMap[] map = new HashMap[n];
    HashMap<Long, Long> map0 = new HashMap<Long, Long>();
    for(int i = 0; i < n; i++) {
      long t = sc.nextLong();
      a[i] = t;
      HashMap<Long, Long> m = new HashMap<Long, Long>();
      for(long j = 2; (j * j) <= t; j++) {
        long k = 0;
        while((t % j) == 0) {
          k++;
          t /= j;         
        }
        if(k > 0) {
          m.put(j, k);
          if(map0.containsKey(j)) {
            map0.put(j, Math.max(map0.get(j), k));
          } else {
            map0.put(j, k);
          }
        }
      }
      if(t > 0) {
        m.put(t, (long)1);
        if(map0.containsKey(t)) {
          map0.put(t, Math.max(map0.get(t), 1));
        } else {
          map0.put(t, (long)1);
        }        
      }
      map[i] = m;
    }

    long ans = 0;
    for(int i = 0; i < n; i++) {
      HashMap<Long, Long> m = map[i];
      long t = 1;
      for(long key : map0.keySet()) {
        long p1 = map0.get(key);
        long p2 = 0;
        if(m.containsKey(key)) p2 = m.get(key);
        t = (t * (long)Math.pow(key, p1 - p2)) % MOD;
      }
      ans = (ans + t) % MOD;
    }
    System.out.println(ans);
  }
}