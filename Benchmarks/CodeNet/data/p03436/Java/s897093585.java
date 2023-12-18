

import java.awt.Point;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

/**
 * for (int i = 0; i < N; i++) {}
 * System.out.println();
 * HashMap<Integer, Integer> hm = new HashMap<>();
 * int[] s = new int[M];
 * ArrayDeque<Integer> deq = new ArrayDeque<>();
 *
 */
public class Main implements Runnable { //クラス名はMainD

	public static void main(String[] args) {
		Thread.setDefaultUncaughtExceptionHandler((t, e) -> System.exit(1));
		new Thread(null, new Main(), "", 1024 * 1024 * 1024).start(); //16MBスタックを確保して実行
	}

	public void run() {
		FastScannerMainD sc = new FastScannerMainD(System.in);

		try {
			//String S = sc.nextLine().trim();
			int H = sc.nextInt();
			int W = sc.nextInt();
			String[][] ss = new String[H][W];
			HashMap<Integer, Integer> hm = new HashMap<>();

			//int[] a = new int[N];
			//long l = sc.nextLong();
			//ArrayList<Integer> arr = new ArrayList<Integer>();

			for (int i = 0; i < H; i++) {
				String S = sc.nextLine().trim();
				for (int j = 0; j < W; j++) {
					ss[i][j] = S.substring(j, j + 1);
				}
			}

			Bfs bfs = new Bfs();

			int[][] result = bfs.BfsMaze(new Point(0, 0), H, W, ss).result;
			int max = bfs.BfsMaze(new Point(0, 0), H, W, ss).max;

			int count = result[H - 1][W - 1];

			for (int i = 0; i <= max; i++) {
				hm.put(i, 0);
			}

			//ans2は#となっていないが、通れない点や通っていない点の数
			int ans2 = 0;
			for (int i = 0; i < H; i++) {
				for (int j = 0; j < W; j++) {
					if (result[i][j] != -100000000) {
						int cnt = hm.get(result[i][j]);
						cnt++;
						hm.put(result[i][j], cnt);
					}
					if (!ss[i][j].equals("#") && result[i][j] == -100000000) {
						ans2++;
					}
				}
				//System.out.println(Arrays.toString(result[i]));
			}

			//ansは無駄な道の数
			int ans = 0;
			for (int i = 0; i <= max; i++) {
				//System.out.println(i + " " + hm.get(i));
				if (i <= count) {
					ans += hm.get(i) - 1;
				} else if (i > count) {
					ans += hm.get(i);
				}

			}
			//最後は足し算。合計の変えられる個数
			System.out.println(ans + ans2);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

//幅優先探索
class Bfs {
	public int max;
	// それぞれの点までの移動距離
	public int[][] result;

	/*
	 * 迷路用の幅優先探索
	 * s  : 始点
	 * H  : 迷路の高さ
	 * W  : 迷路の幅
	 * ss : 迷路の中身の文字列
	 */
	public Bfs BfsMaze(Point s, int H, int W, String[][] ss) {
		int[][] d = new int[H][W];
		int INF = -100000000;
		int[] dx = { 1, 0, -1, 0 }, dy = { 0, 1, 0, -1 }; //4 directions
		ArrayDeque<Point> q = new ArrayDeque<>();

		int sx = s.x, sy = s.y; //Startを指定

		for (int h = 0; h < H; h++) {
			Arrays.fill(d[h], INF);//初期化
		}

		q.offer(new Point(sx, sy));
		d[sy][sx] = 0;

		Bfs bfs = new Bfs();
		bfs.max = 0;
		while (q.size() > 0) {
			Point p = q.poll();
			for (int h = 0; h < H; h++) {
				for (int w = 0; w < W; w++) {
					//4 directions
					for (int i = 0; i < 4; i++) {
						int nx = p.x + dx[i], ny = p.y + dy[i];
						if (nx >= 0 && nx < W && ny >= 0 && ny < H && !ss[ny][nx].equals("#") && d[ny][nx] == INF) {
							q.offer(new Point(nx, ny));
							d[ny][nx] = d[p.y][p.x] + 1;
							if (bfs.max < d[ny][nx]) {
								bfs.max = d[ny][nx];
							}
						}
					}
				}
			}
		}
		bfs.result = d;
		return bfs;
	}
}

//高速なScanner
class FastScannerMainD {
	private BufferedReader reader = null;
	private StringTokenizer tokenizer = null;

	public FastScannerMainD(InputStream in) {
		reader = new BufferedReader(new InputStreamReader(in));
		tokenizer = null;
	}

	public String next() {
		if (tokenizer == null || !tokenizer.hasMoreTokens()) {
			try {
				tokenizer = new StringTokenizer(reader.readLine());
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		return tokenizer.nextToken();
	}

	public String nextLine() {
		if (tokenizer == null || !tokenizer.hasMoreTokens()) {
			try {
				return reader.readLine();
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		return tokenizer.nextToken("\n");
	}

	public long nextLong() {
		return Long.parseLong(next());
	}

	public int nextInt() {
		return Integer.parseInt(next());
	}

	public double nextDouble() {
		return Double.parseDouble(next());
	}

	public int[] nextIntArray(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = nextInt();
		return a;
	}

	public long[] nextLongArray(int n) {
		long[] a = new long[n];
		for (int i = 0; i < n; i++)
			a[i] = nextLong();
		return a;
	}
}
