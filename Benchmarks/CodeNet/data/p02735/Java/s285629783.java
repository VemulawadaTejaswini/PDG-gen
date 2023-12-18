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
	public Solution () {
		reader = new Reader();
		while (reader.hasNext()) {
			run_case();
		}
	}

	int[] dir_row = new int[]{1, 0};
	int[] dir_col = new int[]{0, 1};
	int inf = (int)1e9;
	int row, col;
	int res;
	char[][] grid;
	private void run_case() {
		row = reader.ni();
		col = reader.ni();
		grid = new char[row][col];
		for (int i=0; i<row; i++) grid[i] = reader.ns().toCharArray();

		res = inf;
		dfs(0, 0, grid[0][0] == '.' ? 0 : 1);

		// Queue<State> q = new LinkedList<>();
		// q.offer(new State(0, 0, grid[0][0] == '#' ? 1 : 0));
		//
		// int[][] mem = new int[row][col];
		// for (int i=0; i<row; i++) {
		// 	Arrays.fill(mem[i], inf);
		// }
		//
		// int res = inf;
		//
		// while (!q.isEmpty()) {
		// 	State cur = q.poll();
		// 	if (cur.r == row-1 && cur.c == col-1) {
		// 		res = Math.min(res, cur.brk);
		// 		continue;
		// 	}
		//
		// 	for (int i=0; i<dir_row.length; i++) {
		// 		int tr = cur.r + dir_row[i];
		// 		int tc = cur.c + dir_col[i];
		// 		if (tr < 0 || tc < 0 || tr >= row || tc >= col) continue;
		// 		int tbrk = cur.brk + (grid[tr][tc] == '#' ? 1 : 0);
		// 		if (tbrk >= mem[tr][tc]) continue;
		// 		mem[tr][tc] = tbrk;
		// 		q.offer(new State(tr, tc, tbrk));
		// 	}
		// }

		System.out.println(res);
		return;
	}

	private void dfs(int r, int c, int brk) {
		if (r == row-1 && c == col-1) {
			res = Math.min(res, brk);
		}
		for (int i=0; i<dir_row.length; i++) {
			int tr = r + dir_row[i];
			int tc = c + dir_col[i];
			if (tr < 0 || tc < 0 || tr >= row || tc >= col) continue;
			char hold = grid[tr][tc];
			int cost = grid[tr][tc] == '#' ? 1 : 0;
			grid[tr][tc] = '.';
			dfs(tr, tc, brk + cost);
			grid[tr][tc] = hold;
		}
		return;
	}
}

class State {
	int r, c, brk;
	public State(int r, int c, int brk) {
		this.r = r;
		this.c = c;
		this.brk = brk;
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
