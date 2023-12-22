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
			int[][] a=new int[n][n];
			int x=n/2;
			int y=n/2+1;
			for(int m=1; m<=n*n; m++){
				while(a[y][x]!=0){
					x=(x+n-1)%n;
					y=(y+1)%n;
				}
				a[y][x]=m;
				x=(x+1)%n;
				y=(y+1)%n;
			}
			for(int j=0; j<n; j++){
				for(int i=0; i<n; i++){
					print(String.format("%4d", a[j][i]));
				}
				println("");
			}
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