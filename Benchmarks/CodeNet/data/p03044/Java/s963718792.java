import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    List<List<Integer>> from = new ArrayList<>();
    for (int i = 0; i < N; i++) {
      from.add(new ArrayList<>());
    }
    int[][] cost = new int[N][N];
    for (int i = 0; i < N-1; i++) {
      int u = sc.nextInt();
      int v = sc.nextInt();
      int w = sc.nextInt();
      u--;
      v--;
      from.get(u).add(v);
      from.get(v).add(u);
      cost[u][v] = w;
      cost[v][u] = w;
    }
    
    // BFS
    int[] ans = new int[N];
    Arrays.fill(ans, -1);
    LinkedList<Integer> q = new LinkedList<>();
    q.offer(0);
    ans[0] = 0;
    while (!q.isEmpty()) {
      int v = q.poll();
      for (int vv : from.get(v)) {
        if (ans[vv] == -1) {
          ans[vv] = cost[v][vv]%2;
          q.offer(vv);
        }
      }
    }
    
    for (int i = 0; i < N; i++) {
      System.out.println(ans[i]);
    }
  }
}

