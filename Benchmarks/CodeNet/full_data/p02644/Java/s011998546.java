import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class Main {
	static char[][] c;
	static int[][] d;
	static Queue<Long> que;
	static long m = 10000000L;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int h = Integer.parseInt(sa[0]);
		int w = Integer.parseInt(sa[1]);
		int k = Integer.parseInt(sa[2]);
		sa = br.readLine().split(" ");
		int x1 = Integer.parseInt(sa[0]) - 1;
		int y1 = Integer.parseInt(sa[1]) - 1;
		int x2 = Integer.parseInt(sa[2]) - 1;
		int y2 = Integer.parseInt(sa[3]) - 1;
		c = new char[h][w];
		for (int i = 0; i < h; i++) {
			c[i] = br.readLine().toCharArray();
		}
		br.close();

		d = new int[h][w];
		for (int i = 0; i < h; i++) {
			Arrays.fill(d[i], Integer.MAX_VALUE);
		}
		que = new ArrayDeque<>();
		que.add(x1 * m + y1);
		d[x1][y1] = 0;
		while (!que.isEmpty()) {
			long cur = que.poll();
			int cx = (int) (cur / m);
			int cy = (int) (cur % m);
			int alt = d[cx][cy] + 1;

			int end = Math.max(cx - k, 0);
			for (int i = cx - 1; i >= end; i--) {
				if (exec(i, cy, alt)) {
					break;
				}
			}

			end = Math.min(cx + k, h - 1);
			for (int i = cx + 1; i <= end; i++) {
				if (exec(i, cy, alt)) {
					break;
				}
			}

			end = Math.max(cy - k, 0);
			for (int i = cy - 1; i >= end; i--) {
				if (exec(cx, i, alt)) {
					break;
				}
			}

			end = Math.min(cy + k, w - 1);
			for (int i = cy + 1; i <= end; i++) {
				if (exec(cx, i, alt)) {
					break;
				}
			}
		}

		if (d[x2][y2] == Integer.MAX_VALUE) {
			System.out.println(-1);
		} else {
			System.out.println(d[x2][y2]);
		}
	}

	static boolean exec(int x, int y, int alt) {
		if (c[x][y] == '@' || alt > d[x][y]) {
			return true;
		}
		if (alt == d[x][y]) {
			return false;
		}
		que.add(x * m + y);
		d[x][y] = alt;
		return false;
	}
}
