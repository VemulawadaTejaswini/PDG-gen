import java.util.*;
import java.util.ArrayDeque;
import java.util.Queue;
import java.math.RoundingMode;
import java.math.BigDecimal;



public class Main{
	 public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<ArrayList<Edge>> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list.add(new ArrayList<>());
		}
		for(int i = 0; i < n-1; i++) {
			int u = sc.nextInt()-1;
			int v = sc.nextInt()-1;
			int w = sc.nextInt();
			
			list.get(u).add(new Edge(v, w));
			list.get(v).add(new Edge(u, w));
		}
		int[] col = new int[n];
		dfs(0, -1, 0, list, col);
		
		for(int i=0; i < n; i++) {
			System.out.println(col[i]);
		}
	}
	 static void dfs(int v, int parent, int color, ArrayList<ArrayList<Edge>> edge, int[] col) {
			col[v] = color;
			for(Edge e : edge.get(v)) {
				if (e.to == parent)
					continue;
				if (e.cost % 2 == 0) {
					dfs(e.to, v, color, edge, col);
				} else {
					dfs(e.to, v, 1 - color, edge, col);
				}
			}
	 }
}
class Edge implements Comparable<Edge> {
	int to;
	int cost;
 
	public Edge(int to, int cost) {
		this.to = to;
		this.cost = cost;
	}
 
	@Override
	public int compareTo(Edge e) {
		return this.cost - e.cost;
	}
}