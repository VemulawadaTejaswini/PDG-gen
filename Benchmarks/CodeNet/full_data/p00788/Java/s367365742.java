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
		long n1=0, d1=1;
		long n2=m, d2=1;
		for(long d=1; d<=m; d++){
			double left=1, right=m;
			for(int i=0; i<100; i++){
				double mid=(left+right)/2;
				if(mid*mid<p*d*d+EPS){
					left=mid;
				}else{
					right=mid;
				}
			}
			int n=(int)(left+EPS);
			if(n1*d<n*d1&&n*n<p*d*d){
				n1=n;
				d1=d;
			}
			if(++n<=m){
				if(p*d*d<n*n&&n*d2<n2*d){
					n2=n;
					d2=d;
				}
			}
		}
		long gcd=gcd(n1, d1);
		n1/=gcd;
		d1/=gcd;
		gcd=gcd(n2, d2);
		n2/=gcd;
		d2/=gcd;
		println(n2+"/"+d2+" "+n1+"/"+d1);
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