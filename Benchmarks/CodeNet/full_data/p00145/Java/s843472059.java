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
	int[] a, b;

	void run(){
		n=sc.nextInt();
		a=new int[n];
		b=new int[n];
		for(int i=0; i<n; i++){
			a[i]=sc.nextInt();
			b[i]=sc.nextInt();
		}
		solve();
	}

	void solve(){
		int[][] dp=new int[n][n];
		// dp[i][j]=iツつゥツづァjツづーツづ慊づづ淞つスツづつォツづ個催渉ャ
		// dp[i][i]=0
		// dp[i][j]=min_k{dp[i][k]+dp[k+1][j]+a[i]*b[k]*a[k+1]*b[j]}

		for(int i=0; i<n; i++){
			Arrays.fill(dp[i], INF);
			dp[i][i]=0;
		}

		for(int m=1; m<n; m++){
			for(int i=0, j=m; j<n; i++, j++){
				for(int k=i; k<j; k++){
					dp[i][j]=Math.min(dp[i][j], dp[i][k]+dp[k+1][j]+a[i]*b[k]
							*a[k+1]*b[j]);
				}
			}
		}

		println(""+dp[0][n-1]);

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