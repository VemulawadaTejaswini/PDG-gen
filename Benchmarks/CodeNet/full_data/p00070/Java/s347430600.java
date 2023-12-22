import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main{

	Scanner sc=new Scanner(System.in);

	static final int INF=1<<28;
	static final double EPS=1e-9;

	int n, s;

	void run(){
		for(; sc.hasNext();){
			n=sc.nextInt();
			s=sc.nextInt();
			solve();
		}
		sc.close();
	}

	void solve(){
		// nqÌbªs

		int[][] dp=new int[s+1][1<<10];
		int[][] dp2=new int[s+1][1<<10];
		// [½gÁ½][s]Ì

		dp[0][0]=1;

		for(int j=1; j<=n; j++){
			for(int i=0; i<=s; i++){
				System.arraycopy(dp[i], 0, dp2[i], 0, 1<<10);
				Arrays.fill(dp[i], 0);
			}
			for(int i=0; i<10; i++){
				int d=j*i;
				for(int b=0; b<1<<10; b++){
					if(((1<<i)&b)==0){
						for(int k=0; k+d<=s; k++){
							dp[k+d][(1<<i)|b]+=dp2[k][b];
						}
					}
				}
			}
			
			//debug(j);
			for(int i=0; i<=s; i++){
				//debug(dp[i]);
			}
		}

		int ans=0;
		for(int i=0; i<1<<10; i++){
			ans+=dp[s][i];
		}
		// debug(ans);
		println(ans+"");

		for(int j=0; j<=s; j++){
			int a=0;
			for(int i=0; i<1<<10; i++){
				a+=dp[j][i];
			}
			// debug(j, a);
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
		new Main().run();
	}
}