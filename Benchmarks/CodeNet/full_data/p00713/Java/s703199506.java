import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	Scanner sc = new Scanner(System.in);

	int INF = 1 << 28;
	double EPS = 1e-6;

	int n;
	P[] ps;
	
	void run() {
		for(;;){
			n=sc.nextInt();
			if(n==0){
				break;
			}
			ps=new P[n];
			for(int i=0;i<n;i++){
				double x=sc.nextDouble();
				double y=sc.nextDouble();
				ps[i]=new P(x,y);
			}
			solve();
		}
	}

	void solve() {
		int ans=0;
		for(int j=0;j<n;j++){
			for(int i=j+1;i<n;i++){
				P p1=ps[i];
				P p2=ps[j];
				P d=p1.sub(p2);
				if(d.abs()>2+EPS){
					continue;
				}
				double v=d.abs();
				d=d.div(v);
				double t=sqrt(1-(v/2)*(v/2));
				P m=p1.add(p2).div(2);
				P c1=m.add(d.rot90().mul(t));
				P c2=m.add(d.rot90().mul(-t));
				ans=max(ans,count(c1));
				ans=max(ans,count(c2));
//				debug(c1.x,c1.y);
//				debug(c2.x,c2.y);
//				debug(count(c1),count(c2));
			}
		}
//		debug(ans);
		println(ans+"");
	}
	
	int count(P p){
		int res=0;
		for(int i=0;i<n;i++){
			if(p.sub(ps[i]).abs()<1+EPS){
				res++;
			}
		}
		return res;
	}
	
	class P{
		double x, y;
		
		P(double x,double y){
			this.x=x;
			this.y=y;
		}
		
		P add(P p){return new P(x+p.x,y+p.y);}
		P sub(P p){return new P(x-p.x,y-p.y);}
		P mul(double m){return new P(x*m,y*m);}
		P div(double d){return new P(x/d,y/d);}
		
		double abs(){ return sqrt(abs2()); }
		double abs2(){ return x*x+y*y; }
		P rot90(){ return new P(-y,x); }
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	void print(String s) {
		System.out.print(s);
	}

	void println(String s) {
		System.out.println(s);
	}

	public static void main(String[] args) {
		// System.setOut(new PrintStream(new BufferedOutputStream(System.out)));
		new Main().run();
	}
}