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

	void run(){
		sc=new Scanner(System.in);
		TreeMap<Integer, Integer> map1=new TreeMap<Integer, Integer>();
		TreeMap<Integer, Integer> map2=new TreeMap<Integer, Integer>();
		for(;;){
			String s=sc.nextLine();
			if(s.equals(""))
				break;
			String[] ss=s.split(",");
			int id=Integer.parseInt(ss[0]);
			if(!map1.containsKey(id))
				map1.put(id, 0);
			map1.put(id, map1.get(id)+1);
		}

		for(; sc.hasNext();){
//		for(int i=0;i<3 ;i++){
			String[] ss=sc.nextLine().split(",");
			int id=Integer.parseInt(ss[0]);
			if(!map2.containsKey(id))
				map2.put(id, 0);
			map2.put(id, map2.get(id)+1);
		}

		for(Entry<Integer, Integer> entry : map1.entrySet()){
			int id=entry.getKey();
			if(map2.containsKey(id)){
				println(id+" "+(entry.getValue()+map2.get(id)));
			}
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