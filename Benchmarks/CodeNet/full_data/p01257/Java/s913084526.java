import java.util.Arrays;
import java.util.Scanner;

//Vending Machine
public class Main{

	int n, INF = 1<<29;
	int[] c;
	int[][] dp;
	
	int get(int k, int x){
		if(k==n)return x==0?0:INF;
		if(dp[k][x]!=-1)return dp[k][x];
		int min = INF;
		for(int u=0;u*c[k]<=x&&u<min;u++)min = Math.min(min, Math.max(u, get(k+1, x-u*c[k])));
		return dp[k][x] = min;
	}
	
	void run(){
		Scanner sc = new Scanner(System.in);
		for(;;){
			n = sc.nextInt();
			int M = sc.nextInt();
			if((n|M)==0)break;
			c = new int[n];
			for(int i=0;i<n;i++)c[i]=sc.nextInt();
			dp = new int[n][M+1];
			for(int[]a:dp)Arrays.fill(a, -1);
			System.out.println(get(0, M));	
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}