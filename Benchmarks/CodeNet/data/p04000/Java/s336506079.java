import java.util.*;
import java.io.*;
public class Main {
	static long start,end;
	static Scanner in = new Scanner(System.in);
	static boolean debug=false;
	public static void start() {start = System.currentTimeMillis();}

	public static long end() {
		end = System.currentTimeMillis();
		return end - start;
	}
	public static void print(String s) {
		if (debug) System.out.println(s);
	}
	public static void main(String[] args) {
		start();
		solve_ABC4();
		print(String.format("erapsed:%5dms", end()));
	}

	public static void solve_ABC4() {
		int[] va = {-1,-1,-1,0,0,0,1,1,1};
		int[] vb = {-1,0,1,-1,0,1,-1,0,1};
		int H,W,N,h,w;
		H = in.nextInt();
		W = in.nextInt();
		N = in.nextInt();
		h = H - 2;
		w = W - 2;
		long[] n = new long[10];
		n[0] = (long)h * w;
		int a,b, na,nb, x;
		
		for (int i=0; i < N;i++) {
			a = in.nextInt();
			b = in.nextInt();
			for (int k=0; k < va.length; k++) {
				na = a + va[k];
				nb = b + vb[k];
				if (0 <= na && na <= h && 0 <= nb && nb <= w) {//if can make 3x3
					x = 0;	
					for (int p=0; p < va.length; p++) {
						
					}
				}
			}
		}
	}
}