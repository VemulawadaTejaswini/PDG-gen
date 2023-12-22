import java.awt.geom.Point2D;
import java.util.*;
import static java.lang.Math.*;
public class Main {
	final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		new Main().init();
	}
	void init(){
		new AOJ2151();
	}
	class AOJ2151{
		int N,M,L;
		final int INF=1<<28;
		AOJ2151(){
			while(true){
				N=sc.nextInt(); M=sc.nextInt(); L=sc.nextInt();
				if(N==0)	break;
				solve();
			}
		}
		void solve(){
			ArrayList<ArrayList<Edge>> map=new ArrayList<ArrayList<Edge>>(N);
			for(int i=0; i<N; ++i)	map.add(new ArrayList<Edge>());
			for(int i=0; i<M; ++i){
				int a=sc.nextInt(),b=sc.nextInt(),d=sc.nextInt(),e=sc.nextInt();
				--a; --b;
				map.get(a).add(new Edge(b,d,e));
				map.get(b).add(new Edge(a,d,e));
			}
			
			PriorityQueue<State> open=new PriorityQueue<State>();
			open.add(new State(0,L,0));
			int[][] closed=new int[N][L+1];
			for(int i=0; i<N; ++i)for(int j=0; j<=L; ++j)	closed[i][j]=INF;
			closed[0][L]=0;
			int ans=-1;
			while(!open.isEmpty()){
				State now=open.poll();
				if(now.p==N-1){
					ans=now.e;
					break;
				}
				for(Edge to: map.get(now.p)){
					if(now.m>=to.d && closed[to.p][now.m-to.d]>now.e){
						open.add(new State(to.p, now.m-to.d, now.e));
						closed[to.p][now.m-to.d]=now.e;
					}
					if(closed[to.p][now.m]>now.e+to.e){
						open.add(new State(to.p, now.m, now.e+to.e));
						closed[to.p][now.m]=now.e+to.e;
					}
				}
			}
			System.out.println(ans);
		}
		class Edge{
			int p,d,e;
			Edge(int p,int d,int e){
				this.p=p;	this.d=d;	this.e=e;
			}
		}
		class State implements Comparable<State>{
			int p,m,e;
			State(int p,int m,int e){
				this.p=p;	this.m=m;	this.e=e;
			}
			@Override public int compareTo(State o){
				return this.e-o.e;
			}
		}
	}
}