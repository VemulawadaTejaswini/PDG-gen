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

	P[][] ps;

	void run(){
		for(;;){
			ps=new P[3][2];
			for(int i=0; i<3; i++){
				int x1=sc.nextInt();
				int y1=sc.nextInt();
				int x2=sc.nextInt();
				int y2=sc.nextInt();
				ps[i][0]=new P(x1, y1);
				ps[i][1]=new P(x2, y2);
				if((x1|y1|x2|y2)==0){
					return;
				}
			}
			solve();
		}
	}

	void solve(){
		P[] qs=new P[3];
		for(int i=0; i<3; i++){
			if(!crsSS(ps[i][0], ps[i][1], ps[(i+1)%3][0], ps[(i+1)%3][1])){
				println("kyo");
				return;
			}
			qs[i]=isLL(ps[i][0], ps[i][1], ps[(i+1)%3][0], ps[(i+1)%3][1]);
		}
		double[] h=new double[3];
		for(int i=0; i<3; i++){
			h[i]=qs[i].sub(qs[(i+1)%3]).abs();
		}
		double s=h[0]+h[1]+h[2];
		double a=Math.sqrt(s*(s-h[0])*(s-h[1])*(s-h[2]));

		if(a+EPS>1900000){
			println("dai-kichi");
		}else if(a+EPS>1000000){
			println("chu-kichi");
		}else if(a+EPS>100000){
			println("kichi");
		}else{
			println("syo-kichi");
		}
	}

	P isLL(P p1, P p2, P q1, P q2){
		double d=q2.sub(q1).det(p2.sub(p1));
		if(abs(d)<EPS)
			return null;
		return p1.add(p2.sub(p1).mul(q2.sub(q1).det(q1.sub(p1))/d));
	}

	boolean crsSS(P p1, P p2, P q1, P q2){
		if(max(p1.x, p2.x)+EPS<min(q1.x, q2.x))
			return false;
		if(max(q1.x, q2.x)+EPS<min(p1.x, p2.x))
			return false;
		if(max(p1.y, p2.y)+EPS<min(q1.y, q2.y))
			return false;
		if(max(q1.y, q2.y)+EPS<min(p1.y, p2.y))
			return false;
		return signum(p2.sub(p1).det(q1.sub(p1)))
				*signum(p2.sub(p1).det(q2.sub(p1)))<EPS
				&&signum(q2.sub(q1).det(p1.sub(q1)))
						*signum(q2.sub(q1).det(p2.sub(q1)))<EPS;
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