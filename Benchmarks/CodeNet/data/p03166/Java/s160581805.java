import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.Reader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * The Java template file for AtCoder online judge.
 */
public class Main {

  private static FastScanner scanner;
  private static PrintWriter printer;

  public static void solve() {
    int n = scanner.nextInt();
    int m = scanner.nextInt();
    int[] deg = new int[n];
    List<List<Integer>> edges = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      edges.add(new ArrayList<>());
    }
    for (int x, y, i = 0; i < m; i++) {
      x = scanner.nextInt() - 1;
      y = scanner.nextInt() - 1;
      deg[y]++;
      edges.get(x).add(y);
    }
    Queue<Integer> queue = new ArrayDeque<>();
    for (int i = 0; i < n; i++) {
      if (deg[i] == 0) {
        queue.add(i);
      }
    }
    int[] dist = new int[n];
    while (!queue.isEmpty()) {
      int u = queue.poll();
      for (int v : edges.get(u)) {
        dist[v] = Math.max(dist[v], dist[u] + 1);
        deg[v]--;
        if (deg[v] == 0) {
          queue.add(v);
        }
      }
    }
    int result = 0;
    for (int i = 0; i < n; i++) {
      result = Math.max(result, dist[i]);
    }
    printer.println(result);
  }

  public static void main(String[] args) {
    scanner = new FastScanner();
    printer = new PrintWriter(System.out);
    solve();
    printer.flush();
  }

  private static class FastScanner {
    BufferedReader br;
    StringTokenizer st;

    public FastScanner(Reader in) {
      br = new BufferedReader(in);
    }

    public FastScanner() {
      this(new InputStreamReader(System.in));
    }

    public String next() {
      while (st == null || !st.hasMoreElements()) {
        try {
          st = new StringTokenizer(br.readLine());
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
      return st.nextToken();
    }

    public int nextInt() {
      return Integer.parseInt(next());
    }

    public long nextLong() {
      return Long.parseLong(next());
    }

    public double nextDouble() {
      return Double.parseDouble(next());
    }

    public String nextLine() {
      String str = "";
      try {
        str = br.readLine();
      } catch (IOException e) {
        e.printStackTrace();
      }
      return str;
    }

    public int[] readIntArray(int size) {
      int[] ret = new int[size];
      for (int i = 0; i < size; i++) {
        ret[i] = nextInt();
      }
      return ret;
    }
  }
}
