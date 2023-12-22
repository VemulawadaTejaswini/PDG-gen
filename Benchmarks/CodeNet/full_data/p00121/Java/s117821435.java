
import static java.util.Arrays.deepToString;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}
	void tr(Object... os) {
		System.err.println(deepToString(os));
	}

	Scanner sc = new Scanner(System.in);
	Map<Long, Integer> memo = new HashMap<Long, Integer>();
	public void run() {
		int[][] init = new int[][] {{0,1,2,3},{4,5,6,7}};
		memo.put(h(init), 0);
		Queue<int[][]> q = new ArrayDeque<int[][]>();
		q.add(init);
		int[] dr = {0, 1, 0, -1};
		int[] dc = {1, 0, -1, 0};
		for (;!q.isEmpty();) {
			int[][] cur = q.poll();
			int cur_cost = memo.get(h(cur));
			for (int i = 0; i < 2; i++) for (int j = 0; j < 4; j++) {
				if (cur[i][j] == 0) {
					for (int k = 0; k < 4; k++) {
						int ni = i + dr[k];
						int nj = j + dc[k];
						if (0 <= ni && ni < 2 && 0 <= nj && nj < 4) {
							int[][] b = {cur[0].clone(),cur[1].clone(),};
							int t = b[i][j];
							b[i][j] = b[ni][nj];
							b[ni][nj] = t;
							
							long h = h(b);
							if (!memo.containsKey(h)) {
								memo.put(h, cur_cost + 1);
								q.add(b);
							}
						}
					}
				}
			}
		}
		
		for (;sc.hasNext();) {
			int[][] a = new int[2][4];
			for (int i = 0; i < 2; i++) for (int j = 0; j < 4; j++) a[i][j] = sc.nextInt();
			System.out.println(memo.get(h(a)));
		}
	}
	long h(int[][] a) {
		long h = 0;
		for (int i = 0; i < 2; i++) for (int j = 0; j < 4; j++) h = h * 8 + a[i][j];
		return h;
	}
	int[][] r(long h) {
		int[][] a = new int[2][4];
		for (int i = 1; i >= 0; i--) for (int j = 3; j >= 0; j--) {
			a[i][j] = (int)(h & 7);
			h >>= 3;
		}
		return a;
	}
	
}