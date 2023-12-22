import java.awt.Point;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] X = new int[N+2][N+2];
		boolean[][] gone = new boolean[N+2][N+2];
		int ans = 0;
		for(int i = 1; i <= N/2; i++) {
			for(int j = i+1; j <= N-i; j++) {
				X[i+1][j] = i;
				X[j][i+1] = i;
				X[N-i][j] = i;
				X[j][N-i] = i;
			}
		}
		int[] dx = {-1, 1, 0, 0};
		int[] dy = {0, 0, 1, -1};
		Queue<Point> q = new ArrayDeque<>();
		for(int i = 0; i < N*N; i++) {
			int P = sc.nextInt();
			int x = P -(P - 1) / N * N;
			int y = (P + N - 1) / N;
			ans += X[x][y];
			if(X[x][y] == 0) {
				for(int j = 0; j < 4; j++) {
					if(gone[x+dx[j]][y+dy[j]] && X[x+dx[j]][y+dy[j]] != -1) {
						q.add(new Point(x+dx[j], y+dy[j]));
						X[x+dx[j]][y+dy[j]] = -1;
					}
				}
			}
			X[x][y]--;
			gone[x][y] = true;
			q.add(new Point(x, y));
			while(q.size() > 0) {
				Point n = q.poll();
				int d = X[n.x][n.y];
				for(int j = 0; j < 4; j++) {
					if(X[n.x+dx[j]][n.y+dy[j]] > d + 1) {
						q.add(new Point(n.x+dx[j], n.y+dy[j]));
						X[n.x+dx[j]][n.y+dy[j]] = d + 1; 
					}
				}
			}
		}
		System.out.println(ans);
	}

}