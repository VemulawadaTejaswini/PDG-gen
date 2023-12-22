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

	int len, n;
	int[] a;

	void run(){
		for(;;){
			String[] ss=sc.nextLine().split(" ");
			len=Integer.parseInt(ss[0]);
			n=ss.length-1;
			a=new int[n];
			for(int i=0; i<n; i++){
				a[i]=Integer.parseInt(ss[i+1]);
			}
			solve();
		}
	}

	void solve(){
		double[][] dp=new double[1<<n][n];
		for(int j=0; j<1<<n; j++){
			fill(dp[j], INF);
		}
		for(int i=0; i<n; i++){
			dp[1<<i][i]=2*a[i];
		}
		for(int s=1; s<1<<n; s++){
			for(int j=0; j<n; j++){
				if((s>>j&1)==0){
					continue;
				}
				for(int i=0; i<n; i++){
					if((s>>i&1)==0){
						dp[s|1<<i][i]=min(dp[s|1<<i][i], dp[s][j]+2
								*sqrt(a[j]*a[i])-a[j]+a[i]);
					}
				}
			}
			// debug(s,dp[s]);
		}
		double min=INF;
		for(int i=0; i<n; i++){
			min=min(min, dp[(1<<n)-1][i]);
		}
		println(min<len+EPS?"OK":"NA");
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