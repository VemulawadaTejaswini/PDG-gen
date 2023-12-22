import java.util.Scanner;

class Vertex {
	int state;
	int distance;
	static final int INF = 1000000000;
	Vertex() {
		state = 0;
		distance = INF;
	}
}
public class Main {
	static int N;
	static int W[][];
	static  Vertex vertex[];

	private static int min(int a, int b) {
		if (a < b)
			return a;
		return b;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();

		W = new int[N][N];
		vertex = new Vertex[N];

		for (int i = 0; i < N; i++) {
			vertex[i] = new Vertex();
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

		int p = 0; // 確定頂点番号を保存する変数
		for (int step = 0; step < N; step++) {
			int minimum = Vertex.INF;
			for (int x = 0; x < N; x++) {
				if (vertex[x].state == 0 && vertex[x].distance < minimum) {
					p = x;
					minimum = vertex[x].distance;
				}
			}
			vertex[p].state = 1;
			for (int x = 0; x < N; x++)
				vertex[x].distance = min(vertex[x].distance, vertex[p].distance + W[p][x]);
		}

	}
}

