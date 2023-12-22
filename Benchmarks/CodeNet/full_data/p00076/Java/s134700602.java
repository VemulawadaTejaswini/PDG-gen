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

		double[] xs=new double[1000];
		double[] ys=new double[1000];
		xs[0]=1;
		ys[0]=0;
		for(int i=1; i<1000; i++){
			double rad=atan2(ys[i-1], xs[i-1])+PI/2;
			xs[i]=xs[i-1]+cos(rad);
			ys[i]=ys[i-1]+sin(rad);
			// println(xs[i]+", "+ys[i]);
		}

		for(;;){
			int n=sc.nextInt();
			if(n==-1)
				break;
			println(xs[n-1]+"");
			println(ys[n-1]+"");
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