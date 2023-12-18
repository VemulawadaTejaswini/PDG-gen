import java.util.*;
import java.io.*;

public class Main {
	static ArrayList<Path>[] graph;
	static int[][] matrix;
	public static void main (String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] first = br.readLine().split(" ", 3);
		int n = Integer.parseInt(first[0]);
		int m = Integer.parseInt(first[1]);
		int r = Integer.parseInt(first[2]);
		int[] rArr = new int[r];
		String[] rLine = br.readLine().split(" ", r);
		for (int i = 0; i < r; i++) {
			rArr[i] = Integer.parseInt(rLine[i]);
		}
		graph = new ArrayList[n + 1];
		for (int i = 1; i <= n; i++) {
			graph[i] = new ArrayList<Path>();
		}
		for (int i = 0; i < m; i++) {
			String[] line = br.readLine().split(" ", 3);
			int a = Integer.parseInt(line[0]);
			int b = Integer.parseInt(line[1]);
			int c = Integer.parseInt(line[2]);
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
