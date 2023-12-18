import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
public class Main {
  	static class Graph {
      int N;
      ArrayList<ArrayList<Integer>> list;
      HashMap<Integer, Integer> counter;
      public Graph(int v){
      	N = v;
        list = new ArrayList<>();
        counter = new HashMap<>();
        for(int i = 0; i <= v; i++)
          list.add(i, new ArrayList<>());
      }
      public void addEdge(int v1, int v2){
        list.get(v1).add(v2);
      }
      public void addToCounter(int v, int x){
      	counter.put(v, counter.getOrDefault(v, 0) + x);
      }
    }
  
  static void dfsUtil(Graph g, int i, boolean[] visited, int count) {
        visited[i] = true;
    	g.addToCounter(i, count);
        for(Integer x : g.list.get(i)) {
            if(!visited[x]) 
              dfsUtil(g, x, visited, count);
        }
    }
   
    
    static void dfs(Graph g, int v, int count) {
        boolean[] visited = new boolean[g.N + 1];
        for(int i = 1; i <= g.N; i++) {
            visited[i] = false;
        }
		
        dfsUtil(g, v, visited, count);
    }
	public static void main(String... args){
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int Q = sc.nextInt();
      HashMap<Integer, Integer> queries = new HashMap<>();
      Graph g = new Graph(N);  
      for(int i = 1; i < N; i++){
        int v1 = sc.nextInt();
        int v2 = sc.nextInt();
      	g.addEdge(v1, v2);
      }
      
      for(int i = 0; i < Q; i++){
      	int p = sc.nextInt();
        int x = sc.nextInt();
        dfs(g, p, x);
      }
      
      for(int i = 1; i <= N; i++) {
      	System.out.print(g.counter.get(i)+" ");
      }
      
    }
}