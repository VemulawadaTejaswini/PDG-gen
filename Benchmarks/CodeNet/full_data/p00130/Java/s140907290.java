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

	V[] vs;

	void run(){
		for(int n=sc.nextInt(); n>0; n--){
			String s=sc.next();
			// a, >e, >c, >b
			vs=new V[26];
			for(int i=0; i<26; i++){
				vs[i]=new V((char)(i+'a'));
			}
			int len=s.length()/3+1;
			for(int i=0; i<len-1; i++){
				V v=vs[s.charAt(i*3)-'a'];
				V u=vs[s.charAt(i*3+3)-'a'];
				v.enabled=true;
				u.enabled=true;
				if(s.charAt(i*3+1)=='-'){
					v.add(u);
				}else{
					u.add(v);
				}
			}
			solve();
		}
	}

	void solve(){
		topologicalSort(vs);
		for(V u:us){
			if(u.enabled){
				print(""+u.c);
			}
		}
		println("");
	}

	V[] us;
	int n;

	void topologicalSort(V[] vs){
		n=vs.length;
		us=new V[n];
		for(V v : vs){
			if(v.state==0){
				dfs(v);
			}
		}
	}

	boolean dfs(V v){
		v.state=1;
		for(V u : v){
			if(u.state==1||u.state==0&&!dfs(u))
				return false;
		}
		us[--n]=v;
		v.state=2;
		return true;
	}

	class V extends TreeSet<V> implements Comparable<V>{
		int state;
		char c;
		boolean enabled;

		V(char c){
			this.c=c;
		}

		@Override
		public int compareTo(V v){
			return c-v.c;
		}
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