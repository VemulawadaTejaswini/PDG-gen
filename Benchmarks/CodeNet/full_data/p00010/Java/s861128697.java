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
			double a1=2*(x2-x1);
			double b1=2*(y2-y1);
			double c1=x1*x1-x2*x2+y1*y1*-y2*y2;
			double a2=2*(x3-x1);
			double b2=2*(y3-y1);
			double c2=x1*x1-x3*x3+y1*y1*-y3*y3;
			double a=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
			double b=Math.sqrt((x3-x2)*(x3-x2)+(y3-y2)*(y3-y2));
			double c=Math.sqrt((x1-x3)*(x1-x3)+(y1-y3)*(y1-y3));
			double r=a*b*c/Math.sqrt((a+b+c)*(-a+b+c)*(a-b+c)*(a+b-c));
			double xp=(b1*c2-b2*c1)/(a1*b2-a2*b1);
			double yp=(c1*a2-c2*a1)/(a1*b2-a2*b1);
//			xp+=0.0005;
//			yp+=0.0005;
//			r+=0.0005;
			println(String.format("%.3f %.3f %.3f", xp, yp, r));
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