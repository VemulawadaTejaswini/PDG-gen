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

	int n, m;
	HashMap<String, Integer> val;
	HashMap<String, LinkedList<String>> recipe;
	String item;

	void run(){
		for(;;){
			val=new HashMap<String, Integer>();
			recipe=new HashMap<String, LinkedList<String>>();
			n=sc.nextInt();
			if(n==0){
				break;
			}
			for(int i=0; i<n; i++){
				String s=sc.next();
				int d=sc.nextInt();
				val.put(s, d);
			}
			m=sc.nextInt();
			for(int j=0; j<m; j++){
				String s=sc.next();
				int k=sc.nextInt();
				LinkedList<String> list=new LinkedList<String>();
				for(int i=0; i<k; i++){
					String t=sc.next();
					list.add(t);
				}
				recipe.put(s, list);
			}
			item=sc.next();
			solve();
		}
	}

	void solve(){
		println(dfs(item)+"");
	}

	int dfs(String s){
		int res=INF;
		if(val.containsKey(s)){
			res=min(res, val.get(s));
		}
		if(recipe.containsKey(s)){
			int sum=0;
			for(String t : recipe.get(s)){
				sum+=dfs(t);
			}
			res=min(res, sum);
		}
		return res;
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