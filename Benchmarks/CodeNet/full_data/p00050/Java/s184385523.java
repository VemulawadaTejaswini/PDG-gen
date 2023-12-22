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
		String s=sc.nextLine();

		Pattern pattern=Pattern.compile("peach|apple");
		Matcher matcher=pattern.matcher(s);
		StringBuffer sb=new StringBuffer();
		while(matcher.find()){
			if(matcher.group().equals("peach"))
				matcher.appendReplacement(sb, "apple");
			else
				matcher.appendReplacement(sb, "peach");
		}
		matcher.appendTail(sb);

		println(sb.toString());
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