import java.util.*;

public class Main {
	static long[] distances;
	static ArrayList<Road>[] lists;
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		distances = new long[n];
		lists = new ArrayList[n];
		for (int i = 0; i < n; i++) {
			distances[i] = Long.MAX_VALUE;
			lists[i] = new ArrayList<Road>();
		}
		for (int i = 0; i < n - 1; i++) {
			int u = sc.nextInt();
			int v = sc.nextInt();
			int w = sc.nextInt();
			lists[u - 1].add(new Road(v - 1, w));
			lists[v - 1].add(new Road(u - 1, w));
		}
		int idx = 0;
		while (idx != -1) {
			search(idx, 0);
			idx = getNext();
		}
		StringBuilder sb = new StringBuilder();
		for (long x : distances) {
			if (x % 2 == 0) {
				sb.append(0);
			} else {
				sb.append(1);
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
	
	static int getNext() {
		for (int i = 0; i < distances.length; i++) {
			if (distances[i] == Long.MAX_VALUE) {
				return i;
			}
		}
		return -1;
	}
					
	static void search(int idx, long distance) {
		if (distances[idx] <= distance) {
			return;
		}
		distances[idx] = distance;
		for (Road r : lists[idx]) {
			search(r.dest, distance + r.weight);
		}
	}
	
	static class Road {
		int dest;
		int weight;
		
		public Road(int dest, int weight) {
			this.dest = dest;
			this.weight = weight;
		}
	}
}
