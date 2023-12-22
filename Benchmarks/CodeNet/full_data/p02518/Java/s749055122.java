import java.util.*;
import java.util.Map.Entry;
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

	void test(long[] b){
		n=b.length-1;
		m=n*(n+1)/2;
		a=new long[m];
		int k=0;
		for(int j=0; j<n; j++){
			for(int i=j+1; i<=n; i++){
				a[k++]=b[i]*b[j];
			}
		}
		solve();
	}

	void run(){
		// test(new long[]{6, 3, 9, 27});
		// test(new long[]{6, 9, 9, 9});

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
		debug(a);
		long gcd=-1;
		long gcd2=-1;
		for(int i=0; i<m; i++){
			if(a[i]%2==0){
				if(gcd==-1){
					gcd=a[i];
				}else{
					gcd=gcd(gcd, a[i]);
				}
			}else{
				if(gcd2==-1){
					gcd2=a[i];
				}else{
					gcd2=gcd(gcd2, a[i]);
				}
			}
		}
		debug("gcd", gcd);
		HashMap<Long, Long> map=primeFactor(gcd2);
		long d=1;
		debug(map.entrySet());
		for(Entry<Long, Long> entry : map.entrySet()){
			for(int i=0; i<entry.getValue()/2; i++){
				d*=entry.getKey();
			}
		}
		gcd/=d;
		debug("gcd2", gcd2, d, gcd);
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

	HashMap<Long, Long> primeFactor(long n){
		HashMap<Long, Long> map=new HashMap<Long, Long>();
		for(long i=2; i*i<=n; i++){
			long c=0;
			for(; n%i==0; n/=i)
				c++;
			if(c>0)
				map.put(i, c);
		}
		if(n!=1)
			map.put(n, 1L);
		return map;
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