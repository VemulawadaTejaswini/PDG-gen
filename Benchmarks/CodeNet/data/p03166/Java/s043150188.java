import java.util.*;
public class Main {
	public static void main(String args[]){
    	Scanner s = new Scanner(System.in);
      	int N = s.nextInt();
      	int M = s.nextInt();
      	ArrayList<Integer> graph[] = new ArrayList[N];
      	for(int i=0;i<N;i++)
          	graph[i] = new ArrayList<Integer>();
      	for(int i=0;i<M;i++){
        	int a = s.nextInt()-1;
          	int b = s.nextInt()-1;	
          	graph[a].add(b);
        }
      	int ans = ans(graph,N);
      	System.out.println(ans);
    }
  	public static int ans(ArrayList<Integer> graph[], int N){
      	int ans[] = new int[N];
      	boolean[] visited = new boolean[N];
      	Arrays.fill(ans, -1);
      	int max = 0;
      	for(int i=0;i<N;i++){
        	if(!visited[i]){
            	max = Math.max(max, dfs(graph, i, N, ans, visited)-1);
            }
        }
      	return max;
    }
  	public static int dfs(ArrayList<Integer> graph[], int curr, int N,
                          int[] ans, boolean[] visited){
      	// System.out.println(curr+" "+ans[curr]);
    	if(ans[curr]!=-1){
        	return ans[curr]+1;
        }
      	visited[curr] = true;
      	int max = 0;
      	for(int i : graph[curr]){
          	if(!visited[i])
        		max = Math.max(max, dfs(graph, i, N, ans, visited));
        }
      	ans[curr] = max;
      	visited[curr] = false;
      	return max+1;
    }
}