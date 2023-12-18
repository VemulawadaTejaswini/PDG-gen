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


		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine());
			x[i] = parseInt(st.nextToken());
			y[i] = parseInt(st.nextToken());
			h[i] = parseInt(st.nextToken());
			if(h[i] == 100) {
				System.out.printf("%d %d %d%n",x[i],y[i],h[i]);
				return;
			}
			point[y[i]][x[i]] = h[i];
		}



		for(int y=0;y<point.length;y++) {
			for(int x=0;x<point[y].length;x++) {
//				System.out.println(point[y][x]);
				check(x,y);
//				if(!point[y][x]) {
//					check(x,y);
//				}
			}
		}

		System.out.printf("%d %d %d%n",ax,ay,ah);



	}

	private static boolean check(int xz, int yz) {
		int hy = 0;
		int hx = 0;
		long hz2 = -1;

		if(point[yz][xz] !=0) {
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
			if(hz2 > ah) {
				ax = xz;
				ay = yz;
				ah = hz2;
			}
		}
		return isCenter;

	}

}