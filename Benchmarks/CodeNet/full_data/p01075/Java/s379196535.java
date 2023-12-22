import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N = sc.nextInt();
		int M = sc.nextInt();
		ArrayList<ArrayList<Edge>> g = new ArrayList<>();
		ArrayList<Edge> rev = new ArrayList<>();
		for (int i = 0; i < N; ++i) {
			g.add(new ArrayList<>());
		}
		for (int i = 0; i < M; ++i) {
			int A = Integer.parseInt(sc.next()) - 1;
			int B = Integer.parseInt(sc.next()) - 1;
			int C = Integer.parseInt(sc.next());
			g.get(A).add(new Edge(B, C));
			if (B == N - 1) rev.add(new Edge(A, C));
		}
		PriorityQueue<State> q = new PriorityQueue<>();
		q.add(new State(0, 0));
		int[] time = new int[N];
		Arrays.fill(time, 2_000_000_000);
		boolean[] visited = new boolean[N];
		visited[N - 1] = true;
		time[0] = 0;
		while (!q.isEmpty()) {
			State st = q.poll();
			if (visited[st.pos]) continue;
			visited[st.pos] = true;
			for (Edge e : g.get(st.pos)) {
				if (e.time < st.time) continue;
				if (time[e.next] <= e.time) continue;
				time[e.next] = e.time;
				q.add(new State(e.time, e.next));
			}
		}
		int ans = -1;
		for (Edge e : rev) {
			if (time[e.next] <= e.time) {
				ans = Math.max(ans, e.time);
			}
		}
		System.out.println(ans);
	}

	static class State implements Comparable<State> {
		int time, pos;

		public State(int time, int pos) {
			this.time = time;
			this.pos = pos;
		}

		public int compareTo(State o) {
			return Integer.compare(time, o.time);
		}
	}

	static class Edge {
		int next, time;

		public Edge(int next, int time) {
			this.next = next;
			this.time = time;
		}
	}

}