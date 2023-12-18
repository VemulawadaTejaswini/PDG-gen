import java.util.*;

// ABC 70-D
// https://beta.atcoder.jp/contests/abc070/tasks/abc070_d

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int N = in.nextInt();
		
		ArrayList<ArrayList<KPoint>> map = new ArrayList<ArrayList<KPoint>>();
		for (int i = 0; i < N; i++) {
			map.add(new ArrayList<KPoint>());
		}
		
		for (int i = 0; i < N - 1; i++) {
			int a = in.nextInt() - 1;
			int b = in.nextInt() - 1;
			int c = in.nextInt();

			map.get(a).add(new KPoint(b, c));
			map.get(b).add(new KPoint(a, c));
		}
		int Q = in.nextInt();
		int K = in.nextInt() - 1;

		long[] dist = new long[N];
		dfs(K, dist, 0, map);
		
		for (int i = 0; i < Q; i++) {
			int start = in.nextInt() - 1;
			int end = in.nextInt() - 1;
			System.out.println(dist[start] + dist[end]);
		}
	}
	
	public static void dfs(int curr, long[] dist, long d, ArrayList<ArrayList<KPoint>> map) {
		dist[curr] = d;
		for (int i = 0; i < map.get(curr).size(); i++) {
			for (int j = 0; j < map.get(curr).size(); j++) {
				dfs(j, dist, d + map.get(curr).get(j).dist, map);
			}
		}
	}
}

class KPoint {
	int p;
	int dist;
	
	public KPoint(int p, int dist) {
		this.p = p;
		this.dist = dist;
	}
}