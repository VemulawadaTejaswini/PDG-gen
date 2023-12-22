import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;

public class Main{
	Scanner sc=new Scanner(System.in);

	int INF=1<<28;
	double EPS=1e-12;

	int n, p;

	void run(){
		for(;;){
			n=sc.nextInt();
			p=sc.nextInt();
			if(n==-1){
				break;
			}
			solve();
		}
	}

	int max=200000;
	int[] prime, is;

	void solve(){
		if(prime==null){
			prime=new int[max];
			fill(prime, INF);
			boolean[] isPrime=new boolean[max];
			fill(isPrime, true);
			isPrime[0]=isPrime[1]=false;
			int at=0;
			for(int j=0; j<max; j++){
				if(!isPrime[j]){
					continue;
				}
				prime[at++]=j;
				for(int i=j*2; i<max; i+=j){
					isPrime[i]=false;
				}
			}
			is=new int[40000];
		}
		int k=binarySearch(prime, n);
		if(k<0){
			k=-k-1;
		}
		if(prime[k]<=n){
			k++;
		}
		fill(is, INF);
		for(int i=0; i<200; i++){
			for(int j=i; j<200; j++){
				is[i+j*200]=prime[k+i]+prime[k+j];
			}
		}
		sort(is);
		println(is[p-1]+"");
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
		new Main().run();
	}
}