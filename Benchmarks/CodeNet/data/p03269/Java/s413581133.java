import java.util.*;
import java.util.stream.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int l = in.nextInt(), n = 0;
		while(Math.pow(2, n) <= l) n++;
		List<Edge> list = new ArrayList<>();
		for(int i = 1; i < n; i++) {
			list.add(new Edge(i, i + 1, (int)Math.pow(2, i - 1)));
			list.add(new Edge(i, i + 1, 0));
		}
		int cost = (int)Math.pow(2, n - 1);
		int left = l - (int)Math.pow(2, n - 1);
		while(0 < left) {
			int t = 0;
			while(Math.pow(2, t + 1) <= left) t++;
			list.add(new Edge(t, n, cost));
			cost += (int)Math.pow(2, t);
			left -= (int)Math.pow(2, t);
		}
		System.out.println(n + " " + list.size());
		list.forEach(System.out::println);
	}
}

class Edge {
	int from, to, cost;
	public Edge(int from, int to, int cost) {
		this.from = from; this.to = to; this.cost = cost;
	}
	public String toString() { return from + " " + to + " " + cost; }
}
	
