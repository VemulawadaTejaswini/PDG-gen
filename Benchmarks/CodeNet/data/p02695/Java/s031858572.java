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

	int n, m;
	int[][] score_arr;
	int best;
	int[] selected;
	Map<String, Integer> map_score;
	int q;
	// List<Integer> list;
	private void run_case() {
		n = reader.ni();
		m = reader.ni();
		q = reader.ni();

		map_score = new HashMap<>();
		// list = new ArrayList<>();

		selected = new int[15];
		Arrays.fill(selected, 0);

		best = 0;
		score_arr = new int[q+5][5];

		for (int i=0; i<q; i++) {
			score_arr[i+1][0] = reader.ni();
			score_arr[i+1][1] = reader.ni();
			score_arr[i+1][2] = reader.ni();
			score_arr[i+1][3] = reader.ni();
			int t = score_arr[i+1][2];

			int a = score_arr[i+1][0];
			int b = score_arr[i+1][1];
			int c = score_arr[i+1][2];
			int d = score_arr[i+1][3];

			String key = String.valueOf(a) + "_" + String.valueOf(b) + "_" +
			String.valueOf(c);
			map_score.putIfAbsent(key, 0);
			map_score.put(key, map_score.get(key) + d);
		}

		dfs(1, 0);

		out.println(best);

		return;
	}

	private void dfs(int cur, int sel) {
		if (sel == n) {
			getScore();
			return;
		}
		if (cur > m) return;
		for (int i=cur; i<=m; i++) {
			// if (selected[i]) continue;
			// selected[i] = true;
			selected[i] ++;
			dfs(i, sel + 1);
			selected[i] --;
		}
	}

	private void getScore() {
		int[] arr = new int[n];
		int idx = 0;
		int res = 0;
		for (int i=1; i<=m; i++) {
			// if (selected[i]) arr[idx++] = i;
			if (selected[i] > 0) {
				for (int j=0; j<selected[i]; j++) arr[idx++] = i;
			}
		}
		// Map<String, Integer> map_cnt = new
		for (int i=1; i<=q; i++) {
			if (arr[score_arr[i][1]-1] - arr[score_arr[i][0]-1] == score_arr[i][2]) {
				res += score_arr[i][3];
			}
		}
		// for (int i=0; i<n; i++) {
		// 	for (int j=0; j<n; j++) {
		//
		// 	}
		// }
		best = Math.max(best, res);
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
