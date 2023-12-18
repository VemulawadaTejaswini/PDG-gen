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
	public static long[][] p;
	public static long hz;


	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		N = parseInt(st.nextToken());

		x = new int[N];
		y = new int[N];
		h = new long[N];
		point  = new long[101][101];
		p  = new long[101][101];

		for(int i=0;i<point.length;i++) {
			for(int k=0;k<point[i].length;k++) {
				point[i][k] = -1;
			}
		}

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

		int yz = 0;
		int xz =0;
		label : for(int i=0;i<point.length;i++) {
			for(int k=0;k<point[i].length;k++) {

				yz = i;
				xz = k;

				if(check(xz,yz)) {
					break label;
				}
			}
		}

		System.out.printf("%d %d %d%n",xz,yz,hz);



	}

	private static boolean check(int xz, int yz) {
		if(point[yz][xz] != -1) {
			hz = point[yz][xz];
		}else {
			int hy = Math.abs(yz - y[0]);
			int hx = Math.abs(xz - x[0]);
			hz = point[y[0]][x[0]] + hy + hx;
		}
		boolean isCenter = true;
		for(int i=0;i<N;i++) {
			int hyn = Math.abs(yz - y[i]);
			int hxn = Math.abs(xz - x[i]);
			if(hz !=h[i] + hyn + hxn) {
				isCenter = false;
				break;
			}
		}

		return isCenter;

	}

}