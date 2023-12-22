import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	Scanner sc = new Scanner(System.in);
	int INF = 1 << 28;
	double EPS = 1e-10;

	public static void main(String[] args) {
		new Main().run();
	}

	int w, h;
	char s[][];

	void run() {
		while (true) {
			w = sc.nextInt();
			h = sc.nextInt();
			if ((w | h) == 0)
				break;
			s = new char[h][w];
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					s[i][j] = sc.next().charAt(0);
				}
			}
			int ans = INF;

			int dx[][] = new int[2][9];
			int dy[][] = new int[2][9];
			dx[0] = new int[] { 1, 1, 2, 1, 2, 3, 1, 2, 1 };
			dy[0] = new int[] { -2, -1, -1, 0, 0, 0, 1, 1, 2 };
			dx[1] = new int[] { -1, -1, -2, -1, -2, -3, -1, -2, -1 };
			dy[1] = new int[] { -2, -1, -1, 0, 0, 0, 1, 1, 2 };
			for (int k = 0; k < w; k++) {
				if (s[h - 1][k] == 'S') {
					Queue<Node> q = new PriorityQueue<Node>(w * h * 2,
							new Comparator<Node>() {
								@Override
								public int compare(Node o1, Node o2) {
									// TODO 自動生成されたメソッド・スタブ
									return o1.t - o2.t;
								}
							});
					int d[][][] = new int[2][w][h];
					for (int i = 0; i < 2; i++) {
						for (int j = 0; j < w; j++) {
							Arrays.fill(d[i][j], INF);
						}
					}
					d[0][k][h - 1] = 0;
					d[1][k][h - 1] = 0;
					q.add(new Node(k, h - 1, 0, 0));
					q.add(new Node(k, h - 1, 1, 0));
					while (!q.isEmpty()) {
						Node n = q.poll();
						int x = n.x;
						int y = n.y;
						int t = n.t;
						int leg = n.leg;
						if (d[leg][x][y] < t)
							continue;
						for (int i = 0; i < 9; i++) {
							int nx = x + dx[leg][i];
							int ny = y + dy[leg][i];
							if (nx < 0 || ny < 0 || nx >= w || ny >= h
									|| s[ny][nx] == 'X')
								continue;
							int nt = 0;
							if (s[ny][nx] >= '1' && s[ny][nx] <= '9') {
								nt = s[ny][nx] - '0';
							}
							if (d[leg ^ 1][nx][ny] > d[leg][x][y] + nt) {
								d[leg ^ 1][nx][ny] = d[leg][x][y] + nt;
								q.add(new Node(nx, ny, leg ^ 1, nt));
							}
						}
					}
					for (int i = 0; i < w; i++) {
						if (s[0][i] == 'T')
							for (int j = 0; j < 2; j++) {
								ans = Math.min(ans, d[j][i][0]);
							}
					}
				}
			}
			System.out.println(ans != INF ? ans : -1);
		}
	}
}

class Node {
	int x;
	int y;
	int leg;
	int t;

	Node(int x, int y, int leg, int t) {
		this.x = x;
		this.y = y;
		this.leg = leg;
		this.t = t;
	}
}