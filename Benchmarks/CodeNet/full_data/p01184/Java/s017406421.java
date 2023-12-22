import java.util.*;
import static java.lang.Math.*;
public class Main {
	final Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		new Main().init();
	}
	void init(){
		final long STACK_SIZE=8*1024*1024;
		new Thread(null, new AOJ2061(), "RUN!", STACK_SIZE).start();
		
	}
	
	// 16:40
	class AOJ2061 implements Runnable{
		int N,M;
		String[] LANG;
		ArrayList<HashSet<String>> ST;
		
		AOJ2061(){}
		
		@Override public void run(){
			//long start=System.currentTimeMillis();
			int c=0;
			while(sc.hasNext()){
				N=sc.nextInt();
				M=sc.nextInt();
				if((N|M)==0)	break;
				if(c>0)System.out.println();
				solve();
				++c;
			}
			//System.err.println("\nRUNTIME: "+(System.currentTimeMillis()-start)+"msec");
		}
		
		void solve(){
			LANG=new String[N];
			for(int i=0; i<N; i++)	LANG[i]=sc.next();
			ST=new ArrayList<HashSet<String>>();
			for(int i=0; i<M; i++){
				ST.add(new HashSet<String>());
				int K=sc.nextInt();
				for(int j=0; j<K; j++)	ST.get(i).add(sc.next());
			}
			
			for(int i=1; i<=5; i++){
				ArrayList<String> ans=DFS(0,-1,new ArrayList<String>(),i);
				if(!ans.isEmpty()){
					System.out.println(ans.size());
					for(String s:ans)System.out.println(s);
					return;
				}
			}
			System.out.println("Impossible");
		}
		
		ArrayList<String> DFS(int depth,int last,ArrayList<String> used,int lim){
			if(depth==lim){
				if(check(used) )	return used;
				else				return new ArrayList<String>();
			}
			
			ArrayList<String> ret=new ArrayList<String>();
			for(int i=last+1; i<N; i++){
				used.add(LANG[i]);
				ArrayList<String> tmp=DFS(depth+1,i,used,lim);
				if(!tmp.isEmpty() && (ret.isEmpty() || ret.size()>tmp.size()) ){
					ret.clear();
					ret.addAll(tmp);
				}
				used.remove(used.size()-1);
			}
			
			return ret;
		}
		
		boolean check(ArrayList<String> used){
			boolean[][] g=new boolean[M][M];
			for(String s:used){
				for(int i=0; i<M; i++){
					if(ST.get(i).contains(s)){
						for(int j=i+1; j<M; j++){
							if(!g[i][j] && ST.get(j).contains(s)){
								g[i][j]=true;
								g[j][i]=true;
							}
						}
					}
				}
			}
			boolean[] vtd=isConnected(0,g,new boolean[M]);
			for(int i=0; i<M; i++)if(!vtd[i])return false;
			return true;
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