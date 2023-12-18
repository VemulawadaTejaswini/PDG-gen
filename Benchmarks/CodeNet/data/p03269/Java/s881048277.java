import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int n = 32 - Integer.numberOfLeadingZeros(l);
		int sum = 0;
//		System.err.println(n + " " + Integer.numberOfLeadingZeros(l - 1));
		ArrayList<Edge> edges = new ArrayList<>();
		for(int i=0;i<n-1;i++) {
			edges.add(new Edge(n-1-i,n-i,0));
			edges.add(new Edge(n-1-i,n-i,1<<i));
		}
		sum += 1 << (n - 1);
//		System.err.println(l);
		for(int i=0;i<=n-2;i++) {
			if ((l >> i & 1) == 1) {
				edges.add(new Edge(1,n-i,sum));
				sum += 1 << i;
			}
		}
		System.out.println(n + " " + edges.size());
		for(Edge e: edges) {
			System.out.println(e.u + " " + e.v + " " + e.c);
		}
	}

	static class Edge {
		int u,v,c;

		public Edge(int u, int v, int c) {
			super();
			this.u = u;
			this.v = v;
			this.c = c;
		}
		
	}
}
