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

	int n;
	P[] a, b, c, d;

	void run(){
		for(;;){
			n=sc.nextInt();
			if(n==0){
				break;
			}
			n+=2;
			a=new P[n];
			b=new P[n];
			c=new P[n];
			d=new P[n];
			a[0]=new P(0, 0);
			b[0]=new P(0, 1);
			c[0]=new P(0, 0);
			d[0]=new P(1, 0);
			for(int i=1; i<n-1; i++)
				a[i]=new P(sc.nextDouble(), 0);
			for(int i=1; i<n-1; i++)
				b[i]=new P(sc.nextDouble(), 1);
			for(int i=1; i<n-1; i++)
				c[i]=new P(0, sc.nextDouble());
			for(int i=1; i<n-1; i++)
				d[i]=new P(1, sc.nextDouble());
			a[n-1]=new P(1, 0);
			b[n-1]=new P(1, 1);
			c[n-1]=new P(0, 1);
			d[n-1]=new P(1, 1);
			solve();
		}
	}

	void solve(){
		double ans=0;
		for(int j=0; j<n-1; j++){
			for(int i=0; i<n-1; i++){
				P p1=isLL(a[i], b[i], c[j], d[j]);
				P p2=isLL(a[i+1], b[i+1], c[j], d[j]);
				P p3=isLL(a[i+1], b[i+1], c[j+1], d[j+1]);
				P p4=isLL(a[i], b[i], c[j+1], d[j+1]);
				ans=max(ans, area(p1, p2, p3)+area(p3, p4, p1));
				// debug(j, i, area(p1, p2, p3)+area(p3, p4, p1));
				// debug(p1, p2, p3, p4);
			}
		}
		// debug(ans);
		println(String.format("%.6f", ans+EPS));
	}

	double area(P p1, P p2, P p3){
		double a=p1.sub(p2).abs();
		double b=p2.sub(p3).abs();
		double c=p3.sub(p1).abs();
		double s=(a+b+c)/2;
		return Math.sqrt(s*(s-a)*(s-b)*(s-c));
	}

	// ツ陳シツ静シツづ陳シツ静シツづ個古ーツ点
	P isLL(P p1, P p2, P q1, P q2){
		double d=q2.sub(q1).det(p2.sub(p1));
		if(abs(d)<EPS)
			return null;
		return p1.add(p2.sub(p1).mul(q2.sub(q1).det(q1.sub(p1))/d));
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

		@Override
		public String toString(){
			return "("+x+", "+y+")";
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