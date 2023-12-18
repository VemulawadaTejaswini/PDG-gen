import static java.lang.Integer.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static int N;

	public static int[] x;
	public static int[] y;
	public static long[] h;
	public static long[][] point;
	public static long ah;
	public static int ax;
	public static int ay;


	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		N = parseInt(st.nextToken());

		x = new int[N];
		y = new int[N];
		h = new long[N];
		point  = new long[101][101];
		for(int i=0;i<point.length;i++) {
			for(int k=0;k<point[i].length;k++) {
				point[i][k] = -1;
			}
		}

		boolean isNothing = true;

		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine());
			x[i] = parseInt(st.nextToken());
			y[i] = parseInt(st.nextToken());
			h[i] = parseInt(st.nextToken());
			if(h[i] > 0) {
				isNothing = false;
			}

			point[y[i]][x[i]] = h[i];
		}

		if(isNothing) {
			for(int i=0;i<N;i++) {
				if(point[y[i]][x[i]] == -1) {
					System.out.printf("%d %d %d%n",x[1],y[1],1);
					return;
				}
			}
		}

		label:for(int y=0;y<point.length;y++) {
			for(int x=0;x<point[y].length;x++) {

				if(check(x,y)) {
					break label;
				}

			}
		}

		System.out.printf("%d %d %d%n",ax,ay,ah);



	}




	private static boolean check(int xz, int yz) {
		int hy = 0;
		int hx = 0;
		long hz2 = -1;
		if(point[yz][xz] !=-1) {
			hz2 = point[yz][xz];
		}else {
			for(int i=0;i<N;i++) {
				if(h[i] !=0) {
					hy = Math.abs(yz - y[i]);
					hx = Math.abs(xz - x[i]);
					hz2 = h[i] + hy + hx;
					break;
				}
			}
		}

		boolean isCenter = true;
		for(int i=0;i<N;i++) {
			if(h[i] ==0) {
				continue;
			}
			int hyn = Math.abs(yz - y[i]);
			int hxn = Math.abs(xz - x[i]);
			if(hz2 !=h[i] + hyn + hxn) {
				isCenter = false;
				break;

			}
		}

		if(isCenter) {

			ax = xz;
			ay = yz;
			ah = hz2;
		}

		return isCenter;

	}

}