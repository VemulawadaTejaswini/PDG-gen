import java.util.*;
// im sorry
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int H = in.nextInt();
		int W = in.nextInt();
		int D = in.nextInt();
		Point[] ary = new Point[H*W+1];
		int[] save = new int[H*W+1];
		for( int i = 0; i < H; i++ ) {
			for( int j = 0; j < W; j++ ) {
				int ind = in.nextInt();
				ary[ind] = new Point(i+1, j+1);
			}
		}

		for( int i = 1; i <= H*W-D; i++ ) {
			save[i] = getPoints(ary[i].x,ary[i].y,ary[i+D].x,ary[i+D].y);
			if( i-D > 0 ) save[i] += save[i-D];
		//	System.out.println(Arrays.toString(save));
		}
		int Q = in.nextInt();
		while(Q-->0){
			int total = 0;
			int L = in.nextInt();
			int R = in.nextInt();
			if( L == R ) {
				System.out.println(0); continue;
			}
			if(L-D > 0)
				System.out.println(save[R-D]-save[L-D]);
			else
				System.out.println(save[R-D]);
		}
	}

	public static int getPoints( int i, int j, int x, int y ) {
		return Math.abs(x-i)+Math.abs(y-j);
	}

	public static class Point {
		int x, y;
		public Point( int x, int y ) {
			this.x = x;
			this.y = y;
		}
	}
}