//--- pD ---//
import java.util.*;
import java.lang.*;
import java.io.*;
public class Main {
	public static void main (String[] args) throws java.lang.Exception {
		new Solution();
	}
}
class Solution {
	Reader reader;
	PrintWriter out;
	public Solution() {
		reader = new Reader();
		out = new PrintWriter(System.out);
		while (reader.hasNext()) {
			run_case();
		}
		out.flush();
	}

	Map<Integer, Set<Integer>> adj;
	private void run_case() {
		int n = reader.ni();
		int m = reader.ni();
		adj = new HashMap<>();
		for (int i=0; i<m; i++) {
			int a = reader.ni();
			int b = reader.ni();
			adj.putIfAbsent(a, new HashSet<>());
			adj.putIfAbsent(b, new HashSet<>());
			adj.get(a).add(b);
			adj.get(b).add(a);
		}

		Integer[] vis = new Integer[n+5];

		Queue<State> q = new LinkedList<>();
		q.offer(new State(1, -1));
		while (!q.isEmpty()) {
			State cur = q.poll();
			if (vis[cur.idx] != null) continue;
			vis[cur.idx] = cur.pv;
			if (adj.containsKey(cur.idx)) {
				for (int nx : adj.get(cur.idx)) {
					if (vis[nx] != null) continue;
					q.offer(new State(nx, cur.idx));
				}
			}
		}

		boolean ok = true;
		for (int i=1; i<=n; i++) {
			if (vis[i] == null) ok = false;
		}

		if (ok) {
			out.println("Yes");
			for (int i=2; i<=n; i++) out.println(vis[i]);
		} else {
			out.println("No");
		}

		return;

	}
}

class State {
	public int idx, pv;
	public State(int idx, int pv) {
		this.idx = idx;
		this.pv = pv;
	}
}

class Reader {
	BufferedReader br;
	StringTokenizer st;
	public Reader(){
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			st = new StringTokenizer(br.readLine());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public String next() {
		if (st.hasMoreTokens()) return st.nextToken();
		try {
			st = new StringTokenizer(br.readLine());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return st.nextToken();
	}
	public boolean hasNext() {
		try {
			if (!st.hasMoreTokens() && !br.ready()) return false;
			else return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	public int ni() {return Integer.parseInt(this.next());}
	public long nl() {return Long.parseLong(this.next());}
	public String ns() {return this.next();}
}
