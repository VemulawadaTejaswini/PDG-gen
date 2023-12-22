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
			Scanner c=new Scanner(sc.nextLine());
			LinkedList<Double> stack=new LinkedList<Double>();
			for(; c.hasNext();){
				String s=c.next();
				if(Character.isDigit(s.charAt(0))){
					stack.addFirst(Double.parseDouble(s));
				}else{
					double d2=stack.removeFirst();
					double d1=stack.removeFirst();
					double d=0;
					// double d1=0,d2=0,d=0;
					switch(s.charAt(0)){
					case '+':
						d=d1+d2;
						break;
					case '-':
						d=d1-d2;
						break;
					case '*':
						d=d1*d2;
						break;
					case '/':
						d=d1/d2;
						break;
					}
					stack.addFirst(d);
				}
			}
			println(stack.removeFirst()+"");
		}
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