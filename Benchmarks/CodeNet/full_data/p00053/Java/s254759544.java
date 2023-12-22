import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main{

	Scanner sc;

	static final int INF=1<<28;
	static final double EPS=1e-9;

	void run(){
		int[] p=new int[10001];
		int k=1;
		for(int i=1; i<p.length; i++){
			while(!isPrime(++k));
			p[i]=k+p[i-1];
			// println(k+"");
		}

		sc=new Scanner(System.in);
		for(;;){
			int n=sc.nextInt();
			if(n==0)
				break;
			println(p[n]+"");
		}
		sc.close();
	}

	boolean isPrime(int n){
		int m=(int)sqrt(n);
		for(int i=2; i<=m; i++)
			if(n%i==0)
				return false;
		return true;
	}

	void print(String s){
		System.out.print(s);
	}

	void println(String s){
		System.out.println(s);
	}

	public static void main(String[] args){
		new Main().run();
	}
}