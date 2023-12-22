import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
public class Main {
	static int w;
	static int h;
	static int gx;
	static int gy;
	public static final int INF = 100000000;
	public static final int[] vx = {1,0,-1,0};
	public static final int[] vy = {0,-1,0,1};
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		w = sc.nextInt();
		h = sc.nextInt();
		char[][] s = new char[w][h];
		for (int y=0;y<h;y++) {
			String line = sc.next();
			for (int x=0;x<w;x++) {
				s[x][y] = line.charAt(x);
				if (s[x][y]=='t') {
					gx = x;
					gy = y;
				}
			}
		}
		int n = sc.nextInt();
		Pos2d[] open = new Pos2d[n];
		for(int i=0;i<n;i++) {
			open[i] = new Pos2d(sc.nextInt(),sc.nextInt());
		}

		int ans = -1;
		if (s[0][0]=='t') {
			ans = 0;
		}
		int[][] t = new int[w][h];
		for (int i=0;i<w;i++) {
			for (int j=0;j<h;j++) {
				t[i][j] = INF;
			}
		}
		t[0][0] = 0;

		boolean[] reach = new boolean[n];
		Queue<Pos2d> q = new ArrayDeque<Pos2d>();
		q.offer(new Pos2d(0,0));
		for(int time=0;time<=n;time++) {
			if (time!=0) {
				s[open[time-1].x][open[time-1].y] = '.';
				if (reach[time-1]) {
					q.offer(open[time-1]);
				}else{
					continue;
				}
			}
			while(!q.isEmpty() && ans==-1) {
				Pos2d p = q.poll();
				for(int i=0;i<4;i++) {
					int nx = p.x + vx[i];
					int ny = p.y + vy[i];
					if (nx>= 0 && nx<w && ny>=0 && ny<h) {
						if (s[nx][ny]!='#') {
							if (t[nx][ny]>t[p.x][p.y]) {
								t[nx][ny] = t[p.x][p.y];
								if (s[nx][ny]=='t') {
									ans = t[nx][ny];
								}
								q.offer(new Pos2d(nx,ny));
							}
						}else{
							if (t[nx][ny]>t[p.x][p.y]) {
								for(int j=0;j<n;j++) {
									if (open[j].equals(nx,ny)) {
										t[nx][ny] = max(j+1,t[p.x][p.y]);
										reach[j] = true;
									}
								}
							}
						}
					}
				}
			}
		}
		System.out.println(ans);
		sc.close();
	}
	public static int max(int x,int y) {
		return x>y?x:y;
	}
}