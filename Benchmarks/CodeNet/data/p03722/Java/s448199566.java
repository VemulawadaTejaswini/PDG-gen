import java.util.*;

public class Main {
	static ArrayList<Path>[] graph;
	static long[] scores;
	static int n;
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int m = sc.nextInt();
		graph = new ArrayList[n + 1];
		scores = new long[n + 1];
		for (int i = 1; i <= n; i++) {
			graph[i] = new ArrayList<Path>();
			scores[i] = Long.MIN_VALUE;
		}
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			graph[a].add(new Path(b, c));
		}
		boolean flag = search(1, 0, 0);
		if (flag) {
			System.out.println(scores[n]);
		} else {
			System.out.println("inf");
		}
	}
	
	static boolean search(int idx, int count, long score) {
		if (count > n) {
			return false;
		}
		if (scores[idx] >= score) {
			return true;
		}
		scores[idx] = score;
		for (Path p : graph[idx]) {
			boolean flag = search(p.to, count + 1, score + p.score);
			if (!flag) {
				return false;
			}
		}
		return true;
	}
	
	static class Path {
		int to;
		int score;
		
		public Path(int to, int score) {
			this.to = to;
			this.score = score;
		}
	}
}
