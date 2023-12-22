
import java.util.*;
import java.io.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;

public class Main {

	int INF = 1 << 28;
	//long INF = 1L << 62;
	double EPS = 1e-10;
	int MAX = 100, OFS = MAX + 5;;

	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			int n = sc.nextInt();
			if( n == 0) break;
			
			int[][] height = new int[2*MAX + 10][2*MAX + 10];
			int[][] top = new int[2*MAX + 10][2*MAX + 10];
			for(int i=0;i<n;i++) {
				int t=sc.nextInt(), f = sc.nextInt();
				Dice d = new Dice(t, f);
				int nx = OFS, x = OFS, ny = OFS, y = OFS;
				for(;;) {
					int[] ret = d.max();
					x = nx; y = ny;
//					debug(nx, ny, ret);
					for(int j=0;j<2;j++) {
						if(ret[j] != 0) {
							if(height[ny][nx] > height[ny+dy[ret[j]-1]][nx+dx[ret[j]-1]]) {
								d.roll(ret[j]-1);
								ny += dy[ret[j]-1];
								nx += dx[ret[j]-1];
								break;
							}
						}
					}
					if( nx == x && ny == y) {
						height[y][x]++;
						top[y][x] = d.s[0];
//						debug(y, x, d.s[0]);
						break;
					}
				}
			}
//			for(int[] a: height)debug(a);
//			for(int[] a: top) debug(a);
			int table[] = new int[7];
			for(int i=0;i<2*MAX+10;i++) for(int j=0;j<2*MAX+10;j++) {
				table[top[i][j]]++;
			}
			
			for(int i=1;i<=6;i++) System.out.print(table[i] + (i==6? "\n": " "));
		}
	}
	
	int[] dx = {-1, 0, 1, 0};
	int[] dy = {0, -1, 0, 1};
	
	class Dice {
		int[] s= {1, 3, 5, 4, 2, 6};
		Dice(int t, int f) {
			if(!roll(0, 0, t)) roll(1, 0, t);
			roll(2, 1, f);
		}
		
		int[] max() {
			int[] tmp = {0, 0};
			int[] ret = {0, 0};
			for(int i=1;i<=4;i++) {
				if(tmp[0] < s[i]) {
					tmp[1] = tmp[0];
					ret[1] = ret[0];
					tmp[0] = s[i];
					ret[0] = tmp[0]>=4? i: 0;
				}
				else if(tmp[1] < s[i]) {
					tmp[1] = s[i];
					ret[1] = tmp[1]>=4? i: 0;
				}
			}
			return ret;
		}
		
		boolean roll(int d, int sur, int tar) {
			for(int i=0;i<4;i++) {
				if(s[sur] == tar) return true;
				if(d == 0) rollX(0);
				else if(d == 1) rollY(0);
				else       rollZ(0);
//				if(d == 1)debug(s);
//				debug("", d, s, tar);
			}
			return false;
		}
		
		void roll(int d) {
			if(d == 0) rollY(1);
			if(d == 1) rollX(1);
			if(d == 2) rollY(0);
			if(d == 3) rollX(0);
		}
		
		void rollX(int d) {
			if(d == 0) {
				roll(0, 2, 5, 4);
			}
			else {
				roll(0, 4, 5, 2);
			}
		}
		
		void rollY(int d) {
			if(d == 0) {
				roll(0, 1, 5, 3);
			}
			else {
				roll(0, 3, 5, 1);
			}
		}
		
		void rollZ(int d) {
			if(d == 0) {
				roll(1, 2, 3, 4);
			}
			else {
				roll(1, 4, 3, 2);
			}
		}
		
		void roll(int w, int x, int y, int z) {
			int tmp = s[w];
			s[w] = s[x];
			s[x] = s[y];
			s[y] = s[z];
			s[z] = tmp;
		}
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}