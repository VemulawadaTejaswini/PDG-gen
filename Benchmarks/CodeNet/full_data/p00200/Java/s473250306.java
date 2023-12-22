import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	private static int n, m, k;
	private static int p, q, r;
	private static int[][][] path;
	private static int[] min_path;
	private static int min_val;

	public static void main(String args[]) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] arrays;

		while (true) {
			line = br.readLine();
			arrays = line.split(" ");
			n = Integer.parseInt(arrays[0]);
			m = Integer.parseInt(arrays[1]);
			if(n == 0 && m == 0){
				break;
			}
			path = new int[m + 1][m + 1][2];
			min_path = new int[m + 1];
			
			for (int i = 0; i < n; i++) {
				line = br.readLine();
				arrays = line.split(" ");
				p = Integer.parseInt(arrays[0]);
				q = Integer.parseInt(arrays[1]);
				// set cost
				path[p][q][0] = Integer.parseInt(arrays[2]);
				// set time
				path[p][q][1] = Integer.parseInt(arrays[3]);
				// set cost
				path[q][p][0] = Integer.parseInt(arrays[2]);
				// set time
				path[q][p][1] = Integer.parseInt(arrays[3]);
			}

			k = Integer.parseInt(br.readLine());

			for (int i = 0; i < k; i++) {
				line = br.readLine();
				arrays = line.split(" ");
				p = Integer.parseInt(arrays[0]);
				q = Integer.parseInt(arrays[1]);
				r = Integer.parseInt(arrays[2]);
				min_val = Integer.MAX_VALUE;
				search(p, 0);
				System.out.println(min_val);
			}
		}
	}

	private static void search(int cur_pos, int eval) {

		int val;
		if(eval + 1> min_val){
			return;
		}
		for (int i = 1; i < m + 1; i++) {
			val = path[cur_pos][i][r];
			if(val == 0){
				continue;
			}
			if(min_path[i] != 0 &&
					val + eval >= min_path[i]){
				continue;
			}
			if (i == q) {
				if (val + eval < min_val) {
					min_val = val + eval;
				}
				continue;
			} else {
				search(i, val + eval);
			}
		}

	}
}