import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	private void solve() {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[][] edge = new int[N][N];
		PriorityQueue<Edge> que = new PriorityQueue<>();
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				edge[i][j] = in.nextInt();
				if(i != j){
					que.add(new Edge(i,j,edge[i][j]));
				}
			}
		}
		boolean[][] valiable = new boolean[N][N];
		long sum = 0;
		
		while(!que.isEmpty()) {
			Edge e = que.poll();
			if(valiable[e.x][e.y]) continue;
			sum += e.l;
			if(edge[e.x][e.y] != edge[e.y][e.x]){
				System.out.println(-1);
				return;
			}
			valiable[e.x][e.y] = true;
			valiable[e.y][e.x] = true;
			for (int i = 0; i < N; i++) {
				if((long)(edge[e.x][i]) + e.l < edge[e.y][i] ||
				   (long)(edge[e.y][i]) + e.l < edge[e.x][i]) {
					System.out.println(-1);
					return;
				}
				if(valiable[e.x][i] && edge[e.y][i] == (long)(edge[e.x][i]) + e.l){
					valiable[e.y][i] = true;
					valiable[i][e.y] = true;
				}
				if(valiable[e.y][i] && edge[e.x][i] == (long)(edge[e.y][i]) + e.l){
					valiable[e.x][i] = true;
					valiable[i][e.x] = true;
				}
			}
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		new Main().solve();
	}
	
	class Edge implements Comparable<Edge>{
		int x,y,l;
		public Edge(int x,int y,int l) {
			this.x = x;
			this.y = y;
			this.l = l;
		}
		@Override
		public int compareTo(Edge o) {
			return Integer.compare(l, o.l);
		}
	}
}
