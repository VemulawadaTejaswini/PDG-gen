import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	static class Edge{
		int src;
		int dst;
		int idx;
		public Edge(int s , int d , int i) {
			src = s;
			dst = d;
			idx = i;
		}
	}
	static class Vertex{
		List<Edge> adj;
		public Vertex() {
			adj = new ArrayList<Edge>();
		}
		void add(int s , int d , int i){
			adj.add(new Edge(s, d, i));
		}
	}
	static double rec(int parent , int cur , double memo[] , List<Integer> ordering, Vertex[] vs){
		ordering.add(cur);
		int P = 0;
		double S = 0.0;
		for(Edge e : vs[cur].adj){
			if(e.dst == parent){
				continue;
			}
			if(memo[e.idx] < 0.0){
				double p = rec(cur , e.dst , memo , ordering , vs) + 1.0;
				memo[e.idx] = p;
			}
			S += memo[e.idx];
			++P;
		}
		if(P == 0){
			return 0.0;
		}
		return S / P;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Vertex[] vs = new Vertex[N];
		for(int i = 0 ; i < N ; ++i){
			vs[i] = new Vertex();
		}
		for(int i = 0 ; i < N - 1 ; ++i){
			int u = sc.nextInt() - 1;
			int v = sc.nextInt() - 1;
			vs[u].add(u , v , i * 2);
			vs[v].add(v , u , i * 2 + 1);
		}
		List<Integer> ordering = new ArrayList<Integer>();
		double memo[] = new double[(N - 1) * 2];
		Arrays.fill(memo, -1);
		double ans[] = new double[N];
		rec(0, 0, memo, ordering, vs);
		for(int cur : ordering){
			double S = 0.0;
			for(Edge e : vs[cur].adj){
				S += memo[e.idx];
			}
			int size = vs[cur].adj.size();
			ans[cur] = S / size;
			for(Edge e : vs[cur].adj){
				int redge = e.idx % 2 == 0 ? e.idx + 1 : e.idx - 1;
				if(size == 1){
					memo[redge] = 1.0;
				}else{
					double v = S - memo[e.idx];					
					memo[redge] = 1.0 + v / (size - 1);
				}
			}
		}
		for(double v : ans){
			System.out.println(v);
		}
	}
}
