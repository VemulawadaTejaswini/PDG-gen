import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] dir = new int[][] {{1,0},{-1,0},{0,1},{0,-1}};
		boolean[][] arr = new boolean[N][N];
		int res = 0;
		for(int i = 0; i < N*N; i++) {
			Queue<int[]> q = new LinkedList<>();
			boolean[][] visit = new boolean[N][N];
			int num = sc.nextInt();
			q.offer(new int[] {(num - 1) / N, (num - 1) % N});
			visit[(num - 1) / N][(num - 1) % N] = true;
			arr[(num - 1) / N][(num - 1) % N] = true;
			boolean out = false;
			while(!q.isEmpty()) {
				int[] curr = q.poll();
				int r = curr[0];
				int c = curr[1];
				for(int j = 0; j < 4; j++) {
					int x = r + dir[j][0];
					int y = c + dir[j][1];
					if(x < 0 || x == N || y < 0 || y == N) {
						out = true;
						break;
					}
					if(arr[x][y] && !visit[x][y]) {
						q.offer(new int[] {x, y});
						visit[x][y] = true;
					}
				}
				if(out)
					break;
			}
			
			if(!out)
				res++;
		}
		System.out.println(res);
	}
}