import java.util.*;
import java.util.function.*;
import java.math.*;
public class Main {
    public static void main(String[] args){
Scanner s = new Scanner(System.in);
		int H = Integer.valueOf(s.next());
		int W = Integer.valueOf(s.next());
		int[] start = new int[4]; //x, y, 歩数, ワープ
		int[] goal = new int[2];
		start[0] = Integer.valueOf(s.next()) - 1;
		start[1] = Integer.valueOf(s.next()) - 1;
		goal[0] = Integer.valueOf(s.next()) - 1;
		goal[1] = Integer.valueOf(s.next()) - 1;

		int[][] maze = new int[H][W];
		char[] cur;
		for(int i = 0; i < H; i++) {
			cur = s.next().toCharArray();
			for(int j = 0; j < W; j++) {
				maze[i][j] = cur[j] == '.' ? -1 : -2;
			}
		}

		int[] vx = {1, 0, -1, 0};
		int[] vy = {0, -1, 0, 1};
		int[][] vxw = new int[4][5];
		int[][] vyw = new int[4][5];

		vxw[0] = new int[]{2, 2, 2, 2, 2}; //20個
		vyw[0] = new int[]{2, 1, 0, -1, -2}; //20個
		vxw[1] = new int[]{1, 1, 0, -1, -1}; //20個
		vyw[1] = new int[]{-1, -2, -2, -2, -1}; //20個
		vxw[2] = new int[]{-2, -2, -2, -2, -2}; //20個
		vyw[2] = new int[]{-2, -1, 0, 1, 2}; //20個
		vxw[3] = new int[]{-1, -1, 0, 1, 1}; //20個
		vyw[3] = new int[]{1, 2, 2, 2, 1}; //20個

		PriorityQueue<int[]> Q = new PriorityQueue<>((a, b) -> Integer.compare(a[3], b[3]));
		Q.add(start);

		int[] now;
		int[] tmp = new int[4];
		int ret = -1;
		while(!Q.isEmpty()) {
			now = Q.poll();

			for(int i = 0; i < 4; i++) {
				tmp[0] = now[0] + vx[i];
				tmp[1] = now[1] + vy[i];

				// 範囲内チェック
				if(-1 < tmp[0] && tmp[0] < H && -1 < tmp[1] && tmp[1] < W) {

					// 一回も行ってない
					if(maze[tmp[0]][tmp[1]] > now[3] || maze[tmp[0]][tmp[1]] < 0) {

						// 迷路が壁以外
						if(maze[tmp[0]][tmp[1]] != -2) {

							// ゴール
							if(tmp[0] == goal[0] && tmp[1] == goal[1]) {
								System.out.println(now[3]);
								return;
							}

							maze[tmp[0]][tmp[1]] = now[3]; // 迷路の値を更新
							Q.add(new int[] {tmp[0], tmp[1], 0, now[3]});

						// 迷路が壁
						}else {

							for(int j = 0; j < 5; j++) {
								tmp[0] = now[0] + vxw[i][j];
								tmp[1] = now[1] + vyw[i][j];

								// 範囲内チェック
								if(-1 < tmp[0] && tmp[0] < H && -1 < tmp[1] && tmp[1] < W) {

									// 一回も行ってない
									if(maze[tmp[0]][tmp[1]] > now[3] || maze[tmp[0]][tmp[1]] < 0) {
										// 迷路が壁以外
										if(maze[tmp[0]][tmp[1]] != -2) {

											// ゴール
											if(tmp[0] == goal[0] && tmp[1] == goal[1]) {
												System.out.println(now[3] + 1);
												return;
											}
											maze[tmp[0]][tmp[1]] = now[3] + 1; // 迷路の値を更新
											Q.add(new int[] {tmp[0], tmp[1], 0, now[3] + 1});
										}
									}
								}
							}
						}
					}
				}
			}
		}
		System.out.println(ret);
	}
}