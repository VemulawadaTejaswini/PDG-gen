import java.util.Arrays;
import java.util.Scanner;

//Greedy, Greedy.
public class Main{

	int n, INF = 1<<29, M = 100000;
	int[] c;

	int f(int x){
		int res = 0, k = n-1;
		while(x>0&&k>=0){
			res += x/c[k];
			x%=c[k--];
		}
		return x==0?res:INF;
	}

	void run(){
		Scanner sc = new Scanner(System.in);
		for(int T=1;;T++){
			n = sc.nextInt();
			if(n==0)break;
			c = new int[n];
			for(int i=0;i<n;i++)c[i]=sc.nextInt();
			int[] dp = new int[M];
			Arrays.fill(dp, INF);
			dp[0] = 0;
			boolean f1 = true, f2 = true;
			for(int x=1;x<M&&f1;x++){
				for(int i=0;i<n;i++){
					if(x-c[i]>=0)dp[x] = Math.min(dp[x], dp[x-c[i]]+1);
				}
				if(dp[x]==INF)f1 = false;
				if(dp[x]<f(x))f2 = false;
			}
			System.out.println("Case #"+T+": "+(!f1?"Cannot pay some amount":!f2?"Cannot use greedy algorithm":"OK"));
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}