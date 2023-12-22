import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static int N,M;
	static boolean[]visited;
	static int minElem = Integer.MAX_VALUE;
	static ArrayList<ArrayList<Integer>> adjList = new ArrayList<ArrayList<Integer>>();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 N = sc.nextInt();
		 M = sc.nextInt();
		 visited = new boolean[N+1];
		 //System.out.println(" N "+ N+ " M "+M);
		 for(int i = 0 ; i <= N; i++) {
			adjList.add(new ArrayList<Integer>());
		 }
		 int src, dest;
		for(int i = 0 ; i < M; i++) {
			src = sc.nextInt();
			dest = sc.nextInt();
			adjList.get(src).add(dest);
			adjList.get(dest).add(src);
		}
		//System.out.println("visited size "+visited.length);
		int []compElements = new int[N+1];
		int cc = 0;
		for(int i = 1; i <= N; i++) {
			if(visited[i] ==  false) {
				 int cce = dfs(i, adjList); 
				 //System.out.println("cce  for "+i+ " "+cce);
				 if(cce != 1) {
					 compElements[cc++] = cce;
					 minElem = Math.min(minElem, cce);
				 }	
			}
		}
		//System.out.println("minElem "+minElem);
		int res = minElem;
		for(int i = 0 ; i < cc; i++ ) 
			res = res + compElements[i] - minElem;
		System.out.println(res);		
	}
	
	public static int dfs(int vertex, ArrayList<ArrayList<Integer>> adjList) {
		visited[vertex] = true;
		ArrayList<Integer> adjVs = adjList.get(vertex);
		int res = 1;
		for(int i = 0 ; i < adjVs.size(); i++) {
			int a = adjVs.get(i);
			if(visited[a] == false) {
				res = res + dfs(a, adjList);
			}
		}
		return res;
	}
}	