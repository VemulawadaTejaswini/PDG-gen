import java.lang.reflect.Array;
import java.util.*;
public class Main {
	static Queue<Integer> queue_x = new ArrayDeque<>();
	static Queue<Integer> queue_y = new ArrayDeque<>();
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int H = Integer.parseInt(sc.next());
		int W = Integer.parseInt(sc.next());
		String s[][] = new String[H][W];
		int cnt[][] = new int[s.length][s[0].length];
		for(int i = 0; i < H; i++) {
			String temp = sc.next();
			for(int j = 0; j < W; j++) {
				s[i][j] = temp.substring(j, j + 1);
				if(s[i][j].equals("#")) {
					queue_x.add(j);
					queue_y.add(i);
					s[i][j] = "!";
					cnt[i][j] = 0;
				}
			}
		}
		
		int ans = 0;
		while(queue_x.size() != 0 && queue_y.size() != 0) {
			int y = queue_y.poll();
			int x = queue_x.poll();
			
			int dx[] = {0, 1, 0, -1};
			int dy[] = {1, 0, -1, 0};
			
			in : for(int i = 0; i < 4; i++) {
				if(x + dx[i] < 0) continue in;
				if(x + dx[i] >= s[0].length) continue in;
				if(y + dy[i] < 0) continue in;
				if(y + dy[i] >= s.length) continue in;
				
				if(s[y + dy[i]][x + dx[i]].equals(".")) {
					queue_x.add(x + dx[i]);
					queue_y.add(y + dy[i]);
					s[y + dy[i]][x + dx[i]] = "!";
					cnt[y + dy[i]][x + dx[i]] = cnt[y][x] + 1;
					ans = Math.max(ans, cnt[y + dy[i]][x + dx[i]]);
				}
			}
		}
		System.out.println(ans);
	}
}
