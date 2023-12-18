import java.util.*;

import java.io.PrintWriter;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static final int INF = (int) 1e9;
	public static char[][] s;
	public static int h;
	public static int w;
	public static void main(String[] args) {
		int i=0,j=0,k=0;
		Scanner sc = new Scanner(in);
		h = parseInt(sc.next());
		w = parseInt(sc.next());
		s = new char[h][w];
		int kabeCnt=0;
		for (i = 0; i < h; i++) {
			s[i] = sc.next().toCharArray();
			for (j = 0; j < s[i].length; j++) {
				if(s[i][j]=='#') kabeCnt++;
			}
		}
		sc.close();
		ArrayDeque<Point> que;
		int[][] ll;
		int[] dw = {-1, 1, 0, 0}; 
		int[] dh = {0, 0, -1, 1}; 
		que = new ArrayDeque<>();
		ll = new int[h][w];
		for (i = 0; i < h; i++) {
			Arrays.fill(ll[i], INF);
		}
		ll[0][0] = 0;
		que.add(new Point(0, 0));
		while (que.size() > 0) {
			Point p = que.removeFirst();
			if(p.h == h-1 && p.w == w-1) break;
			for (i=0; i<4; i++) {
				int ww = p.w+dw[i];
				int hh = p.h+dh[i];
				if(ww<0||ww>=w) continue;
				if(hh<0||hh>=h) continue;
				if (s[hh][ww] == '.'&&ll[hh][ww]==INF) {
					que.addLast(new Point(hh, ww));
					ll[hh][ww] = ll[p.h][p.w] + 1;
				}
			}
		}
		int l = ll[h-1][w-1];
		out.println(h*w-kabeCnt-l-1);
	}
	public static int cntMasu(int x, int y, int m) {
		s[x][y]='#';
		if(x==w-1 && y==h-1) 
		if(x>0 && s[x-1][y]=='.')cntMasu(x-1, y, m+1);
		cntMasu(x, y, m+1);
		cntMasu(x, y, m+1);
		cntMasu(x, y, m+1);
		return m;
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

