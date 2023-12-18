import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    private int findLongestPath(int[][] edges, int n) {
      List<Integer>[] adjList = new List[n + 1];
      int[] dist = new int[n + 1];
      for (int i = 1; i <= n; i++) {
        adjList[i] = new ArrayList<>();
      }
      for (int[] e: edges) {
        adjList[e[0]].add(e[1]);
      }
      int result = 0;
      for (int i = 1; i <= n; i++) {
        result = Math.max(result, bfs(i, adjList, dist));
      }
      return result;
    }
    private int bfs(int i, List<Integer>[] adjList, int[] dist) {
      if (dist[i] != 0) {
        return dist[i];
      }
      int result = -1;
      Deque<Integer> bfsQueue = new ArrayDeque<>();
      bfsQueue.offer(i);
      while (!bfsQueue.isEmpty()) {
        for (int sz = bfsQueue.size(); sz > 0; sz--) {
          int u = bfsQueue.poll();
          for (int v: adjList[u]) {
            bfsQueue.offer(v);
          }
        }
        result++;
      }
      return dist[i] = result;
    }
    public static void main(String[] args)  {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] split = br.readLine().split(" ");
            int n = Integer.parseInt(split[0]);
            int m = Integer.parseInt(split[1]);
            int[][] edges = new int[m][2];
            for (int i = 0; i < m; i++) {
              split = br.readLine().split(" ");
              edges[i][0] = Integer.parseInt(split[0]);
              edges[i][1] = Integer.parseInt(split[1]);
            }
            Main app = new Main();
            int result = app.findLongestPath(edges, n);
            System.out.println(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
