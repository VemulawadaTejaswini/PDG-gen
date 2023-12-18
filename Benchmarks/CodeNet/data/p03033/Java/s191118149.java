import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    SortedSet<Integer> ss = new TreeSet<Integer>();
    SortedMap<Double, int[]> mp = new TreeMap<Double, int[]>();
    int n = Integer.parseInt(sc.next());
    int q = Integer.parseInt(sc.next());
    int[] res = new int[q];
    for (int i = 0; i < n; i++) {
      int s = Integer.parseInt(sc.next()), e = Integer.parseInt(sc.next()), x = Integer.parseInt(sc.next());
      mp.put((double)s - 0.5 - x, new int[]{ 0, x });
      mp.put((double)e - 0.75 - x, new int[]{ 1, x });
    }
    for (int i = 0; i < q; i++) {
      int d = Integer.parseInt(sc.next());
      mp.put((double)d, new int[]{ 2, i });
    }
    for (Map.Entry<Double, int[]> entry : mp.entrySet()) {
      int[] value = entry.getValue();
      if (value[0] == 0) {
        ss.add(value[1]);
      }
      if (value[0] == 1) {
        ss.remove(value[1]);
      }
      if (value[0] == 2) {
        res[value[1]] = ss.size() == 0 ? -1 : ss.first();
      }
    }
    // System.out.println(n);
    for (int i : res) {
      System.out.println(i);
    }
  }
}
