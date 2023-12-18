import java.util.*;

class Main{
	
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		int h[] = new int[N];

		for(int n=0;n<N;n++){
			h[n] = sc.nextInt();
		}

		int dp[] = new int[N];
		dp[0] = 0;
		dp[1] = Math.abs(h[1]-h[0]);
		for(int n=2;n<N;n++){
			
			int tmp = -1;
			for(int k=1;k<=K;k++){

				if(n < k) break;

				int val = dp[n-k]+Math.abs(h[n]-h[n-k]);
				
				if(tmp==-1 || tmp > val)
				tmp = val;
			}
			dp[n] = tmp;
		}

		System.out.println(dp[N-1]);
	}
}