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

	int n, k;
	int[] a;

	void run(){
		for(;;){
			n=sc.nextInt();
			k=sc.nextInt();
			if((n|k)==0){
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
		int[] sum=new int[n];
		sum[0]=a[0];
		for(int i=1; i<n; i++){
			sum[i]=sum[i-1]+a[i];
		}
		int max=Integer.MIN_VALUE;
		for(int i=0; i+k<n; i++){
			max=max(max, sum[i+k-1]-(i>0?sum[i-1]:0));
		}
		println(max+"");
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