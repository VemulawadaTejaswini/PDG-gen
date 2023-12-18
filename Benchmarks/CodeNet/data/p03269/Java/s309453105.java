import java.util.*;

public class Main {
	static class Edge {
		int s,t,c;

		public Edge(int s, int t, int c) {
			this.s = s;
			this.t = t;
			this.c = c;
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int L = sc.nextInt();
		int FOLK = 3;
		
		ArrayList<Edge> edges = new ArrayList<>();
		
		int cur = 1;
		ArrayList<Integer> toEnd = new ArrayList<>();
		while(L>FOLK) {
			int cost = 0;
			for(int i=0; i<FOLK; i++) {
				if(i<L%FOLK) {
					edges.add(new Edge(cur, cur+1, cost));
					cost += L/FOLK+1;
				} else {
					edges.add(new Edge(cur, cur+2, cost));
					cost += L/FOLK;
				}
			}
			if(L%FOLK!=0) {
				edges.add(new Edge(cur+1, cur+2, 1));
				toEnd.add(cur+1);
				cur++;
			}
			cur++;
			L /= FOLK;
		}
		for(int i=0; i<L; i++) {
			edges.add(new Edge(cur, cur+1, i));
		}
		cur++;
		
		for(int i : toEnd) {
			edges.add(new Edge(i, cur, 0));
		}

		System.out.println(cur + " " + edges.size());
		for(Edge e : edges) {
			System.out.println(e.s + " " + e.t + " " + e.c);
		}
	}
}
