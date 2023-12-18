/*
595 ms	104520 KB
*/
import java.util.*;

public class Main {
    public static void main(String args[]) {
 		Scanner scan = new Scanner(System.in);
      	int v = scan.nextInt();
      	int e = scan.nextInt();
      	Graph graph = new Graph(v);
      
      	for(int edge = 0; edge < e; edge++){
          int a = scan.nextInt();
          int b = scan.nextInt();
         graph.addEdge(a, b);
        }
      	scan.close();
      	System.out.println(graph.longestPath(v));
	}
  
  public static class Graph{
 	public int size; 
    public ArrayList<Integer> edge[]; 
  
    public Graph(int vertices)  
    { 
        this.size = vertices; 
        edge = new ArrayList[vertices+1]; 
        for (int i = 0; i <= vertices; i++)  
            edge[i] = new ArrayList<>(); 
    } 
    public void addEdge(int a,int b) 
    { 
        edge[a].add(b); 
    } 
   public void visit(int node, ArrayList<Integer> adj[], int dp[], 
                                    boolean visited[]) 
    { 
        // Mark as visited 
        visited[node] = true; 
  
        // Traverse for all its children 
        for (int i = 0; i < adj[node].size(); i++)  
        { 
  
            // If not visited 
            if (!visited[adj[node].get(i)]) 
                visit(adj[node].get(i), adj, dp, visited); 
  
            // Store the max of the paths 
            dp[node] = Math.max(dp[node], 1 + dp[adj[node].get(i)]); 
        } 
    } 
    public int longestPath(int n) 
    { 
        ArrayList<Integer> adj[] = edge; 
        int[] dp = new int[n+1]; 
        boolean[] visited = new boolean[n + 1]; 
      
        for (int i = 1; i <= n; i++)  
         if (!visited[i]) visit(i, adj, dp, visited); 
         
  
        int answer = 0; 
  
        for (int i = 1; i <= n; i++)  answer = Math.max(answer, dp[i]); 
        return answer; 
    } 
  }
}
