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
		int max=10000000;
		int p=0;
		int[] prime=new int[max];
		boolean[] isPrime=new boolean[max+1];
		Arrays.fill(isPrime, true);
		isPrime[0]=isPrime[1]=false;
		for(int i=2; i<=max; i++){
			if(isPrime[i]){
				prime[p++]=i;
				for(int j=2*i; j<=max; j+=i){
					isPrime[j]=false;
				}
			}
		}

		for(;;){
			int n=sc.nextInt();
			if(n==0){
				break;
			}
			for(;; n--){
				if(isPrime[n-8]&&isPrime[n-6]&&isPrime[n-2]&&isPrime[n]){
					println(""+n);
					break;
				}
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