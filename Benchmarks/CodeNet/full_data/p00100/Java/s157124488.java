package p0100;

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
			int n=sc.nextInt();
			if(n==0)
				break;
			HashMap<Integer, Long> map=new HashMap<Integer, Long>();
			LinkedList<Integer> list=new LinkedList<Integer>();
			for(int i=0; i<n; i++){
				int id=sc.nextInt();
				long a=sc.nextInt();
				long b=sc.nextInt();
				if(!map.containsKey(id)){
					list.addLast(id);
					map.put(id, 0l);
				}
				map.put(id, map.get(id)+a*b);
			}
			boolean f=false;
			for(int id : list){
				println("test:"+id+":"+map.get(id));
				if(map.get(id)>=1000000){
					println(id+"");
					f=true;
				}
			}
			if(!f)
				println("NA");
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