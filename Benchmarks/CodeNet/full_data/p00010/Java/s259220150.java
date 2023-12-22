import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;

// AC
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
			double c1=x1*x1-x2*x2+y1*y1-y2*y2;
			double a2=2*(x3-x1);
			double b2=2*(y3-y1);
			double c2=x1*x1-x3*x3+y1*y1-y3*y3;

			double x=(b1*c2-b2*c1)/(a1*b2-a2*b1);
			double y=(c1*a2-c2*a1)/(a1*b2-a2*b1);

			double r=Math.sqrt((x1-x)*(x1-x)+(y1-y)*(y1-y));
			println(String.format("%.3f %.3f %.3f", x, y, r));
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