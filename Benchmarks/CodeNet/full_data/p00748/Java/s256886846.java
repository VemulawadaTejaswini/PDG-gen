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

	int[] dp1, dp2;
	int n;

	void run(){
		dp1=new int[max];
		dp2=new int[max];
		fill(dp1, INF);
		fill(dp2, INF);
		dp1[0]=0;
		dp2[0]=0;

		for(int i=0; i<max; i++){
			for(int j=1, sum=1; i+sum<max; j++, sum+=j*(j+1)/2){
				dp1[i+sum]=min(dp1[i+sum], dp1[i]+1);
				if(sum%2==1){
					dp2[i+sum]=min(dp2[i+sum], dp2[i]+1);
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