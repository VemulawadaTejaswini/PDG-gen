import java.util.Scanner;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		List<List<Edge>> edge = new ArrayList<>();
		for (int i = 0;i < N;++ i) edge.add(new ArrayList<>());
		for (int i = 1;i < N;++ i) {
			int u = sc.nextInt() - 1, v = sc.nextInt() - 1, w = sc.nextInt();
			edge.get(u).add(new Edge(v, w));
			edge.get(v).add(new Edge(u, w));
		}
		int[] color = new int[N];
		Arrays.fill(color, -1);
		color[0] = 0;
		Queue<Integer> queue = new ArrayDeque<>();
		queue.add(0);
		while (!queue.isEmpty()) {
			int tmp = queue.poll();
			for (Edge i : edge.get(tmp)) {
				if (color[i.edge] >= 0) continue;
				color[i.edge] = color[tmp] ^ (i.weight & 1);
				queue.add(i.edge);
			}
		}
		for (int i = 0;i < N;++ i) System.out.println(color[i]);
	}
	public static class Edge {
		int edge;
		int weight;
		public Edge(int edge, int weight) {
			this.edge = edge;
			this.weight = weight;
		}
	}
}