import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
public class Main {
	public static final int vx[] = {1,0,-1,0};
	public static final int vy[] = {0,-1,0,1};
	public static int h = 0;
	public static int w = 0;
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			h = sc.nextInt();
			w = sc.nextInt();
			if (h+w==0) {
				break;
			}
			char[][] f = new char[w][h];
			for (int y=0;y<h;y++) {
				String line = sc.next();
				for(int x=0;x<w;x++) {
					f[x][y] = line.charAt(x);
				}
			}
			int ans = 0;
			for (int x=0;x<w;x++) {
				for (int y=0;y<h;y++) {
					if (f[x][y]!='.') {
						ans++;
						//BFS-------
						char tf = f[x][y];
						Queue<Pos2d> q = new ArrayDeque<Pos2d>();
						q.offer(new Pos2d(x,y));
						while(!q.isEmpty()) {
							Pos2d p = q.poll();
							if (f[p.x][p.y]==tf) {
								f[p.x][p.y]='.';
								for(int i=0;i<4;i++) {
									int nx = p.x + vx[i];
									int ny = p.y + vy[i];
									if (nx>=0 && nx<w && ny>=0 && ny<h) {
										q.offer(new Pos2d(nx,ny));
									}
								}
							}
						}
						//----------
					}
				}
			}
			System.out.println(ans);
		}
	}
}
public class Pos2d {
	public int x = 0;
	public int y = 0;
	public Pos2d(int x,int y) {
		this.x = x;
		this.y = y;
	}
	public boolean equals(Object o) {
		Pos2d p = (Pos2d) o;
		return (this.x==p.x && this.y==p.y);
	}
	public String toString() {
		return "("+x+","+y+")";
	}
}