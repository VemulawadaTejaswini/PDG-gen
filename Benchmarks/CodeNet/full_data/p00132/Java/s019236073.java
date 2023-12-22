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
	static int[][]   wp2;
	static HashMap<Integer,Boolean> MAP;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			MAP = new HashMap<Integer,Boolean>();
			h = sc.nextInt();
			w = sc.nextInt();
			if(h == 0 && w == 0) break;
			map = new int[h];
			int countA = 0;
			for(int i = 0; i < h; i++) {
				String in = sc.next();
				int ix = 0;
				for(int j = 0; j < w; j++) {
					if(in.charAt(j) == '#') {
						countA++;
						ix |= (1 << (w - j - 1));
					}
				}
				map[i] = ix;
			}
			n = sc.nextInt();
			piece = new int[n][4][];
			hp = new int[n][4];
			wp = new int[n][4];
			wp2 = new int[n][4];
			for(int i = 0; i < n; i++) {
				Arrays.fill(wp2[i], -1);
			}
			int countB = 0;
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
								if(wp2[i][j] == -1) {
									wp2[i][j] = l;
								}
								if(j == 0) countB++;
								tmp |= (1 << (wp[i][j] - l - 1));
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
			if(countA > countB)
			dfs(0,0,0,map);
			//System.out.println(MAP.size());
			int np = sc.nextInt();
			for(int i = 0; i < np; i++) {
				int k1 = sc.nextInt();
				int tmp = 0;
				for(int j = 0; j < k1; j++) {
					int ckk = sc.nextInt();
					tmp |= (1 << (ckk-1));
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
		//int[] cx = Arrays.copyOf(c, c.length);
		
		CONX:for(int i = 0; i < n; i++) {
			if((use & (1 << i)) == 0) {
				CK:for(int j = 0; j < 4; j++) {
					boolean X = false;
					CON:for(int k = w - x; k <= w; k++) {
							if(X) continue CK;
							if(y + hp[i][j] - 1 >= h) continue CONX;
							int t = k - wp[i][j];
							if(((c[y] & piece[i][j][0] << t) != 0 ||  ((c[y] | piece[i][j][0] << (t)) & (1 << (w - x - 1))) == 0)) continue CON;
							X = true;
							for(int l = 1; l < hp[i][j]; l++) {
								if((c[y + l] & (piece[i][j][l] << (t))) != 0) continue CON;
							}
							int[] nex = Arrays.copyOf(c, c.length);
							for(int l = 0; l < hp[i][j]; l++) {
								nex[y + l] |=  (piece[i][j][l] << (t));
							}
							
							dfs(y,x,(use | (1 << i)),nex);
					}
				}
			}
		}
	}
}