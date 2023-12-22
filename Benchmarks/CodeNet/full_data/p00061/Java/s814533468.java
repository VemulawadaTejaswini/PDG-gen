package kyougi;

import java.io.PrintWriter;
import java.util.*;
class Main{
	static String str="";
	static int n=0;
	private static Scanner sc;
	private static PrintWriter out;
	private static Main app;
	private static Map<Integer,Set<String>> map;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		out = new PrintWriter(System.out);
		app = new Main();
		map = new TreeMap<Integer,Set<String>>();
		app.doing(args);
		
	}
	void doing(String []args){
		for(;!(str=sc.next()).equals("0,0");){
			args=str.split(",");
			
			if(!map.containsKey(n=new Integer(args[1])))map.put(n,new HashSet<String>());
			map.get(n).add(args[0]);
		}
		
		for(int i=0;sc.hasNext();System.out.println(i)){
			str=sc.next();
			i=map.size();
			for(int k:map.keySet())if(map.get(k).contains(str))break;--i;
		}
		
		
		
	}
}