import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/*
 * AtCoder Beginner Contest 087 D "People on a Line"
 *   https://abc087.contest.atcoder.jp/tasks/arc090_b/
 */
public class Main {

	public static void main(String[] args) {

		InputScanner in = new InputScanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

		int N = in.nextInt();
		int M = in.nextInt();

		Main main = new Main();
		Graph graph = main.new Graph();
		for (int i = 1; i <= N; i++) {
			graph.addVertex(i);
		}

		for (int i = 1; i <= M; i++) {
			int L = in.nextInt();
			int R = in.nextInt();
			int D = in.nextInt();
			graph.addEdge(R, L, D);
		}

		boolean ans = true;
		boolean[] isSearched = new boolean[N];
		Arrays.fill(isSearched, false);
		int[] dist = new int[N];
		Arrays.fill(dist, 0);

		for (int i = 1; i <= N; i++) {

			List<Integer> searchList = new ArrayList<Integer>();
			if (!isSearched[i - 1]) {
				searchList.add(i);
			}

			while (!searchList.isEmpty()) {

				int target = searchList.get(0);
				searchList.remove(0);
				isSearched[target - 1] = true;

				Vertex vertex = graph.map.get(target);
				for (Edge edge : vertex.edges) {

					if (isSearched[edge.vertex.id - 1]) {
						if (dist[edge.vertex.id - 1] != dist[target - 1] + edge.weight) {
							ans = false;
							break;
						}
					} else {
						dist[edge.vertex.id - 1] = dist[target - 1] + edge.weight;
						searchList.add(edge.vertex.id);
					}
				}

			}

		}

		if (ans) {
			out.println("Yes");
		} else {
			out.println("No");
		}


		in.close();
		out.close();
	}


	class Edge {

		int weight;
		Vertex vertex;

		public Edge(Vertex vertex, int weight) {
			this.vertex = vertex;
			this.weight = weight;
		}
	}

	class Vertex {

		int id;
		List<Edge> edges;

		public Vertex(int id) {
			this.id = id;
			this.edges = new ArrayList<Edge>();
		}

		public void addEdge(Vertex vertex, int weight) {
			edges.add(new Edge(vertex, weight));
		}

	}

	class Graph {

		int vertexNum;
		int edgeNum;
		Map<Integer, Vertex> map;

		public Graph() {
			this.vertexNum = 0;
			this.edgeNum = 0;
			this.map = new HashMap<Integer, Vertex>();
		}

		public void addVertex(int vertex) {

			if (!map.containsKey(vertex)) {
				map.put(vertex, new Vertex(vertex));
				vertexNum++;
			}

		}

		public void addEdge(int fromVertex, int toVertex, int weight) {

			if (!map.containsKey(fromVertex)) {
				map.put(fromVertex, new Vertex(fromVertex));
				vertexNum++;
			}
			if (!map.containsKey(toVertex)) {
				map.put(toVertex, new Vertex(toVertex));
				vertexNum++;
			}

			Vertex fromV = map.get(fromVertex);
			Vertex toV = map.get(toVertex);
			fromV.addEdge(toV, weight);
			toV.addEdge(fromV, - weight);
			edgeNum += 2;

		}

	}

	/*
	 * extends java.util.Scanner
	 */
	static class InputScanner {

		Scanner scanner;

		public InputScanner(InputStream inputStream) {
			this.scanner = new Scanner(inputStream);
		}

		public int nextInt() {
			return scanner.nextInt();
		}

		public long nextLong() {
			return scanner.nextLong();
		}

		public double nextDouble() {
			return scanner.nextDouble();
		}
		public String next() {
			return scanner.next();
		}

		public int[] nextIntArray(int n) {
			int[] ret = new int[n];
			for (int i = 0; i < n; i++) {
				ret[i] = scanner.nextInt();
			}
			return ret;
		}

		public int[][] nextIntArray(int h, int w) {
			int[][] ret = new int[h][w];
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					ret[i][j] = scanner.nextInt();
				}
			}
			return ret;
		}

		public long[] nextLongArray(int n) {
			long[] ret = new long[n];
			for (int i = 0; i < n; i++) {
				ret[i] = scanner.nextLong();
			}
			return ret;
		}

		public long[][] nextlongArray(int h, int w) {
			long[][] ret = new long[h][w];
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					ret[i][j] = scanner.nextLong();
				}
			}
			return ret;
		}

		public double[] nextDoubleArray(int n) {
			double[] ret = new double[n];
			for (int i = 0; i < n; i++) {
				ret[i] = scanner.nextDouble();
			}
			return ret;
		}

		public double[][] nextDoubleArray(int h, int w) {
			double[][] ret = new double[h][w];
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					ret[i][j] = scanner.nextLong();
				}
			}
			return ret;
		}

		public String[] nextStringArray(int n) {
			String[] ret = new String[n];
			for (int i = 0; i < n; i++) {
				ret[i] = scanner.next();
			}
			return ret;
		}

		public String[] nextStringArray(int n, String split) {
			String[] ret = scanner.next().split(split);
			return ret;
		}

		public String[][] nextStringArray(int h, int w) {
			String[][] ret = new String[h][w];
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					ret[i][j] = scanner.next();
				}
			}
			return ret;
		}

		public String[][] nextStringArray(int h, int w, String split) {
			String[][] ret = new String[h][w];
			for (int i = 0; i < h; i++) {
				ret[i] = scanner.next().split(split);
			}
			return ret;
		}

		public void close() {
			scanner.close();
		}

	}

}
