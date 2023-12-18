import java.util.*;

class Main {
	Scanner sc;
	int N, M;
	List<Integer>[] to;
	int[] marker;

	public Main() {
		sc = new Scanner(System.in);
	}
	
	@SuppressWarnings("unchecked")
	private void calc() {
		N = sc.nextInt();
		M = sc.nextInt();
		to = new ArrayList[N];
		for (int i = 0; i < N; i++) to[i] = new ArrayList<>();
		for (int i = 0; i < M; i++) {
			int a = sc.nextInt() - 1;
			to[a].add(sc.nextInt()-1);
		}
		marker = new int[N];
		
		Deque<Integer> ans = null;
		for (int s = 0; s < N; s++) {
			if (marker[s] == 2) continue;
			Deque<Integer> b = dfs(s);
			if (b == null) continue;
			ans = b;
			break;
		}
		if (ans == null) {
			System.out.println(-1);
			return;
		}
		
		int s = ans.size();
		while ( (ans = shrink(ans)).size() < s ) { s = ans.size(); }
		
		System.out.println(s);
		for (int v : ans) System.out.println(v+1);
	}
	
	private Deque<Integer> dfs(int sv) {
		Deque<Integer> track = new ArrayDeque<>();
		Deque<Integer> q = new ArrayDeque<>();
		q.push(sv);
		
		while (!q.isEmpty()) {
			int v = q.peek();
			marker[v] = 1;
			track.addLast(v);
			boolean stop = true;
			for (int next : to[v]) {
				if (marker[next] == 1) {
					int nv;
					while ( (nv = track.getFirst()) != next) {
						marker[nv] = 3;
						track.removeFirst();
					}
					return track;
				}
				if (marker[next] == 2) continue;
				stop = false;
				q.push(next);
			}
			if (stop) {
				q.pop();
				marker[v] = 2;
				int r = track.removeLast();
			}
		}
		return null;
	}
	
	private Deque<Integer> shrink(Deque<Integer> track) {
		int prev = track.getLast();
		int ev = -1;
	lp:
		for (int now : track) {
			for (int n : to[prev]) {
				if (marker[n] != 1 || n == now) continue;
				ev = n;
				break lp;
			}
			prev = now;
		}
		if (ev == -1) return track;
		for (int i = 0; i < N; i++) marker[i] = 4;
		Iterator<Integer> it = track.iterator();
		int v;
		while (true) {
			v = it.next();
			if (v == ev) break;
		}
		Deque<Integer> ans = new ArrayDeque<>();
		while (v != prev) {
			marker[v] = 1;
			ans.addLast(v);
			if (!it.hasNext()) it = track.iterator();
			v = it.next();
		}
		marker[v] = 1;
		ans.addLast(v);
		return ans;
	}
	
	public static void main(String[] args) {
		new Main().calc();
	}
}
