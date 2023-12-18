import java.util.*;
import java.io.PrintWriter;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static ArrayDeque<Point> que;
	public static int[][] ll;
	public static char[][] s;
	public static int h;
	public static int w;
	public static int[] xadd = {-1, 1, 0, 0}; 
	public static int[] yadd = {0, 0, -1, 1}; 
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		h = parseInt(sc.next());
		w = parseInt(sc.next());
		s = new char[h][];
		for(i=0;i<h;i++) {
			s[i] = sc.next().toCharArray();
		}
		sc.close();
		int mx=0;
		for (int hs = 0; hs < h; hs++) {
			for (int ws = 0; ws < w; ws++) {
				if(s[hs][ws]=='#') continue;
				for (int he = 0; he < h; he++) {
					for (int we = 0; we < w; we++) {
						if(s[he][we]=='#') continue;
						if(hs==he&&ws==we) continue;
						que = new ArrayDeque<>();
						ll = new int[h][w];
						for (i = 0; i < h; i++) {
							Arrays.fill(ll[i], 401);
						}
						ll[hs][ws] = 0;
						que.add(new Point(hs, ws));
//						out.printf("%d,%d -> %d,%d%n", hs, ws,he, we);
						while (que.size() > 0) {
							Point p = que.removeFirst();
							if(p.h == he && p.w == we) break;
							for (i=0; i<4; i++) {
								int ww = p.w+xadd[i];
								int hh = p.h+yadd[i];
								if(ww<0||ww>=w) continue;
								if(hh<0||hh>=h) continue;
								if (s[hh][ww] == '.'&&ll[hh][ww]==401) {
									que.addLast(new Point(hh, ww));
									ll[hh][ww] = ll[p.h][p.w] + 1;
//									out.printf("%d,%d%n",p.h,p.w);
//									out.println(Arrays.deepToString(ll));
								}
							}
						}
						int l = ll[he][we];
						if(mx<l) mx=l;
//						out.println(Arrays.deepToString(ll));
//						out.printf("%d%n", l);
						que = null;
						ll = null;
					}
				}
			}
		}
		out.println(mx);
	}
}
class Point {
	int h;
	int w;
	Point(int h, int w) {
		this.h = h;
		this.w = w;
	}
	
}
