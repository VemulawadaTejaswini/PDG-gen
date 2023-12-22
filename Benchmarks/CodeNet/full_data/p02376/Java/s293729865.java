import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  private void solve(Scanner in, PrintWriter out) {
    int V = in.nextInt();
    int E = in.nextInt();
    PushRelabel relabel = new PushRelabel(V);
    for (int i = 0; i < E; i++) {
      int u = in.nextInt();
      int v = in.nextInt();
      int c = in.nextInt();
      relabel.addEdge(u, v, c);
    }
    out.println(relabel.maxFlow(0, V - 1));
  }
  class PushRelabel {
    class Edge {
      int from, to, cap, flow, rev;
      Edge(int from, int to, int cap, int flow, int rev) {
        this.from = from;
        this.to = to;
        this.cap = cap;
        this.flow = flow;
        this.rev = rev;
      }
    }

    int N;
    ArrayList<ArrayList<Edge>> G = new ArrayList<>();
    long[] excess;
    int[] dist, count;
    boolean[] active;
    ArrayDeque<Integer> Q = new ArrayDeque<>();

    PushRelabel(int N) {
      this.N = N;
      for (int i = 0; i < N; i++) G.add(new ArrayList<>());
      excess = new long[N];
      dist = new int[N];
      active = new boolean[N];
      count = new int[N * 2];
    }

    void Push(Edge e) {
      int amt = (int) Math.min(excess[e.from], e.cap - e.flow);
      if (dist[e.from] <= dist[e.to] || amt == 0)
        return;
      e.flow += amt;
      G.get(e.to).get(e.rev).flow -= amt;
      excess[e.to] += amt;
      excess[e.from] -= amt;
      Enqueue(e.to);
    }

    void addEdge(int from, int to, int cap) {
      G.get(from).add(new Edge(from, to, cap, 0, G.get(to).size()));
      G.get(to).add(new Edge(to, from, 0, 0, G.get(from).size() - 1));
    }

    void Discharge(int v) {
      for (Edge e : G.get(v)) {
        if (excess[v] <= 0) break;
        Push(e);
      }
      if (excess[v] > 0) {
        if (count[dist[v]] == 1)
          Gap(dist[v]);
        else
          Relabel(v);
      }
    }

    void Enqueue(int v) {
      if (!active[v] && excess[v] > 0) {
        active[v] = true;
        Q.push(v);
      }
    }

    void Gap(int k) {
      for (int v = 0; v < N; v++) {
        if (dist[v] < k)
          continue;
        count[dist[v]]--;
        dist[v] = Math.max(dist[v], N + 1);
        count[dist[v]]++;
        Enqueue(v);
      }
    }

    void Relabel(int v) {
      count[dist[v]]--;
      dist[v] = 2 * N;
      for (Edge e : G.get(v))
        if (e.cap - e.flow > 0)
          dist[v] = Math.min(dist[v], dist[e.to] + 1);
      count[dist[v]]++;
      Enqueue(v);
    }

    long maxFlow(int s, int t) {
      count[0] = N - 1;
      count[N] = 1;
      dist[s] = N;
      active[s] = active[t] = true;
      for (Edge e : G.get(s)) {
        excess[s] += e.cap;
        Push(e);
      }

      while (!Q.isEmpty()) {
        int v = Q.poll();
        active[v] = false;
        Discharge(v);
      }

      long flow = 0;
      for (Edge e : G.get(s)) flow += e.flow;
      return flow;
    }

  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    PrintWriter out = new PrintWriter(System.out);
    new Main().solve(in, out);
    in.close();
    out.close();
  }
}