import java.util.*;
import java.io.*;

public class Main {

  private static void solve() {
    int n = nextInt();
    int m = nextInt();

    Map<Integer, List<Integer>> graph = new HashMap<>();

    for (int i = 0; i < m; i++) {
      int a = nextInt();
      int b = nextInt();

      graph.computeIfAbsent(a, (k) -> new ArrayList<>()).add(b);
    }

    Stack<Integer> order = new Stack<>();
    boolean[] vis = new boolean[n + 1];
    for (int i = 1; i <= n; i++) {
      if (!vis[i]) {
        dfs(i, graph, vis, order);
      }
    }

    int[] dist = new int[n + 1];
    int ans = 0;
    Arrays.fill(dist, 0);
    while (!order.isEmpty()) {
      Integer last = order.pop();
      List<Integer> neighbours = graph.getOrDefault(last, new ArrayList<>());

      for (Integer neighbour : neighbours) {
        dist[neighbour] = Math.max(dist[neighbour], dist[last] + 1);
        ans = Math.max(ans, dist[neighbour]);
      }
    }


    System.out.println(ans);
  }

  private static void dfs(int cur, Map<Integer, List<Integer>> graph, boolean[] vis, Stack<Integer> order) {
    vis[cur] = true;

    List<Integer> neighbours = graph.getOrDefault(cur, new ArrayList<>());

    for (Integer neighbour : neighbours) {
      if (!vis[neighbour]) {
        dfs(neighbour, graph, vis, order);
      }
    }

    order.push(cur);
  }

  private static void run() {
    br = new BufferedReader(new InputStreamReader(System.in));
    out = new PrintWriter(System.out);

    solve();

    out.close();
  }

  private static StringTokenizer st;
  private static BufferedReader br;
  private static PrintWriter out;

  private static String next() {
    while (st == null || !st.hasMoreElements()) {
      String s;
      try {
        s = br.readLine();
      } catch (IOException e) {
        return null;
      }
      st = new StringTokenizer(s);
    }
    return st.nextToken();
  }

  private static int nextInt() {
    return Integer.parseInt(next());
  }

  private static long nextLong() {
    return Long.parseLong(next());
  }

  public static void main(String[] args) {
    run();
  }
}