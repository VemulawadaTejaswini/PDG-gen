import java.io.PrintStream;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
	final static PrintStream so = System.out;
	final static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			int w = sc.nextInt();
			int h = sc.nextInt();
		
			if (w == 0 && h == 0) return;
			
			so.println(count(h, w));
		}
	}
	
	public static int count(int H, int W) {
		int[][] g = new int[H][W];
		
		for (int h = 0; h < H; h++) {
			for (int w = 0; w < W; w++) {
				g[h][w] = sc.nextInt();
			}
		}
		
		int count = 0;
		int[] mh = {0, 1, 0, -1, 1, 1, -1, -1};
		int[] mw = {1, 0, -1, 0, -1, 1, 1, -1};
		
		for (int h = 0; h < H; h++) {
			for (int w = 0; w < W; w++) {
				if (g[h][w] == 1) {
					Deque<Point> deq = new ArrayDeque<>();
					
					deq.push(new Point(h, w));

					while(!deq.isEmpty()) {
						Point current = deq.pop();
						g[current.h][current.w] = 0;
						
						for (int m = 0; m < mh.length; m++) {
							int nextH = current.h + mh[m];
							int nextW = current.w + mw[m];
							
							if (nextH >= H || nextH < 0 || nextW >= W || nextW < 0) continue;
							
							if (g[nextH][nextW] == 1) {
								deq.push(new Point(nextH, nextW));
							}
						}
					}
					count++;
				}
			}
		}
		
		return count;
	}
	
	static class Point {
		int h;
		int w;
		public Point(int h, int w) {
			this.h = h;
			this.w = w;
		}
		
		@Override
		public boolean equals(Object obj) {
			if (obj == null) return false;
			if (!(obj instanceof Point)) return false;
			Point that = (Point) obj;
			return this.h == that.h && this.w == that.w;
		}
	}
}

