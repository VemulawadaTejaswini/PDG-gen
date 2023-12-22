import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

	private static final int INFINITY = 1 << 30;

	class PriorityQueue<T> {
		
		List<T> data;
		Comparator<T> comparator;
		int size;
		
		public PriorityQueue(int initialCapacity, Comparator<T> comparator) {
			data = new ArrayList<>(initialCapacity);
			data.add(null);
			size = 0;
			this.comparator = comparator;
		}
		
		public void push(T element) {
			size++;
			int dataSize = data.size();
			if (dataSize > size) {
				data.set(size, element);
			} else {
				data.add(element);
			}
			bottomUp(size);
		}

		private void bottomUp(int cur) {
			
			if (cur == 1) return;
			
			int p;
			if (cur % 2 == 0) {
				p = cur / 2;
			} else {
				p = (cur - 1) / 2;
			}
			if (p >= 1 && comparator.compare(data.get(cur), data.get(p)) > 0) {
				swap(cur, p);
				bottomUp(p);
			}
		}

		private void swap(int i, int j) {
			T tmp = data.get(i);
			data.set(i, data.get(j));
			data.set(j, tmp);
		}

		public T poll() {
			if (isEmpty()) return null;
			T top = data.get(1);
			T last = data.get(size);
			data.set(1, last);
			data.set(size, null);
			size--;
			topDown(1);
			return top;
		}
		
		private void topDown(int cur) {
			int l = cur * 2;
			int r = l + 1;
			int max = cur;
			if (l <= size && comparator.compare(data.get(max), data.get(l)) < 0) {
				max = l;
			}
			if (r <= size && comparator.compare(data.get(max), data.get(r)) < 0) {
				max = r;
			}
			if (max != cur) {
				swap(max, cur);
				topDown(max);
			}
		}

		public T peek() {
			if (isEmpty()) return null;		
			return data.get(1);
		}
		
		public boolean isEmpty() {
			return size() == 0;
		}

		private int size() {
			return size;
		}
		
		public String toString() {
			StringBuilder sb = new StringBuilder();
			sb.append("[");
			for (int i = 1; i <= size; i++) {
				sb.append(data.get(i));
				if (i != size) {
					sb.append(", ");
				}
			}
			sb.append("]");
			return sb.toString();
		}
	}
	
	class Vertex {
		
		int id;
		int dist;
		boolean visited;
		List<Edge> edges;
		
		public Vertex(int id) {
			this.id = id;
			dist = INFINITY;
			visited = false;
			edges = new ArrayList<>();
		}
		
		public String toString() {
			return String.format("%d", dist);
		}
	}
	
	class Edge {
		int id;
		int cost;
		
		public Edge(int id, int cost) {
			this.id = id;
			this.cost = cost;
		}
	}
	
	class VertexComparator implements Comparator<Vertex> {
		@Override
		public int compare(Vertex o1, Vertex o2) {
			return o2.dist - o1.dist;
		}
	}
	
	public static void main(String[] args) throws IOException {
		new Main().run();
	}
	
	private void run() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		Vertex[] vertices = new Vertex[n];
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(reader.readLine());
			int id = Integer.parseInt(st.nextToken());
			vertices[i] = new Vertex(id);
			int k = Integer.parseInt(st.nextToken());
			for (int j = 0; j < k; j++) {
				int v = Integer.parseInt(st.nextToken());
				int c = Integer.parseInt(st.nextToken());
				vertices[i].edges.add(new Edge(v, c));
			}
		}
		reader.close();
		
		dijskstra(n, vertices);
	}

	private void dijskstra(int n, Vertex[] vertices) {
		
		vertices[0].dist = 0;
		PriorityQueue<Vertex> pq = new PriorityQueue<>(5, new VertexComparator());
		pq.push(vertices[0]);
		
		while(!pq.isEmpty()) {
			//System.out.println(pq);
			Vertex vtx = pq.poll();
			if (vtx.visited) continue;
			vtx.visited = true;
			for (Edge edge : vtx.edges) {
				vertices[edge.id].dist = Math.min(vertices[edge.id].dist, vtx.dist + edge.cost);
				pq.push(vertices[edge.id]);
			}
		}
		
		for (int i = 0; i < n; i++) {
			System.out.println(vertices[i].id + " " + vertices[i].dist);
		}
	}
}
