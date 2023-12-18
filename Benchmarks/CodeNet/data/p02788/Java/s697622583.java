import java.util.*;
import java.lang.*;
import java.io.*;

public class F {
	public static void main (String[] args) throws java.lang.Exception {
		new Solution();
	}
}
class Solution {
	Reader reader;
	public Solution() {
		reader = new Reader();
		while (reader.hasNext()) {
			run_case();
		}
	}

	Map<Integer, Set<Integer>> adj;
	// Set<Integer> vis;
	int[] color;
	boolean[] vis;
	int[] resArr;
	private void run_case() {
		int n = reader.ni();
		color = new int[n];
		for (int i=0; i<n; i++) color[i] = reader.ni();

		// vis
		adj = new HashMap<>();
		vis = new boolean[n];
		for (int i=0; i<n-1; i++) {
			int u = reader.ni() - 1;
			int v = reader.ni() - 1;
			adj.putIfAbsent(u, new HashSet<>());
			adj.putIfAbsent(v, new HashSet<>());
			adj.get(u).add(v);
			adj.get(v).add(u);
		}

		int[] res = new int[n];
		resArr = new int[n];
		// for (int i=0; i<n; i++) {
		// 	// vis.add(i);
		// 	vis[i] = true;
		// 	res[i] = dfs(i);
		// 	System.out.print(res[i] + " ");
		// 	// vis.remove(i);
		// 	vis[i] = false;
		// }
		vis[0] = true;
		dfs(0);
		for (int i=0; i<n; i++) System.out.print(resArr[i] + " ");

		System.out.println();
		return;
	}

	private int dfs(int node) {
		int score = color[node] == 1 ? 1 : -1;
		int res = score;
		// resArr[node] += res;
		for (int nx : adj.get(node)) {
			// if (vis.contains(nx)) continue;
			if (vis[nx]) continue;
			// vis.add(nx);
			vis[nx] = true;
			int t = dfs(nx);
			// if (t > 0) res += t;
			if (t > 0) {
				res += t;
				resArr[nx] += t;
			}
			// vis.remove(nx);
			// vis[nx] = false;
		}
		resArr[node] += res;
		return res;
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
	public String ns() {return this.next();}
}
