import java.util.*;
import static java.lang.Math.*;
public class Main {
	final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}
	Main(){
		new AOJ1277();
	}
	
	class AOJ1277{
		int N,T,L,B;
		AOJ1277(){
			while(true){
				N=sc.nextInt(); T=sc.nextInt();
				L=sc.nextInt(); B=sc.nextInt();
				if(N==0)	break;
				solve();
			}
		}
		void solve(){
			HashSet<Integer>	lose=new HashSet<Integer>(),
								back=new HashSet<Integer>();
			for(int i=0; i<L; ++i)	lose.add(sc.nextInt());
			for(int i=0; i<B; ++i)	back.add(sc.nextInt());
			
			double[][] dp=new double[N+1][T+2];
			dp[0][0]=1;
			for(int t=0; t<T; ++t){
				for(int a=0; a<N; ++a){
					for(int d=1; d<=6; ++d){
						int pos=(a+d>N? N-((a+d)-N): a+d);
						pos = (back.contains(pos)? 0: pos);
						int offset = (lose.contains(pos)? 1: 0);
						dp[pos][t+1+offset] += dp[a][t]/6;
					}
				}
			}
			double ans=0;
			for(int t=1; t<=T; ++t)	ans+=dp[N][t];
			System.out.printf("%.6f\n", ans);
		}
	}
}