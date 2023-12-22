import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;

// Statement Coverage
// 2013/03/20
public class Main{
	Scanner sc=new Scanner(System.in);

	int n, m;
	String[] ss;

	void run(){
		n=sc.nextInt();
		m=sc.nextInt();
		ss=new String[n];
		for(int i=0; i<n; i++){
			ss[i]=sc.next();
		}
		solve();
	}

	void solve(){
		V[] vs=new V[m*2];
		for(int i=0; i<m*2; i++){
			vs[i]=new V();
		}
		for(int i=0; i<m; i++){
			vs[i].not=vs[m+i];
			vs[m+i].not=vs[i];
		}
		ArrayList<String> list=new ArrayList<String>();
		for(String s : ss){
			E exp=conv(s);
			if(exp.s1!=null&&!list.contains(exp.s1)){
				list.add(exp.s1);
			}
			if(exp.s2!=null&&!list.contains(exp.s2)){
				list.add(exp.s2);
			}
		}
		for(String s : ss){
			E exp=conv(s);
			if(exp.s2==null){
				V v=vs[list.indexOf(exp.s1)];
				if(exp.not1){
					v=v.not;
				}
				or(v, v);
			}else{
				V v1=vs[list.indexOf(exp.s1)], v2=vs[list.indexOf(exp.s2)];
				if(exp.not1){
					v1=v1.not;
				}
				if(exp.not2){
					v2=v2.not;
				}
				if(exp.or){
					or(v1, v2);
				}else{
					or(v1, v1);
					or(v2, v2);
				}
			}
		}
		scc(vs);
		boolean ok=true;
		for(int i=0; i<m; i++){
			ok&=vs[i].comp!=vs[i].not.comp;
		}
		println(ok?"accept":"reject");
	}

	void or(V u, V v){
		u.not.connect(v);
		v.not.connect(u);
	}

	E conv(String s){
		s=s.substring(0, s.length()-1);
		int k=max(s.indexOf('&'), s.indexOf('|'));
		if(k==-1){
			String name=s.replaceAll("\\(|\\)|~", "");
			boolean not=count(s, '~')%2==1;
			return new E(name, null, not, false, false);
		}else{
			boolean or=s.charAt(k)=='|';
			String s1=s.substring(0, k), s2=s.substring(k+1, s.length());
			String name1=s1.replaceAll("\\(|\\)|~", "");
			String name2=s2.replaceAll("\\(|\\)|~", "");
			boolean not=false, not1=false, not2=count(s2, '~')%2==1;
			int left=0, right=count(s2, ')')-count(s2, '(');
			for(int i=k-1; i>=0; i--){
				if(s1.charAt(i)=='~'){
					if(right==0||right-left>0){
						not1=!not1;
					}else{
						not=!not;
					}
				}else if(s1.charAt(i)=='('){
					left++;
				}else if(s1.charAt(i)==')'){
					left--;
				}
			}
			if(not){
				not1=!not1;
				not2=!not2;
				or=!or;
			}
			return new E(name1, name2, not1, not2, or);
		}
	}

	int count(String s, char c){
		return s.length()-s.replaceAll("\\"+c, "").length();
	}

	class E{
		String s1, s2;
		boolean not1, not2;
		boolean or;

		E(String s1, String s2, boolean not1, boolean not2, boolean or){
			this.s1=s1;
			this.s2=s2;
			this.not1=not1;
			this.not2=not2;
			this.or=or;
		}
	}

	LinkedList<V> list;

	int scc(V[] vs){
		list=new LinkedList<V>();
		for(V v : vs)
			dfs(v);
		for(V v : vs)
			v.visit=false;
		int k=0;
		for(V u : list)
			if(!u.visit)
				revdfs(u, k++);
		return k;
	}

	void dfs(V v){
		if(v.visit)
			return;
		v.visit=true;
		for(V u : v.es)
			dfs(u);
		list.addFirst(v);
	}

	void revdfs(V v, int k){
		if(v.visit)
			return;
		v.visit=true;
		v.comp=k;
		for(V u : v.rs)
			revdfs(u, k);
	}

	class V{
		ArrayList<V> es=new ArrayList<V>(), rs=new ArrayList<V>();
		boolean visit;
		int comp;
		V not;

		void connect(V v){
			es.add(v);
			v.rs.add(this);
		}
	}

	void println(String s){
		System.out.println(s);
	}

	public static void main(String[] args){
		new Main().run();
	}
}