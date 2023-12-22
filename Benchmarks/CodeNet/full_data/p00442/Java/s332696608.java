import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	
	public static final int unvisited = 0;
	public static final int visiting = 1;
	public static final int visited = 2;

	public static boolean dfs(int node, boolean[][] adj, int[] state, LinkedList<Integer> list){
	    state[node] = visiting;
	    
	    for(int i = 0; i < adj.length; i++){
	        if(!adj[node][i]){ continue; }
	        else if(state[i] == unvisited){
	            if(!dfs(i, adj, state, list)){ //
	                state[node] = visited; return false;
	            }
	        }else if(state[i] == visiting){ //cycle!
	            return false;
	        }
	    }
	    
	    state[node] = visited;
	    list.addFirst(node);
	    return true;
	}

	public static boolean topological_sort(boolean[][] adj, LinkedList<Integer> list){
	    int[] state = new int[adj.length];
	    for(int i = 0; i < adj.length; i++){
	        state[i] = unvisited;
	    }
	    for(int i = 0; i < adj.length; i++){
	        if(state[i] == unvisited){
	            if(!dfs(i, adj, state, list)){
	                return false;
	            }
	        }
	    }
	    return true;
	}
	
	
	public static class UnionFind{
	    int[] par; // 
	    
	    public UnionFind(int n){
	        par = new int[n];
	        for(int i = 0; i < n; i++){ par[i] = -1; }
	    }
	    
	    public int find(int x){
	        if(par[x] < 0){
	            return x;
	        }else{
	            return par[x] = find(par[x]);
	        }
	    }
	    
	    public boolean union(int x, int y){
	        x = find(x);
	        y = find(y);
	        
	        if(x != y){
	            if(par[y] < par[x]) {  // 多い方が根になるようにスワップする.
	                int tmp = x; x = y; y = tmp;
	            }
	            par[x] += par[y];
	            par[y] = x;
	            return true;
	        }else{
	            return false;
	        }
	    }
	    
	    public boolean same(int x, int y){
	        return find(x) == find(y);
	    }
	    
	    public int size(int x){
	        return -par[find(x)];
	    }
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final int n = sc.nextInt();
		final int m = sc.nextInt();
		
		boolean[][] adj = new boolean[n][n];
		
		for(int i = 0; i < m; i++){
			final int win  = sc.nextInt() - 1;
			final int lose = sc.nextInt() - 1;
			
			adj[win][lose] = true;
		}
		
		LinkedList<Integer> result = new LinkedList<Integer>();
		final boolean is_valid = topological_sort(adj, result);
		
		boolean order = true;
		int pre = -1;
		for(int ret : result){
			if(pre != -1 && !adj[pre][ret]){
				order = false;
				break;
			}
			pre = ret;
		}
		
		for(int ret : result){
			System.out.println(ret + 1);
		}
		System.out.println(order ? 0 : 1);
	}

}