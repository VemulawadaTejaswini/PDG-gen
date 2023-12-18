//--- pF ---//
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
		// int t = reader.ni();
		while (reader.hasNext()) {
			run_case();
		}
		out.flush();
	}

	long[] arr;
	int sel;
	int n;
	Long[][] mem;
	long inf = (1L << 60);
	private void run_case() {
		n = reader.ni();
		arr = new long[n+10];
		for (int i=0; i<n; i++) {
			arr[i] = reader.nl();
		}
		sel = (int)Math.floor(n / 2.0);
		mem = new Long[n][3];

		long res = dfs(0, n%2+1);
		System.out.println(res);

		return;
	}

	private long dfs(int idx, int skip) {
		if (idx >= n) {
			return 0;
		}

		if (mem[idx][skip] != null) return mem[idx][skip];

		long res = -inf;

		for (int i=0; i <= skip; i++) {
			res = Math.max(res, arr[idx + i] + dfs(idx + 2 + i, skip - i));
		}

		mem[idx][skip] = new Long(res);
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
	public long nl() {return Long.parseLong(this.next());}
	public String ns() {return this.next();}
}
