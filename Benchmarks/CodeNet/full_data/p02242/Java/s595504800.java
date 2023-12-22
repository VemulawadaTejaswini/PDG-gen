import java.util.PriorityQueue;
import java.util.Scanner;

class Vertex implements Comparable<Vertex> {
	int no;
	int state;
	int distance;
	static final int INF = 1000000000;
	Vertex(int no) {
		this.no = no;
		state = 0;
		distance = INF;
	}
	@Override
	public int compareTo(Vertex o) {
		return Integer.compare(this.distance, o.distance); 
	}
}
public class Main {
	static int N;
	static int W[][];
	static  Vertex vertex[];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();

		W = new int[N][N];
		vertex = new Vertex[N];

		for (int i = 0; i < N; i++) {
			vertex[i] = new Vertex(i);
			for (int j = 0; j < N; j++) {
				W[i][j] = Vertex.INF;
			}
		}

		for (int i = 0; i < N; i++) {
			sc.nextInt(); // u を読み飛ばし
			int k = sc.nextInt();
			for (int j = 0; j < k; j++) {
				int v = sc.nextInt();
				int c = sc.nextInt();
				W[i][v] = c;
			}
		}
		dijkstra(0);
		for (int i = 0; i < N; i++) {
			System.out.println(i + " " + vertex[i].distance);
		}
	}

	private static void dijkstra(int start) {
		vertex[start].distance = 0;

		PriorityQueue<Vertex> que = new PriorityQueue<Vertex>();
		que.add(vertex[start]);
		for (int step = 0; step < N; step++) {
			Vertex p = que.poll(); // 確定頂点を保存する変数
			p.state = 1;
			for (int x = 0; x < N; x++) {
				if (vertex[x].distance > p.distance + W[p.no][x]) {
					vertex[x].distance = p.distance + W[p.no][x];
					que.add(vertex[x]);
				}
			}
		}

	}
}

