import java.util.*;
import java.io.*;
import java.awt.geom.*;
import java.math.*;

public class Main {

	static final Scanner in = new Scanner(System.in);
	static final PrintWriter out = new PrintWriter(System.out,false);
	static boolean debug = false;

	static int h, w, c;
	static int[] change;
	static int[][] p, stamp;

	static int[] dx = { 0, 1, 0,-1};
	static int[] dy = { 1, 0,-1, 0};

	static int rec(int y, int x, int pos) {
		int res = stamp[y][x] == 6 ? 1 : 0;
		stamp[y][x] = pos;
		for (int k=0; k<4; k++) {
			int ny = y + dy[k];
			int nx = x + dx[k];
			if (ny < 0 || nx < 0 || h <= ny || w <= nx) continue;
			int ptmp = pos;
			while (ptmp < 6 && change[ptmp] != p[ny][nx]) ptmp++;
			if (stamp[ny][nx] <= ptmp) continue;
			res += rec(ny, nx, ptmp);
		}
		return res;
	}

	static boolean solve() {
		h = in.nextInt();
		w = in.nextInt();
		c = in.nextInt();
		if (h + w + c == 0) return false;

		p = new int[h][w];

		for (int i=0; i<h; i++) {
			for (int j=0; j<w; j++) {
				p[i][j] = in.nextInt();
			}
		}

		int ans = 0;

		for (int i=1; i<=6; i++) {
			for (int j=1; j<=6; j++) {
				for (int k=1; k<=6; k++) {
					for (int l=1; l<=6; l++) {
						change = new int[]{p[0][0], i, j, k, l, c};

						stamp = new int[h][w];
						for (int m=0; m<h; m++) {
							Arrays.fill(stamp[m],6);
						}
						ans = Math.max(ans, rec(0, 0, 0));
					}
				}
			}
		}

		out.println(ans);

		return true;
	}

	public static void main(String[] args) {
		debug = args.length > 0;
		long start = System.currentTimeMillis();

		while(solve());
		out.flush();

		long end = System.currentTimeMillis();
		dump((end-start) + "ms");
		in.close();
		out.close();
	}

	static void dump(Object... o) { if (debug) System.err.println(Arrays.deepToString(o)); }
}