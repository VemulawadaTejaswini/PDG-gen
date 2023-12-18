import java.io.InputStream;
import java.io.PrintStream;
import java.util.*;

public class Main {

  public static void main(String[] args) {
    solve(System.in, System.out);
  }

  private static class Edge {
    int fr;
    int to;
    int cost;
  }

  static void solve(InputStream is, PrintStream os) {
    Scanner sc = new Scanner(is);

    /* read */
    int n = sc.nextInt();
    int m = sc.nextInt();
    int l = sc.nextInt();

    // key : from city, value : edge
    List<List<Edge>> lists = new ArrayList<>(n + 1);
    for (int i = 0; i <= n; i++){
      lists.add(new LinkedList<>());
    }

    // exclude the expensive edge (than L) in advance
    for (int i = 0; i < m; i++) {
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      if (c <= l) {
        Edge edge1 = new Edge();
        edge1.fr = a;
        edge1.to = b;
        edge1.cost = c;
        lists.get(edge1.fr).add(edge1);

        Edge edge2 = new Edge();
        edge2.fr = b;
        edge2.to = a;
        edge2.cost = c;
        lists.get(edge2.fr).add(edge2);
      }
    }
    Move[][] dijkstras = new Move[n + 1][];
    for (int i = 1; i <= n; i++) {
      dijkstras[i] = dijkstra(i, lists, n, l);
    }

    int q = sc.nextInt();
    List<Pair> pairs = new ArrayList<>(q);
    for (int i = 0; i < q; i++) {
      int s = sc.nextInt();
      int t = sc.nextInt();
      if (dijkstras[s][t] == null) {
        os.println(-1);
      } else {
        os.println(dijkstras[s][t].refill);
      }
    }
  }

  private static class Pair {
    int s;
    int t;
  }

  private static class Move implements Comparable<Move> {
    private final int max;

    int usedFuel = 0;
    int refill = 0;

    private Move(int max) {
      this.max = max;
    }

    @Override
    public int compareTo(Move other) {
      return this.refill != other.refill ? Integer.compare(this.refill, other.refill) :
              Integer.compare(this.usedFuel, other.usedFuel);
    }

    Move run(int cost) {
      Move move = new Move(max);
      move.usedFuel = usedFuel;
      move.refill = refill;
      if (max < move.usedFuel + cost) {
        move.refill++;
        move.usedFuel = 0;
      }
      move.usedFuel += cost;
      return move;
    }
  }

  private static Move[] dijkstra(int s, List<List<Edge>> edges, int n, int l) {
    Move[] d = new Move[n + 1];
    d[s] = new Move(l);
    d[s].usedFuel = 0;
    d[s].refill = 0;

    Queue<Integer> queue = new PriorityQueue<>((i1, i2) ->
            d[i1] == null ? i2 :
                    d[i2] == null ? i1 :
                            d[i1].compareTo(d[i2]));
    queue.add(s);

    while(!queue.isEmpty()) {
      int fr = queue.remove();
      for (Edge edge : edges.get(fr)) {
        int to = edge.to;
        Move alt = d[fr].run(edge.cost);
        if (d[to] == null || alt.compareTo(d[to]) < 0) {
          d[to] = alt;
          queue.add(to);
        }
      }
    }
    return d;
  }
}