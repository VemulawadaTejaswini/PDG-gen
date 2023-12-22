import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	Scanner sc = new Scanner(System.in);

	int INF = 1 << 28;
	double EPS = 1e-9;

	int n;
	int start, goal, ttl;
	LinkedList<Integer>[] graph;

	@SuppressWarnings("unchecked")
	void run() {
		n = sc.nextInt();
		graph = new LinkedList[n];
		for (int j = 0; j < n; j++) {
			int u = sc.nextInt() - 1;// [^Ô
			int m = sc.nextInt();
			graph[u] = new LinkedList<Integer>();
			for (int i = 0; i < m; i++) {
				int v = sc.nextInt() - 1;
				graph[u].add(v);
			}
		}
		int p = sc.nextInt();
		for (int i = 0; i < p; i++) {
			start = sc.nextInt() - 1;
			goal = sc.nextInt() - 1;
			ttl = sc.nextInt();
			solve();
		}
	}

	void solve() {
		LinkedList<Integer> que = new LinkedList<Integer>();
		boolean[] visited = new boolean[n];
		int[] d = new int[n];
		que.offer(start);
		d[start] = 1;
		visited[start] = true;
		for (; !que.isEmpty();) {
			int u = que.poll();
			for (int v : graph[u]) {
				if (!visited[v]) {
					que.offer(v);
					d[v] = d[u] + 1;
					visited[v] = true;
				}
			}
		}
		if (d[goal] <= ttl) {
			println("" + d[goal]);
		} else {
			println("NA");
		}
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	void print(String s) {
		System.out.print(s);
	}

	void println(String s) {
		System.out.println(s);
	}

	public static void main(String[] args) {
		// System.setOut(new PrintStream(new BufferedOutputStream(System.out)));
		new Main().run();
	}
}