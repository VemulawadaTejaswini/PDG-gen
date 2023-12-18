import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int H = Integer.parseInt(sc.next());
		int W = Integer.parseInt(sc.next());
		String A_temp[] = new String[H];
		String A[][] = new String[H][W];
		for(int i = 0; i < H; i++) {
			A_temp[i] = sc.next();
		}
		Queue<Integer> queue_x = new ArrayDeque<Integer>();
		Queue<Integer> queue_y = new ArrayDeque<Integer>();
		for(int i = 0; i < H; i++) {
			for(int j = 0; j < W; j++) {
				A[i][j] = A_temp[i].substring(j, j + 1);
				if(A[i][j].equals(".")) {
					queue_x.add(j);
					queue_y.add(i);
				}
			}
		}
		int max = 0;
		while(queue_x.size() != 0 && queue_y.size() != 0) {
			max = Math.max(max, BFS(A, queue_x.poll(), queue_y.poll()));
		}
		System.out.println(max);
	}
	
	public static int BFS(String maze[][], int now_x, int now_y) {
		int dx[] = {-1, 0, 1, 0};
		int dy[] = {0, 1, 0, -1};
		int sx = now_x;
		int sy = now_y;
		
		Queue<Integer> queue_x = new ArrayDeque<Integer>();
		Queue<Integer> queue_y = new ArrayDeque<Integer>();
		queue_x.add(now_x);
		queue_y.add(now_y);
		
		while(queue_x.size() != 0 && queue_y.size() != 0) {
			now_x = queue_x.poll();
			now_y = queue_y.poll();
			for(int i = 0; i < 4; i++) {
				if(i == 0 && now_x == 0) continue;
				if(i == 1 && now_y == maze.length - 1) continue;
				if(i == 2 && now_x == maze[0].length - 1) continue;
				if(i == 3 && now_y == 0) continue;
				if(maze[now_y + dy[i]][now_x + dx[i]].equals("$")) continue;
				if(maze[now_y + dy[i]][now_x + dx[i]].equals("#")) {
					return Math.abs(now_x + dx[i] - sx) + Math.abs(now_y + dy[i] - sy);
				}
				queue_x.add(now_x + dx[i]);
				queue_y.add(now_y + dy[i]);
			}
			maze[now_y][now_x] = "$";
		}
		return -1;
	}
}
