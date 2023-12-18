import java.util.*;
import java.lang.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		HashMap<Integer, ArrayList<Edge>> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			map.put(i, new ArrayList<>());
		}
		for (int i = 0; i < n - 1; i++) {
			int from = sc.nextInt() - 1;
			int to = sc.nextInt() - 1;
			int dis = sc.nextInt();
			Edge e = new Edge(from, to, dis);
			map.get(from).add(e);
			map.get(to).add(e);
		}
		TreeMap<Integer, Integer> color = new TreeMap<>();
		dfs(map, color, 0, 0);
		for (int i = 0; i < n; i++) {
			System.out.println(color.get(i));
		}
	}
	static void dfs(HashMap<Integer, ArrayList<Edge>> map, TreeMap<Integer, Integer> color, int index, int col) {
		for (int i = 0; i < map.get(index).size(); i++) {
			Edge e = map.get(index).get(i);
			if (!color.containsKey(e.from)) {
				color.put(e.from, (col + e.distance) % 2);
				dfs(map, color, e.from, (col + e.distance) % 2);
			} else if (!color.containsKey(e.to)) {
				color.put(e.to, (col + e.distance) % 2);
				dfs(map, color, e.to, (col + e.distance) % 2);
			}
		}
	}
}

class Edge {
	int from;
	int to;
	int distance;
	Edge(int from, int to, int distance) {
		this.from = from;
		this.to = to;
		this.distance = distance;
	}
}

