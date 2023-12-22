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

	int n, m;
	int[] b, a;

	void run(){
		for(;;){
			n=sc.nextInt();
			m=sc.nextInt();
			if((n|m)==0){
				break;
			}
			b=new int[n];
			a=new int[m];
			for(int i=0; i<n; i++){
				b[i]=sc.nextInt();
			}
			for(int i=0; i<m; i++){
				a[i]=sc.nextInt();
			}
			solve();
		}
	}

	void solve(){
		int p=0;
		int i;
		for(i=0; i<m; i++){
			p+=a[i];
			if(p>=n-1){
				break;
			}
			p+=b[p];
			if(p>=n-1){
				break;
			}
		}
		println(""+(i+1));
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