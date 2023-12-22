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

	int n, t, u;
	int[][] a, b;
	int ans;

	void run(){
		t=10;
		u=5;
		for(;;){
			n=sc.nextInt();
			if(n==0){
				break;
			}
			a=new int[u][n];
			for(int j=0; j<u; j++){
				String s=sc.next();
				for(int i=0; i<n; i++){
					a[j][i]=s.charAt(i)=='.'?0:1;
				}
			}
			solve();
		}
	}

	void rec(int k, int p){
		if(p>=ans){
			return;
		}
		if(k==t+1){
			ans=min(ans, p+n-1);
			return;
		}
		for(int q=p; q<p+n; q++){
			boolean f=true;
			for(int j=0; j<u; j++){
				for(int i=0; i<n; i++){
					f&=a[j][i]==0||b[j][q+i]==0;
				}
			}
			if(f){
				for(int j=0; j<u; j++){
					for(int i=0; i<n; i++){
						if(a[j][i]==1){
							b[j][q+i]=k;
						}
					}
				}
				rec(k+1, q+1);
				for(int j=0; j<u; j++){
					for(int i=0; i<n; i++){
						if(a[j][i]==1){
							b[j][q+i]=0;
						}
					}
				}
			}
		}
	}

	void solve(){
		ans=INF;
		b=new int[u][(n+1)*(t+1)];
		rec(1, 0);
		println(""+ans);
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