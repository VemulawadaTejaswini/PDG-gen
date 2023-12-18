import java.util.*;
import java.io.*;

public class Main {
  
   public static void main(String []abc) {
      Main answer = new Main();
      long solution = answer.solve();
   }
   long [] dp = new long[1000000];	
   private long solve() {
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int E = sc.nextInt();
      Map<Integer, List<Integer>> graph = new HashMap<>();
      for(int i=0;i<E;i++){
         int u = sc.nextInt();
         int v = sc.nextInt();
         List<Integer> children =graph.getOrDefault(u, new ArrayList<>());
         children.add(v);
         graph.put(u, children);          
      }
      Arrays.fill(dp, -1);
      long bestLength=0;
      for(int i=1;i<=N;i++){
        bestLength = Math.max(bestLength, solve(graph, i));
      }
      return bestLength;     
   }

   private long solve(Map<Integer, List<Integer>> graph, int u) {
     if (dp[u]!=-1) return dp[u];
     if (!graph.containsKey(u)) {
        dp[u]=0;
        return dp[u];
     }
     long bestChild=0;
     for(int child: graph.get(u)){
        bestChild = Math.max(bestChild, solve(graph, child));
     }
     dp[u]= 1+bestChild;
     return dp[u];
   }
}
