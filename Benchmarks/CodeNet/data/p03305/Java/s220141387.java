import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
  static Scanner sc = new Scanner(System.in);
  static ArrayList<ArrayList<Edge>> g = new ArrayList<>();
  static int N, M, S, T;

  public static void main(String[] args) {
    N = sc.nextInt();
    M = sc.nextInt();
    S = sc.nextInt() - 1;
    T = sc.nextInt() - 1;
    for (int i = 0; i < N; i++) {
      g.add(new ArrayList<>());
    }
    for (int i = 0; i < M; i++) {
      int U = Integer.parseInt(sc.next()) - 1;
      int V = Integer.parseInt(sc.next()) - 1;
      int A = Integer.parseInt(sc.next());
      int B = Integer.parseInt(sc.next());
      g.get(U).add(new Edge(V, A, B));
      g.get(V).add(new Edge(U, A, B));
    }
    long[] sd = shortest(S);
    long[] td = shortest(T);
    long[] ans = new long[N];
    ans[N - 1] = sd[N - 1] + td[N - 1];
    for (int i = N - 2; i >= 0; i--) {
      ans[i] = Math.min(ans[i + 1], sd[i] + td[i]);
    }
    PrintWriter writer = new PrintWriter(System.out);
    for (int i = 0; i < N; i++) {
      writer.println(1_000_000_000_000_000L - ans[i]);
    }
    writer.flush();
  }

  static long[] shortest(int from) {
    final long INF = (long) 1e17;
    long[] dist = new long[N];
    Arrays.fill(dist, INF);
    boolean[] visited = new boolean[N];
    PriorityQueue<State> q = new PriorityQueue<>();
    q.add(new State(0, from));
    while (!q.isEmpty()) {
      State s = q.poll();
      if (visited[s.p]) continue;
      dist[s.p] = s.d;
      visited[s.p] = true;
      for (Edge e : g.get(s.p)) {
        if (visited[e.to]) continue;
        long nd = s.d + (from == S ? e.a : e.b);
        if (dist[e.to] <= nd) continue;
        dist[e.to] = nd;
        q.add(new State(nd,e.to));
      }
    }
    return dist;
  }

  static class State implements Comparable<State> {
    long d;
    int p;

    public State(long d, int p) {
      this.d = d;
      this.p = p;
    }

    @Override
    public int compareTo(State o) {
      return Long.compare(this.d, o.d);
    }
  }

  static class Edge {
    int to;
    long a, b;

    public Edge(int to, int a, int b) {
      this.to = to;
      this.a = a;
      this.b = b;
    }
  }
}
