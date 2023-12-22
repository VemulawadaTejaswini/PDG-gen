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
		int ans=0;
//		Pattern pattern=Pattern.compile("^\\d+|\\d+");
		Pattern pattern=Pattern.compile("\\d+");
		for(; sc.hasNext();){
//		for(int i=0;i<2;i++){
			String s=sc.next();
			Matcher matcher=pattern.matcher(s);
			while(matcher.find()){
				ans+=Integer.parseInt(matcher.group());
//				println(matcher.group());
			}
		}
		println(ans+"");
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