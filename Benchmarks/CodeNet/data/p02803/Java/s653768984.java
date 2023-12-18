import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	// h, wをスタートとしたときの最も遠い点への距離
	int g(char[][] S, int h, int w) {
		int[][] d = new int[H][W];
		for (int i = 0; i < H; i++) {
			Arrays.fill(d[i], -1);
		}

		d[h][w] = 0;

		Deque<List<Integer>> q = new ArrayDeque<>();
		q.add(Arrays.asList(h, w));

		while (!q.isEmpty()) {
			List<Integer> l = q.poll();
			int y = l.get(0);
			int x = l.get(1);

			int c = d[y][x];

			// 上
			if (y > 0 && d[y - 1][x] == -1 && S[y - 1][x] == '.') {
				d[y - 1][x] = c + 1;
				q.add(Arrays.asList(y - 1, x));
			}

			// 下
			if (y < H - 1 && d[y + 1][x] == -1 && S[y + 1][x] == '.') {
				d[y + 1][x] = c + 1;
				q.add(Arrays.asList(y + 1, x));
			}

			// 左
			if (x > 0 && d[y][x - 1] == -1 && S[y][x - 1] == '.') {
				d[y][x - 1] = c + 1;
				q.add(Arrays.asList(y, x - 1));
			}

			// 右
			if (x < W - 1 && d[y][x + 1] == -1 && S[y][x + 1] == '.') {
				d[y][x + 1] = c + 1;
				q.add(Arrays.asList(y, x + 1));
			}

		}

		int result = 0;
		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				result = Math.max(result, d[i][j]);
			}
		}

//		System.err.println("result " + result);
		return result;

	}

	int H, W;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		H = sc.nextInt();
		W = sc.nextInt();

		char[][] S = new char[H][W];
		for (int i = 0; i < H; i++) {
			String x = sc.next();
			for (int j = 0; j < W; j++) {
				S[i][j] = x.charAt(j);
			}
		}

		sc.close();

		int ans = Integer.MIN_VALUE;
		for (int sth = 0; sth < H; sth++) {
			for (int stw = 0; stw < W; stw++) {

				if (S[sth][stw] == '#') {
					continue;
				}
//System.err.println(sth + "," + stw);
				ans = Math.max(ans, g(S, sth, stw));

			}
		}

		out.println(ans);

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
