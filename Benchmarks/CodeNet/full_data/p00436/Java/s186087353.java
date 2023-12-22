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
		int[] a=new int[2*n];
		int[] b=new int[2*n];
		for(int i=0; i<2*n; i++){
			a[i]=i+1;
		}
		int m=sc.nextInt();
		for(int j=0; j<m; j++){
			int k=sc.nextInt();
			if(k==0){
				for(int i=0; i<n; i++){
					b[2*i]=a[i];
					b[2*i+1]=a[i+n];
				}
			}else{
				for(int i=0; i<k; i++){
					b[2*n-k+i]=a[i];
				}
				for(int i=0; i<2*n-k; i++){
					b[i]=a[k+i];
				}
			}
			System.arraycopy(b, 0, a, 0, 2*n);
		}
		for(int i=0; i<2*n; i++){
			println(a[i]+"");
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
		// System.setOut(new PrintStream(new BufferedOutputStream(System.out)));
		new Main().run();
	}
}