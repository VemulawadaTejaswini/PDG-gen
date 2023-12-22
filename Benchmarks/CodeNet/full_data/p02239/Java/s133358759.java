import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static int n;
	static int[][]M;	// 隣接行列
	static int[]d;
	static final int INF = 10000000;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		M = new int[n][n];
		d = new int[n];
		for(int i = 0; i < n; i++) {
			int u = scan.nextInt() - 1;
			int k = scan.nextInt();
			for(int j = 0; j < k; j++) {
				M[u][scan.nextInt() - 1] = 1;
			}
		}
		scan.close();
		bfs(0);
	}
	static void bfs(int s) {
		Queue<Integer> queue = new ArrayDeque<Integer>();
		queue.add(s);
		Arrays.fill(d, INF);
		d[s] = 0;
		while(!queue.isEmpty()) {
			int u = queue.poll();
			for(int v = 0; v < n; v++) {
				if(M[u][v] == 0) continue;
				if(d[v] != INF) continue;
				d[v] = d[u] + 1;
				queue.add(v);
			}
		}
		for(int i = 0; i < n; i++) {
			int u = i + 1;
			int l;
			if(d[i] == INF) l = -1;
			else l = d[i];
			System.out.println(u + " " + l);
		}
	}
}
