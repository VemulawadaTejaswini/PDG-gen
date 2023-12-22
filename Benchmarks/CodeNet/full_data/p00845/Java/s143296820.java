import java.awt.geom.*;
import java.io.*;
import java.util.*;
public class Main {
	double EPS = 1.0e-08;

	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n == 0) break;
			P [] stars = new P[n];
			for(int i = 0 ; i < n; i++){
				double [] temp = new double[3];
				for(int j = 0 ; j < 3; j++){
					temp[j] = sc.nextDouble();
				}
				stars[i] = new P(temp);
			}
			int m = sc.nextInt();
			P [] mlist = new P[m];
			double [] radlist = new double[m];
			for(int i = 0 ; i < m; i++){
				double [] temp = new double[3];
				for(int j = 0 ; j < 3; j++){
					temp[j] = sc.nextDouble();
				}
				mlist[i] = new P(temp);
				radlist[i] = sc.nextDouble();
			}
			
			int ans = 0;
			for(int i = 0 ; i < n; i++){
				if(find(stars[i], mlist, radlist)){
					ans++;
				}
			}
			System.out.println(ans);
		}
	}
	
	private boolean find(P p, P[] mlist, double[] radlist) {
		for(int i = 0 ; i < mlist.length; i++){
			double rad1 = angle(p, mlist[i]);
			if(radlist[i] + EPS > rad1) return true;
		}
		return false;
	}

	private double angle(P p1, P p2) {
		double a = dot(p1,p2);
		double b = abs(p1);
		double c = abs(p2);
		return Math.acos(a / (b * c));
	}

	class P{
		double [] p;
		public P(double[] p) {
			this.p = new double[3];
			for(int i =0; i < 3; i++){
				this.p[i] = p[i];
			}
			this.p = p;
		}
	}

	private double abs(P p) {
		return Math.sqrt(norm(p));
	}

	private double norm(P p) {
		return dot(p,p);
	}

	private double dot(P p1, P p2) {
		double res = 0.0;
		for(int i = 0; i < 3; i++){
			res += p1.p[i] * p2.p[i];
		}
		return res;
	}

	public static void main(String [] args){
		new Main().doit();
	}
}