import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = sc.nextInt();
      int[] p = new int[n+1];
      Map<Integer, List<Integer>> graph = new HashMap<>();
      for(int i = 1; i <= n; i++){
        p[i] = sc.nextInt();
        graph.put(i, new ArrayList<>());
      }

      for(int i = 0; i < m; i++) {
        int x = sc.nextInt();
        int y = sc.nextInt();
        graph.get(x).add(y);
        graph.get(y).add(x);
      }

      ArrayList<Set<Integer>> groups = new ArrayList<>();
      boolean[] visited = new boolean[n+1];
      for(int i = 1; i <= n; i++) {
        if(visited[i]) continue;
        Set<Integer> group = new HashSet<>();
        group.add(i);
        dfs(graph, visited, group, i);
        groups.add(group);
      }

      int cnt = 0;
      for(Set<Integer> group : groups) {
        for(int node : group) {
          if(group.contains(p[node])) cnt++;
        }
      }

      System.out.println(cnt);
  }

  private static void dfs(Map<Integer, List<Integer>> graph, boolean[] visited, Set<Integer> group, int curNode) {
    for(int adj : graph.get(curNode)) {
      if(!visited[adj]) {
        visited[adj] = true;
        group.add(adj);
        dfs(graph, visited, group, adj);
      }
    }
  }
}