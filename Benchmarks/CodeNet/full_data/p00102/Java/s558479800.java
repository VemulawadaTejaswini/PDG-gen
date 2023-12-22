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
			if(n==0)
				break;
			int[] s=new int[n];
			for(int j=0; j<n; j++){
				int sum=0;
				for(int i=0; i<n; i++){
					int d=sc.nextInt();
					print(String.format("%5d", d));
					sum+=d;
					s[i]+=d;
				}
				println(String.format("%5d", sum));
			}
			int sum=0;
			for(int i=0; i<n; i++){
				print(String.format("%5d", s[i]));
				sum+=s[i];
			}
			println(String.format("%5d", sum));

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