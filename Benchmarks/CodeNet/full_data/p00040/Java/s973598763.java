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
		int n=sc.nextInt();
		sc.nextLine();
		for(int i=0; i<n; i++){
			String s=sc.nextLine();
			println(dec(s));
		}
		sc.close();
	}

	String dec(String s){
		for(int a=0; a<26; a++){
			if(a%2==0||a%13==0)
				continue;
			for(int b=0; b<26; b++){
				String t="";
				for(char c : s.toCharArray()){
					if(Character.isLowerCase(c))
						c=(char)((a*(c-'a')+b)%26+'a');
					t+=c;
				}
				if(t.contains("that")||t.contains("this"))
					return t;
			}
		}

		return null;
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