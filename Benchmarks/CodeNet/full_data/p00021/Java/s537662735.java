import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main{

	Scanner sc;

	static final int INF=1<<28;
	static final double EPS=1e-9;

	void run(){
		sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0; i<n; i++){
			double x1=sc.nextDouble();
			double y1=sc.nextDouble();
			double x2=sc.nextDouble();
			double y2=sc.nextDouble();
			double x3=sc.nextDouble();
			double y3=sc.nextDouble();
			double x4=sc.nextDouble();
			double y4=sc.nextDouble();

			P v1=new P(x2-x1, y2-y1);
			P v2=new P(x4-x3, y4-y3);

			println(abs(v1.det(v2))<EPS?"YES"
					:"NO");
		}
		sc.close();
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

	double dot(P p){
		return x*p.x+y*p.y;
	}

	double det(P p){
		return x*p.y-p.x*y;
	}

	P rot90(){
		return new P(-y, x);
	}
}