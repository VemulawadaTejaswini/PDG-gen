import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	static int nmax = 8;
	static boolean graph[][] = new boolean[nmax][nmax];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		Integer N = Integer.parseInt(sc.next());
		Integer M = Integer.parseInt(sc.next());
		for(int i=0;i<M;i++) {
			int a = Integer.parseInt(sc.next());
			int b = Integer.parseInt(sc.next());
			graph[a-1][b-1] = true;
			graph[b-1][a-1] = true;
		}
		boolean visited[] = new boolean[nmax];
		for(int i=0;i<N;i++) {
			visited[i] = false;
		}
		visited[0] = true;
		int result = dfs(0,N,visited);
		out.println(result);
		
		
		out.flush();
	}

	public static int dfs(int v,int N,boolean visited[]) {
		boolean all_visited = true;

		for(int i=0;i<N;i++) {
			if(visited[i]==false) {
				all_visited = false;
			}
		}

		if(all_visited) {
			return 1;
		}
		int ret = 0;

		for(int i=0;i<N;i++) {
			if(graph[v][i] == false) {
				continue;
			}
			if(visited[i]) {
				continue;
			}

			visited[i] = true;
			ret += dfs(i,N,visited);
			visited[i] = false;
		}
		return ret;
	}
}