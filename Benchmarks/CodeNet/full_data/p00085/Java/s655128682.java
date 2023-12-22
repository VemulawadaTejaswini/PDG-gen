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
		for(;;){
			int n=sc.nextInt();
			int m=sc.nextInt();
			if(n==0&&m==0)
				break;
			int h=m-1-m;
			boolean[] f=new boolean[n];
			for(int i=0; i<n; i++){
				for(int k=0; k<m; k++)
					while(f[h=(h+1)%n]);
				f[h]=true;
			}
			println(h+1+"");
		}
		sc.close();
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