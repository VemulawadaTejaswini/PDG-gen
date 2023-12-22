//--- pC ---//
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
		HashMap<Integer, TreeMap<Integer, Integer>> adj = new HashMap<>();
		int n = reader.ni();
		int m = reader.ni();
		int[] hei = new int[n+5];
		for (int i=1; i<=n; i++) {
			int h = reader.ni();
			hei[i] = h;
			// adj.put(i, new TreeMap<>());
			// adj.get(i).put(i, h);
		}
		boolean[] bad = new boolean[n+1];
		for (int i=0; i<m; i++) {
			int a = reader.ni();
			int b = reader.ni();
			if (hei[a] > hei[b]) {
				bad[b] = true;
			} else if (hei[a] < hei[b]) {
				bad[a] = true;
			} else {
				bad[a] = bad[b] = true;
			}
			// adj.get(a).put(b, hei[b]);
			// adj.get(b).put(a, hei[a]);
		}
		int ans = 0;
		for (int i=1; i<=n; i++) {
			// if (adj.get(i).lastKey())
			if (!bad[i]) ans ++;
		}
		out.println(ans);
		return;
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
