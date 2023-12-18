import java.util.LinkedList;
import java.util.Scanner;

class Edge{
	int s, t;
	public Edge(int _s, int _t) {
		s = _s; t = _t;
	}
}
class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), K = sc.nextInt();
		if((N - 1) * (N - 2) < 2 * K) System.out.println(-1);
		else {
			LinkedList<Edge> edges = new LinkedList<Edge>();
			for(int i = 2; i <= N; i++) edges.add(new Edge(1, i));
			int add = (N - 1) * (N - 2) / 2 - K;
			for(int i = 2; i <= N; i++) {
				for(int j = i + 1; j <= N; j++) {
					if(add <= 0) break;
					else {
						edges.add(new Edge(i, j));
						add--;
					}
				}
			}
			System.out.println(edges.size());
			for(Edge e : edges) {
				System.out.println(e.s+" "+e.t);
			}
		}
	}
}