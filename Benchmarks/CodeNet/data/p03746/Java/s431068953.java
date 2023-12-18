import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] A = new int[M];
		int[] B = new int[M];
		int[][] dp = new int[N+1][N+1];
		int[] count = new int[N+1];
		for(int i=0; i<=N; i++){
			count[i] = 0;
		}
		for(int i=0; i<M; i++){
			A[i]  = sc.nextInt();
			B[i]  = sc.nextInt();
			dp[A[i]][count[A[i]]] = B[i];
			count[A[i]]++;
			dp[B[i]][count[B[i]]] = A[i];
			count[B[i]]++;
		}

		int start = N+1;
		int c = 0;
		for(int i=1; i<=N; i++){
			if(count[i]==1){
				start = i;
				c = 1;
				break;
			}
		}
		if(start==N+1){
			c = 2;
			for(int i=1; i<=N; i++){
				if(count[i]>=2){
					start = i;
					break;
				}
			}
		}
		
		int[] ans = new int[2*N];
		ans[N] = start;
		ans[N+1] = dp[ans[N]][0];
		int min = N;
		int max = N+1;
		int true_false = 1;
		while(max!=2*N-1){
			if(count[ans[max]]==1){
				break;
			}
			for(int i=0; i<count[ans[max]]; i++){
				true_false = 1;
				for(int j=min; j<=max; j++){
					if(dp[ans[max]][i]==ans[j]){
						true_false = -1;
					}
				}
				if(true_false==1){
					ans[max+1] = dp[ans[max]][i];
					max++;
					break;
				}
			}
			if(true_false==-1){
				break;
			}
		}

		if(c==2){
			while(min!=2){
				if(count[ans[min]]==1){
					break;
				}
				for(int i=0; i<count[ans[min]]; i++){
					true_false = 1;
					for(int j=min; j<=max; j++){
						if(dp[ans[min]][i]==ans[j]){
							true_false = -1;
						}
					}
					if(true_false==1){
						ans[min+1] = dp[ans[min]][i];
						min++;
						break;
					}
				}
				if(true_false==-1){
					break;
				}
			}
			
		}
		
		System.out.println(max-min+1);
		for(int j=min; j<max; j++){
			System.out.print(ans[j] + " ");
		}
		System.out.print(ans[max]);

	}

}
