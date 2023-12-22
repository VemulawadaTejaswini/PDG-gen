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
			int s1=sc.nextInt();
			int s2=sc.nextInt();
			int s3=sc.nextInt();
			double minR=sqrt(s1*s1+s2*s2);
			minR=min(minR, sqrt(s2*s2+s3*s3));
			minR=min(minR, sqrt(s3*s3+s1*s1));
			if(s1==0&&s2==0&&s3==0)
				break;
//			println(minR+"");
			int n=sc.nextInt();
			for(int i=0; i<n; i++){
				int r=sc.nextInt();
				if(2*r>minR)
					println("OK");
				else
					println("NA");
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