import java.io.InputStream;
import java.io.PrintStream;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

  public static void main(String[] args) {
    solve(System.in, System.out);
  }

  private static class Pair {

    int x;
    int y;

    @Override
    public boolean equals(Object o) {
      if (this == o) {
        return true;
      }
      if (o == null || getClass() != o.getClass()) {
        return false;
      }
      Pair pair = (Pair) o;
      return x == pair.x &&
          y == pair.y;
    }

    @Override
    public int hashCode() {
      return Objects.hash(x, y);
    }
  }

  static void solve(InputStream is, PrintStream os) {
    Scanner sc = new Scanner(is);

    /* read */
    int n = sc.nextInt();

    List<Pair> pairs = new ArrayList<>(n);

    int[] x = new int[n];
    int[] y = new int[n];

    for (int i = 0; i < n; i++) {
      x[i] = sc.nextInt();
      y[i] = sc.nextInt();
      Pair pair = new Pair();
      pair.x = x[i];
      pair.y = y[i];
      pairs.add(pair);
    }

    // first, pick up (i, i)
    int costMin = Integer.MAX_VALUE;
    for (int i = 0; i < n; i++) {
      // next pick up
      for (int j = i + 1; j < n; j++) {
        List<Pair> remain = new LinkedList<>(pairs);
        Pair first = remain.get(i);
        Pair second = remain.get(j);
        remain.remove(first);
        remain.remove(second);
        int p = second.x - first.x;
        int q = second.y - first.y;

        Pair last = second;
        int cost = 0;
        while (!remain.isEmpty()) {
          Pair next = null;
          for (Pair cand : remain) {
            if (last.x == cand.x - p && last.y == cand.y - q) {
              next = cand;
              break;
            }
          }
          if (next == null) {
            cost++;
            if (p > 0) {
              if (q > 0) {
                remain.sort((p1, p2) -> p1.x != p2.x ? Integer.compare(p1.x, p2.x) : Integer.compare(p1.y, p2.y));
              } else {
                remain.sort((p1, p2) -> p1.x != p2.x ? Integer.compare(p1.x, p2.x) : -Integer.compare(p1.y, p2.y));
              }
            } else {
              if (q > 0) {
                remain.sort((p1, p2) -> p1.x != p2.x ? -Integer.compare(p1.x, p2.x) : Integer.compare(p1.y, p2.y));
              } else {
                remain.sort((p1, p2) -> p1.x != p2.x ? -Integer.compare(p1.x, p2.x) : -Integer.compare(p1.y, p2.y));
              }
            }
            last = remain.get(0);
            remain.remove(0);
          } else {
            last = next;
            remain.remove(last);
          }
        }
        costMin = Math.min(cost, costMin);
      }
    }
    os.println(costMin + 1);
  }
}