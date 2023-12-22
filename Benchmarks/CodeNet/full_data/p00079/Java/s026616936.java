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

	class P{
		double x, y;

		P(double x, double y){
			this.x=x;
			this.y=y;
		}

		double length(P p){
			return sqrt((p.x-x)*(p.x-x)+(p.y-y)*(p.y-y));
		}
	}

	void run(){
		sc=new Scanner(System.in);
		LinkedList<P> list=new LinkedList<P>();
		for(; sc.hasNext();){
			String[] s=sc.next().split(",");
			double x=Double.parseDouble(s[0]);
			double y=Double.parseDouble(s[1]);
			list.add(new P(x, y));
		}
		int n=list.size();
		P p0=list.getFirst();
		double sum=0;
		for(int i=0; i<n-2; i++){
			// i+1, i+2
			P p1=list.get(i+1);
			P p2=list.get(i+2);
			double a=p0.length(p1);
			double b=p1.length(p2);
			double c=p2.length(p0);
			double z=(a+b+c)/2;
			double s=sqrt(z*(z-a)*(z-b)*(z-c));
			sum+=s;
		}
		println(sum+"");
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