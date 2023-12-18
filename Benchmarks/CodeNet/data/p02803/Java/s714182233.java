
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	class P{
		int x;
		int y;
		P(int x, int y){
			this.x=x;
			this.y=y;
		}
		@Override
		public String toString() {
			return "P [x=" + x + ", y=" + y + "]";
		}
	}
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}


	public void run() {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		char m[][] = new char[h][w];
		for(int i=0; i<h; i++) {
			m[i] = sc.next().toCharArray();
		}
		int used[][] = new int[h][w];
		int ans = 0;
		for(int i=0; i<h; i++) {
			for(int j=0; j<w; j++) {
				for(int k=0; k<h; k++) {
					Arrays.fill(used[k], -1);
				}
				if(m[i][j] == '#') continue;
				used[i][j]=0;
				ans = Math.max(ans, bfs(h,w, j, i, used, m))  ;
			}
		}
		System.out.println(ans);
		sc.close();
	}

	private int bfs(int h, int w, int sx, int sy, int used[][], char m[][]) {

		int dx[] = {1, 0, -1, 0};
		int dy[] = {0, 1, 0, -1};

		ArrayDeque<P> q = new ArrayDeque<P>();
		q.add(new P(sx,sy));

		int ans = 0;
		while(! q.isEmpty()) {

			P p = q.poll();
			for(int i=0; i<4; i++) {
				int tx = p.x+dx[i];
				int ty = p.y+dy[i];
				if(tx<0 || tx>=w || ty<0 || ty>=h) continue;
				if(m[ty][tx]=='#') continue;
				if(used[ty][tx]>=0) continue;
				used[ty][tx]=used[p.y][p.x]+1;
				ans = Math.max(ans, used[ty][tx]);
				q.add(new P(tx, ty));
			}

		}
		return ans;
	}


}
