import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main{

	Scanner sc=new Scanner(System.in);

	int INF=1<<28;
	double EPS=1e-9;

	String worm;

	void run(){
		for(;;){
			worm=sc.next();
			if(worm.equals("0")){
				break;
			}
			solve();
		}
	}

	void solve(){
		LinkedList<String> que=new LinkedList<String>();
		TreeSet<String> set=new TreeSet<String>();
		HashMap<String, Integer> map=new HashMap<String, Integer>();
		que.add(worm);
		set.add(worm);
		map.put(worm, 0);
		for(; !que.isEmpty();){
			String s=que.poll();
			boolean f=true;
			for(int i=0; i<s.length(); i++){
				f&=s.charAt(0)==s.charAt(i);
			}
			// debug(s,map.get(s));
			if(f){
				println(""+map.get(s));
				return;
			}
			for(String t : next(s)){
				if(!set.contains(t)){
					que.offer(t);
					set.add(t);
					map.put(t, map.get(s)+1);
				}
			}
		}
		println("NA");
	}

	LinkedList<String> next(String s){
		LinkedList<String> list=new LinkedList<String>();
		for(int i=0; i<s.length()-1; i++){
			if(s.charAt(i)!=s.charAt(i+1)){
				char c='*';
				switch(s.charAt(i)+s.charAt(i+1)){
				case 'r'+'g':
					c='b';
					break;
				case 'g'+'b':
					c='r';
					break;
				case 'b'+'r':
					c='g';
					break;
				}
				list.add(s.substring(0, i)+c+c
						+(i<s.length()-2?s.substring(i+2, s.length()):""));
			}
		}
		return list;
	}

	void debug(Object... os){
		System.err.println(Arrays.deepToString(os));
	}

	void print(String s){
		System.out.print(s);
	}

	void println(String s){
		System.out.println(s);
	}

	public static void main(String[] args){
		// System.setOut(new PrintStream(new BufferedOutputStream(System.out)));
		new Main().run();
	}
}