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
		char[] cs=sc.nextLine().toCharArray();
		for(;;){
			for(int i=0; i<cs.length; i++){
				if(Character.isLowerCase(cs[i])){
					if(cs[i]=='z')
						cs[i]='a';
					else
						cs[i]++;
				}
			}
			String s=new String(cs);
			if(s.indexOf("the")!=-1||s.indexOf("this")!=-1
					||s.indexOf("that")!=-1)
				break;
		}
		println(new String(cs));
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