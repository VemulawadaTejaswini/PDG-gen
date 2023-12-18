import java.io.*;
import java.util.*;

public class Main {
  private static boolean debug = false;
  private static boolean elapsed = false;

  private static PrintWriter _err = new PrintWriter(System.err);

  private int N;
  private int K;
  private int L;

  private long[] count;
  private Map<Integer, List<Integer>> road = new TreeMap<>();
  private Map<Integer, List<Integer>> rail = new TreeMap<>();

  private List<Integer> idList = new ArrayList<>();

  private Set<Integer> usedRoad = new TreeSet<>();
  private Set<Integer> usedRail = new TreeSet<>();

  private void solve(Scanner sc, PrintWriter out) {
    N = sc.nextInt();
    K = sc.nextInt();
    L = sc.nextInt();
    sc.nextLine();

    for (int i = 0; i < N; ++i) {
      road.put(i, new ArrayList<>());
      rail.put(i, new ArrayList<>());
    }

    for (int i = 0; i < K; ++i) {
      int p = sc.nextInt() - 1;
      int q = sc.nextInt() - 1;

      road.get(p).add(q);
      road.get(q).add(p);
    }

    for (int i = 0; i < L; ++i) {
      int r = sc.nextInt() - 1;
      int s = sc.nextInt() - 1;

      rail.get(r).add(s);
      rail.get(s).add(r);
    }

    for (int i = 0; i < N; ++i) {
      idList.add(0);
    }

    for (int i = 0; i < N; ++i) {
      findRoad(i, i);
    }

    count = new long[N];

    for (int i = 0; i < N; ++i) {
      Map<Integer, Integer> map = new HashMap<>();
      List<Integer> list = new ArrayList<>();
      if (!usedRail.contains(i)) {
        findRail(i, map, list);
        for (Integer j : list) {
          count[j] += map.get(idList.get(j));
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

  private void findRoad(int id, int p) {
    if (!usedRoad.contains(p)) {
      usedRoad.add(p);
      idList.set(p, id);
      List<Integer> list = road.get(p);
      for (Integer q : list) {
        if (!usedRoad.contains(q)) {
          findRoad(id, q);
        }
      }
    }
  }
  private void findRail(int r, Map<Integer, Integer> map, List<Integer> list) {
    if (!usedRail.contains(r)) {
      usedRail.add(r);
      list.add(r);
      if (!map.containsKey(idList.get(r))) {
        map.put(idList.get(r), 1);
      } else {
        map.put(idList.get(r), map.get(idList.get(r)) + 1);
      }
      List<Integer> list2 = rail.get(r);
      for (Integer s : list2) {
        if (!usedRail.contains(s)) {
          findRail(s, map, list);
        }
      }
    }
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