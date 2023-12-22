import java.util.*;
import static java.lang.Math.*;
public class Main {
	final Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		new Main().init();
	}
	void init(){
		new B2();
	}
	
	class C{
		C(){
			while(true){
				int n = sc.nextInt();
				int m = sc.nextInt();
				if((n|m) == 0 )break;
				int [][] data  = new int[n][n];
				for(int i = 0 ; i < n; i++){
					for(int j = 0 ; j < n; j++){
						data[i][j] = sc.nextInt();
					}
				}
				int [][][] mlist = new int[4][m][m];
				for(int i = 0 ; i < n; i++){
					for(int j = 0 ; j < n; j++){
						mlist[0][i][j] = sc.nextInt();
					}
				}
			}
		}
	}
	class B2{
		final int MAX=1000001,INF=1<<29;
		int N,X;
		boolean[] prime;
		int[] vtd;
		B2(){
			prime=sieve(MAX);
			while(sc.hasNext()){
				N=sc.nextInt();
				X=sc.nextInt();
				if((N|X)==0)	break;
				solve();
			}
		}
		boolean[] sieve(int MAX){
			boolean[] list=new boolean[MAX+1];
			list[0]=true;
			list[1]=true;
			for(int i=2; i*i<=MAX; i++){
				if(!list[i])for(int j=i+i; j<=MAX; j+=i)list[j]=true;
			}
			return list;
		}
		void solve(){
			int[] a=new int[N];
			for(int i=0; i<N; i++)	a[i]=sc.nextInt();
			int[][] dp=new int[N+1][X+1];
			int ans=-1;
			for(int i=0; i<N; i++){
				for(int j=0; j<=X; j++){
					if(j<a[i]){
						dp[i+1][j]=dp[i][j];
					}else{
						dp[i+1][j]=max(dp[i][j], dp[i+1][j-a[i]]+a[i]);
						if(!prime[dp[i+1][j]])ans=max(ans,dp[i+1][j]);
					}
				}
			}
			System.out.println(ans>0?ans:"NA");
		}
	}
	
	class B{
		final int MAX=1000001,INF=1<<29;
		int N,X;
		boolean[] prime,ans;
		int[] vtd;
		B(){
			prime=sieve(MAX);
			while(sc.hasNext()){
				N=sc.nextInt();
				X=sc.nextInt();
				if((N|X)==0)	break;
				solve();
			}
		}
		boolean[] sieve(int MAX){
			boolean[] list=new boolean[MAX+1];
			list[0]=true;
			list[1]=true;
			for(int i=2; i*i<=MAX; i++){
				if(!list[i])for(int j=i+i; j<=MAX; j+=i)list[j]=true;
			}
			return list;
		}
		void solve(){
			int[] a=new int[N];
			for(int i=0; i<N; i++)	a[i]=-1*sc.nextInt();
			Arrays.sort(a);
			for(int i=0; i<N; i++)	a[i]*=-1;
			ans=new boolean[X+1];
			vtd=new int[X+1];
			for(int i=0; i<=X; i++)vtd[i]=INF;
			solve2(0,0,a);
			int tmp=-1;
			for(int i=X; i>=2; i--)if(ans[i]){
				tmp=i;
				break;
			}
			System.out.println(tmp>0?tmp:"NA");
		}
		void solve2(int depth,int sum,int[] a){
			if(!(depth<N))	return;
			while(true){
				sum+=a[depth];
				if(sum>X)	break;
				if(!prime[sum])	ans[sum]=true;
				if(vtd[sum]>depth){
					vtd[sum]=depth;
					solve2(depth+1,sum,a);
				}
			}
			return;
		}
	}
}