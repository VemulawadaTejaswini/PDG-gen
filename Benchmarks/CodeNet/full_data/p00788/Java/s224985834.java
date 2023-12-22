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

	int p, m;

	void run(){
		for(;;){
			p=sc.nextInt();
			m=sc.nextInt();
			if((p|m)==0){
				break;
			}
			solve();
		}
	}

	void solve(){
		long nLeft=0, dLeft=1;
		long nRight=p, dRight=1;
		for(long d=1; d<=m; d++){
			for(long n=1; n<=m; n++){
				if(nLeft*d<n*dLeft&&n*n<p*d*d){
					nLeft=n;
					dLeft=d;
				}else if(p*d*d<n*n&&n*dRight<nRight*d){
					nRight=n;
					dRight=d;
				}
			}
		}
		long gcd=gcd(nRight, dRight);
		nRight/=gcd;
		dRight/=gcd;
		gcd=gcd(nLeft, dLeft);
		nLeft/=gcd;
		dLeft/=gcd;
		println(nRight+"/"+dRight+" "+nLeft+"/"+dLeft);
	}

	long gcd(long m, long n){
		for(; n!=0;){
			m=m%n;
			long t=m;
			m=n;
			n=t;
		}
		return m;
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