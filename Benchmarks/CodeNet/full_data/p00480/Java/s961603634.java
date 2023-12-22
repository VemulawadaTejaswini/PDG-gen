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

	void run(){
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0; i<n; i++){
			a[i]=sc.nextInt();
		}
		long[][] dp=new long[n-1][21];
		dp[0][a[0]]=1;
		for(int j=1; j<n-1; j++){
			for(int i=0; i<21; i++){
				if(i+a[j]<21){
					dp[j][i+a[j]]+=dp[j-1][i];
				}
				if(i-a[j]>=0){
					dp[j][i-a[j]]+=dp[j-1][i];
				}
			}
		}
		println(dp[n-2][a[n-1]]+"");
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