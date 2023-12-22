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

	int m, n;
	int[][] a;

	void run(){
		for(;;){
			m=sc.nextInt();
			n=sc.nextInt();
			if((m|n)==0){
				break;
			}
			int k=sc.nextInt();
			a=new int[n][m];
			for(int i=0; i<k; i++){
				int x=sc.nextInt()-1;
				int y=sc.nextInt()-1;
				a[y][x]=1;
			}
			solve();
		}
	}

	void solve(){
		int[][] dp=new int[n][m];
		dp[0][0]=1;
		for(int j=0; j<n; j++){
			for(int i=0; i<m; i++){
				if(a[j][i]==0){
					if(j>0){
						dp[j][i]+=dp[j-1][i];
					}
					if(i>0){
						dp[j][i]+=dp[j][i-1];
					}
				}
			}
		}
		println(dp[n-1][m-1]+"");
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