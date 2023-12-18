import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int nodes = in.nextInt();
		int edges = in.nextInt();
		ArrayList<Integer>[] g = new ArrayList[nodes];
		visited = new boolean[nodes];
		for(int i=0;i<nodes;i++) g[i] = new ArrayList<>();
		for(int i=0;i<edges;i++){
			int n = in.nextInt()-1;
			int m = in.nextInt()-1;
			g[n].add(m);
			g[m].add(n);
		}
		visited[0] = true;
		dfs(g, 0);
		System.out.println(count);
	}
	static boolean[] visited;
	static int count = 0;
	public static void dfs(ArrayList<Integer>[] g, int node){
		boolean done = true;
		for(int i:g[node]){
			if(!visited[i]){
				visited[i] = true;
				dfs(g, i);
				visited[i] = false;
				done = false;
			}
		}
		if(done){
			boolean finish = true;
			for(boolean b:visited) if(!b) finish = false;
			count += finish ? 1 : 0;
		}
	}
}
