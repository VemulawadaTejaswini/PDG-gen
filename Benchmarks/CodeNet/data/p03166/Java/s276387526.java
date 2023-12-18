import java.util.*;

public class Main {
    public static void main(String args[]) {
 		Scanner scan = new Scanner(System.in);
      	int v = scan.nextInt();
      	int e = scan.nextInt();
      	boolean[][] graph = new boolean[v][v];
      	for(int edge = 0; edge < e; edge++){
          int a = scan.nextInt();
          int b = scan.nextInt();
          graph[a-1][b-1] = true;
        }
      	scan.close();
      	System.out.println((new Solver()).solve(graph));
	}
  
  public static class Solver {
    private int answer;
    public int solve(boolean[][] graph){
      answer = 0;
      int[] memo = new int[graph.length];
      Arrays.fill(memo, -1);
      
      //for(boolean[] level : graph) System.out.println(Arrays.toString(level));
      
      for(int i = 0; i < graph.length; i++){
        if(memo[i] == -1) answer = Math.max(visit(graph, i, memo,0), answer);
      }
      return answer;
    }
    
    private int visit(boolean[][] graph, int v, int[] memo, int level){
    	if(memo[v] != -1) return memo[v];
      	int max = 0;
      	for(int i = 0; i < graph.length; i++){
        	if(graph[v][i]){
            	int path = visit(graph, i, memo, level + 1);
              	max = Math.max(max, path + 1);
            }
        }
      	memo[v] = max;
      	return max;
    }
  }
}