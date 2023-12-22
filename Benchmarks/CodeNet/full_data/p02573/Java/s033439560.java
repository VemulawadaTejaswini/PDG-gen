
import java.util.*;
import java.io.*;

/**
 * Made by egor https://github.com/chermehdi/egor.
 * 
 * @author Azuz
 * 
 */
public class Main {

    void solve(Scanner in, PrintWriter out) {
      int n = in.nextInt();
      int m = in.nextInt();
      ArrayList<Integer>[] g = new ArrayList[n + 1];
      
      for (int i = 0; i <= n; ++i) {
        g[i] = new ArrayList<>(); 
      } 
      
      for (int i = 0; i < m; ++i) {
        int u = in.nextInt();
        int v = in.nextInt();
        g[u].add(v);
        g[v].add(u);
      }

      int ans = 0;
      int count = 0;
      boolean[] vis = new boolean[n + 1];
      for (int i = 1; i <= n; ++i) if (!vis[i]) {
        int size = 0;
        Stack<Integer> stk = new Stack<>();
        stk.push(i);

        while (!stk.isEmpty()) {
          int u = stk.pop();
          if (vis[u]) continue;
          vis[u] = true;
          ++size;

          for (int v : g[u]) {
            stk.push(v);
          }
        }
        ans = Math.max(ans, size);
      }

      
      out.println(ans);
    }

    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in);
            PrintWriter out = new PrintWriter(System.out)) {
            new Main().solve(in, out);
        }
    }
}
