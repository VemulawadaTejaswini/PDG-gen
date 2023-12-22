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

	int n, e;
	int[] a;

	void run(){
		for(;;){
			n=sc.nextInt();
			if(n==0){
				break;
			}
			a=new int[n];
			for(int i=0; i<n; i++){
				a[i]=sc.nextInt();
			}
			e=sc.nextInt();
			solve();
		}
	}

	void solve(){
		int left=0, right=n-1;
		for(int i=1;; i++){
			int mid=(left+right)/2;
			if(a[mid]==e||left==right){
				println(""+i);
				break;
			}
			// debug(i, "", left, right, mid);
			if(a[mid]<e){
				left=mid+1;
			}else if(a[mid]>e){
				right=mid-1;
			}
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