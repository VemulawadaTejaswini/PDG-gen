import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;

// Enumeration
// 2012/09/19
public class Main{
	Scanner sc=new Scanner(System.in);

	int n;
	long m;
	long[] a;
	int[] p;

	void run(){
		n=sc.nextInt();
		m=sc.nextLong();
		a=new long[n];
		for(int i=0; i<n; i++){
			a[i]=sc.nextLong();
		}
		p=new int[n];
		for(int i=0; i<n; i++){
			p[i]=sc.nextInt();
		}
		solve();
	}

	void solve(){
		long[] f=new long[1<<n];
		for(int s=0; s<1<<n; s++){
			long lcm=1;
			for(int i=0; i<n; i++){
				if((s>>i&1)==1){
					lcm=lcm(lcm, a[i]);
				}
			}
			if(lcm!=0){
				f[s]=m/lcm;
			}
		}
		f[0]=0;

		for(int i=0; i<n; i++){
			for(int s=0; s<1<<n; s++){
				if((s>>i&1)==1){
					f[s]-=f[s^(1<<i)];
				}
			}
		}

		double ans=0;
		for(int s=0; s<1<<n; s++){
			f[s]=abs(f[s]);
			double E=f[s];
			for(int i=0; i<n; i++){
				if((s>>i&1)==1){
					E*=p[i]/100.0;
				}else{
					E*=(100-p[i])/100.0;
				}
			}
			ans+=E;
		}
		println(String.format("%f", ans));
	}

	long gcd(long a, long b){
		return a==0?b:gcd(b%a, a);
	}

	long lcm(long a, long b){
		if(overflow(a/gcd(a, b), b)){
			return 0;
		}else{
			return a/gcd(a, b)*b;
		}
	}

	// a*b
	boolean overflow(long a, long b){
		return b!=0&&a>Long.MAX_VALUE/b;
	}

	void println(String s){
		System.out.println(s);
	}

	public static void main(String[] args){
		new Main().run();
	}
}