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

	int n, x;
	int[] a;

	void run(){
		for(;;){
			n=sc.nextInt();
			x=sc.nextInt();
			if((n|x)==0){
				break;
			}
			a=new int[n];
			for(int i=0; i<n; i++){
				a[i]=sc.nextInt();
			}
			solve();
		}
	}

	void solve(){
		int max=1000000;
		int p=0;
		int[] prime=new int[max];
		boolean[] isPrime=new boolean[max+1];
		Arrays.fill(isPrime, true);
		isPrime[0]=isPrime[1]=false;
		for(int i=2; i<=max; i++){
			if(isPrime[i]){
				prime[p++]=i;
				for(int j=2*i; j<=max; j+=i){
					isPrime[j]=false;
				}
			}
		}
		boolean[] dp=new boolean[max+1];
		dp[0]=true;
		for(int j=0; j<n; j++){
			for(int i=a[j]; i<=max; i++){
				dp[i]|=dp[i-a[j]];
			}
		}
		int ans=0;
		for(int i=2; i<=x; i++){
			if(dp[i]&&isPrime[i]){
				ans=i;
			}
		}
		if(ans>0){
			println(ans+"");
		}else{
			println("NA");
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