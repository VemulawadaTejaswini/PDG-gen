import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import static java.lang.Integer.parseInt;

/**
 * Paint Color
 * JOI 2008 ??¬???3
 */
public class Main {

	static final int[][] HV = {
			{1, 0},
			{-1, 0},
			{0, 1},
			{0, -1},
	};

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

//		long ts = System.nanoTime();

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			int w, h, n;
			w = parseInt(line.substring(0, line.indexOf(' ')));
			h = parseInt(line.substring(line.indexOf(' ') + 1));
			if ((w | h) == 0) break;

			n = parseInt(br.readLine());

			int[][] masks = new int[n][4];
			Map<Integer, Integer> xs = new TreeMap<>();
			Map<Integer, Integer> ys = new TreeMap<>();
			xs.put(-1, 0);
			ys.put(-1, 0);

			for (int i = 0; i < n; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				//
				int x1, y1, x2, y2;
				x1 = parseInt(st.nextToken());
				y1 = parseInt(st.nextToken());
				x2 = parseInt(st.nextToken());
				y2 = parseInt(st.nextToken());
				//
				masks[i][0] = x1;
				masks[i][1] = y1;
				masks[i][2] = x2;
				masks[i][3] = y2;
				//
				xs.put(x1, 0);
				xs.put(x2, 0);
				ys.put(y1, 0);
				ys.put(y2, 0);
				//
				xs.put(x1 - 1, 0);
				//xs.put(x2 + 1, 0);
				ys.put(y1 - 1, 0);
				//ys.put(y2 + 1, 0);
			}

			//compress
			int _i = 0;
			for (int k : xs.keySet()) {
				xs.put(k, _i);
				_i++;
			}
			_i = 0;
			for (int k : ys.keySet()) {
				ys.put(k, _i);
				_i++;
			}

			//mask
			boolean[][] board = new boolean[xs.size()][ys.size()];
			for (int i = 0; i < board.length; i++) {
				for (int j = 0; j < board[0].length; j++) {
					if (i == 0 || i == board.length - 1
							|| j == 0 || j == board[0].length - 1) {
						board[i][j] = true;
					}
				}
			}

			for (int i = 0; i < n; i++) {
				int x1, y1, x2, y2;
				x1 = masks[i][0];
				y1 = masks[i][1];
				x2 = masks[i][2];
				y2 = masks[i][3];
				for (int j = xs.get(x1); j < xs.get(x2); j++) {
					for (int k = ys.get(y1); k < ys.get(y2); k++) {
						board[j][k] = true;
					}
				}
			}

//			for (int i = 0; i < board.length; i++) {
//				for (int j = 0; j < board[0].length; j++) {
//					System.out.print(board[i][j] ? '*' : ' ');
//				}
//				System.out.println();
//			}
//			System.out.println();

			//paint
			int colors = 0;
			for (int i = 1; i < board.length - 1; i++) {
				for (int j = 1; j < board[0].length - 1; j++) {
					if (!board[i][j]) {
						Deque<int[]> q = new ArrayDeque<>();
						q.offer(new int[]{i, j});
						board[i][j] = true;
						colors++;
						while (!q.isEmpty()) {
							int[] p = q.poll();
							int x, y;
							x = p[0];
							y = p[1];
							for (int k = 0; k < HV.length; k++) {
								int nx, ny;
								nx = x + HV[k][0];
								ny = y + HV[k][1];
								if (!board[nx][ny]) {
									board[nx][ny] = true;
									q.offer(new int[]{nx, ny});
								}
							}
						}
					}
				}
			}
			System.out.println(colors);

//		System.out.println((System.nanoTime() - ts) / 1000 / 1000);
		}//end while
	}//end main
}