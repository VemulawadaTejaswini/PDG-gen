import java.util.*;
import java.util.Map.Entry;
import java.lang.*;
import java.math.*;
import java.io.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main{

	Scanner sc;

	static final int INF=1<<28;
	static final double EPS=1e-9;

	class R{
		int r;
	}

	void run(){
		sc=new Scanner(System.in);
		String[] ss=sc.nextLine().split(" ");
		HashMap<String, R> map=new HashMap<String, R>();
		String ans2="";
		for(String s : ss){
			if(!map.containsKey(s))
				map.put(s, new R());
			map.get(s).r++;
			if(s.length()>ans2.length())
				ans2=s;
		}
		String ans="";
		int max=0;
		for(Entry<String, R> entry : map.entrySet()){
			if(entry.getValue().r>max){
				ans=entry.getKey();
				max=entry.getValue().r;
			}
		}
		println(ans+" "+ans2);
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