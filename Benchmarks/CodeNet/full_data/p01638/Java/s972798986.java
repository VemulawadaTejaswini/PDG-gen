import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;

// Pie Chart is as easy as pie.
public class Main{
	Scanner sc=new Scanner(System.in);

	double r, cx, cy;
	int n;
	double[] ps;

	void run(){
		r=sc.nextInt();
		cx=sc.nextInt();
		cy=sc.nextInt();
		n=sc.nextInt();
		ps=new double[n];
		for(int i=0; i<n; i++){
			ps[i]=sc.nextInt()/100.0*2*PI;
		}
		solve();
	}

	void solve(){
		double[] xs=new double[n], ys=new double[n];
		double sum=0;
		for(int i=0; i<n; i++){
			xs[i]=r*cos(PI/2-sum);
			ys[i]=r*sin(PI/2-sum);
			sum+=ps[i];
		}
		for(int i=0; i<n; i++){
			int j=(i+1)%n;
			double d=hypot(xs[j]-xs[i], ys[j]-ys[i]);
			double A1=r*r*ps[i]/2, A2=A1;
			double s1=heron(d, r, r);
			double s2=heron(d, hypot(xs[i]-cx, ys[i]-cy),
					hypot(xs[j]-cx, ys[j]-cy));
			A2+=s1*ccw(xs[i], ys[i], xs[j], ys[j], 0, 0);
			A2-=s2*ccw(xs[i], ys[i], xs[j], ys[j], cx, cy);
			print((int)(100*A2/A1)+(i==n-1?"\n":" "));
		}
	}

	double heron(double a, double b, double c){
		double s=(a+b+c)/2;
		return sqrt(s*(s-a)*(s-b)*(s-c));
	}

	int ccw(double ax, double ay, double bx, double by, double cx, double cy){
		bx-=ax;
		by-=ay;
		cx-=ax;
		cy-=ay;
		if(det(bx, by, cx, cy)>0){
			return +1;
		}
		if(det(bx, by, cx, cy)<0){
			return -1;
		}
		return 0;
	}

	double det(double x1, double y1, double x2, double y2){
		return x1*y2-y1*x2;
	}

	void print(String s){
		System.out.print(s);
	}

	public static void main(String[] args){
		new Main().run();
	}
}
package acpc2013.day3.p2526;

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;

// Pie Chart is as easy as pie.
public class Main{
	Scanner sc=new Scanner(System.in);

	double r, cx, cy;
	int n;
	double[] ps;

	void run(){
		r=sc.nextInt();
		cx=sc.nextInt();
		cy=sc.nextInt();
		n=sc.nextInt();
		ps=new double[n];
		for(int i=0; i<n; i++){
			ps[i]=sc.nextInt()/100.0*2*PI;
		}
		solve();
	}

	void solve(){
		double[] xs=new double[n], ys=new double[n];
		double sum=0;
		for(int i=0; i<n; i++){
			xs[i]=r*cos(PI/2-sum);
			ys[i]=r*sin(PI/2-sum);
			sum+=ps[i];
		}
		for(int i=0; i<n; i++){
			int j=(i+1)%n;
			double d=hypot(xs[j]-xs[i], ys[j]-ys[i]);
			double A1=r*r*ps[i]/2, A2=A1;
			double s1=heron(d, r, r);
			double s2=heron(d, hypot(xs[i]-cx, ys[i]-cy),
					hypot(xs[j]-cx, ys[j]-cy));
			A2+=s1*ccw(xs[i], ys[i], xs[j], ys[j], 0, 0);
			A2-=s2*ccw(xs[i], ys[i], xs[j], ys[j], cx, cy);
			print((int)(100*A2/A1)+(i==n-1?"\n":" "));
		}
	}

	double heron(double a, double b, double c){
		double s=(a+b+c)/2;
		return sqrt(s*(s-a)*(s-b)*(s-c));
	}

	int ccw(double ax, double ay, double bx, double by, double cx, double cy){
		bx-=ax;
		by-=ay;
		cx-=ax;
		cy-=ay;
		if(det(bx, by, cx, cy)>0){
			return +1;
		}
		if(det(bx, by, cx, cy)<0){
			return -1;
		}
		return 0;
	}

	double det(double x1, double y1, double x2, double y2){
		return x1*y2-y1*x2;
	}

	void print(String s){
		System.out.print(s);
	}

	public static void main(String[] args){
		new Main().run();
	}
}