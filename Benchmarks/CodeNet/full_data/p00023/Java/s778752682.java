import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main{

	Scanner sc;

	static final int INF=1<<28;
	static final double EPS=1e-6;

	void run(){
		sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0; i<n; i++){
			double xa=sc.nextDouble();
			double ya=sc.nextDouble();
			double ra=sc.nextDouble();
			double xb=sc.nextDouble();
			double yb=sc.nextDouble();
			double rb=sc.nextDouble();
			P a=new P(xa, ya);
			P b=new P(xb, yb);
			double dis=a.sub(b).abs();
			if(ra+rb<dis+EPS)
				println("0"); // dÈÁÄ¢È¢
			else if(abs(rb-ra)<dis+EPS)
				println("1"); // ~üªðíÁÄ¢é
			else if(ra<rb+EPS)
				println("-2"); // AªBÌ
			else
				println("2"); // BªAÌ
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