import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    HashMap<Long, HashMap<Long, Long>> map = new HashMap<Long, HashMap<Long, Long>>();
    long MOD = (long)1000000007;
    long[] rui = new long[n + 1];
    rui[0] = 1;
    for(int i = 1; i <= n; i++) { 
      rui[i] = (rui[i - 1] * (long)2) % MOD;
    }
    ArrayList<Long> list = new ArrayList<Long>();
    long[] a = new long[n];
    long[] b = new long[n];
    long zero = 0;
    for(int i = 0; i < n; i++) {
      a[i] = sc.nextLong();
      b[i] = sc.nextLong();
      long g = gcd(Math.abs(a[i]), Math.abs(b[i]));
      a[i] = (a[i] / g);
      b[i] = (b[i] / g);
      if(a[i] < 0) {
        a[i] = (-1) * a[i];
        b[i] = (-1) * b[i];
      }
      if((a[i] == 0) && (b[i] == 0)) {
        zero++;
      } else {
        if(a[i] == 0) b[i] = 1;
        if(b[i] == 0) a[i] = 1;
        HashMap<Long, Long> map0 = new HashMap<Long, Long>();
        if(map.containsKey(a[i])) {
          map0 = map.get(a[i]);
        }
        if(map0.containsKey(b[i])) {
          map0.put(b[i], map0.get(b[i]) + 1);
        } else {
          map0.put(b[i], (long)1);
        }
        map.put(a[i], map0);
        long aa = b[i];
        long bb = a[i];
        if(aa < 0) {
          aa = (-1) * aa;
          bb = (-1) * bb;
        }
        if(a[i] == 0) {
          aa = 1;
          bb = 0; 
        }
        if(b[i] == 0) {
          aa = 0;
          bb = 1;
        }
        if((a[i] != 0) && (b[i] != 0)) {
          bb = (-1) * bb;
        }
        map0 = new HashMap<Long, Long>();
        if(map.containsKey(aa)) {
          map0 = map.get(aa);
        }
        if(!map0.containsKey(bb)) {
          map0.put(bb, (long)0);
          map.put(aa, map0);
        }
      }
    }
    long ans = zero;
    for(int i = 0; i < n; i++) {
      if((a[i] != 0) || (b[i] != 0)) {
        long aa = a[i];
        long bb = b[i];
        long c1 = 0;
        long c2 = 0;
        HashMap<Long, Long> map1 = map.get(aa);
        c1 = map1.get(bb);
        map1.put(bb, (long)0);
        map.put(aa, map1);
        aa = b[i];
        bb = a[i];
        if(aa < 0) {
          aa = (-1) * aa;
          bb = (-1) * bb;
        }
        if(a[i] == 0) {
          aa = 1;
          bb = 0; 
        }
        if(b[i] == 0) {
          aa = 0;
          bb = 1;
        }
        if((a[i] != 0) && (b[i] != 0)) {
          bb = (-1) * bb;
        }
        HashMap<Long, Long> map2 = map.get(aa);
        c2 = map2.get(bb);
        map2.put(bb, (long)0);
        map.put(aa, map2);
        if((c1 != 0) || (c2 != 0)) {
          long d = rui[(int)c1] + rui[(int)c2] - 1;
          list.add(d);
        }
      }
    }
    long c = 1;
    for(int i = 0; i < list.size(); i++) {
      c = (c * list.get(i)) % MOD;
    }
    ans = (ans + c) % MOD;
    ans = (ans - 1 + MOD) % MOD;
    System.out.println(ans);
  }

  public static long gcd(long x, long y) {
    if(y == 0) return x;
    return gcd(y, (x % y));
  }
}