import java.util.*;
import java.math.*;
import java.awt.geom.*;
import java.io.*;
     
     
public class Main {
	static int W;
	static int H;
	static int N;
	static boolean[][] fld;
	static int[] vx = new int[] {0,1,0,-1};
	static int[] vy = new int[] {1,0,-1,0};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int h = sc.nextInt();
		int n = sc.nextInt();
		W = w+1;
		H = h+1;
		N = n;
		int[] x1 = new int[N];
		int[] y1 = new int[N];
		int[] x2 = new int[N];
		int[] y2 = new int[N];
		for(int i = 0; i < N; i++) {
			x1[i] = sc.nextInt();
			y1[i] = sc.nextInt();
			x2[i] = sc.nextInt();
			y2[i] = sc.nextInt();
		}
		W = compress(x1,x2,W);
		H = compress(y1,y2,H);
		fld = new boolean[H][W];
		for(int i = 0; i < N; i++) {
			for(int y = y1[i]; y <= y2[i]; y++) {
				for(int x = x1[i]; x <= x2[i]; x++) {
					fld[y][x] = true;
				}
			}
		}
		
		int ans = 0;
		for(int i = 0; i < H; i++) {
			for(int j = 0; j < W; j++) {
				if(fld[i][j]) continue;
				ans++;
				ArrayDeque<Data> queue = new ArrayDeque<Data>();
				queue.add(new Data(i,j));
				while(!queue.isEmpty()) {
					int sx = queue.peek().x;
					int sy = queue.poll().y;
					
					for(int k = 0; k < 4; k++) {
						int tx = sx + vx[k];
						int ty = sy + vy[k];
						if(tx < 0 || ty < 0 || tx >= W || ty >= H) continue;
						if(fld[ty][tx]) continue;
						queue.add(new Data(ty,tx));
						fld[ty][tx] = true;
					}
				}
			}
		}
		System.out.println(ans-1);
	
		
		
		
	}
	static class Data {
		int y;
		int x;
		Data(int a, int b) {
			y = a;
			x = b;
		}
	}
	static int compress(int[] x1, int[] x2, int w) {
		ArrayList<Integer> xs = new ArrayList<Integer>();
		for(int i = 0; i < N; i++) {
			for(int d = -1; d <= 1; d++) {
				int tx1 = x1[i] + d;
				int tx2 = x2[i] + d;
				if(0 <= tx1 && tx1 <= w) {
					xs.add(tx1);
				}
				if(0 <= tx2 && tx2 <= w) {
					xs.add(tx2);
				}
			}
		}
		Collections.sort(xs);
		for(int i = 1; i < xs.size(); i++) {
			if(xs.get(i-1).intValue() == xs.get(i).intValue()) {
				xs.remove(i);
				i--;
			}
		}
		for(int i = 0; i < N; i++) {
			x1[i] = Collections.binarySearch(xs, x1[i]);
			x2[i] = Collections.binarySearch(xs, x2[i]);
		}
		return xs.size();
	}
}