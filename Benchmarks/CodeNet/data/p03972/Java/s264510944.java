import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		new Main().solve();
	}
	int W,H,N;
	long[]p;
	long[]q;
	long INF=Long.MAX_VALUE/2;
	
	void solve(){
		Scanner sc=new Scanner(System.in);
		W=sc.nextInt();
		H=sc.nextInt();
		N=(W+1)*(H+1);
		p=new long[W];
		q=new long[H];
		for(int i=0;i<W;i++) {
			p[i]=sc.nextLong();
		}
		for(int i=0;i<H;i++) {
			q[i]=sc.nextLong();
		}
		
		System.out.println(prim());
		
	}
	
	long prim() {
		long[] mincost=new long[N];
		boolean[] used=new boolean[N];
		
		for(int i=0;i<N;i++) {
			mincost[i]=INF;
			used[i]=false;
		}
		mincost[0]=0;
		int res=0;
		
		while(true) {
			int v=-1;
			for(int u=0;u<N;u++) {
				if(!used[u] && (v==-1 || mincost[u]<mincost[v]))v=u;
			}
			if(v==-1)break;
			used[v]=true;
			res+=mincost[v];
			
			for(int u=0;u<N;u++) {
				int vx=v%(W+1);
				int vy=v/(W+1);
				int ux=u%(W+1);
				int uy=u/(W+1);
				
				long cost;
				if(vx==ux) {
					if(vy-uy==1) cost=q[uy];
					else if(vy-uy==-1)cost=q[vy];
					else cost=INF; 
				}else if(vy==uy) {
					if(vx-ux==1) cost=p[ux];
					else if(vx-ux==-1)cost=p[vx];
					else cost=INF;
				}else cost=INF;
				
				mincost[u]=Math.min(mincost[u], cost);
			}
		}
		
		return res;
	}
}
