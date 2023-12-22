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

	int n, m;
	long[] a;

	void run(){
		for(;;){
			n=sc.nextInt();
			if(n==0){
				break;
			}
			m=n*(n+1)/2;
			a=new long[m];
			for(int i=0; i<m; i++){
				a[i]=sc.nextLong();
			}
			solve();
		}
	}

	void solve(){
		long gcd=-1;
		for(int i=0; i<m; i++){
			if(a[i]%2==0){
				if(gcd==-1){
					gcd=a[i];
				}else{
					gcd=gcd(gcd, a[i]);
				}
			}
		}
		debug("gcd", gcd);
		int k=0;
		long[] ans=new long[n];
		for(int i=0; i<m; i++){
			if(a[i]%gcd==0){
				ans[k++]=a[i]/gcd;
			}
		}
		sort(ans);
		debug(ans);
		println(gcd+"");
		for(int i=0; i<n; i++){
			print(ans[i]+(i==n-1?"\n":" "));
		}
	}

	long gcd(long m, long n){
		for(; m!=0;){
			long t=n%m;
			n=m;
			m=t;
		}
		return n;
	}

	void debug(Object... os){
		// System.err.println(Arrays.deepToString(os));
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