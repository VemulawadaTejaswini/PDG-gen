import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	private static final int INFINITY = 1 << 30;
	
	private class PriorityQueue<T extends Comparable<T>> {

		private List<T> data;
		int size;
		
		public PriorityQueue() {
			data = new ArrayList<>();
			data.add(null);
			size = 0;
		}
		
		public void add(T element) {
			if (element == null) return;
			size++;
			if (data.size() > size) {
				data.set(size, element);
			} else {
				data.add(element);
			}
			bottomUp(size);
		}
		
		private void bottomUp(int cur) {
			int p;
			if (cur % 2 == 0) {
				p = cur / 2;
			} else {
				p = (cur - 1) / 2;
			}
			if (p >= 1 && data.get(p).compareTo(data.get(cur)) < 0) {
				swap(p, cur);
				bottomUp(p);
			}
		}
		
		private void swap(int i, int j) {
			T tmp = data.get(i);
			data.set(i, data.get(j));
			data.set(j, tmp);
		}

		public T poll() {
			if (size == 0) return null;
			T max = data.get(1);
			T last = data.get(size);
			data.set(1, last);
			data.set(size, null);
			size--;
			topDown(1);
			return max;
		}
		
		private void topDown(int cur) {
			int l = cur * 2;
			int r = l + 1;
			int max = cur;
			if (l <= size && data.get(max).compareTo(data.get(l)) < 0) {
				max = l;
			}
			if (r <= size && data.get(max).compareTo(data.get(r)) < 0) {
				max = r;
			}
			if (max != cur) {
				swap(max, cur);
				topDown(max);
			}
		}

		public T peek() {
			if (size == 0) return null;
			return data.get(1);
		} 

		public int getSize() {
			return size;
		}
		
		public String toString() {
			return String.format("(%d)%s", getSize(), data);
		}

		public boolean empty() {
			return getSize() == 0;
		}
	}	
	
	private class Edge {
		int id;
		int weight;
		public Edge(int id, int weight) {
			this.id = id;
			this.weight = weight;
		}
	}
	
	private class Vertex implements Comparable<Vertex> {
		int id;
		int dist;
		boolean visited;
		List<Edge> edges;
		
		public Vertex(int id) {
			this.id = id;
			this.dist = INFINITY;
			this.visited = false;
			this.edges = new ArrayList<>();
		}
		
		@Override
		public int compareTo(Vertex o) {
			return o.dist - this.dist;
		}
	}
	
	public static void main(String[] args) throws IOException {
		new Main().run();
	}
	
	private void run() throws IOException {
		BufferedReader reader = new  BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		Vertex[] vtxs = new Vertex[n];
		for (int i = 0; i < n; i++) {
			vtxs[i] = new Vertex(i);
			StringTokenizer st = new StringTokenizer(reader.readLine());
			for (int j = 0; j < n; j++) {
				int w = Integer.parseInt(st.nextToken());
				if (w == -1) continue;
				vtxs[i].edges.add(new Edge(j, w));
			}
		}
		reader.close();
		
		int cost = prim(n, vtxs);
		
		System.out.println(cost);
	}

	private int prim(int n, Vertex[] vtxs) {
		
		vtxs[0].dist = 0;
		PriorityQueue<Vertex> pq = new PriorityQueue<>();
		pq.add(vtxs[0]);

		while (!pq.empty()) {
			Vertex vtx = pq.peek();
			pq.poll();
			if (vtxs[vtx.id].visited) continue;
			vtxs[vtx.id].visited = true;
			for (Edge edge : vtx.edges) {
				if (vtxs[edge.id].visited) continue;
				vtxs[edge.id].dist = Math.min(vtxs[edge.id].dist, edge.weight);
				pq.add(vtxs[edge.id]);
			}
		}
		
		int cost = 0;
		for (int i = 0; i < n; i++) {
			cost += vtxs[i].dist;
		}
		return cost;
	}
}

