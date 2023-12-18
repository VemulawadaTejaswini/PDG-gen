import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String[] l = br.readLine().split(" ");
    int N = Integer.parseInt(l[0]);
    int Q = Integer.parseInt(l[1]);
    Point[] a = new Point[N * 2 + Q];
    for (int i = 0; i < N; i++) {
      String[] line = br.readLine().split(" ");
      int s = Integer.parseInt(line[0]);
      int t = Integer.parseInt(line[1]);
      int x = Integer.parseInt(line[2]);
      a[i * 2] = new End(s - x, i, x, true);
      a[i * 2 + 1] = new End(t - x, i, x, false);
    }
    for (int i = 0; i < Q; i++) {
      int d = Integer.parseInt(br.readLine());
      a[N * 2 + i] = new Query(d, i);
    }
    Arrays.sort(a, Comparator.comparingInt(point -> point.x));

    int[] result = new int[Q];
    Arrays.fill(result, -1);

    PriorityQueue<End> pq = new PriorityQueue<>(Comparator.comparingInt(end -> end.xx));
    boolean[] removed = new boolean[N];
    for (int i = 0; i < N * 2 + Q; i++) {
      Point p = a[i];
      if (p instanceof End) {
        End e = (End) p;
        if (e.start) pq.add(e);
        else removed[e.id] = true;
      } else {
        Query q = (Query) p;
        while (!pq.isEmpty() && removed[pq.peek().id]) {
          pq.poll();
        }
        if (!pq.isEmpty()) result[q.id] = pq.peek().xx;
      }
    }

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < Q; i++) {
      sb.append(result[i]).append('\n');
    }
    System.out.print(sb.toString());
  }

  private static class Point {
    protected final int x;

    private Point(int x) {
      this.x = x;
    }
  }

  private static class End extends Point {
    private final int id;
    private final int xx;
    private final boolean start;

    private End(int x, int id, int xx, boolean start) {
      super(x);
      this.id = id;
      this.xx = xx;
      this.start = start;
    }
  }

  private static class Query extends Point {
    private final int id;
    private Query(int x, int id) {
      super(x);
      this.id = id;
    }
  }
}
