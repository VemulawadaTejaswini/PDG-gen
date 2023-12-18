import static java.lang.Integer.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static int N;
	public static int LI;

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

			if(h[i] !=0) {
				LI=i;

			}
			point[y[i]][x[i]] = h[i];
		}


		label:for(int yy=0;yy<=100;yy++) {
			for(int xx=0;xx<=100;xx++) {

				if(check(xx,yy)) {
					break label;
				}

			}
		}

		System.out.printf("%d %d %d%n",ax,ay,ah);



	}




	private static boolean check(int xz, int yz) {
		int hy = Math.abs(yz - y[LI]);
		int hx = Math.abs(xz - x[LI]);
		long hz2 = h[LI] + hy + hx;


		boolean isCenter = true;
		for(int i=0;i<N;i++) {
//			if(h[i] ==0) {
//				continue;
//			}
			int hyn = Math.abs(yz - y[i]);
			int hxn = Math.abs(xz - x[i]);
			if(hz2 !=h[i] + hyn + hxn) {
				if(h[i] ==0) {
					if(hz2 >hyn + hxn) {
						isCenter = false;
						break;

					}
				}else {
					isCenter = false;
					break;
				}

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