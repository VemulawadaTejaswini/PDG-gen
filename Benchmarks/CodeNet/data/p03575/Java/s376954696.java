import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(), M = sc.nextInt();
		boolean graph[][] = new boolean[N+1][N+1];
				
		for(int i = 1; i<=M; i++) {
			int a = sc.nextInt(), b = sc.nextInt();
			graph[a][b] = graph[b][a] = true;
		}
		
		int count = 0;
		
		for(int i = 1; i<=N; i++) {
			for(int j = i+1; j<=N; j++) {
				if(graph[i][j]) {
					graph[j][i] = graph[i][j] = false;
					if(!BFS(graph, N)) count++;
					graph[j][i] = graph[i][j] = true;
				}
			}
		}
		
		System.out.println(count);
		
		
		
	}
	
	public static boolean BFS(boolean graph[][], int N) {
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		list.add(1);
		boolean dist[] = new boolean[N+1];
		dist[1] = true;
		
		while(!list.isEmpty()) {
			int node = list.pop();
			for(int i = 1; i<=N; i++) {
				if(graph[node][i] && !dist[i]) {
					dist[i] = true;
					list.add(i);
				}
			}
		}
		
		for(int i = 1; i<=N; i++) {
			if(!dist[i]) return false;
		}
		return true;
		
	}

}
