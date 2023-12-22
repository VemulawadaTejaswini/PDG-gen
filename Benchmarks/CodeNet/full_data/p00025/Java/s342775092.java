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
			LinkedList<Integer> a=new LinkedList<Integer>();
			LinkedList<Integer> b=new LinkedList<Integer>();
			for(int i=0; i<4; i++)
				a.add(sc.nextInt());
			for(int i=0; i<4; i++)
				b.add(sc.nextInt());
			int hit=0, brow=0;
			for(int i=0; i<4; i++){
				if(a.get(i)==b.get(i))
					hit++;
				else if(a.contains(b.get(i)))
					brow++;
			}
			println(hit+" "+brow);
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