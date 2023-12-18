
import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	static class Edge {
		int src, dst;
		int used = 0;

		Edge(int src, int dst) {
			this.src = src;
			this.dst = dst;
		}
	}

	int N, M, S, T;
	long result = Long.MAX_VALUE;
	boolean enable = false;

	Set[] dists;
	Map<Integer, List<Edge>> edges;

	Main(int N, int M, List<String> lines, int S, int T) {
		this.N = N;
		this.M = M;
		this.S = S - 1;
		this.T = T - 1;
		this.dists = new Set[N];
		this.edges = new HashMap<>();
		for (int i = 0; i < N; ++i) {
			this.dists[i] = new HashSet();
			this.edges.put(i, new ArrayList<>());
		}
		for (int i = 0; i < M; ++i) {
			String[] tokens = lines.get(i).split(" ");
			int src = Integer.parseInt(tokens[0]) - 1;
			int dst = Integer.parseInt(tokens[1]) - 1;
			Edge edge = new Edge(src, dst);
			this.edges.get(src).add(edge);
		}
		this.dists[this.S].add(0);

		calcDist(this.S);
		calcResult();
		showResult();
	}

	void calcDist(int src) {
		Edge[] edges = this.edges.get(src).stream().filter(x -> x.used < 2).toArray(Edge[]::new);
		if (edges.length == 0) {
			return;
		}
		for (Edge edge : edges) {
			edge.used++;
			for (Integer dist : (Set<Integer>) this.dists[src]) {
				this.dists[edge.dst].add(dist + 1);
			}
		}
		for (Edge edge : edges) {
			calcDist(edge.dst);
		}
	}

	void calcResult() {
		List<Integer> dist = new ArrayList<>();
		dist.addAll(this.dists[T]);
		Collections.sort(dist);
		for (Integer d : dist) {
			if (d % 3 == 0) {
				this.result = Math.min(d / 3, this.result);
				this.enable = true;
			}
		}
		if (this.enable) {
			return;
		}
		int c = check(dist.get(0), dist.get(1));
		if(c>=0) {
			this.result = Math.min(this.result, c);
			this.enable = true;
		}
	}

	int check(int small, int large) {
		if ((large - small) % 3 == 0) {
			return -1;
		}
		int result = small;
		result += (large - small) / 3 + 1;
		return result;
	}

	void showResult() {
		if (!this.enable) {
			System.out.println("-1");
		} else {
			System.out.println(result);
		}
	}

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		String[] tokens = in.readLine().split(" ");
		int N = Integer.parseInt(tokens[0]);
		int M = Integer.parseInt(tokens[1]);
		List<String> lines = new ArrayList<>(M);
		for (int i = 0; i < M; ++i) {
			lines.add(in.readLine());
		}
		tokens = in.readLine().split(" ");
		int S = Integer.parseInt(tokens[0]);
		int T = Integer.parseInt(tokens[1]);

		Main ins = new Main(N, M, lines, S, T);

		in.close();
	}
}