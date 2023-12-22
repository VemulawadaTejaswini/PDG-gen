import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;
import java.util.Calendar.Builder;

import javax.jws.soap.SOAPBinding.Use;



public class Main {
	static int H;
	static int W;
	static int[] map;
	static Piece[] p;
	static boolean END = false;
	public static void main(String[] args) {	
		//FastScanner sc = new FastScanner();
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		while(true) {
			H = sc.nextInt();
			W = sc.nextInt();
			if(H == 0 && W == 0) break;
			map = new int[H];
			int mapCount = 0;
			for(int i = 0; i < H; i++) {
				String in = sc.next();
				in = in.replace('.', '0');
				in = in.replace('#', '1');
				int bin = Integer.parseInt(in,2);
				map[i] = bin;
				mapCount += W - Integer.bitCount(bin);
			}
			int n = sc.nextInt();
			p = new Piece[n];
			for(int i = 0; i < n; i++) {
				int h = sc.nextInt();
				int w = sc.nextInt();
				String[] map = new String[h];
				for(int j = 0; j < h; j++) {
					String in = sc.next();
					map[j] = in;
				}
				p[i] = new Piece(h,w,map);
			}
			
			int p = sc.nextInt();
			for(int i = 0; i < p; i++) {
				int k = sc.nextInt();
				int[] t = new int[k];
				for(int j = 0; j < k; j++) {
					t[j] = sc.nextInt()-1;
				}
				int bitCount = 0;
				for(int j = 0; j < k; j++) {
					for(int l = 0; l < Main.p[t[j]].h[0]; l++) {
						bitCount += Integer.bitCount(Main.p[t[j]].map[0][l]);
					}
				}
				boolean ans = false;
				if(bitCount == mapCount) {
					END = false;
					ans = check(new boolean[k],t,map,0,0,0);
				}
				if(ans) System.out.println("YES");
				else System.out.println("NO");
			}
		}
	}
	static boolean check(boolean[] used, int[] use, int[] map, int y, int x,int c) {
		if(y == H && c  == use.length) {
			return true;
		}
		else if(y == H) return false;
		if((map[y] & (1 << (W - x - 1))) == 0) {
			for(int i = 0; i < use.length; i++) {

				if(used[i]) continue;
				int sel = use[i];
				for(int j = 0; j < 4; j++) {
					if(END) return false;
					int xx = x - p[sel].vw[j];
					if(xx < 0) continue;
					boolean cf = checkCanFill(y,xx,j,map,p[sel]);
					if(!cf) continue;
					fill(y,xx,j,map,p[sel]);
					used[i] = true;
					int nexty = y;
					int nextx = x+1;
					if(nextx == W) {
						nexty++;
						nextx = 0;
					}
					boolean rt = check(used,use,map,nexty,nextx,c+1);
					if(rt) {
						used[i] = false;
						fill(y,xx,j,map,p[sel]);
						return true;
					}
					used[i] = false;
					fill(y,xx,j,map,p[sel]);
				}
			}
			return false;
		}
		else {
			int nexty = y;
			int nextx = x+1;
			if(nextx == W) {
				nexty++;
				nextx = 0;
			}
			return check(used,use,map,nexty,nextx,c);
			
		}
	}
	static boolean checkCanFill(int A, int B, int C,int[] map, Piece p) {
		if(p.h[C] + A > H) return false;
		if(p.w[C] + B > W) return false;
		for(int i = 0; i < p.h[C]; i++) {
			if((map[i + A] & (p.map[C][i] << (W - p.w[C] - B))) != 0) return false;
		}
		return true;
	}
	static void fill(int A, int B, int C, int[] map, Piece p) {
		for(int i = 0; i < p.h[C]; i++) {
			map[i + A] ^= (p.map[C][i] << (W - p.w[C] - B));
		}
	}
	static boolean checkFill(int[] map) {
		for(int i = 0; i < H; i++) {
			if(map[i] != (1 << W)-1) return false;
		}
		return true;
	}
	
	static String[] rotate(String[] map) {
		char[][] in = new char[map.length][];
		for(int i = 0; i < map.length; i++) {
			in[i] = map[i].toCharArray();
		}
		char[][] ret = new char[in[0].length][in.length];
		for(int i = 0; i < in[0].length; i++) {
			for(int j = 0; j < in.length; j++) {
				ret[i][j] = in[in.length - j - 1][i];
			}
		}
		String[] retu = new String[ret.length];
		for(int i = 0; i < ret.length; i++) {
			retu[i] = String.valueOf(ret[i]);
		}
		return retu;
		
	}
	
	
	static class Piece {
		int[] h;
		int[] w;
		int[][] map;
		int[] vw;
		Piece(int a, int b, String[] c) {
			h = new int[4];
			w = new int[4];
			vw = new int[4];
			map = new int[4][];
			for(int i = 0; i < 4; i++) {
				h[i] = a;
				w[i] = b;
				map[i] = new int[h[i]];
				for(int j = 0; j < w[i]; j++) {
					if(c[0].charAt(j) == '#') {
						vw[i] = j;
						break;
					}
				}
				for(int j = 0; j < h[i]; j++) {
					String in = c[j];
					in = in.replace('.', '0');
					in = in.replace('#', '1');
					int bin = Integer.parseInt(in,2);
					map[i][j] = bin;
				}
				int tmp = a;
				a = b;
				b = tmp;
				c = rotate(c);
			}
		}
	}

}