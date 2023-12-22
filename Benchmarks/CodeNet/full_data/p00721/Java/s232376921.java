import java.util.*;
import static java.lang.Math.*;
public class Main {
	final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		new Main().run();
	}
	void run(){
		new AOJ1140();
	}
	
	class AOJ1140{
		int w,h;
		final int INF=Integer.MAX_VALUE/4;
		AOJ1140(){
			while(true){
				w=sc.nextInt();
				h=sc.nextInt();
				if((w|h)==0)	break;
				solve();
			}
		}
		void solve(){
			int[][] map=new int[w][h];
			int sx=0,sy=0,c=1;
			for(int y=0; y<h; ++y){
				char[] line=sc.next().toCharArray();
				for(int x=0; x<w; ++x){
					if(line[x]=='o'){
						sx=x;
						sy=y;
					}else if(line[x]=='x'){
						map[x][y]=-1;
					}else if(line[x]=='*'){
						map[x][y]=c++;
					}
				}
			}
			
			--c;	// number of dirty tile
			int b=(1<<c)-1;
			int[] vx={0,1,0,-1}, vy={-1,0,1,0};
			
			int[][][] closed=new int[w][h][b+1];
			for(int x=0; x<w; ++x)for(int y=0; y<h; ++y)for(int z=0; z<=b; ++z)closed[x][y][z]=(x==sx&&y==sy?0:INF);
			
			LinkedList<state> open=new LinkedList<state>();
			open.add(new state(sx,sy,b,0));
			
			int ans=INF;
			while(!open.isEmpty()){
				state now=open.poll();
				if(now.t==0){
					ans=now.z;
					break;
				}
				for(int v=0; v<4; ++v){
					int xx=now.x+vx[v], yy=now.y+vy[v];
					if(!(0<=xx && xx<w && 0<=yy && yy<h))	continue;
					if(map[xx][yy]<0)	continue;
					
					int nt=now.t;
					if(map[xx][yy]>0)	nt = now.t^(1<<(map[xx][yy]-1));
					
					if(closed[xx][yy][nt]<=now.z+1)	continue;
					closed[xx][yy][nt]=now.z+1;
					open.add(new state(xx,yy,nt,now.z+1));
				}
			}
			System.out.println(ans>=INF? -1 : ans );
		}
		class state{
			int x,y,t,z;
			state(int x,int y,int t,int z){
				this.x=x;
				this.y=y;
				this.t=t;
				this.z=z;
			}
		}
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