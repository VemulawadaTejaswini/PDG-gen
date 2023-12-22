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
		int n=sc.nextInt();
		sc.useDelimiter("(\\s)+|[:]");
		for(int i=0; i<n; i++){
			double h=sc.nextInt()*30;
			double m=sc.nextInt()*6;
			h+=m/12;
			double d=Math.abs(h-m);
			d=Math.min(d, 360-d);
			if(d+EPS<30){
				println("alert");
			}else if(d+EPS>=90&&d<=180+EPS){
				println("safe");
			}else{
				println("warning");
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