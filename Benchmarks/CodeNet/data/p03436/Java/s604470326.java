import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int H = Integer.parseInt(sc.next());
		int W = Integer.parseInt(sc.next());
		String s[][] = new String[H][W];
		int score = 0;
		for(int i = 0; i < H; i++) {
			String temp = sc.next();
			for(int j = 0; j < W; j++) {
				s[i][j] = temp.substring(j, j + 1);
				if(s[i][j].equals(".")) score++;
			}
		}
		int minus = BFS(s, H, W);
		if(minus == 0) {
			System.out.println(-1);
			return;
		}
		System.out.println(score - minus - 1);
	}
	
	public static int BFS(String s[][], int H, int W) {
		int cnt[][] = new int[H][W];
		for(int i = 0; i < H; i++) {
			Arrays.fill(cnt[i], 0);
		}
		Queue<Integer> queue_x = new ArrayDeque<>();
		Queue<Integer> queue_y = new ArrayDeque<>();
		int x = 0;
		int y = 0;
		queue_x.add(x);
		queue_y.add(y);
		cnt[y][x] = 0;
		s[y][x] = "!";
		
		while(queue_x.size() != 0 && queue_y.size() != 0) {
			int dx[] = {0, 1, 0, -1};
			int dy[] = {1, 0, -1, 0};
			x = queue_x.poll();
			y = queue_y.poll();
			
			in : for(int i = 0; i < 4; i++) {
				if(x + dx[i] < 0) continue in;
				if(x + dx[i] >= W) continue in;
				if(y + dy[i] < 0) continue in;
				if(y + dy[i] >= H) continue in;
				
				if(s[y + dy[i]][x + dx[i]].equals(".")) {
					queue_x.add(x + dx[i]);
					queue_y.add(y + dy[i]);
					cnt[y + dy[i]][x + dx[i]] = cnt[y][x] + 1;
					s[y + dy[i]][x + dx[i]] = "!";
				}
			}
		}
		
		return cnt[H - 1][W - 1];
	}
}
