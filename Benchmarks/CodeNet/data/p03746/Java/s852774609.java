import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] A = new int[M];
		int[] B = new int[M];
		int[][] dp = new int[N+1][N];
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

		int[] start = new int[N];
		int c = 0;
		for(int i=0; i<N; i++){
			if(count[i]>=2){
				start[c] = i;
				c++;
			}
		}

		int[] path = new int[4];

		OUT1:
			for(int j=0; j<c; j++){
				for(int i=0; i<count[start[j]]; i++){
					if(count[dp[start[j]][i]]>=2){
						if(i==0){
							path[0] = dp[start[j]][1];
						}else{
							path[0] = dp[start[j]][0];
						}
						path[1] = start[j];
						path[2] = dp[start[j]][i];
						if(dp[dp[start[j]][i]][0]==start[j]){
							path[3] = dp[dp[start[j]][i]][1];
						}else{
							path[3] = dp[dp[start[j]][i]][0];
						}
						break OUT1;
					}
				}	
			}

		int[] ans = new int[2*N-2];
		ans[N-4] = path[0];
		ans[N-3] = path[1];
		ans[N-2] = path[2];
		ans[N-1] = path[3];

		int min = N-4;
		int max = N-1;
		int now;
		int true_false = 1;
		now = min;
		while(min!=0){
			if(count[ans[now]]==1){
				break;
			}
			for(int i=0; i<count[ans[now]]; i++){
				true_false = 1;
				for(int j=min; j<=max; j++){
					if(dp[ans[now]][i]==ans[j]){
						true_false = -1;
					}
				}
				if(true_false==1){
					ans[min-1] = dp[ans[now]][i];
					min--;
					now--;
					break;
				}
			}
			if(true_false==-1){
				break;
			}
		}
		now = max;
		while(max!=2*N-3){
			if(count[ans[now]]==1){
				break;
			}
			for(int i=0; i<count[ans[now]]; i++){
				true_false = 1;
				for(int j=min; j<=max; j++){
					if(dp[ans[now]][i]==ans[j]){
						true_false = -1;
					}
				}
				if(true_false==1){
					ans[max+1] = dp[ans[now]][i];
					max++;
					now++;
					break;
				}
			}
			if(true_false==-1){
				break;
			}
		}
		for(int j=min; j<max; j++){
			System.out.print(ans[j] + " ");
		}
		System.out.print(ans[max]);

	}

}
