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
	int[] x, y, c;
	int[] parent;

	@SuppressWarnings("unchecked")
	void run(){
		for(;;){
			n=sc.nextInt();
			m=sc.nextInt();
			if((m|n)==0){
				break;
			}
			x=new int[m];
			y=new int[m];
			c=new int[m];
			parent=new int[n];
			fill(parent, -1);
			for(int i=0; i<m; i++){
				x[i]=sc.nextInt();
				y[i]=sc.nextInt();
				c[i]=sc.nextInt();
				parent[y[i]]=x[i];
			}
			solve();
		}
	}

	int[][] w;
	boolean[][] exist;

	void solve(){
		make(n);
		for(int i=0; i<m; i++){
			union(x[i], y[i]);
		}
		int k=0;
		for(int i=0; i<n; i++){
			if(p[i]<0){
				k++;
			}
		}
		w=new int[n][n];
		exist=new boolean[n][n];
		long ans=0;
		for(int i=0; i<m; i++){
			exist[x[i]][y[i]]=exist[y[i]][x[i]]=true;
			if(c[i]<0){
				ans+=c[i];
				c[i]=0;
			}
			w[x[i]][y[i]]=w[y[i]][x[i]]+=c[i];
		}
		boolean[][] used=new boolean[n][n];

		visited=new boolean[n];
		long min=1L<<40;
		for(int i=0; i<n; i++){
			fill(visited, false);
			if(dfs(i)==i){ // i->p[i]->...->i
				PriorityQueue<Integer> que=new PriorityQueue<Integer>();
				que.offer(w[i][parent[i]]);
				used[i][parent[i]]=used[parent[i]][i]=true;
				for(int v=parent[i]; v!=i; v=parent[v]){
					que.offer(w[v][parent[v]]);
					used[v][parent[v]]=used[parent[v]][v]=true;
				}
				min=min(min, que.poll()+que.poll());
			}
		}
		PriorityQueue<Integer> que=new PriorityQueue<Integer>();
		for(int i=0; i<m; i++){
			if(!used[x[i]][y[i]]){
				que.offer(c[i]);
			}
		}
		if(!que.isEmpty()){
			min=min(min, que.poll());
		}
		println(min+ans+"");
		if(1==1){
			return;
		}

		for(int j=0; j<n-1; j++){
			for(int i=j+1; i<n; i++){
				if(exist[j][i]){
					que.offer(w[j][i]);
				}
			}
		}
		// debug(p);
		// debug(k);
		sort(c);
		int i=0;
		if(k==1){
			// ans+=que.poll();
			ans+=c[0];
			i++;
			if(loop()){
				ans+=c[1];
				i++;
			}
		}
		for(i=1; i<m; i++){
			if(c[i]<0){
				ans+=c[i];
			}
		}
		println(ans+"");
	}

	boolean[] visited;

	boolean loop(){
		visited=new boolean[n];
		for(int i=0; i<n; i++){
			fill(visited, false);
			if(dfs(i)==i){}
		}
		return false;
	}

	int dfs(int v){
		// debug(v, visited);
		if(v==-1){
			return -1;
		}
		if(visited[v]){
			return v;
		}
		visited[v]=true;
		return dfs(parent[v]);
	}

	int[] p;

	void make(int n){
		p=new int[n];
		fill(p, -1);
	}

	int find(int x){
		return p[x]<0?x:(p[x]=find(p[x]));
	}

	boolean union(int x, int y){
		x=find(x);
		y=find(y);
		if(x!=y){
			if(p[y]<p[x]){
				int t=x;
				x=y;
				y=t;
			}
			p[x]+=p[y];
			p[y]=x;
		}
		return x!=y;
	}

	int size(int x){
		return -p[find(x)];
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