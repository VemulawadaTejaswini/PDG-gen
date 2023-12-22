import java.util.*;
import static java.lang.Math.*;

public class Main {
	final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		new Main().init();
	}
	void init(){
		final long stackSize = 8*1024*1024;
		new Thread(null, new AOJ1330(), "RUN", stackSize).start();
	}
	
	class AOJ1330 implements Runnable{
		AOJ1330(){}
		@Override public void run(){
//			long start = System.currentTimeMillis();
			while(sc.hasNext()){
				N=sc.nextInt();
				M=sc.nextInt();
				if((N|M)==0)	break;
				solve();
			}
//			System.out.println( (System.currentTimeMillis()-start)+"ms");
		}
		
		int N,M;
		
		void solve(){
			UnionFind uf = new UnionFind(N);
			for(int i=0; i<M; ++i){
				if(sc.next().equals("!")){
					int a=sc.nextInt(), b=sc.nextInt(), w=sc.nextInt();
					--a;
					--b;
					uf.unite(a, b, w);
				}else{
					int a=sc.nextInt(), b=sc.nextInt();
					int ret = uf.getWeight(--a, --b);
					System.out.println(ret>=uf.INF? "UNKNOWN" : ret);
				}
			}
			System.gc();
		}
		
//		// Union-Find Tree
		class UnionFind{
			int[] par,w;
			final int INF = Integer.MAX_VALUE/4;
			
			UnionFind(int n){
				par = new int[n];
				w = new int[n];
				for(int i=0; i<n; ++i)	par[i]=i;
			}
			
			int find(int x){
				if(par[x] == x)	return x;
				else{
					int tmp = find(par[x]);
					w[x] += w[par[x]];
					return par[x] = tmp;
				}
			}
			
			void unite(int x,int y,int ww){
				int px=find(x),
					py=find(y);
				if(px==py)	return;
				
				w[px] = ww - w[x];
				par[px] = y;
			}
			
			int getWeight(int x,int y){
				int xx = find(x),
					yy = find(y);
				return (xx==yy? w[x]-w[y] : INF);
			}
			
		}
}}