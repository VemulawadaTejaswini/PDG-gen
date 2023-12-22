import java.util.List;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;

public class Main {

	private class PriorityQueue<T> {
		
		private List<T> data;
		private int size;
		private Comparator<T> comparator;
		
		public PriorityQueue(int n, Comparator<T> comparator) {
			data = new ArrayList<>();
			data.add(null);
			size = 0;
			this.comparator = comparator;
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

		public T poll() {
			if (size == 0) return null;
			T max = data.get(1);
			T last = data.get(size);
			data.set(size, null);
			data.set(1, last);
			size--;
			topDown(1);
			return max;
		}
		
		public T peek() {
			if (size == 0) return null;
			return data.get(1);
		}
		
		private void topDown(int cur) {
			int l = cur * 2;
			int r = l + 1;
			int max = cur;
			if (l <= size && comparator.compare(data.get(max), data.get(l)) > 0) {
				max = l;
			}
			if (r <= size && comparator.compare(data.get(max), data.get(r)) > 0) {
				max = r;
			}
			if (max != cur) {
				swap(max, cur);
				topDown(max);
			}
		}

		private void bottomUp(int cur) {
			int p;
			if (cur % 2 == 0) {
				p = cur / 2;
			} else {
				p = (cur - 1) / 2;
			}
			if (p >= 1 && size >= 2 && comparator.compare(data.get(p), data.get(cur)) > 0) {
				swap(p, cur);
				bottomUp(p);
			}
		}

		private void swap(int i, int j) {
			T tmp = data.get(i);
			data.set(i, data.get(j));
			data.set(j, tmp);
		}
		
		private int size() {
			return size;
		}
		
		private boolean isEmpty() {
			return size() == 0;
		}
		
		public String toString() {
			StringBuilder sb = new StringBuilder();
			for (int i = 1; i <= size; i++) {
				sb.append(data.get(i).toString());
				if (i != size) sb.append(", ");
			}
			return sb.toString();
		}
	}
	
	private static final int INFINITY = 1 << 30;
	
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
			edges = new ArrayList<>();
		}

		@Override
		public int compareTo(Vertex obj) {
			return obj.dist - this.dist;
		}
		
		public String toString() {
			return String.format("id=%d,dist=%d,visited=%s", id, dist, visited==false?"false":"true");
		}
	}
	
	public static void main(String[] args) throws IOException {
		new Main().run();
	} 
	
	private void run() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		Vertex[] vtxs = new Vertex[n];
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(reader.readLine());
			int id = Integer.parseInt(st.nextToken());
			vtxs[i] = new Vertex(id);
			int k = Integer.parseInt(st.nextToken());
			for (int j = 0; j < k; j++) {
				id = Integer.parseInt(st.nextToken());
				int w = Integer.parseInt(st.nextToken());
				vtxs[i].edges.add(new Edge(id, w));
			}
		}
		reader.close();
		
		dijskstra(n, vtxs);
	}

	/*
	private void dijskstra(int n, Vertex[] vtxs) {
		
		vtxs[0].dist = 0;
		while (true) {
			int minv = INFINITY;
			int u = -1;
			for (int i = 0; i < n; i++) {
				if (vtxs[i].visited) continue;
				if (minv > vtxs[i].dist) {
					minv = vtxs[i].dist;
					u = i;
				}
			}
			if (u == -1) break;
			vtxs[u].visited = true;
			for (Edge edge : vtxs[u].edges) {
				if (vtxs[edge.id].visited) continue;
				if (vtxs[edge.id].dist > vtxs[u].dist + edge.weight) {
					vtxs[edge.id].dist = vtxs[u].dist + edge.weight;
				}
			}
		}

		for (int i = 0; i < n; i++) {
			System.out.println(vtxs[i].id + " " + vtxs[i].dist);
		}
	}
	*/
	
	private class VertexComparator implements Comparator<Vertex> {
		@Override
		public int compare(Vertex o1, Vertex o2) {
			return o1.dist - o2.dist;
		}
	}
	
	private void dijskstra(int n, Vertex[] vtxs) {

		vtxs[0].dist = 0;
		PriorityQueue<Vertex> pq = new PriorityQueue<>(10, new VertexComparator());
		pq.add(vtxs[0]);
		while (!pq.isEmpty()) {
			Vertex vtx = pq.poll();
			if (vtxs[vtx.id].visited) continue;
			vtxs[vtx.id].visited = true;
			for (Edge edge : vtxs[vtx.id].edges) {
				if (vtxs[edge.id].dist > vtxs[vtx.id].dist + edge.weight) {
					vtxs[edge.id].dist = vtxs[vtx.id].dist + edge.weight;
				}
				pq.add(vtxs[edge.id]);
			}
		}
		
		for (int i = 0; i < n; i++) {
			System.out.println(vtxs[i].id + " " + (vtxs[i]	.dist==INFINITY?-1:vtxs[i].dist));
		}
	}
}

