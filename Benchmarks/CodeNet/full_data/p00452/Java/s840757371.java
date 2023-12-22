import java.util.*;

public class Main {
  // constant
  static final int MAX_N = 1000;

  // main
  public static final void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);

    for (;;) {
      int n = sc.nextInt();
      int m = sc.nextInt();
      if ((n | m) == 0) break;

      int[] ps = new int[n + 1];
      ps[0] = 0;

      for (int i = 1; i <= n; i++)
        ps[i] = sc.nextInt();

      TreeMap<Integer, Boolean> p2s = new TreeMap<Integer, Boolean>();

      for (int i = 0; i <= n; i++) {
        int pi = ps[i];
        for (int j = i; j <= n; j++)
          p2s.put(pi + ps[j], Boolean.TRUE);
      }

      int max_s = 0;

      Iterator<Integer> p2itr = p2s.keySet().iterator();

      while (p2itr.hasNext()) {
        int p2 = p2itr.next();
        if (m < p2) break;
        int rem = p2s.floorKey(m - p2);
        int s = p2 + rem;
        if (max_s < s) max_s = s;
      }

      System.out.println(max_s);
    }
  }
}