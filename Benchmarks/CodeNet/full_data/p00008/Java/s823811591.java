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
			if(!sc.hasNext())
				break;
			int n=sc.nextInt();
			int r=0;
			for(int d=0; d<=9; d++)
				for(int c=0; c<=9; c++)
					for(int b=0; b<=9; b++)
						for(int a=0; a<=9; a++)
							if(a+b+c+d==n)
								r++;
			println(""+r);
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