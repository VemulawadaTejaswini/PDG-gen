import java.awt.*;
import java.awt.geom.*;
import java.io.*;

import java.util.*;
class Main {
	static int h;
	static int w;
	static int[] map;
	static int n;
	static int[][][] piece;
	static int[][]   hp;
	static int[][]   wp;
	static HashMap<Integer,Boolean> MAP;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			MAP = new HashMap<Integer,Boolean>();
			h = sc.nextInt();
			w = sc.nextInt();
			if(h == 0 && w == 0) break;
			MAP.clear();
			map = new int[h];
			for(int i = 0; i < h; i++) {
				String in = sc.next();
				int ix = 0;
				for(int j = 0; j < w; j++) {
					if(in.charAt(j) == '#') {
						ix |= 1 << (w - j - 1);
					}
				}
				map[i] = ix;
			}
			n = sc.nextInt();
			piece = new int[n][4][];
			hp = new int[n][4];
			wp = new int[n][4];
			for(int i = 0; i < n; i++) {
				int hpx = sc.nextInt();
				int wpx = sc.nextInt();
				hp[i][0] = hp[i][2] = wp[i][1] = wp[i][3] = hpx;
				wp[i][0] = wp[i][2] = hp[i][1] = hp[i][3] = wpx;
				char[][] ps = new char[hpx][wpx];
				for(int j = 0; j < hpx; j++) {
					ps[j] = sc.next().toCharArray();
				}
				for(int j = 0; j < 4; j++) {
					piece[i][j] = new int[hp[i][j]];
					for(int k = 0; k < hp[i][j]; k++) {
						int tmp = 0;
						for(int l = 0; l < wp[i][j]; l++) {
							if(ps[k][l] == '#') {
								tmp |= 1 << (wp[i][j] - l - 1);
							}
						}
						piece[i][j][k] = tmp;
					}
					char[][] pstmp = new char[hp[i][(j+1)%4]][wp[i][(j+1)%4]];
					for(int k = 0; k < hp[i][(j+1)%4]; k++) {
						for(int l = 0; l < wp[i][(j+1)%4]; l++) {
							pstmp[k][l] = ps[l][hp[i][(j+1)%4] - k - 1];
						}
					}
					ps = pstmp;
				}
			}
			BFS();
			//dfs(0,0,0,map);
			int np = sc.nextInt();
			for(int i = 0; i < np; i++) {
				int k1 = sc.nextInt();
				int tmp = 0;
				for(int j = 0; j < k1; j++) {
					int ckk = sc.nextInt();
					tmp |= (1 << ckk-1);
				}
				if(MAP.containsKey(tmp)) {
					System.out.println("YES");
				}
				else {
					System.out.println("NO");
				}
			}
		}
	}
	static Queue<Data> queue = new ArrayDeque<Data>();
	static void BFS() {
		queue.clear();
		queue.add(new Data(0,0,0,map));
		while(!queue.isEmpty()) {
			Data tmp = queue.poll();
			dfs(tmp.y,tmp.x,tmp.use,tmp.c);
		}
	}
	
	
	static void dfs(int y, int x,int use, int[] c) {
		while((c[y] & (1 << (w - x - 1))) != 0) {
			x++;
			if(x == w) {
				x = 0;
				y++;
			}
			if(y == h) {
				if(!MAP.containsKey(use))
				MAP.put(use, true);
				return;
			}
		}
		for(int i = 0; i < n; i++) {
			if((use & (1 << i)) == 0) {
				for(int j = 0; j < 4; j++) {
					CON:for(int k = wp[i][j]; k < w; k++) {
						for(int l = 0; l < hp[i][j]; l++) {
							if((c[y + l] & piece[i][j][l] << (k - wp[i][j])) != 0) continue CON;
						}
						int[] nex = new int[c.length];
						nex = Arrays.copyOf(c, c.length);
						for(int l = 0; l < hp[i][j]; l++) {
							nex[y + l] |=  piece[i][j][l] << (k - wp[i][j]);
						}
						if((nex[y] & (1 << w - x - 1)) != 0)
						queue.add(new Data(y,x,use | (1 << i),nex));
					}
				}
			}
		}
	}
	static class Data {
		int y;
		int x;
		int use;
		int[] c;
		Data(int a, int b, int d, int[] e) {
			y = a;
			x = b;
			use = d;
			c = e;
		}
	}
	
}