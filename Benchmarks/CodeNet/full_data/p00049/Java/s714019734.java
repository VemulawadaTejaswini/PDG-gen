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
		int a=0, b=0, ab=0, o=0;
		for(; sc.hasNext();){
			String s=sc.nextLine().split(",")[1];
			if(s.equals("A"))
				a++;
			else if(s.equals("B"))
				b++;
			else if(s.equals("AB"))
				ab++;
			else
				o++;
		}
		println(a+"");
		println(b+"");
		println(ab+"");
		println(o+"");
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