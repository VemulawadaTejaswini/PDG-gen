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

	int caze, n;
	int[] x, y;

	void run(){
		for(caze=1;; caze++){
			n=sc.nextInt();
			if(n==0){
				break;
			}
			x=new int[n];
			y=new int[n];
			for(int i=0; i<n; i++){
				x[i]=sc.nextInt();
				y[i]=sc.nextInt();
			}
			solve();
		}
	}

	void solve(){
		double ans=0;
		for(int i=0; i<n-2; i++){
			double x1=x[i];
			double y1=y[i];
			double x2=x[i+1];
			double y2=y[i+1];
			double x3=x[n-1];
			double y3=y[n-1];
			double a=hypot(x2-x1, y2-y1);
			double b=hypot(x3-x2, y3-y2);
			double c=hypot(x1-x3, y1-y3);
			double s=(a+b+c)/2;
			ans+=sqrt(s*(s-a)*(s-b)*(s-c));
		}
		println(String.format("%d %.1f", caze, ans));
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