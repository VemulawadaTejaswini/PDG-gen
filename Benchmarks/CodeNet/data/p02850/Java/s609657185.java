import java.util.*;
public class Main {
    
    public static class Edge {
      int idx;
      int node;
      public Edge(int n, int i) {
        this.idx = i;
        this.node = n;
      }
    }

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      
      Map<Integer, List<Edge>> graph = new HashMap<>();
      Map<Integer, Set<Integer>> usedColor = new HashMap<>();
      for(int i = 1; i <= n; i++) {
          graph.put(i, new ArrayList<>());
          usedColor.put(i, new HashSet<>());
      }

      for(int i = 0; i < n - 1; i++) {
          int v = sc.nextInt();
          int u = sc.nextInt();
          graph.get(v).add(new Edge(u, i));
          graph.get(u).add(new Edge(v, i));
      }

      int cnt = 0;
      for(List<Edge> adjs : graph.values())
          cnt = Math.max(cnt, adjs.size());

      System.out.println(cnt);
      
      int[] colors = new int[n-1];
      Queue<Integer> queue = new LinkedList<>();
      Set<Integer> visited = new HashSet<>();
      queue.offer(1);
      visited.add(1);
      while(!queue.isEmpty()) {
        int node = queue.poll();
        int c = 1;
        for(Edge e : graph.get(node)) {
          if(visited.contains(e.node)) continue;
          while(usedColor.get(node).contains(c) || usedColor.get(e.node).contains(c)) c++;
          if(colors[e.idx] == 0)
              colors[e.idx] = c;
          usedColor.get(node).add(c);
          usedColor.get(e.node).add(c);
          queue.offer(e.node);
          visited.add(e.node);
          c++;
        }
      }
      for(int c : colors)
        System.out.println(c);
  }
}