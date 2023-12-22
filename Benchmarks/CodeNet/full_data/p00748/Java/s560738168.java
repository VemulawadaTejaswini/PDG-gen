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

	int max=1000001;

	int[] dp1, a;
	int n;

	void run(){
		dp1=new int[max];
		a=new int[max];

		fill(dp1, INF);
		dp1[0]=0;
		for(int j=0; j<5; j++){
			System.arraycopy(dp1, 0, a, 0, max);
			for(int k=0; k*(k+1)*(k+2)/6<max; k++){
				int m=k*(k+1)*(k+2)/6;
				for(int i=0; i+m<max; i++){
					dp1[i+m]=min(dp1[i+m], a[i]+1);
				}
			}
		}

		for(;;){
			n=sc.nextInt();
			if(n==0){
				break;
			}
			solve();
		}
	}

	void solve(){
		int[] dp2=new int[n+1];
		fill(dp2, INF);
		dp2[0]=0;
		for(int j=0;; j++){
			System.arraycopy(dp2, 0, a, 0, n+1);
			for(int k=0; k*(k+1)*(k+2)/6<n+1; k++){
				int m=k*(k+1)*(k+2)/6;
				if(m%2==0){
					continue;
				}
				for(int i=0; i+m<n+1; i++){
					dp2[i+m]=min(dp2[i+m], a[i]+1);
				}
			}
			// debug(dp);
			if(dp2[n]<INF){
				break;
			}
		}
		println(dp1[n]+" "+dp2[n]);
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