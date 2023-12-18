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

	List<Num> list;
	Long[][] mem;
	private void run_case() {
		int n = reader.ni();
		list = new ArrayList<>();
		mem = new Long[n][n];
		for (int i=0; i<n; i++) {
			list.add(new Num(reader.ni(), i));
		}
		Collections.sort(list, new ComparatorNum());
		long res = dfs(0, n-1, 0);
		out.println(res);
		return;
	}

	private long dfs(int l, int r, int idx) {
		if (l > r) return 0;
		if (mem[l][r] != null) return mem[l][r];
		long res = 0;
		res = Math.max(res, 1L * Math.abs(list.get(idx).idx - l) * list.get(idx).val + dfs(l + 1, r, idx + 1));
		res = Math.max(res, 1L * Math.abs(list.get(idx).idx - r) * list.get(idx).val + dfs(l, r - 1, idx + 1));
		mem[l][r] = new Long(res);
		return res;
	}
}

class Num {
	public int val, idx;
	public Num(int val, int idx) {
		this.val = val;
		this.idx = idx;
	}
}

class ComparatorNum implements Comparator<Num> {
	public int compare(Num a, Num b) {
		return b.val - a.val;
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
