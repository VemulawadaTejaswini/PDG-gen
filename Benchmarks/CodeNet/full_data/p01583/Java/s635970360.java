import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;

public class Main{
	Scanner sc=new Scanner(System.in);

	int INF=1<<28;
	double EPS=1e-12;

	int n, m, p;
	int[] xs, ks;
	int[][] ls;
	int[] ys;
	int[] js1, js2, ds;

	void run(){
		n=sc.nextInt();
		m=sc.nextInt();
		p=sc.nextInt();
		xs=new int[n];
		ks=new int[n];
		ls=new int[n][];
		for(int j=0; j<n; j++){
			xs[j]=sc.nextInt();
			ks[j]=sc.nextInt();
			ls[j]=new int[ks[j]];
			for(int i=0; i<ks[j]; i++){
				ls[j][i]=sc.nextInt()-1;
			}
		}
		ys=new int[m];
		for(int i=0; i<m; i++){
			ys[i]=sc.nextInt();
		}
		js1=new int[p];
		js2=new int[p];
		ds=new int[p];
		for(int i=0; i<p; i++){
			js1[i]=sc.nextInt()-1;
			js2[i]=sc.nextInt()-1;
			ds[i]=sc.nextInt();
		}
		solve();
	}

	void solve(){
		int sum=0;
		V source=new V(), sink=new V();
		V[] cs=new V[n];
		V[] ts=new V[m];
		V[] ps=new V[p];
		for(int i=0; i<n; i++){
			cs[i]=new V();
		}
		for(int i=0; i<m; i++){
			ts[i]=new V();
		}
		for(int i=0; i<p; i++){
			ps[i]=new V();
		}
		for(int j=0; j<n; j++){
			sum+=xs[j];
			source.add(cs[j], xs[j]);
			for(int i=0; i<ks[j]; i++){
				cs[j].add(ts[ls[j][i]], INF);
			}
		}
		boolean[] used=new boolean[m];
		for(int i=0; i<p; i++){
			used[js1[i]]=used[js2[i]]=true;
			// ts[js1[i]].add(ps[i], INF);
			// ts[js2[i]].add(ps[i], INF);
			ts[js1[i]].add(ps[i], ys[js1[i]]);
			ts[js2[i]].add(ps[i], ys[js2[i]]);
			// debug(ys[js1[i]], ys[js2[i]]);
			ps[i].add(sink, ds[i]);
		}
		for(int i=0; i<m; i++){
			if(!used[i]){
				ts[i].add(sink, ys[i]);
			}
		}
		ArrayList<V> list=new ArrayList<V>();
		list.addAll(asList(source, sink));
		list.addAll(asList(cs));
		list.addAll(asList(ts));
		list.addAll(asList(ps));
//		debug(sum);
//		debug(fordFulkerson(list.toArray(new V[0]), source, sink));
		println(sum-fordFulkerson(list.toArray(new V[0]), source, sink)+"");
	}

	int fordFulkerson(V[] vs, V s, V t){
		for(int flow=0;;){
			for(V v : vs)
				v.used=false;
			int f=dfs(s, t, INF);
			if(f==0)
				return flow;
			flow+=f;
		}
	}

	int dfs(V v, V t, int f){
		if(v==t)
			return f;
		v.used=true;
		for(E e : v.es){
			if(!e.to.used&&e.cap>0){
				int d=dfs(e.to, t, min(f, e.cap));
				if(d>0){
					e.cap-=d;
					e.rev.cap+=d;
					return d;
				}
			}
		}
		return 0;
	}

	class V{
		ArrayList<E> es=new ArrayList<E>();
		boolean used;

		void add(V to, int cap){
			E e=new E(to, cap), rev=new E(this, 0);
			e.rev=rev;
			rev.rev=e;
			es.add(e);
			to.es.add(rev);
		}
	}

	class E{
		V to;
		E rev;
		int cap;

		E(V to, int cap){
			this.to=to;
			this.cap=cap;
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
		new Main().run();
	}
}