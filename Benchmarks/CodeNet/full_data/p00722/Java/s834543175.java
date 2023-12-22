import java.util.*;
public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}

	public Main(){
		new AOJ1141().doIt();
	}
	
	class AOJ1141{
		int a,d,n;
		
		boolean prime[];
		int MAX = 1000000;
		
		void solve(){
			int cnt = 0;
			int result = -1;
			for(int i=a;i<MAX;i+=d){
				if(prime[i])cnt++;
				if(cnt==n){
					result = i;
					break;
				}
			}
			System.out.println(result);
		}
		
		void doIt(){
//			System.out.println(MAX);
			prime = new boolean[MAX];
			Arrays.fill(prime, true);prime[0] = false;prime[1] = false;
			for(int i=0;i<MAX;i++)if(prime[i]){
				for(int s=i+i;s<MAX;s+=i)prime[s] = false;
			}
			while(in.hasNext()){
				a = in.nextInt();
				d = in.nextInt();
				n = in.nextInt();
				if(a+d+n==0)break;
				solve();
			}
		}
	}
	
}