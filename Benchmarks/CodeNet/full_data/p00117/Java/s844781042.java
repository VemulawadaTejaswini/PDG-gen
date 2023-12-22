import java.util.Scanner;

public class Main {
	static class Vertex {
		int number;
		int degree;
		Vertex neighbor[];
		Edge edge[];
		int cost;
		boolean mark;

		Vertex (int number, int n, int m) {
			this.number = number;
			this.degree = 0;
			neighbor = new Vertex[n];
			edge = new Edge[m];
			this.cost = Integer.MAX_VALUE;
			this.mark = false;
		}

		public void remake(Vertex v, Edge e) {
			neighbor[degree] = v;
			edge[degree] = e;
			this.degree++;
		}

		public String toString() {
			String s = "";
			for (int i = 0; i < degree; i++) {
				s += (neighbor[i].number + 1) + " ";
				if (edge[i].v1 == this) {
					s += edge[i].costFromV1 + " ";
				} else {
					s += edge[i].costFromV2 + " ";
				}
			}
			return s;
		}
	}

	static class Edge {
		int number;
		Vertex v1, v2;
		int costFromV1;
		int costFromV2;

		Edge (int number, Vertex v1, Vertex v2, int costFromV1, int costFromV2) {
			this.number = number;
			this.v1 = v1;
			this.v2 = v2;
			this.costFromV1 = costFromV1;
			this.costFromV2 = costFromV2;
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n, m;
		Vertex vertex[];
		Edge edge[];

		n = sc.nextInt();
		m = sc.nextInt();
		vertex = new Vertex[n];
		edge = new Edge[m];
		for (int i = 0; i < n; i++) {
			vertex[i] = new Vertex(i, n, m);
		}
		for (int i = 0; i < m; i++) {
			String s[] = sc.next().split(",");
			int a = Integer.valueOf(s[0]) - 1;
			int b = Integer.valueOf(s[1]) - 1;
			int c = Integer.valueOf(s[2]);
			int d = Integer.valueOf(s[3]);
			edge[i] = new Edge(i, vertex[a], vertex[b], c, d);
			vertex[a].remake(vertex[b], edge[i]);
			vertex[b].remake(vertex[a], edge[i]);
		}
		String s[] = sc.next().split(",");
		int a = Integer.valueOf(s[0]) - 1;
		int b = Integer.valueOf(s[1]) - 1;
		int c = Integer.valueOf(s[2]);
		int d = Integer.valueOf(s[3]);
		int total = c;
		total -= minimumWay(vertex, edge, a, b);
		for (int i = 0; i < n; i++) {
			vertex[i].cost = Integer.MAX_VALUE;
			vertex[i].mark = false;
		}
		total -= d;
		total -= minimumWay(vertex, edge, b, a);
		System.out.println(total);
	}

	public static int minimumWay(Vertex v[], Edge e[], int start, int goal) {
		int n = v.length;
		int index = start;
		int minIndex;

		v[start].cost = 0;
		while (!v[goal].mark) {
			v[index].mark = true;
			for (int i = 0; i < v[index].degree; i++) {
				Vertex v1 = v[index].neighbor[i];
				Edge e1 = v[index].edge[i];
				if (!v1.mark) {
					if (e1.v1 == v[index]) {
						if (v[index].cost + e1.costFromV1 < v1.cost) {
							v1.cost = v[index].cost + e1.costFromV1;
						}
					} else {
						if (v[index].cost + e1.costFromV2 < v1.cost) {
							v1.cost = v[index].cost + e1.costFromV2;
						}
					}
				}
			}
			minIndex = -1;
			for (int i = 0; i < n; i++) {
				if (!v[i].mark && (minIndex == -1 || v[i].cost < v[minIndex].cost)) {
					minIndex = i;
				}
			}
			index = minIndex;
		}
		return v[goal].cost;
	}
}