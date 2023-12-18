import java.util.*;

public class Main {
    public static void main(String args[]) {
 		Scanner scan = new Scanner(System.in);
      	int v = scan.nextInt();
      	int e = scan.nextInt();
      	Solver solver = new Solver(v);
      
      	for(int edge = 0; edge < e; edge++){
          int a = scan.nextInt();
          int b = scan.nextInt();
          solver.addEdge(a, b);
        }
      	scan.close();
      	System.out.println(solver.solve());
	}
  
  public static class Solver{
 	public int size; 
    public ArrayList<Integer> edge[]; 
  
    public Solver(int vertices)  
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
   public void visit(int node, ArrayList<Integer> adj[], int dp[], boolean visited[]) 
    { 
        visited[node] = true; 
  
        for (int i = 0; i < adj[node].size(); i++)  
        { 
  
            if (!visited[adj[node].get(i)]) 
                visit(adj[node].get(i), adj, dp, visited); 
 
            dp[node] = Math.max(dp[node], 1 + dp[adj[node].get(i)]); 
        } 
    } 
    public int solve() 
    { 
        ArrayList<Integer> adj[] = edge; 
        int[] dp = new int[size+1]; 
        boolean[] visited = new boolean[size + 1]; 
      
        for (int i = 1; i <= size; i++)  
         if (!visited[i]) visit(i, adj, dp, visited); 
         
  
        int answer = 0; 
  
        for (int i = 1; i <= size; i++)  answer = Math.max(answer, dp[i]); 
        return answer; 
    } 
  }
}
