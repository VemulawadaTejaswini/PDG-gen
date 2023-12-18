import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	private void solve() {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int M = in.nextInt();
		int P = in.nextInt();
		
		ArrayList<ArrayList<Edge>> edges = new ArrayList<>();
		for(int i=0; i<N; i++) {
			edges.add(new ArrayList<Edge>());
		}
		for(int i=0; i<M; i++) {
			Edge e = new Edge();
			e.A = in.nextInt()-1;
			e.B = in.nextInt()-1;
			e.C = in.nextInt();
			edges.get(e.A).add(e);
		}
		
		long[][] coins = new long[N][2];
		for(int i=0; i<N; i++) {
			coins[i][0] = Integer.MIN_VALUE;
			coins[i][1] = Integer.MIN_VALUE;
		}
		coins[0][0] = 0;
		
		long max_point = 0;
		
		for(int t = 1; t<= 2*M; t++) {
			for(ArrayList<Edge> edg : edges) {
				for(Edge e: edg) {
					coins[e.B][t%2] = Math.max(
						Math.max(
							coins[e.B][t%2],
							coins[e.B][(t+1)%2]
						),
						coins[e.A][(t+1)%2] + e.C
					);
				}
			}
			long new_point = coins[N-1][t%2] - t*P;
			if(max_point < new_point) {
				if(t <= M) {
					max_point = new_point;
				}else {
					System.out.println(-1);
					return;
				}
			}
		}

		System.out.println(Math.max(max_point,0));
	}
	
	public static void main(String[] args) {
		new Main().solve();
	}
	
	class Edge{
		public int A;
		public int B;
		public int C;
	}
}