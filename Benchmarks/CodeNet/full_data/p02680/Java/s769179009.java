import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int m = Integer.parseInt(sa[1]);
		int[] a = new int[n];
		int[] b = new int[n];
		int[] c = new int[n];
		for (int i = 0; i < n; i++) {
			sa = br.readLine().split(" ");
			a[i] = Integer.parseInt(sa[0]);
			b[i] = Integer.parseInt(sa[1]);
			c[i] = Integer.parseInt(sa[2]);
		}
		int[] d = new int[m];
		int[] e = new int[m];
		int[] f = new int[m];
		for (int i = 0; i < m; i++) {
			sa = br.readLine().split(" ");
			d[i] = Integer.parseInt(sa[0]);
			e[i] = Integer.parseInt(sa[1]);
			f[i] = Integer.parseInt(sa[2]);
		}
		br.close();

		TreeMap<Integer, Integer> mapx = new TreeMap<>();
		mapx.put(0, null);
		mapx.put(Integer.MAX_VALUE, null);
		for (int i = 0; i < n; i++) {
			mapx.put(a[i], null);
			mapx.put(b[i], null);
		}
		for (int i = 0; i < m; i++) {
			mapx.put(d[i], null);
		}
		Integer[] arr = mapx.keySet().toArray(new Integer[0]);
		int cnt = 0;
		for (Integer i : arr) {
			mapx.put(i, cnt);
			cnt++;
		}
		int[] tox = new int[mapx.size()];
		for (Integer key : mapx.keySet()) {
			tox[mapx.get(key)] = key;
		}

		TreeMap<Integer, Integer> mapy = new TreeMap<>();
		mapy.put(0, null);
		mapy.put(Integer.MAX_VALUE, null);
		for (int i = 0; i < n; i++) {
			mapy.put(c[i], null);
		}
		for (int i = 0; i < m; i++) {
			mapy.put(e[i], null);
			mapy.put(f[i], null);
		}
		arr = mapy.keySet().toArray(new Integer[0]);
		cnt = 0;
		for (Integer i : arr) {
			mapy.put(i, cnt);
			cnt++;
		}
		int[] toy = new int[mapy.size()];
		for (Integer key : mapy.keySet()) {
			toy[mapy.get(key)] = key;
		}


		boolean[][] ngy = new boolean[tox.length][toy.length];
		for (int i = 0; i < n; i++) {
			int x1 = mapx.get(a[i]);
			int x2 = mapx.get(b[i]);
			int y = mapy.get(c[i]);
			for (int j = x1 + 1; j <= x2; j++) {
				ngy[j][y] = true;
			}
		}

		boolean[][] ngx = new boolean[tox.length][toy.length];
		for (int i = 0; i < m; i++) {
			int x = mapx.get(d[i]);
			int y1 = mapy.get(e[i]);
			int y2 = mapy.get(f[i]);
			for (int j = y1 + 1; j <= y2; j++) {
				ngx[x][j] = true;
			}
		}


		boolean[][] visit = new boolean[tox.length][toy.length];
		int fx = mapx.get(0);
		int fy = mapx.get(0);
		if (fx == 0 || fx == tox.length - 1 || fy == 0 || fy == toy.length - 1) {
			System.out.println("INF");
			return;
		}

		Queue<Integer> que = new ArrayDeque<>();
		que.add(fx * 10000 + fy);
		visit[fx][fy] = true;
		while (!que.isEmpty()) {
			int cur = que.poll();
			int cx = cur / 10000;
			int cy = cur % 10000;
			// 上
			int nx = cx - 1;
			int ny = cy;
			if (!ngx[nx][ny] && !visit[nx][ny]) {
				if (nx == 0) {
					System.out.println("INF");
					return;
				}
				que.add(nx * 10000 + ny);
				visit[nx][ny] = true;
			}
			// 下
			nx = cx + 1;
			ny = cy;
			if (!ngx[cx][ny] && !visit[nx][ny]) {
				if (nx == tox.length - 1) {
					System.out.println("INF");
					return;
				}
				que.add(nx * 10000 + ny);
				visit[nx][ny] = true;
			}
			// 左
			nx = cx;
			ny = cy - 1;
			if (!ngy[nx][ny] && !visit[nx][ny]) {
				if (ny == 0) {
					System.out.println("INF");
					return;
				}
				que.add(nx * 10000 + ny);
				visit[nx][ny] = true;
			}
			// 右
			nx = cx;
			ny = cy + 1;
			if (!ngy[nx][cy] && !visit[nx][ny]) {
				if (ny == toy.length - 1) {
					System.out.println("INF");
					return;
				}
				que.add(nx * 10000 + ny);
				visit[nx][ny] = true;
			}
		}

		throw new Exception();
//		long ans = 0;
//		for (int i = 1; i < tox.length; i++) {
//			for (int j = 1; j < toy.length; j++) {
//				if (visit[i][j]) {
//					long dx = tox[i] - tox[i - 1];
//					long dy = toy[j] - toy[j - 1];
//					ans += dx * dy;
//				}
//			}
//		}
//		System.out.println(ans);
	}
}
