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
		for(; sc.hasNext();){
			int y=sc.nextInt();
			int m=sc.nextInt();
			int d=sc.nextInt();
			if((y>=1990)||(y==1989&&(m>=2||m==1&&d>=8)))
				println(String.format("heisei %d %d %d", y-1988, m, d));
			else if((y>=1927)||(y==1926&&m==12&&d>=25))
				println(String.format("showa %d %d %d", y-1925, m, d));
			else if((y>=1913)||(y==1912&&(m>=8||m==7&&d>=30)))
				println(String.format("taisho %d %d %d", y-1911, m, d));
			else if((y>=1869)||(y==1868&&(m>=10||m==9&&d>=8)))
				println(String.format("meiji %d %d %d", y-1867, m, d));
			else
				println("pre-meiji");
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