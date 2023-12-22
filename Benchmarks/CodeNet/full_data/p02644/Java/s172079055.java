import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class Main {
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
		char[][] c = new char[h][w];
		for (int i = 0; i < h; i++) {
			c[i] = br.readLine().toCharArray();
		}
		br.close();

		int inf = 100000000;
		int[][] du = new int[h][w];
		int[][] dd = new int[h][w];
		int[][] dl = new int[h][w];
		int[][] dr = new int[h][w];
		for (int i = 0; i < h; i++) {
			Arrays.fill(du[i], inf);
			Arrays.fill(dd[i], inf);
			Arrays.fill(dl[i], inf);
			Arrays.fill(dr[i], inf);
		}
		long m = 10000000L;
		Queue<Long> que = new ArrayDeque<>();
		que.add(x1 * m + y1);
		du[x1][y1] = 0;
		dd[x1][y1] = 0;
		dl[x1][y1] = 0;
		dr[x1][y1] = 0;
		while (!que.isEmpty()) {
			long cur = que.poll();
			int cx = (int) (cur / m);
			int cy = (int) (cur % m);
			int alt = Math.min(du[cx][cy], dd[cx][cy]);
			alt = Math.min(alt, dl[cx][cy]);
			alt = Math.min(alt, dr[cx][cy]);
			alt++;

			int end = Math.max(cx - k, 0);
			for (int i = cx - 1; i >= end; i--) {
				if (c[i][cy] == '.' && alt < du[i][cy]) {
					que.add(i * m + cy);
					du[i][cy] = alt;
				} else {
					break;
				}
			}

			end = Math.min(cx + k, h - 1);
			for (int i = cx + 1; i <= end; i++) {
				if (c[i][cy] == '.' && alt < dd[i][cy]) {
					que.add(i * m + cy);
					dd[i][cy] = alt;
				} else {
					break;
				}
			}

			end = Math.max(cy - k, 0);
			for (int i = cy - 1; i >= end; i--) {
				if (c[cx][i] == '.' && alt < dl[cx][i]) {
					que.add(cx * m + i);
					dl[cx][i] = alt;
				} else {
					break;
				}
			}

			end = Math.min(cy + k, w - 1);
			for (int i = cy + 1; i <= end; i++) {
				if (c[cx][i] == '.' && alt < dr[cx][i]) {
					que.add(cx * m + i);
					dr[cx][i] = alt;
				} else {
					break;
				}
			}
		}
		int ans = Math.min(du[x2][y2], dd[x2][y2]);
		ans = Math.min(ans, dl[x2][y2]);
		ans = Math.min(ans, dr[x2][y2]);
		if (ans == inf) {
			System.out.println(-1);
		} else {
			System.out.println(ans);
		}
	}
}
