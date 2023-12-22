import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main{

	Scanner sc=new Scanner(System.in);

	int INF=1<<28;
	double EPS=1e-9;

	int r, n;
	double[] xs, ys, rs, vs;

	void run(){
		for(;;){
			r=sc.nextInt();
			n=sc.nextInt();
			if((r|n)==0){
				break;
			}
			xs=new double[n];
			ys=new double[n];
			rs=new double[n];
			vs=new double[n];
			for(int i=0; i<n; i++){
				xs[i]=sc.nextInt();
				ys[i]=sc.nextInt();
				rs[i]=sc.nextInt();
				vs[i]=sc.nextInt();
			}
			solve();
		}
	}

	void solve(){
		double[] ds=new double[n];
		double[] coss=new double[n];
		double[] sins=new double[n];
		for(int i=0; i<n; i++){
			ds[i]=hypot(xs[i], ys[i]);
			coss[i]=xs[i]/ds[i];
			sins[i]=ys[i]/ds[i];
		}

		boolean debug=false;

		if(debug){
			debug("ds", ds);
			debug("xs", xs);
			debug("ys", ys);
		}

		boolean[] attacked=new boolean[n];
		for(int t=0;; t++){
			double min=INF;
			int k=-1;
			for(int i=0; i<n; i++){
				ds[i]-=vs[i];
				xs[i]-=vs[i]*coss[i];
				ys[i]-=vs[i]*sins[i];
				if(ds[i]>r+EPS&&ds[i]+EPS<min&&!attacked[i]){
					k=i;
					min=ds[i];
				}
			}
			if(debug){
				debug("k", k);
				debug("ds", ds);
				debug("xs", xs);
				debug("ys", ys);
				debug("attacked", attacked);
			}
			if(k==-1){
				break;
			}
			P p=new P(0, 0);
			P q=new P(coss[k], sins[k]).mul(10000);
			for(int i=0; i<n; i++){
				if(ds[i]>r+EPS&&crsCS(new P(xs[i], ys[i]), rs[i], p, q)){
					attacked[i]=true;
				}
			}
		}
		int ans=0;
		for(boolean b : attacked){
			ans+=b?0:1;
		}
		// debug(ans);
		println(""+ans);
	}

	// ツ静シツ閉ェツづ点ツづ個仰猟猟」
	double disSP(P p1, P p2, P q){
		if(p2.sub(p1).dot(q.sub(p1))<EPS)
			return q.sub(p1).abs();
		if(p1.sub(p2).dot(q.sub(p2))<EPS)
			return q.sub(p2).abs();
		return disLP(p1, p2, q);
	}

	// ツ陳シツ静シツづ点ツづ個仰猟猟」
	double disLP(P p1, P p2, P q){
		return abs(p2.sub(p1).det(q.sub(p1)))/p2.sub(p1).abs();
	}

	// ツ円ツづ静シツ閉ェツづ個古ーツ債キツ板サツ津ィ
	boolean crsCS(P c, double r, P p1, P p2){
		return disSP(p1, p2, c)<r+EPS
				&&(r<c.sub(p1).abs()+EPS||r<c.sub(p2).abs()+EPS);
	}

	class P{
		double x, y;

		P(){
			this(0, 0);
		}

		P(double x, double y){
			this.x=x;
			this.y=y;
		}

		P add(P p){
			return new P(x+p.x, y+p.y);
		}

		P sub(P p){
			return new P(x-p.x, y-p.y);
		}

		P mul(double m){
			return new P(x*m, y*m);
		}

		P div(double d){
			return new P(x/d, y/d);
		}

		double abs(){
			return Math.sqrt(abs2());
		}

		double abs2(){
			return x*x+y*y;
		}

		double arg(){
			return Math.atan2(y, x);
		}

		// inner product
		double dot(P p){
			return x*p.x+y*p.y;
		}

		// outer product
		double det(P p){
			return x*p.y-y*p.x;
		}

		P rot90(){
			return new P(-y, x);
		}

		// conjugation
		P conj(){
			return new P(x, -y);
		}
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
		// System.setOut(new PrintStream(new BufferedOutputStream(System.out)));
		new Main().run();
	}
}