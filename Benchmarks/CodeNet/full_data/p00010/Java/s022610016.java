import java.io.*;
import java.util.StringTokenizer;

class Main {
	public static void main(String args[]) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		try {
			int n = Integer.parseInt(br.readLine());
			for (int i=0;i<n;i++) {
				String buf = br.readLine();
				StringTokenizer st = new StringTokenizer(buf);
				double x[] = new double[3];
				double y[] = new double[3];
				for (int j=0;j<3;j++) {
					x[j] = Double.parseDouble(st.nextToken());
					y[j] = Double.parseDouble(st.nextToken());
				}

				double d1 = x[1]-x[0];
				double d2 = y[1]-y[0];
				double d3 = x[2]-x[0];
				double d4 = y[2]-y[0];

				double midx[] = new double[2];
				double midy[] = new double[2];
				midx[0] = mid(x[0],x[1]);
				midy[0] = mid(y[0],y[1]);
				midx[1] = mid(x[0],x[2]);
				midy[1] = mid(y[0],y[2]);

				double a,b,c,d,e,f;
				if (d2==0) {
					a = 1.0;
					b = 0.0;
					c = midx[0];
				} else {
					a = d1/d2;
					b = 1.0;
					c = a*midx[0]+midy[0];
				}
				if (d4==0) {
					d = 1.0;
					e = 0.0;
					f = midx[1];
				} else {
					d = d3/d4;
					e = 1.0;
					f = d*midx[1]+midy[1];
				}

				double det1 = (double)a*e-b*d;
				double det2 = (double)c*e-b*f;
				double det3 = (double)a*f-c*d;
				if (det1 == 0.000) System.out.println("解なしor解がたくさん");
				else {
					String cx = String.format("%.3f",(double)Math.round((det2/det1)*1000)/1000);
					String cy = String.format("%.3f",(double)Math.round((det3/det1)*1000)/1000);
					String r = String.format("%.3f",(double)Math.round(dist(det2/det1,det3/det1,x[0],y[0])*1000)/1000);
					System.out.println(cx+" "+cy+" "+r);
				}
			}
		} catch (Exception e) {
			System.out.println("Exception!");
		}
	}

	public static double mid(double p1,double p2) {
		return (p1+p2)/2;
	}

	public static double dist(double sx,double sy,double ex,double ey) {
		return Math.sqrt(Math.pow(ex-sx,2)+Math.pow(ey-sy,2));
	}
}