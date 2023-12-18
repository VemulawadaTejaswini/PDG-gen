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
		
		System.out.println(0);
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