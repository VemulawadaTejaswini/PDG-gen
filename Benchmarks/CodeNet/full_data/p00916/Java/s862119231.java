import java.awt.Point;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Queue;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	public static int[] dx = {1,0,-1,0};
	public static int[] dy = {0,1,0,-1};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int n = sc.nextInt();
			if (n == 0) {
				break;
			}
			TreeSet<Integer> xx = new TreeSet<Integer>();
			TreeSet<Integer> yy = new TreeSet<Integer>();
			Square[] s = new Square[n];
			for(int i=0;i<n;i++) {
				int l = sc.nextInt();
				int t = sc.nextInt();
				int r = sc.nextInt();
				int b = sc.nextInt();
				s[i] = new Square(l, t, r, b);
				xx.add(l);
				xx.add(r);
				yy.add(t);
				yy.add(b);
			}
			HashMap<Integer,Integer> zipx = new HashMap<Integer,Integer>();
			HashMap<Integer,Integer> zipy = new HashMap<Integer,Integer>();
			int i_ = 0;
			for(int i:xx) {
				zipx.put(i, i_++);
			}
			i_ = 0;
			for(int i:yy) {
				zipy.put(i, i_++);
			}
			int m = n * 4 + 1;
			boolean[][] map = new boolean[m][m];
			for(int i=0;i<n;i++) {
				int l = zipx.get(s[i].l) * 2 + 1;
				int t = zipy.get(s[i].t) * 2 + 1;
				int r = zipx.get(s[i].r) * 2 + 1;
				int b = zipy.get(s[i].b) * 2 + 1;
				for(int j=l;j<=r;j++) {
					map[j][t] = true;
					map[j][b] = true;
				}
				for(int j=b;j<=t;j++) {
					map[l][j] = true;
					map[r][j] = true;
				}
			}
//			StringBuilder sb = new StringBuilder();
//			for(int y=0;y<m;y++) {
//				for(int x=0;x<m;x++) {
//					sb.append(map[x][y] ? 1 : 0);
//				}
//				sb.append("\n");
//			}
//			System.out.println();
//			System.out.print(sb.toString());
			int ans = 0;
			for(int sx=0;sx<m;sx++) {
				for(int sy=0;sy<m;sy++) {
					if (!map[sx][sy]) {
						map[sx][sy] = true;
						ans++;
						Queue<Point> q = new ArrayDeque<Point>();
						q.offer(new Point(sx,sy));
						while(!q.isEmpty()) {
							Point p = q.poll();
							for(int i=0;i<4;i++) {
								int nx = p.x + dx[i];
								int ny = p.y + dy[i];
								if (nx < 0 || nx >= m || ny < 0 || ny >= m || map[nx][ny]) {
									continue;
								}
								map[nx][ny] = true;
								q.offer(new Point(nx,ny));
							}
						}
					}
				}
			}
			System.out.println(ans);
		}
	}
	
	static class Square {
		int l,t,r,b;
		public Square(int l,int t,int r,int b) {
			this.l = l;
			this.t = t;
			this.r = r;
			this.b = b;
		}
	}

}