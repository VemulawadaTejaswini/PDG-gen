//--- pE ---//
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

	private void run_case() {
		int n = reader.ni();
		long m = reader.nl();
		long s = reader.nl();

		Map<Integer, Map<Integer, Cost>> adj = new HashMap<>();

		long inf = Long.MAX_VALUE;

		for (int i=0; i<m; i++) {
			int u = reader.ni();
			int v = reader.ni();
			long a = reader.nl();
			long b = reader.nl();
			Cost cst = new Cost(a, b);
			adj.putIfAbsent(u, new HashMap<>());
			adj.get(u).put(v, cst);
			adj.putIfAbsent(v, new HashMap<>());
			adj.get(v).put(u, cst);
		}

		long[] time_cost = new long[n+1];
		long[] change = new long[n+1];
		for (int i=1; i<=n; i++) {
			long c = reader.nl();
			long d = reader.nl();
			change[i] = c;
			time_cost[i] = d;
		}

		PriorityQueue<State> pq = new PriorityQueue<>(new ComparatorState());
		pq.offer(new State(1, (long)0, s));

		long[] res = new long[n+1];
		Arrays.fill(res, inf);
		int found_cnt = 0;

		long[] max_silver = new long[n+1];
		Arrays.fill(max_silver, -1);

		while (!pq.isEmpty()) {
			State cur = pq.poll();

			if (res[cur.node] == inf) found_cnt ++;
			res[cur.node] = Math.min(res[cur.node], cur.time);
			if (found_cnt == n) break;

			if (max_silver[cur.node] >= cur.silver) continue;
			max_silver[cur.node] = Math.max(max_silver[cur.node], cur.silver);

			List<Long> need = new ArrayList<>();

			if (adj.get(cur.node) != null) {
				for (int nx : adj.get(cur.node).keySet()) {
					Cost t = adj.get(cur.node).get(nx);
					if (cur.silver < t.coin) {
						// long left = t.coin - cur.silver;
						// long need_round = (long)Math.ceil(1.0 * left / change[cur.node]);
						// pq.offer(new State(cur.node, cur.time + time_cost[cur.node] * need_round, cur.silver + change[cur.node] * need_round));
					} else {
						pq.offer(new State(nx, cur.time + t.time, cur.silver - t.coin));
					}
				}
			}

			pq.offer(new State(cur.node, cur.time + time_cost[cur.node], cur.silver + change[cur.node]));
		}

		for (int i=2; i<=n; i++) out.println(res[i]);

		return;
	}

}
class Cost {
	public long time, coin;
	public Cost(long coin, long time) {
		this.time = time;
		this.coin = coin;
	}
}

class State {
	public int node;
	public long time, silver;
	public State(int node, long time, long silver) {
		this.node = node;
		this.time = time;
		this.silver = silver;
	}
}

class ComparatorState implements Comparator<State> {
	public int compare(State a, State b) {
		if (a.time == b.time) {
			if (a.silver < b.silver) {
				return 1;
			} else if (a.silver == b.silver) {
				return 0;
			} else {
				return -1;
			}
			// return b.silver - a.silver;
		}
		if (a.time > b.time) {
			return 1;
		} else if (a.time == b.time) {
			return 0;
		} else {
			return -1;
		}
		// return a.time - b.time;
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
