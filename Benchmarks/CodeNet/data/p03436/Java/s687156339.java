import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int H = Integer.parseInt(sc.next());
		int W = Integer.parseInt(sc.next());
		String s[][] = new String[H][W];
		for(int i = 0; i < H; i++) {
			String temp = sc.next();
			for(int j = 0; j < W; j++) {
				s[i][j] = temp.substring(j, j + 1);
			}
		}
		int maze_cnt[][] = new int[H][W];
		int white_cnt = 0;
		for(int i = 0; i < H; i++) {
			for(int j = 0; j < W; j++) {
				maze_cnt[i][j] = 0;
				if(s[i][j].equals(".")) {
					white_cnt++;
				}
			}
		}
		
		int now_x = 0;
		int now_y = 0;
		Queue<Integer> queue_x = new ArrayDeque<Integer>();
		Queue<Integer> queue_y = new ArrayDeque<Integer>();
		queue_x.add(0);
		queue_y.add(0);
		int dx[] = {-1, 0, 1, 0};
		int dy[] = {0, 1, 0, -1};
		while(queue_x.size() != 0) {
			now_x = queue_x.poll();
			now_y = queue_y.poll();
			for(int i = 0; i < 4; i++) {
				if(i == 0 && now_x == 0) continue;
				if(i == 1 && now_y == H - 1) continue;
				if(i == 2 && now_x == W - 1) continue;
				if(i == 3 && now_y == 0) continue;
				
				if(s[now_y + dy[i]][now_x + dx[i]].equals(".")) {
					queue_x.add(now_x + dx[i]);
					queue_y.add(now_y + dy[i]);
					s[now_y + dy[i]][now_x + dx[i]] = "#";
					maze_cnt[now_y + dy[i]][now_x + dx[i]] = maze_cnt[now_y][now_x] + 1;
				}
			}
		}
		if(maze_cnt[H - 1][W - 1] == 0) {
			System.out.println(-1);
		} else {
			System.out.println(white_cnt - maze_cnt[H - 1][W - 1] - 1);
		}
	}
}
