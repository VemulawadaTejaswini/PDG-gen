
import java.util.*;

 class Main {
     static boolean[][] graph = new boolean[8][8];

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        int a,b;
        for(int i=0;i<M;i++) {
        	a=sc.nextInt();
        	b=sc.nextInt();
        	graph[a-1][b-1]=true;
        	graph[b-1][a-1]=true;
        }
        
        boolean[] visited = new boolean[N];
		for(int i=0;i<N;i++) {
			visited[i]=false;
		}

        visited[0]=true;
        int result = dfs(0,N,visited);
        
        System.out.println(result);
    }
    
    static int dfs(int first, int max, boolean[] visited) {
    	int ret = 0;
    	boolean all_visited = true;
    	for(int i=0;i<max;i++) {
    		if(visited[i]==false) {
    			all_visited=false;    			
    		}
    	}
    	if (all_visited) {
    		return 1;
    	}
    	
    	for(int i=0;i<max;i++) {
    		if(graph[first][i]==false) {
    			continue;
    		}
    		if(visited[i]==true) {
    			continue;
    		}
    		visited[i]=true;
			ret += dfs(i,max,visited);
			visited[i] = false;
    	}
    	return ret;
    }
}