import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
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
		Pattern pattern=Pattern.compile("@\\d.");
		for(; sc.hasNext();){
			String s=sc.next();
			
			Matcher matcher=pattern.matcher(s);
			while(matcher.find()){
				String match=matcher.group();
				int n=match.charAt(1)-'0';
				char c=match.charAt(2);
				String ss="";
				for(int i=0; i<n; i++)
					ss+=c;
				s=s.replaceFirst(matcher.group(), ss);
			}
				println(s);

			/**
			 * 			String s=sc.next();
			while(true){
			
			Matcher matcher=pattern.matcher(s);
			if(matcher.find()){
				String match=matcher.group();
				int n=match.charAt(1)-'0';
				char c=match.charAt(2);
				String ss="";
				for(int i=0; i<n; i++)
					ss+=c;
				s=s.replaceFirst(matcher.group(), ss);
			}else{
				println(s);
				break;
			}
			}
			 */
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