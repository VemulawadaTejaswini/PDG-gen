import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      Map<Integer, List<Integer>> graph = new HashMap<>();
      Map<Integer, Set<Integer>> colorMap = new HashMap<>();
      for(int i = 1; i <= n; i++) {
        graph.put(i, new ArrayList<>());
        colorMap.put(i, new HashSet<>());
      }

      List<int[]> edges = new ArrayList<>();
      for(int i = 0; i < n - 1; i++) {
        int v = sc.nextInt();
        int u = sc.nextInt();
        graph.get(v).add(u);
        graph.get(u).add(v);
        edges.add(new int[]{v,u});
      }

      int cnt = 0;

      for(List<Integer> adjs : graph.values())
        cnt = Math.max(cnt, adjs.size());

      System.out.println(cnt);
      for(int[] edge : edges) {
        int v = edge[0], u = edge[1];
        for(int i = 1; i <= cnt; i++) {
          if(!colorMap.get(v).contains(i) && !colorMap.get(u).contains(i)) {
            colorMap.get(v).add(i);
            colorMap.get(u).add(i);
            System.out.println(i);
            break;
          }
        }
      }
  }
}