import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	Scanner sc = new Scanner(System.in);

	int INF = 1 << 28;
	double EPS = 1e-9;

	int n, r;
	int[] a,b;
	
	void run() {
		for(;;){
			n=sc.nextInt();
			r=sc.nextInt();
			if((n|r)==0){
				break;
			}
			a=new int[n];
			b=new int[n];
			for(int i=0;i<n;i++){
				a[i]=n-i;
			}
			for(int k=0;k<r;k++){
				System.arraycopy(a, 0, b, 0, n);
				int p=sc.nextInt();
				int c=sc.nextInt();
				for(int i=0;i<c;i++){
					a[i]=b[p-1+i];
				}
				for(int i=0;i<p-1;i++){
					a[c+i]=b[i];
				}
				// debug(a);
			}
			println(""+a[0]);
		}
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	void print(String s) {
		System.out.print(s);
	}

	void println(String s) {
		System.out.println(s);
	}

	public static void main(String[] args) {
		// System.setOut(new PrintStream(new BufferedOutputStream(System.out)));
		new Main().run();
	}
}