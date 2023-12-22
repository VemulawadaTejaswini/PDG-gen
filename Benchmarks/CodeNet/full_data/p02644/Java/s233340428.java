import java.util.*;

public class Main {
	static class Path {
		int dir;
		int step;
		int move;
		int y, x;
		
		public Path(int dir, int step, int move, int y, int x) {
			this.dir = dir;
			this.step = step;
			this.move = move;
			this.y = y;
			this.x = x;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int H = sc.nextInt();
		int W = sc.nextInt();
		int K = sc.nextInt();
		int y1 = sc.nextInt()-1;
		int x1 = sc.nextInt()-1;
		int y2 = sc.nextInt()-1;
		int x2 = sc.nextInt()-1;

		char[][] m = new char[H][];
		for(int i=0; i<H; i++)
			m[i] = sc.next().toCharArray();

		long[][][] best = new long[H][W][4];
		for(int i=0; i<H; i++)
			for(int j=0; j<W; j++)
				Arrays.fill(best[i][j], Long.MAX_VALUE);
		
		final int[] dx = {0, 1, 0, -1};
		final int[] dy = {1, 0, -1, 0};
		
		PriorityQueue<Path> q = new PriorityQueue<Path>(new Comparator<Path>() {
			public int compare(Path p1, Path p2) {
				if(p1.step==p2.step)
					return Integer.compare(p1.move, p2.move);
				else
					return Integer.compare(p1.step, p2.step);
			}
		});
		
		for(int d=0; d<4; d++) {
			q.add(new Path(d, 1, 0, y1, x1));
		}
		
		while(!q.isEmpty()) {
			Path cur = q.poll();
			
			if(best[cur.y][cur.x][cur.dir] <= cur.step*(K+1)+cur.move)
				continue;
			best[cur.y][cur.x][cur.dir] = cur.step*(K+1)+cur.move;
			
			for(int d=0; d<4; d++) {
				int ny = cur.y + dy[d];
				int nx = cur.x + dx[d];
				if(0<=ny && ny<H && 0<=nx && nx<W &&m[ny][nx]=='.') {
					int nextStep = cur.step;
					int nextMove = cur.move;
					if(d==cur.dir && nextMove<K) {
						nextMove++;
					} else {
						nextStep++;
						nextMove = 1;
					}
					if(best[ny][nx][d] > nextStep*(K+1)+nextMove)
						q.add(new Path(d, nextStep, nextMove, ny, nx));
				}
			}
		}
		long ans = Long.MAX_VALUE;
		for(int d=0; d<4; d++)
			ans = Math.min(ans, best[y2][x2][d]);
		System.out.println(ans < Long.MAX_VALUE ? ans/(K+1) : -1);

		sc.close();
	}
}
