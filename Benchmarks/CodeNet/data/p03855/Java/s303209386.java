import java.io.*;
import java.util.*;

public class Main {
  private static boolean debug = false;
  private static boolean elapsed = false;

  private static PrintWriter _err = new PrintWriter(System.err);

  private int N;
  private int K;
  private int L;

  private Map<Integer, Set<Integer>> road = new TreeMap<>();
  private Map<Integer, Set<Integer>> rroad = new TreeMap<>();
  private Map<Integer, Set<Integer>> rail = new TreeMap<>();
  private Map<Integer, Set<Integer>> rrail = new TreeMap<>();
  private Map<Integer, Set<Integer>> both = new TreeMap<>();

  private long[] count;

  private void solve(Scanner sc, PrintWriter out) {
    N = sc.nextInt();
    K = sc.nextInt();
    L = sc.nextInt();
    sc.nextLine();

    for (int i = 0; i < K; ++i) {
      int p = sc.nextInt() - 1;
      int q = sc.nextInt() - 1;

      putRoad(p, q);
    }
    for (int i = 0; i < L; ++i) {
      int r = sc.nextInt() - 1;
      int s = sc.nextInt() - 1;

      putRail(r, s);
    }

    count = new long[N];
    Arrays.fill(count, 1);

    Map<Integer, Integer> map = new TreeMap<>();
    for (int i = 0; i < N; ++i) {
      for (Map.Entry<Integer, Set<Integer>> entry : both.entrySet()) {
        int key = entry.getKey();
        Set<Integer> vals = entry.getValue();

        if (!map.containsKey(Math.min(i, key))) {
          Integer rd = findRoad(i, key);
          Integer rl = findRail(i, key);
          if (rd != null && rl != null && i != rd) {
            ++count[i];
            ++count[rd];
            map.put(i, rd);
//_err.println("k[" + i + "][" + key + "] => [" + rd + "][" + Arrays.toString(count) + "]");
          }
        }
        for (Integer val : vals) {
          if (!map.containsKey(Math.min(i, val))) {
            if (val > i) {
              Integer rd = findRoad(i, val);
              Integer rl = findRail(i, val);
              if (rd != null && rl != null && i != rd) {
                ++count[i];
                ++count[rd];
                map.put(i, rd);
//_err.println("v[" + i + "][" + val + "] => [" + rd + "][" + Arrays.toString(count) + "]");
              }
            }
          }
        }
      }
    }

    boolean isFirst = true;
    for (long l : count) {
      if (!isFirst) {
        out.print(" ");
      } else {
        isFirst = false;
      }
      out.print(l);
    }
    out.println();
  }
  private void putRoad(int p, int q) {
    Set<Integer> set;
    set = road.get(p);
    if (set == null) {
      set = new TreeSet<>();
      road.put(p, set);
    }
    set.add(q);

    set = rroad.get(q);
    if (set == null) {
      set = new TreeSet<>();
      rroad.put(q, set);
    }
    set.add(p);

    set = both.get(p);
    if (set == null) {
      set = new TreeSet<>();
      both.put(p, set);
    }
    set.add(q);
  }
  private void putRail(int r, int s) {
    Set<Integer> set;
    set = rail.get(r);
    if (set == null) {
      set = new TreeSet<>();
      rail.put(r, set);
    }
    set.add(s);

    set = rrail.get(s);
    if (set == null) {
      set = new TreeSet<>();
      rrail.put(s, set);
    }
    set.add(r);

    set = both.get(r);
    if (set == null) {
      set = new TreeSet<>();
      both.put(r, set);
    }
    set.add(s);
  }
  private Integer findRoad(int p, int q) {
    return findRoad(p, q, new HashSet<>());
  }
  private Integer findRoad(int p, int q, Set<Integer> set) {
    if (p == q) {
      return q;
    }
    if (p < q && road.containsKey(p)) {
      Set<Integer> t = road.get(p);
      for (Integer tt : t) {
        set.add(tt);
        Integer res = findRoad(tt, q, set);
        set.remove(tt);
        if (res == null || res == q) {
          return res;
        }
      }
    }
    if (p > q && rroad.containsKey(p)) {
      Set<Integer> t = rroad.get(p);
      for (Integer tt : t) {
        set.add(tt);
        Integer res = findRoad(tt, q, set);
        set.remove(tt);
        if (res == null || res == q) {
          return res;
        }
      }
    }
    return null;
  }
  private Integer findRail(int r, int s) {
    return findRail(r, s, new HashSet<>());
  }
  private Integer findRail(int r, int s, Set<Integer> set) {
    if (r == s) {
      return s;
    }
    if (!set.contains(r) && rail.containsKey(r)) {
      Set<Integer> t = rail.get(r);
      for (Integer tt : t) {
        set.add(tt);
        Integer res = findRail(tt, s, set);
        set.remove(tt);
        if (res == null || res == s) {
          return res;
        }
      }
    }
    if (!set.contains(r) && rrail.containsKey(r)) {
      Set<Integer> t = rrail.get(r);
      for (Integer tt : t) {
        set.add(tt);
        Integer res = findRail(tt, s, set);
        set.remove(tt);
        if (res == null || res == s) {
          return res;
        }
      }
    }
    return null;
  }

  private long C(long n, long r) {
    long res = 1;
    for (long i = n; i > n - r; --i) {
      res *= i;
    }
    for (long i = r; i > 1; --i) {
      res /= i;
    }
    return res;
  }
  private long P(long n, long r) {
    long res = 1;
    for (long i = n; i > n - r; --i) {
      res *= i;
    }
    return res;
  }
  private long ceil2pow(long n) {
    if (n == 0) {
      return 1;
    }
    n--;
    n |= (n >>> 1);
    n |= (n >>> 2);
    n |= (n >>> 4);
    n |= (n >>> 8);
    n |= (n >>> 16);
    n++;
    return n;
  }
  /*
   * 10^10 > Integer.MAX_VALUE = 2147483647 > 10^9
   * 10^19 > Long.MAX_VALUE = 9223372036854775807L > 10^18
   */
  public static void main(String[] args) {
    long S = System.currentTimeMillis();

    Scanner sc = new Scanner(System.in);
    PrintWriter out = new PrintWriter(System.out);
    new Main().solve(sc, out);
    out.flush();

    long G = System.currentTimeMillis();
    if (elapsed) {
      _err.println((G - S) + "ms");
    }
    _err.flush();
  }
}