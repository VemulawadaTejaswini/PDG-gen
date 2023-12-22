import static java.lang.Math.*;
import static java.util.Arrays.*;

import java.util.*;
import java.io.*;

public class Main {
	double[] x, y;
	double EPS = 1e-8;
	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			int n = sc.nextInt();
			if(n == 0) break;
			
			x = new double[n];
			y = new double[n];
			for(int i=0;i<n;i++) {
				x[i] = sc.nextDouble(); y[i] = sc.nextDouble();
			}
			int max = 1;
			for(int i=0;i<n;i++) for(int j=i+1;j<n;j++) {
				if(2.0  < d(i, j) - EPS ) continue;
				double[][] c = c(i, j);
				for(double[] a: c) {
					int cnt = 0;
					for(int k=0;k<n;k++)  if(1.0 + EPS > d(a, k)){
						cnt++;
					}
					max = max(max, cnt);
				}
					
			}
			System.out.println(max);
		}
	}
	
	double d(double[] c, int i) {
		return sqrt( (x[i] - c[0]) * (x[i] - c[0]) + (y[i] - c[1]) * (y[i] - c[1]) );
	}
	
	double d(int i, int j) {
		return sqrt( (x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]) );
	}
	
	double[][] c(int i, int j) {
		double[][] ret = new double[2][2];
		double cx = (x[i]+x[j]) / 2, cy = (y[i]+y[j]) / 2;
		double nx = y[i] - y[j], ny = x[j] - x[i], norm = sqrt(nx*nx+ny*ny);
		nx /= norm; ny /= norm;
		double dc = (x[j]-cx)*(x[j]-cx)+(y[j]-cy)*(y[j]-cy), d = sqrt( 1.0 - dc );
		nx *= d; ny *= d;
		ret[0][0] = nx + cx; ret[0][1] = ny + cy;
		ret[1][0] = -1.0 * nx + cx; ret[1][1] = -1.0 * ny + cy;
		debug(nx, ny, cx, cy, ret);
		return ret;
	}

	void debug(Object... os) {
	//	System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}