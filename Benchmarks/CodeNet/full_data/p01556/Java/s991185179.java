import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;

// ConvexCut
// 2012/09/19
public class Main{
	Scanner sc=new Scanner(System.in);

	double EPS=1e-6;

	int n;
	P[] ps;

	void run(){
		n=sc.nextInt();
		ps=new P[n];
		for(int i=0; i<n; i++){
			int x=sc.nextInt();
			int y=sc.nextInt();
			ps[i]=new P(x, y);
		}
		solve();
	}

	void solve(){
		P g=new P();
		for(int i=0; i<n; i++){
			g=g.add(ps[i]);
		}
		g=g.div(n);
		boolean ok=true;
		double full=area(ps);
		Random rand=new Random();
		for(int i=0; i<2*n; i++){
			P cut=inDiv(ps[i%n], ps[(i+1)%n], rand.nextDouble(),
					rand.nextDouble());
			P[] qs=convexCut(ps, cut, g);
			double area=area(qs);
			ok&=reEq(full/2, area);
		}
		println(ok?(g.x+" "+g.y):"NA");
	}

	P inDiv(P p, P q, double m, double n){
		return p.mul(n).add(q.mul(m)).div(m+n);
	}

	// relative error
	boolean reEq(double a, double b){
		if(a==0){
			return abs(b)<EPS;
		}else{
			return abs((a-b)/a)<EPS;
		}
	}

	double area(P[] ps){
		double area=0;
		for(int i=1; i<ps.length-1; i++){
			double a=ps[0].sub(ps[i]).abs();
			double b=ps[0].sub(ps[i+1]).abs();
			double c=ps[i].sub(ps[i+1]).abs();
			double s=(a+b+c)/2;
			area+=sqrt(s*(s-a)*(s-b)*(s-c));
		}
		return area;
	}

	P[] convexCut(P[] ps, P p1, P p2){
		int n=ps.length;
		ArrayList<P> res=new ArrayList<P>();
		for(int i=0; i<n; i++){
			int d1=(int)signum(p2.sub(p1).det(ps[i].sub(p1)));
			int d2=(int)signum(p2.sub(p1).det(ps[(i+1)%n].sub(p1)));
			if(d1>=0)
				res.add(ps[i]);
			if(d1*d2<0)
				res.add(isLL(p1, p2, ps[i], ps[(i+1)%n]));
		}
		return res.toArray(new P[0]);
	}

	P isLL(P p1, P p2, P q1, P q2){
		double d=q2.sub(q1).det(p2.sub(p1));
		if(abs(d)<EPS)
			return null;
		return p1.add(p2.sub(p1).mul(q2.sub(q1).det(q1.sub(p1))/d));
	}

	class P implements Comparable<P>{
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
			return sqrt(abs2());
		}

		double abs2(){
			return x*x+y*y;
		}

		double arg(){
			return atan2(y, x);
		}

		double dot(P p){
			return x*p.x+y*p.y;
		}

		double det(P p){
			return x*p.y-y*p.x;
		}

		double ang(P p){
			return atan2(det(p), dot(p));
		}

		P rot90(){
			return new P(y, -x);
		}

		P rot(double d){
			return new P(cos(d)*x-sin(d)*y, sin(d)*x+cos(d)*y);
		}

		@Override
		public int compareTo(P p){
			if(x!=p.x)
				return Double.compare(x, p.x);
			else
				return Double.compare(y, p.y);
		}

		@Override
		public String toString(){
			return "("+x+", "+y+")";
		}
	}

	void println(String s){
		System.out.println(s);
	}

	public static void main(String[] args){
		new Main().run();
	}
}