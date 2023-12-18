


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;



public class Main {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		HashMap<Integer, ArrayList<Edge>> map = new HashMap<>();
		for (int i=1;i<=n;i++) {
			map.put(i, new ArrayList<Edge>());
		}
		for (int i=0;i<n-1;i++) {
			int u = sc.nextInt();
			int v = sc.nextInt();
			int w = sc.nextInt();
			Edge e = new Edge();
			e.from = u;
			e.to = v;
			e.w = w;
			map.get(u).add(e);
			map.get(v).add(e);
		}
		
		HashMap<Integer, Integer> color = new HashMap<>();
		
		dfs(map, color, 1, 0);
		
		for (int i=1;i<=n;i++) {
			System.out.println(color.get(i));
		}
	}
	
	static void dfs(HashMap<Integer, ArrayList<Edge>> map, HashMap<Integer, Integer> color, int v, int c) {
		color.put(v, c);
		for (Edge e:map.get(v)) {
			int u = e.from+e.to-v;
			if (!color.containsKey(u)) {
				dfs(map, color, u, (c+e.w)%2);
			}
		}
	}



}

class Edge {
	int from;
	int to;
	int w;
}



