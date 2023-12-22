import java.util.*;
import static java.lang.Math.*;
public class Main {
	final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		new Main().run();
	}
	void run(){
		new AOJ1138();
	}
	
	class AOJ1138{
		int n,m,p,a,b;
		final int INF=Integer.MAX_VALUE/4;
		AOJ1138(){
			while(true){
				n=sc.nextInt();
				m=sc.nextInt();
				p=sc.nextInt();
				a=sc.nextInt();
				b=sc.nextInt();
				if(n==0)	break;
				solve();
			}
		}
		void solve(){
			int[] tickets=new int[n];
			for(int i=0; i<n; ++i)	tickets[i]=sc.nextInt();
			int[][] path=new int[m][m];
			for(int i=0; i<m; ++i)for(int j=0; j<m; ++j)path[i][j]=INF;
			for(int i=0; i<p; ++i){
				int x=sc.nextInt(),y=sc.nextInt(),z=sc.nextInt();
				--x;
				--y;
				path[x][y]=z;
				path[y][x]=z;
			}
			
			--a;
			--b;
			
			int bit=(1<<n)-1;
//			System.out.println(Integer.bitCount(bit));
			double[][] closed=new double[m][bit+1];
			for(int i=0; i<m; ++i)for(int j=0; j<=bit; ++j)closed[i][j]=(i==a? 0 : INF);
			
			PriorityQueue<state> open = new PriorityQueue<state>();
			open.add(new state(a,bit,0));
			
			double ans=INF;
			
			while(!open.isEmpty()){
				state now = open.poll();
//				System.out.println(now);
				if(now.p==b){
					ans=min(ans,now.z);
					continue;
				}
				for(int to=0; to<m; to++){
					if(path[now.p][to]>=INF)	continue;
					if(now.p==to)	continue;
					for(int i=0; i<n; ++i){
						if( (now.t & (1<<i) ) == 0 )	continue;
						double a = (double)path[now.p][to]/(double)tickets[i];
						int b = now.t^(1<<i);
						if(closed[to][b] <= now.z+a)	continue;
						closed[to][b] = now.z+a;
						open.add(new state(to,b,now.z+a));
					}
				}
			}
			
			System.out.println(ans>=INF ? "Impossible" : ans);
		}
		class state implements Comparable<state>{
			int p,t;
			double z;
			state(int p,int t,double z){
				this.p=p;
				this.t=t;
				this.z=z;
			}
			@Override public int compareTo(state o){
				return (int)(this.z-o.z);
			}
			@Override public String toString(){
				return "p:"+p+" t:"+Integer.toBinaryString(t)+" z:"+z;
			}
		}
	}
	
	class AOJ1135{
		AOJ1135(){
			int n=sc.nextInt();
			while(--n>=0)	solve();
		}
		void solve(){
			int m=sc.nextInt(),y=sc.nextInt(),n=sc.nextInt(),ans=0;
			while(--n>=0){
				int a=sc.nextInt();
				double rate = sc.nextDouble();
				int b=sc.nextInt();
				if(a==0){
					int mm=m,c=0;
					for(int i=0; i<y; ++i){
						c += (double)mm*rate;
						mm-=b;
					}
					ans=max(ans, mm+c);
				}else{
					int mm=m;
					for(int i=0; i<y; ++i){
						mm+=(double)mm*rate;
						mm-=b;
					}
					ans=max(ans, mm);
				}
			}
			System.out.println(ans);
		}
	}
	
	

}