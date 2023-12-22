import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;
import java.util.TreeSet;

public class Main {
	static char[][] c;
	static List<TreeSet<Obj>> listx, listy;
	static int[][] d;
	static Queue<Obj> que;

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

		listx = new ArrayList<>(h);
		for (int i = 0; i < h; i++) {
			listx.add(new TreeSet<>((o1, o2) -> o1.y - o2.y));
		}
		listy = new ArrayList<>(w);
		for (int i = 0; i < w; i++) {
			listy.add(new TreeSet<>((o1, o2) -> o1.x - o2.x));
		}

		Obj f = null;
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				Obj o = new Obj(i, j);
				listx.get(i).add(o);
				listy.get(j).add(o);
				if (i == x1 && j == y1) {
					f = o;
				}
			}
		}

		int inf = 100000000;
		d = new int[h][w];
		for (int i = 0; i < h; i++) {
			Arrays.fill(d[i], inf);
		}

		que = new ArrayDeque<>();
		que.add(f);
		d[x1][y1] = 0;
		listx.get(x1).remove(f);
		listy.get(y1).remove(f);
		while (!que.isEmpty()) {
			Obj cur = que.poll();
			int alt = d[cur.x][cur.y] + 1;

			Obj end = new Obj(cur.x, cur.y - k);
			Obj[] nexts = listx.get(cur.x).subSet(end, true, cur, false).descendingSet().toArray(new Obj[0]);
			exec(nexts, alt);

			end = new Obj(cur.x, cur.y + k);
			nexts = listx.get(cur.x).subSet(cur, false, end, true).toArray(new Obj[0]);
			exec(nexts, alt);

			end = new Obj(cur.x - k, cur.y);
			nexts = listy.get(cur.y).subSet(end, true, cur, false).descendingSet().toArray(new Obj[0]);
			exec(nexts, alt);

			end = new Obj(cur.x + k, cur.y);
			nexts = listy.get(cur.y).subSet(cur, false, end, true).toArray(new Obj[0]);
			exec(nexts, alt);
		}

		if (d[x2][y2] == inf) {
			System.out.println(-1);
		} else {
			System.out.println(d[x2][y2]);
		}
	}

	static void exec(Obj[] nexts, int alt) {
		for (Obj next : nexts) {
			if (c[next.x][next.y] == '@') {
				return;
			}
			listx.get(next.x).remove(next);
			listy.get(next.y).remove(next);
			d[next.x][next.y] = alt;
			que.add(next);
		}
	}

	static class Obj {
		int x, y;

		public Obj(int x, int y) {
			this.x = x;
			this.y = y;
		}

		public String toString() {
			return x + "-" + y;
		}
	}
}
