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
			BigInteger a=sc.nextBigInteger();
			BigInteger b=sc.nextBigInteger();
			BigInteger gcd=a.gcd(b);
			BigInteger lcm=a.multiply(b).divide(gcd);
			println(gcd+" "+lcm);
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