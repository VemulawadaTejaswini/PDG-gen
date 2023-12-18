import java.util.*;

public class Main {
	static ArrayList<Path>[] graph;
	static int[][] matrix;
	public static void main (String[] args)  {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int r = sc.nextInt();
		int[] rArr = new int[r];
		for (int i = 0; i < r; i++) {
			rArr[i] = sc.nextInt();
		}
		graph = new ArrayList[n + 1];
		for (int i = 1; i <= n; i++) {
			graph[i] = new ArrayList<Path>();
		}
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			graph[a].add(new Path(b, c));
			graph[b].add(new Path(a, c));
		}
		matrix = new int[r][r];
		for (int i = 0; i < r; i++) {
			int x = rArr[i];
			int[] arr = new int[n + 1];
			arr[x] = Integer.MAX_VALUE;
			search(arr, new Path(x, 0), 1);
			for (int j = 0; j < r; j++) {
				matrix[i][j] = arr[rArr[j]] - 1;
			}
		}
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < r; i++) {
			boolean[] routes = new boolean[r];
			routes[i] = true;
			min = Math.min(min, getRoute(routes, i));
		}
		System.out.println(min);
	}
	
	
	static int getRoute(boolean[] arr, int from) {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (!arr[i]) {
				boolean[] routes = (boolean[])arr.clone();
				routes[i] = true;
				int base = matrix[i][from];
				base += getRoute(routes, i);
				min = Math.min(min, base);
			}
		}
		if (min == Integer.MAX_VALUE) {
			return 0;
		} else {
			return min;
		}
	}
	
	static void search(int[] cities, Path p, int total) {
		if (cities[p.to] != 0 && cities[p.to] <= total + p.cost) {
			return;
		}
		cities[p.to] = total + p.cost;
		for (Path x : graph[p.to]) {
			search(cities, x, cities[p.to]);
		}
	}
	
	static class Path {
		int to;
		int cost;
		
		public Path(int to, int cost) {
			this.to = to;
			this.cost = cost;
		}
	}
}
