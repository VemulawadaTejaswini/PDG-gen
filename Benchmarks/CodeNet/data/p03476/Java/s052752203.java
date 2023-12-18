import java.util.Scanner;

class Main{


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int[] A =new int[N];
		int[] B = new int[N];
		boolean[] flag = new boolean[100001];
		flag[0] = true;
		flag[1] = true;

		int[]dp = new int[100001];
		dp[0] = dp[1] = 0;
		
		for(int i = 0; i < N; i++) {
			A[i] = scanner.nextInt();
			B[i] = scanner.nextInt();
		}
		for(int i = 2;i < 100001;i++){
			if(flag[i]){					//flag立ってたら前と一緒
				dp[i] = dp[i-1];
				continue;
			}
			if(!flag[(i+1)/2]){
				dp[i] = dp[i-1]+1;
			}else{
				dp[i] = dp[i-1];
			}
			for(int j = i*2;j < 100001;j+=i){			//倍数全部flag立てる
				flag[j] = true;
			}
		}
		for(int i = 0; i < N; i++) 
			System.out.println(dp[A[i]] - dp[B[i] - 1]);
	}



}

