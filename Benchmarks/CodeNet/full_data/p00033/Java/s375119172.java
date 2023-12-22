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
		sc.nextLine();
		for(int k=0; k<n; k++){
			String[] ss=sc.nextLine().split(" ");
			int[] a=new int[10];
			for(int i=0; i<10; i++)
				a[i]=Integer.parseInt(ss[i]);
			int x=0;
			for(int i=0; i<10; i++){
				if(a[i]>x){
					x=a[i];
					a[i]=-1;
				}
			}
			x=0;
			for(int i=0; i<10; i++){
				if(a[i]>x){
					x=a[i];
					a[i]=-1;
				}
			}
			boolean f=true;
			for(int i=0; i<10; i++)
				if(a[i]!=-1){
					f=false;
					break;
				}
			println(f?"YES":"NO");
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