import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = sc.nextInt();
      Map<Integer, List<Integer>> graph = new HashMap<>();
      int[] heights = new int[n + 1];
      for(int i = 1; i <= n; i++) {
        heights[i] = sc.nextInt();
        graph.put(i, new ArrayList<>());
      }

      for(int i = 0; i < m; i++) {
        int u = sc.nextInt();
        int v = sc.nextInt();
        graph.get(u).add(v);
        graph.get(v).add(u);
      }
      int res = 0;
      for(Map.Entry<Integer, List<Integer>> entry : graph.entrySet()) {
        int cnt = 0;
        for(int adj : entry.getValue()) {
          if(heights[adj] >= heights[entry.getKey()]) {
            cnt++;
            break;
          }
        }
        if(cnt == 0) res++;
      }
      System.out.println(res);
  }
}