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

	int n;
	R[] rs;

	void run(){
		for(;;){
			n=sc.nextInt();
			if(n==0){
				break;
			}
			rs=new R[n];
			for(int i=0; i<n; i++){
				rs[i]=new R();
				rs[i].c=sc.nextInt();
				for(int k=0; k<4; k++){
					rs[i].sec+=sc.nextInt()*60;
					rs[i].sec+=sc.nextInt();
				}
			}
			Arrays.sort(rs);
			println(""+rs[0].c);
			println(""+rs[1].c);
			println(""+rs[n-2].c);
		}
	}

	class R implements Comparable<R>{
		int c, sec;

		@Override
		public int compareTo(R r){
			return sec-r.sec;
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