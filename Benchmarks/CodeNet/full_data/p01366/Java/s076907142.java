import java.util.*;
import java.util.Map.Entry;
import java.lang.*;
import java.math.*;
import java.io.*;

public class Main{
	Scanner sc=new Scanner(System.in);
	int INF=1<<28;
	double EPS=1e-9;

	int n, m;
	//int[][] w, cs;
	HashMap<Integer,Integer>[] w, cs;

	@SuppressWarnings("unchecked")
	void run(){
		for(;;){
			n=sc.nextInt();
			m=sc.nextInt();
			if((n|m)==0){
				break;
			}
			//w=new int[n][n];
			//cs=new int[n][n];
			w=new HashMap[n];
			cs=new HashMap[n];
			for(int i=0; i<n; i++){
				w[i]=new HashMap<Integer, Integer>();
				cs[i]=new HashMap<Integer, Integer>();
				//w[i].put(i, 0);
				//cs[i].put(i, 0);
				//Arrays.fill(w[i], INF);
				//Arrays.fill(cs[i], INF);
				//cs[i][i]=0;
			}
			for(int i=0; i<m; i++){
				int u=sc.nextInt()-1;
				int v=sc.nextInt()-1;
				int d=sc.nextInt();
				int c=sc.nextInt();
				// w[u][v]=w[v][u]=Math.min(w[u][v], d);
				//cs[u][v]=cs[v][u]=Math.min(cs[u][v], c);
				w[u].put(v, d);
				w[v].put(u, d);
				cs[u].put(v, c);
				cs[v].put(u, c);
			}
			solve();
		}
	}

	void solve(){
		boolean[] used=new boolean[n];
		int[] road=new int[n];
		int[] d=new int[n];

		Arrays.fill(d, INF);
		d[0]=0;

		for(;;){
			int u=-1;
			for(int v=0; v<n; v++){
				if(!used[v]&&(u==-1||d[v]<d[u])){
					u=v;
				}
			}
			if(u==-1){
				break;
			}
			debug("");
			debug("u",u);
			debug("d",d);
			debug("road",road);
			used[u]=true;
			for(Entry<Integer,Integer> entry:w[u].entrySet()){
				int v=entry.getKey();
				int w=entry.getValue();
				int c1=cs[road[v]].containsKey(v)?cs[road[v]].get(v):INF;
				int c2=cs[u].get(v);
				if(d[v]>d[u]+w){
					d[v]=d[u]+w;
					road[v]=u;
				}else if(d[v]==d[u]+w&&c1>c2){
					road[v]=u;
				}
			}
/*			for(int v=0; v<n; v++){
				if(d[v]>d[u]+w[u][v]){
					d[v]=d[u]+w[u][v];
					road[v]=u;
				}else if(d[v]==d[u]+w[u][v]&&cs[road[v]][v]>cs[u][v]){
					road[v]=u;
				}
			}*/
		}
		debug(d);
		debug(road);
		int ans=0;
		for(int i=1; i<n; i++){
			//debug("i",i);
			//debug("road[i]",road[i]);
			ans+=cs[i].get(road[i]);
		}
		debug(ans);
		println(""+ans);
	}

	void debug(Object... os){
		//System.err.println(Arrays.deepToString(os));
	}

	void print(String s){
		System.out.print(s);
	}

	void println(String s){
		System.out.println(s);
	}

	public static void main(String[] args){
		try{
			// System.setIn(new FileInputStream("in.txt"));
		}catch(Throwable e){
			e.printStackTrace();
		}
		new Main().run();
	}
}