
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;

public class Main{
	Scanner sc=new Scanner(System.in);

	int INF=1<<28;
	double EPS=1e-12;

	int n;
	double[] xs, ys, ls;

	void run(){
		for(;;){
			n=sc.nextInt();
			if(n==0){
				break;
			}
			xs=new double[n];
			ys=new double[n];
			ls=new double[n];
			for(int i=0; i<n; i++){
				xs[i]=sc.nextInt();
				ys[i]=sc.nextInt();
				ls[i]=sc.nextInt();
			}
			solve();
		}
	}

	double max;

	void solve(){
		max=0;
		// 1点
		for(int i=0; i<n; i++){
			update(xs[i], ys[i]);
		}
		// 2点
		for(int i=0; i<n; i++){
			for(int j=i+1; j<n; j++){
				double[] pin=pin(i, j);
				update(pin[0], pin[1]);
			}
		}
		// 3点
		for(int i=0; i<n; i++){
			for(int j=i+1; j<n; j++){
				for(int k=j+1; k<n; k++){
					// debug(i,j,k);
					double[] pin1=pin(i, j);
					double[] pin2=pin(j, k);
					// debug(i, j, pin1, j, k, pin2);
					double px1=pin1[0];
					double py1=pin1[1];
					double px2=px1+(ys[j]-ys[i]);
					double py2=py1-(xs[j]-xs[i]);

					double qx1=pin2[0];
					double qy1=pin2[1];
					double qx2=qx1+(ys[k]-ys[j]);
					double qy2=qy1-(xs[k]-xs[j]);

					double[] cross=cross(px1, py1, px2, py2, qx1, qy1, qx2, qy2);
					// debug(cross);
					update(cross[0], cross[1]);
				}
			}
		}
		// debug(max);
		println(String.format("%.20f", max));
	}

	double[] cross(double px1, double py1, double px2, double py2, double qx1,
			double qy1, double qx2, double qy2){
		// debug(px1, py1, px2, py2, qx1, qy1, qx2, qy2);
		double det=det(qx2-qx1, qy2-qy1, px2-px1, py2-py1);
		if(abs(det)<EPS){
			return new double[]{0, 0};
		}
		double det2=det(qx2-qx1, qy2-qy1, qx1-px1, qy1-py1);
		double x=px1+(px2-px1)*det2/det;
		double y=py1+(py2-py1)*det2/det;
		return new double[]{x, y};
	}

	double det(double x1, double y1, double x2, double y2){
		return x1*y2-x2*y1;
	}

	double[] pin(int i, int j){
		double ratio=(1+(sq(ls[i])-sq(ls[j]))
				/sq(hypot(xs[i]-xs[j], ys[i]-ys[j])))/2.0;
		// debug("pin", i, j, ratio);
		double x=xs[i]+(xs[j]-xs[i])*ratio;
		double y=ys[i]+(ys[j]-ys[i])*ratio;
		return new double[]{x, y};
	}

	void update(double x, double y){
		double min=Double.MAX_VALUE;
		for(int i=0; i<n; i++){
			min=min(min, sqrt(max(sq(ls[i])-sq(hypot(xs[i]-x, ys[i]-y)), 0)));
		}
		// debug(x, y, min);
		max=max(max, min);
	}

	double sq(double x){
		return x*x;
	}

	void debug(Object... os){
		System.err.println(Arrays.deepToString(os));
	}

	void print(String s){
		System.out.print(s);
	}

	void println(String s){
		System.out.println(s);
	}

	public static void main(String[] args){
		new Main().run();
	}
}