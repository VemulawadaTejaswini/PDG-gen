import java.util.*;
import static java.lang.Math.*;
public class Main {
	final Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		new Main().init();
	}
	void init(){
		final long STACK_SIZE=8*1024*1024;
		new Thread(null, new AOJ2061(), "RUN", STACK_SIZE).start();
	}
	
	// International party
	class AOJ2061 implements Runnable{
		AOJ2061(){}
		@Override public void run(){
			int c=0;
			while(sc.hasNext()){
				N=sc.nextInt();
				M=sc.nextInt();
				if((N|M)==0)	break;
				if(c>0)System.out.println();
				solve();
				++c;
			}
		}
		
		int N,M;
		String[] LANG;
		long[] ST;
		HashMap<String, Integer> dic;
		
		void solve(){
			LANG=new String[N];
			dic=new HashMap<String,Integer>();
			for(int i=0; i<N; ++i){
				LANG[i]=sc.next();
				dic.put(LANG[i], i);
			}
			
			ST=new long[M];
			for(int i=0; i<M; ++i){
				int K=sc.nextInt();
				for(int j=0; j<K; ++j){
					long tmp=dic.get(sc.next());
					ST[i]|=(1<<tmp);
				}
			}
			
			for(int i=1; i<=5; ++i){
				long ans=DFS(0,-1,0L,i,new boolean[M][M]);
				if(ans>0){
					System.out.println(Long.bitCount(ans));
					for(int j=0; j<N; ++j){
						long tmp=1<<j;
						if( (ans&tmp) >0 )	System.out.println(LANG[j]);
					}
					return;
				}
			}
			
			System.out.println("Impossible");
			
		}
		
		long DFS(int depth,int last,long used,int lim,boolean[][] graph){
			
			if(depth==lim){
				boolean[] ret=isConnected(0, graph, new boolean[M]);
				for(boolean b:ret)if(!b)	return 0L;
				return used;
			}
			
			long ret=0L;
			for(int i=last+1; i<N; ++i){
				long now=(1<<i);
				used|=now;
				
				boolean[][] newGraph=new boolean[M][M];
				for(int j=0; j<M; ++j){
					for(int k=0; k<M; ++k){
						newGraph[j][k] = graph[j][k] | ( (ST[j]&now)>0 && (ST[k]&now)>0 );
					}
				}
				
				long tmp=DFS(depth+1,i,used,lim,newGraph);
				if(tmp > 0 && (ret == 0 || Long.bitCount(ret) < Long.bitCount(tmp) ) )	ret=tmp;
				
				used^=now;
			}
			
			return ret;
		}
		
		boolean[] isConnected(int n,boolean[][] g,boolean[] vtd){
			for(int i=0; i<M; i++){
				if(g[n][i] && !vtd[i]){
					vtd[i]=true;
					vtd = isConnected(i,g,vtd);
				}
			}
			return vtd;
		}
	}
}