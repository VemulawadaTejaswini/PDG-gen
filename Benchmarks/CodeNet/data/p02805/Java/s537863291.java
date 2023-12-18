import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		double[] x = new double[N];
		double[] y = new double[N];
		for (int i=0;i<N;i++) {
			x[i] = Integer.parseInt(sc.next());
			y[i] = Integer.parseInt(sc.next());
		}
		double ans = 19191919;
		if (N==2) ans = Math.sqrt((x[0]-x[1])*(x[0]-x[1])+(y[0]-y[1])*(y[0]-y[1]))/2;
		for (int i=0;i<N;i++) {
			for (int j=i+1;j<N;j++) {
				for (int k=j+1;k<N;k++) {
					double tmp = 0;
					double x1 = x[i];
					double x2 = x[j];
					double x3 = x[k];
					double y1 = y[i];
					double y2 = y[j];
					double y3 = y[k];

					// double x0 = (-(x2-x1)*(x1+x2)*(y3-y2)+(x3-x2)*(x2+x1)*(y2-y3)+(y2-y1)*(y3-y2)*(y3-y1))/(-(x2-x1)*(y3-y2)+(x3-x2)*(y2-y1))/2;
					// double y0 = -(x2-x1)/(y2-y1)*(x0-(x1+x2)/2)+(y1+y2)/2;
					// y0=100;
					double A = x2 - x1;
		            double B = y2 - y1;
		            double p = (y2 * y2 - y1 * y1 + x2 * x2 - x1 * x1) / 2;
		            double C = x3 - x1;
		            double D = y3 - y1;
		            double q = (y3 * y3 - y1 * y1 + x3 * x3 - x1 * x1) / 2;

		            double x0 = (D * p - B * q) / (A * D - B * C);
		            double y0 = (A * q - C * p) / (A * D - B * C);
					System.out.println("x0, y0: "+x0+" "+y0);
					System.out.println("H"+(-(x2-x1)*(x1+x2)*(y3-y2)+(x3-x2)*(x2+x1)*(y2-y3)+(y2-y1)*(y3-y2)*(y3-y1)));
					for (int l=0;l<N;l++) {
						double r = Math.sqrt((x[l]-x0)*(x[l]-x0)+(y[l]-y0)*(y[l]-y0));
						tmp = Math.max(tmp, r);
					}
					ans = Math.min(ans, tmp);
				}
			}
		}
		System.out.println(ans);
	}
}