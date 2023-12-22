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
		int[] a=new int[100];
		int[] b=new int[100];
		int n=0;
		for(; sc.hasNext();){
			System.arraycopy(a, 0, b, 0, 100);
			String[] s=sc.nextLine().split(",");
			if(s.length>n){
				for(int i=0; i<s.length; i++){
					int m=Integer.parseInt(s[i]);
					if(i>0)
						a[i]=max(b[i-1]+m, b[i]+m);
					else
						a[i]=b[i]+m;
//					print(a[i]+", ");
				}
			}else{
				for(int i=0; i<s.length; i++){
					int m=Integer.parseInt(s[i]);
					a[i]=max(b[i+1]+m, b[i]+m);
//					print(a[i]+", ");
				}
			}
			n=s.length;
//			println("");
		}
		println(a[0]+"");
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