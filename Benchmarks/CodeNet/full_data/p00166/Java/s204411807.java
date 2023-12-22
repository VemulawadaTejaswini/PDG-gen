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

	void run(){
		for(;;){
			int m=sc.nextInt();
			if(m==0){
				break;
			}
			int sum=0;
			double area1=0;
			for(int i=0; i<m-1; i++){
				int deg=sc.nextInt();
				area1+=Math.sin(Math.toRadians(deg))/2;
				sum+=deg;
			}
			area1+=Math.sin(Math.toRadians(360-sum))/2;

			int n=sc.nextInt();
			sum=0;
			double area2=0;
			for(int i=0; i<n-1; i++){
				int deg=sc.nextInt();
				area2+=Math.sin(Math.toRadians(deg))/2;
				sum+=deg;
			}
			area2+=Math.sin(Math.toRadians(360-sum))/2;
			// debug(area1,area2);
			
			if(area1>area2+EPS){
				println("1");
			}else if(area1+EPS<area2){
				println("2");
			}else{
				println("0");
			}
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