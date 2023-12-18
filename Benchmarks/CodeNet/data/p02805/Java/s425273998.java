import java.util.*;

class Main {
	private static final double EPS = 1e-10;
	Scanner sc;
	int N;
	int[] x, y;
	double[] d = new double[3];
	
	private void calc() {
		sc = new Scanner(System.in);
		N = sc.nextInt();
		x = new int[N];
		y = new int[N];
		for (int i = 0; i < N; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}
		
		double minr = Double.MAX_VALUE / 10;
		for (int i = 0; i < N; i++) {
			for (int j = i; j < N; j++) {
				for (int k = j; k < N; k++) {
					setEnclosingDiskOf(x[i], y[i], x[j], y[j], x[k], y[k]);
					if (isEnclosing()) minr = Math.min(minr, d[2]);
				}
			}
		}
		
		System.out.println(Math.sqrt(minr));
	}
	
	private void setEnclosingDiskOf(double x1, double y1,
					double x2, double y2,
					double x3, double y3) {
		double a2 = dist2(x1, y1, x2, y2);
		double b2 = dist2(x2, y2, x3, y3);
		double c2 = dist2(x3, y3, x1, y1);
		
		if (a2+b2 <= c2) {
			d[0] = (x3+x1)/2;
			d[1] = (y3+y1)/2;
			d[2] = c2/4;
		} else if (b2+c2 <= a2) {
			d[0] = (x1+x2)/2;
			d[1] = (y1+y2)/2;
			d[2] = a2/4;
		} else if (c2+a2 <= b2) {
			d[0] = (x2+x3)/2;
			d[1] = (y2+y3)/2;
			d[2] = b2/4;
		} else {
			boolean s = setSub(x1, y1, x2, y2, x3, y3) ||
				setSub(x2, y2, x3, y3, x1, y1) ||
				setSub(x3, y3, x1, y1, x2, y2);
		}
	}
	
	private boolean setSub(double x1, double y1,
					double x2, double y2,
					double x3, double y3) {
		if ( Math.abs((x3-x1)*(y1-y2)-(x2-x1)*(y1-y3)) < EPS ) return false;
		double x12 = x1 * x1;
		double y12 = y1 * y1;
		double x22 = x2 * x2;
		double y22 = y2 * y2;
		double x32 = x3 * x3;
		double y32 = y3 * y3;
		d[1] = ((x3-x1) * (x12+y12-x22-y22) - (x2-x1) * (x12+y12-x32-y32)) / (2*(x3-x1)*(y1-y2) - 2*(x2-x1)*(y1-y3));
		if (Math.abs(x1-x2) < EPS)
			d[0] = (2*(y1-y3)*d[1]-x12-y12+x32+y32) / (2*(x3-x1));
		else
			d[0] = (2*(y1-y2)*d[1]-x12-y12+x22+y22) / (2*(x2-x1));
		d[2] = dist2(d[0], d[1], x1, y1);
		return true;
	}
	
	private double dist2(double x1, double y1, double x2, double y2) {
		return (x1-x2)*(x1-x2)+(y1-y2)*(y1-y2);
	}
	
	private boolean isEnclosing() {
		for (int i = 0; i < N; i++) {
			if (dist2(x[i], y[i], d[0], d[1]) > d[2]) return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		new Main().calc();
	}
}
