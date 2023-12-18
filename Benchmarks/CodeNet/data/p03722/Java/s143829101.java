import java.io.*;
import java.util.*;

class Edge implements Cloneable {
	int from;
	int to;
	long cost;

	public Edge(int from, int to, long cost) {
		this.from = from;
		this.to = to;
		this.cost = cost;
	}

	@Override
	public Edge clone() {
		Edge b = null;
		try {
			b = (Edge) super.clone();
			b.from = this.from;
			b.to = this.to;
			b.cost = this.cost;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return b;
	}
}

class Main {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int M = in.nextInt();
		List<Edge> es = new ArrayList<>(M);
		for (int i = 0; i < M; i++) {
			es.add(new Edge(0,0,0));
		}

		for (int i = 0; i < M; i++) {
			int ai = in.nextInt() - 1;
			int bi = in.nextInt() - 1;
			int ci = in.nextInt();
			es.set(i, new Edge(ai, bi, ci));
		}

		List<Edge> neg_es = new ArrayList<>();
		for(int i=0;i<es.size();i++) {
			neg_es.add(es.get(i).clone());
		}
		for (int i = 0; i < neg_es.size(); i++) {
			neg_es.get(i).cost *= -1;
		}
		List<Edge> neg_es_special = new ArrayList<>(es);
        for(int i=0;i<es.size();i++) {
			neg_es_special.add(es.get(i).clone());
		}
		for(int i = 0; i < neg_es_special.size();i++) {
			neg_es_special.get(i).cost -= (long)Math.pow(10, 9);
		}

		if (find_negative_loop(neg_es_special, N, M)) {
			System.out.println("inf");
			return;
		}

		long[] d = shortest_path(neg_es_special, 0, N, M);
		System.out.println(String.format("%d", d[N-1] + (long)((N-1)*Math.pow(10, 9))));
	}

	public static long[] shortest_path(List<Edge> es, int s, int V, int E) {
		long d[] = new long[V];
		long INF = Long.MAX_VALUE / 2;
		for(int i=0;i<V;i++) {
			d[i] = INF;
		}
		d[s] = 0;
		while(true) {
			boolean update = false;
			for(int i=0;i<E;i++) {
				Edge e = es.get(i);
				if (d[e.from] != INF && d[e.to] > d[e.from] + e.cost) {
					d[e.to] = d[e.from] + e.cost;
					update = true;
				}
			}
			if (!update) break;
		}
		return d;
	}

	public static boolean find_negative_loop(List<Edge> es, int V, int E) {
		long d[] = new long[es.size()];
		for(int i=0;i<V;i++) {
			for(int j=0;j<E;j++) {
				Edge e = es.get(j);
				if (d[e.to] > d[e.from] + e.cost) {
					d[e.to] = d[e.from] + e.cost;

					if(i == V - 1) return true;
				}
			}
		}
		return false;
	}
}