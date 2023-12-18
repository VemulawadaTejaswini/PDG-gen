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
          solver.graph[a].add(b);
        }
      	scan.close();
      	System.out.println(solver.longestPath());
	}
  
  public static class Solver{
 	public int size; 
    public ArrayList<Integer> graph[]; 
    private int[] memo;
    
    public Solver(int size)  
    { 
        this.size = size; 
        graph = new ArrayList[size+1]; 
        for (int i = 0; i <= size; i++) graph[i] = new ArrayList<>(); 
    } 
        
   private void visit(int node, boolean visited[]) 
    { 
        visited[node] = true; 
  
        for (int i = 0; i < graph[node].size(); i++)  
        { 
            if (!visited[graph[node].get(i)]) visit(graph[node].get(i), visited); 
            memo[node] = Math.max(memo[node], 1 + memo[graph[node].get(i)]); 
        } 
    } 
    
    public int longestPath() 
    { 
        memo = new int[size+1]; 
        boolean[] visited = new boolean[size + 1]; 
      
        for (int i = 1; i <= size; i++)  
         if (!visited[i]) visit(i, visited); 
         
        int answer = 0;   
        for (int i = 1; i <= size; i++)  answer = Math.max(answer, memo[i]); 
        return answer; 
    } 
  }
}