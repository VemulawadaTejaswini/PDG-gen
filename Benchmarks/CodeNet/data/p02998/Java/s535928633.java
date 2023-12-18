import java.util.*;

class Main {
	static int V = 100005;
	static boolean[] visited = new boolean[V*2];
	static ArrayList<ArrayList<Integer>> _to;
	static int[] cnt;
	static void dfs(int v) {
		if (visited[v]) {
			return;
		}
		visited[v]=true;
		cnt[v/V]++;
		for (Integer u: _to.get(v)) {
			dfs(u);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		_to = new ArrayList<ArrayList<Integer>>();
		for (int i=0;i<V*2;i++) {
			ArrayList<Integer> tmp = new ArrayList<Integer>();
			_to.add(tmp);
		}
		for (int i=0;i<N;i++) {
			int x=Integer.parseInt(sc.next());
			int y=Integer.parseInt(sc.next());
			y+=V;
			_to.get(x).add(y);
			_to.get(y).add(x);
		}
		long ans = 0L;
		for (int i=0;i<2*V;i++) {
			if (visited[i]) {
				continue;
			}
			cnt = new int[2];
			dfs(i);
			ans += (long)cnt[0]*cnt[1];
		}
		ans-=N;
		System.out.println(ans);
	}
}