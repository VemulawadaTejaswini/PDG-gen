import java.util.*;

public class Main {
    
    static int N;
    static int K;
    static int mod = (int)1e9 + 7;
    static Map<Integer, Set<Integer>> edge = new HashMap<>();
    static boolean[] isVisited;
	
	public static void main(String[] args) throws Exception {
    
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();
        
        isVisited = new boolean[N];
        for(int i = 0; i < N; i++){
            edge.put(i, new HashSet<>() );
        }
        
        for(int i = 0; i < N - 1; i++){
            int a = sc.nextInt() -1;
            int b = sc.nextInt() -1;
            
            edge.get(a).add(b);
            edge.get(b).add(a);
        }
        
        System.out.println(dfs(0, 0, 0) );

	}
	
	private static long dfs(int c, int parent, int other){
	    
	    long answer = K - parent - other;
	    isVisited[c] = true;
	    
	    int otherEdges = 0;
	    for(int i : edge.get(c) ){
	        if (!isVisited[i]){
	            answer *= dfs(i, 1, parent + otherEdges) ;
	            answer %= mod;
	            otherEdges++;
	        }
	    }
	    
	    return answer;
	}
    
}
