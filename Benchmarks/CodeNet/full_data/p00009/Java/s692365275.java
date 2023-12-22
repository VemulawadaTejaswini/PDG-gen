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
		sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=0;
		for(int i=2; i<=n; i++)
			if(isPrime(i))
				a++;
		println(""+a);
		sc.close();
	}

	boolean isPrime(int n){
		int m=(int)sqrt(n);
		if(n==2)
			return true;
		if(n%2==0)
			return false;
		for(int i=3; i<=m; i++)
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