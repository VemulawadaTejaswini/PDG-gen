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
		boolean[] fs=new boolean[10001];
		for(int i=0; i<10001; i++){
			fs[i]=isPrime(i-2)&&isPrime(i);
		}

		for(; sc.hasNext();){
			int n=sc.nextInt();
			if(n==0){
				break;
			}
			for(; !fs[n]; n--);
			println((n-2)+" "+n);
		}
	}

	boolean isPrime(int n){
		for(int i=2; i*i<=n; i++){
			if(n%i==0){
				return false;
			}
		}
		return n>=2;
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