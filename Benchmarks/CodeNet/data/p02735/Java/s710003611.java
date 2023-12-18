//--- pA ---//
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

	Integer[][][] mem;
	char[][] arr;
	int row, col;
	int[] dir_row = new int[]{0, 1};
	int[] dir_col = new int[]{1, 0};
	int inf = (int)1e9;
	private void run_case() {
		row = reader.ni();
		col = reader.ni();

		mem = new Integer[row][col][2];

		arr = new char[row][col];
		for (int i=0; i<row; i++) arr[i] = reader.ns().toCharArray();

		int res = dfs(0, 0, 0);

		out.println(res);

		return;
	}

	private int dfs(int r, int c, int pv) {
		if (r == row-1 && c == col-1) {
			if (arr[r][c] == '#' && pv == 0) return 1;
			else return 0;
		}
		if (mem[r][c][pv] != null) return mem[r][c][pv];
		int res = inf;
		int cost = 0;
		if (arr[r][c] == '#' && pv == 0) cost = 1;
		for (int i=0; i<dir_row.length; i++) {
			int tr = r + dir_row[i];
			int tc = c + dir_col[i];
			if (tr >= row || tc >= col) continue;
			res = Math.min(res, cost + dfs(tr, tc, arr[r][c] == '#' ? 1 : 0));
		}
		return mem[r][c][pv] = res;
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
