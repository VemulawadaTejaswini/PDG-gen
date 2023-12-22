import java.util.*;
import static java.lang.Math.*;
public class Main {
	final Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		new Main().init();
	}
	void init(){
		final long STACK_SIZE=8*1024*1024;
		new Thread(null, new AOJ1306(), "RUN!", STACK_SIZE).start();
		//new Live5015();
	}
	
	class AOJ1306 implements Runnable{
		int N;
		final int INF=1<<29;
		AOJ1306(){}
		@Override public void run(){
			while(sc.hasNext()){
				N=sc.nextInt();
				if(N==0)	break;
				solve();
			}
		}
		void solve(){
			int[] p=new int[N+1],t=new int[N+1];
			for(int i=1; i<=N; i++){
				p[i]=sc.nextInt();
				t[i]=sc.nextInt();
			}
			
			int[][] dp=new int[N+1][4];
			for(int i=0; i<=N; i++)for(int j=0; j<=3; j++)dp[i][j]=INF;
			dp[1][1]=p[1];
			dp[1][0]=p[1]*3;
			if(t[1]<p[1]){
				System.out.println("NG 1");
				return;
			}
			
			int ans=INF;
			for(int now=2; now<=N; now++){
				boolean f=false;
				for(int b=1; b<=3; b++){
					int d0=p[now-1]+p[now],
						t0=p[now-1]*(b+1)+p[now],
						d1=(b==3?d0:abs(p[now-1]-p[now])),
						t1=(b==3?t0:d1*(b+1)),
						tlim=t[now]-t[now-1];
					if(dp[now-1][b]<INF){
						if(t0<=tlim){
							f=true;
							dp[now][1]=min(dp[now][1], dp[now-1][b]+d0);
						}
						if(t1<=tlim){
							f=true;
							dp[now][(b%3)+1]=min(dp[now][(b%3)+1], dp[now-1][b]+d1);
						}
					}
				}
				if(!f)	ans=now;
			}
			
			if(ans<INF)	System.out.println("NG "+ans);
			else{
				for(int i=0; i<=3; i++)	ans=min(ans,dp[N][i]);
				System.out.println("OK "+(ans+p[N]));
			}
			
			// degug
//			for(int y=0; y<=3; y++){
//				for(int x=1; x<=N; x++)System.out.printf("%4d ",dp[x][y]>=INF?-1:dp[x][y]);
//				System.out.println();
//			}
//			System.out.println("---------------------------------------");
		}
	}
}