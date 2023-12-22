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
	int[] m, a, b;

	void run(){
		for(;;){
			n=sc.nextInt();
			if(n==0){
				break;
			}
			m=new int[n];
			a=new int[n];
			b=new int[n];
			for(int i=0; i<n; i++){
				m[i]=sc.nextInt();
				a[i]=sc.nextInt();
				b[i]=sc.nextInt();
			}
			solve();
		}
	}

	void solve(){
		for(int j=0; j<n; j++){
			int sum1=0, sum2=0;
			for(int i=0; i<n; i++){
				if(a[i]<=a[j]&&a[j]<b[i]){
					sum1+=m[i];
				}
				if(a[i]<=b[j]-1&&b[j]-1<b[i]){
					sum2+=m[i];
				}
			}
			if(sum1>150||sum2>150){
				println("NG");
				return;
			}
		}
		println("OK");
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