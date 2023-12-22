import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	int t;
	Set<D> block, point;
	int[] dx = {-1, 0, 0, 1, 1, -1};
	int[] dy = {0, -1, 1, 0, 1, -1};
	Queue<D> queue = new LinkedList<D>();

	class D implements Comparable<D>{
		int x, y, k;

		D(int x, int y, int k) {
			this.x = x;
			this.y = y;
			this.k = k;
		}

		public int compareTo(D o) {
			if (this.x != o.x) {
				return this.x - o.x;
			}
			return this.y - o.y;
		}

		public String toString() {
			return "(" + x + ", " + y + ")";
		}
	}
	
	

	void bfs(int x, int y, int k) {
		if (t < k) {
			return;
		}
		D d = new D(x, y, k);
		if (point.contains(d)) {
			return ;
		}
		if (block.contains(d)) {
			return;
		}
		point.add(d);

		for (int i = 0; i < 6; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			queue.add(new D(nx, ny, k + 1));
		}

		while (!queue.isEmpty()) {
			D nd = queue.poll();
			bfs(nd.x, nd.y, nd.k);
		}
	}

	void run() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			t = sc.nextInt();
			int n = sc.nextInt();
			if ((t | n) == 0) {
				break;
			}
			block = new TreeSet<D>();
			point = new TreeSet<D>();
			for (int i = 0; i < n; i++) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				block.add(new D(x, y, 0));
			}
			int ax = sc.nextInt();
			int ay = sc.nextInt();

			bfs(ax, ay, 0);
			System.out.println(point.size());
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}