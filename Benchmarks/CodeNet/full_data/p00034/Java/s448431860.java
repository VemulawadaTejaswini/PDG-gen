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
		for(;sc.hasNext();){
			String[] s=sc.nextLine().split(",");
			int[] lengths=new int[10];
			int length=0;
			for(int i=0;i<10;i++)
				length+=lengths[i]=Integer.parseInt(s[i]);
			int v1=Integer.parseInt(s[10]);
			int v2=Integer.parseInt(s[11]);
			double x=(double)v1*length/(v1+v2);
//			println("x="+x);
//			println("[x]="+(int)x);
			int tot=0;
			for(int i=0;i<10;i++){
				tot+=lengths[i];
				if(x<tot+EPS){
					//x<tot
					//x-tot<0
					println(""+(i+1));
					break;
				}
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