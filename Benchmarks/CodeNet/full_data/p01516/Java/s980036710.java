import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int l = sc.nextInt();
			if (n == 0) {
				break;
			}
			Vector2[][] p = new Vector2[n*5][2];
			for(int i=0;i<n;i++) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				int a = sc.nextInt();
				int r = sc.nextInt();
				Vector2[] q = new Vector2[5];
				for(int j=0;j<5;j++) {
					double rad = Math.toRadians(90 + a + j * 72);
					q[j] = new Vector2(x + Math.cos(rad) * r, y + Math.sin(rad) * r);
//					System.out.println(q[j]);
				}
				for(int j=0;j<5;j++) {
					p[i*5+j][0] = q[j];
					p[i*5+j][1] = q[(j+2)%5];
				}
			}
			Graph g = new Graph(n*5);
			for(int i=0;i<n*5;i++) {
				for(int j=i+1;j<n*5;j++) {
					g.addBidirectionalEdge(i, j, Vector2.distLineToLine(p[i][0], p[i][1], p[j][0], p[j][1]));
				}
			}
			double dist = g.minDistDijkstra((m-1)*5)[(l-1)*5];
			System.out.println(String.format("%.8f", dist));
		}
	}

}
class Vector2 {
	public double x;
	public double y;
	public Vector2(double x,double y) {
		this.x = x;
		this.y = y;
	}
	public double dot(Vector2 v) {
		return this.x*v.x+this.y*v.y;
	}
	public double cross(Vector2 v) {
		return this.x*v.y-this.y*v.x;
	}
	public double norm() {
		return Math.sqrt(this.x*this.x+this.y*this.y);
	}
	public Vector2 normalize() {
		return divide(norm());
	}
	public Vector2 add(Vector2 v) {
		return new Vector2(x+v.x,y+v.y);
	}
	public Vector2 subtract(Vector2 v) {
		return new Vector2(x-v.x,y-v.y);
	}
	public Vector2 multiply(double k) {
		return new Vector2(x*k,y*k);
	}
	public Vector2 divide(double k) {
		return new Vector2(x/k,y/k);
	}
	public double dist(Vector2 p1) {
		return p1.subtract(this).norm();
	}
	public static double distLineToLine(Vector2 p0,Vector2 p1,Vector2 p2,Vector2 p3) {
		if (intersects(p0, p1, p2, p3)) {
			return 0;
		}
		double dist = Double.POSITIVE_INFINITY;
		dist = Math.min(dist, distLineToPoint(p0, p1, p2));
		dist = Math.min(dist, distLineToPoint(p0, p1, p3));
		dist = Math.min(dist, distLineToPoint(p2, p3, p0));
		dist = Math.min(dist, distLineToPoint(p2, p3, p1));
		return dist;
	}
	public static boolean intersects(Vector2 p0,Vector2 p1,Vector2 p2,Vector2 p3) {
		Vector2 v1 = p1.subtract(p0);
		Vector2 v2 = p3.subtract(p2);
		Vector2 v = p2.subtract(p0);
		Vector2 v_ = p2.subtract(p1);
		double a = v1.cross(v2);
		if(a==0) {
			return v.cross(v_) == 0 && (v.dot(v_) <= 0 || p0.subtract(p2).dot(p0.subtract(p3)) <= 0);
		}else{
			double a1 = -v1.cross(v);
			double a2 = -v2.cross(v);
			if (a>0) {
				return (0<=a1&&a1<=a&&0<=a2&&a2<=a);
			}else{
				return (a<=a1&&a1<=0&&a<=a2&&a2<=0);
			}
		}
	}
	public static double distLineToPoint(Vector2 r1,Vector2 r2,Vector2 p) {
		Vector2 r12 = r2.subtract(r1);
		if (p.subtract(r1).dot(r12) * p.subtract(r2).dot(r12) >= 0) {
			return Math.min(p.dist(r1), p.dist(r2));
		}else{
			return Math.abs(r2.subtract(r1).normalize().cross(p.subtract(r1)));
		}
	}
	public String toString() {
		return "(" + this.x + "," + this.y + ")";
	}
}
class Graph {
	public static final int INF = 1<<29;
	int n;
	ArrayList<Edge>[] graph;

	@SuppressWarnings("unchecked")
	public Graph(int n) {
		this.n = n;
		this.graph = new ArrayList[n];
		for(int i=0;i<n;i++) {
			graph[i] = new ArrayList<Edge>();
		}
	}
	
	public void addBidirectionalEdge(int from,int to,double cost) {
//		System.out.println(from + "," + to + "," + cost);
		addEdge(from,to,cost);
		addEdge(to,from,cost);
	}
	public void addEdge(int from,int to,double cost) {
		graph[from].add(new Edge(to, cost));
	}

	//dijkstra O(ElogV)
	public double[] minDistDijkstra(int s) {
		double[] dist = new double[n];
		Arrays.fill(dist, INF);
		dist[s] = 0;
		PriorityQueue<Node> q = new PriorityQueue<Node>();
		q.offer(new Node(0, s));
		while(!q.isEmpty()) {
			Node node = q.poll();
			int v = node.id;
			if (dist[v] < node.dist) {
				continue;
			}
			for(Edge e:graph[v]) {
				if (dist[e.to] > dist[v] + e.cost) {
					dist[e.to] = dist[v] + e.cost;
					q.add(new Node(dist[e.to], e.to));
				}
			}
		}
		return dist;
	}

	class Edge {
		int to;
		double cost;
		public Edge(int to,double cost) {
			this.to = to;
			this.cost = cost;
		}
	}
	class Node implements Comparable<Node>{
		double dist;
		int id;
		public Node(double dist,int i) {
			this.dist = dist;
			this.id = i;
		}
		public int compareTo(Node o) {
			return (this.dist < o.dist) ? -1 : ((this.dist == o.dist) ? 0 : 1);
		}
	}
}