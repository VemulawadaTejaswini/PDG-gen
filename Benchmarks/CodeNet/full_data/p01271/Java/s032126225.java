import java.math.BigInteger;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Scanner;

import javax.xml.crypto.Data;
public class Main{
	static int INF = 2 << 28;
	static int[] vxL = {0,0,1,-1};
	static int[] vxR = {0,0,-1,1};
	static int[] vyL = {1,-1,0,0};
	static int[] vyR = {1,-1,0,0};
	static int w;
	static int h;
	static int Lx;
	static int Ly;
	static int Rx;
	static int Ry;
	static char[][] mapL;
	static char[][] mapR;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			w = sc.nextInt();
			h = sc.nextInt();
			if(w == 0 && h == 0) break;
			mapL = new char[h][];
			mapR = new char[h][];
			for(int i = 0; i < h; i++) {
				mapL[i] = sc.next().toCharArray();
				mapR[i] = sc.next().toCharArray();
			}
			Lx = 0;
			Ly = 0;
			Rx = 0;
			Ry = 0;
			
			for(int i = 0; i < h; i++) {
				for(int j = 0; j < w; j++) {
					if(mapL[i][j] == 'L') {
						Ly = i;
						Lx = j;
						mapL[i][j] = '.';
					}
					if(mapR[i][j] == 'R') {
						Ry = i;
						Rx = j;
						mapR[i][j] = '.';
					}
				}
			}
			boolean ans = BFS();
			if(ans) {
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
		}
	}	
	static boolean BFS() {
		boolean[][][][] use = new boolean[w][h][w][h];
		ArrayDeque<Data> queue = new ArrayDeque<Data>();
		queue.add(new Data(Lx,Ly,Rx,Ry));
		while(!queue.isEmpty()) {
			Data tmp = queue.poll();
			if(use[tmp.Lx][tmp.Ly][tmp.Rx][tmp.Ry]) continue;
			use[tmp.Lx][tmp.Ly][tmp.Rx][tmp.Ry] = true;
			for(int i = 0; i < 4; i++) {
				
				int Ltx = tmp.Lx + vxL[i];
				int Lty = tmp.Ly + vyL[i];
				int Rtx = tmp.Rx + vxR[i];
				int Rty = tmp.Ry + vyR[i];
				
				int  L = Rcheck(Ltx,Lty,mapL);
				int  R = Rcheck(Rtx,Rty,mapR);
				
				if(L == 2 && R == 2) return true;
				if(L == 2 && R != 2) continue;
				if(L != 2 && R == 2) continue;
				if(L == 0 && R == 0) continue;
				if(L == 0) {
					Ltx = tmp.Lx;
					Lty = tmp.Ly;
				}
				if(R == 0) {
					Rtx = tmp.Rx;
					Rty = tmp.Ry;
				}
				queue.addLast(new Data(Ltx,Lty,Rtx,Rty));
			}
		}
		return false;
		
	}
	static int Rcheck(int x,int y,char[][] map) {
		if(x < 0 || y < 0 || x >= w || y >= h) return 0;
		if(map[y][x] == '#') return 0;
		if(map[y][x] == '.') return 1;
		if(map[y][x] == '%') return 2;
		return -1;
	}
	
	static class Data {
		int Lx;
		int Ly;
		int Rx;
		int Ry;
		Data(int a, int b, int c, int d) {
			Lx = a;
			Ly = b;
			Rx = c;
			Ry = d;
		}
		public boolean equals(Object o) {
			Data c = (Data)o;
			if(this.Lx != c.Lx) return false;
			if(this.Ly != c.Ly) return false;
			if(this.Rx != c.Rx) return false;
			if(this.Ry != c.Ry) return false;
			return true;
		}
	}
}