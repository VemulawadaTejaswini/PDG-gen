import java.util.Scanner;


public class Main {
	static int N ;
	static int K;
	static int[] H;
	static int[] memo;
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
			N = sc.nextInt();
			K = sc.nextInt();

			H = new int[N];
			for(int i = 0 ; i < N ; i++){
				H[i] = sc.nextInt();
			}
		sc.close();

		memo = new int[N];
		//Arrays.fill(memo, 200000);

		memo[0] = 0;
		memo[1] = Math.abs(H[1]-H[0]);

		System.out.println(dfs(N,K,H,2,memo));


	}

	static int dfs(int n, int k, int[] h, int count, int[] memo){

		int tmp = 0;
		int tmp2 = 0;
		if(count < N){

			int pp = 0;
			if(count> K){
				pp = count-K;
			}

			for(int i = pp ; i < N-1 ; i++){
				if(i == count){
					break;
				}
				tmp = memo[i] + Math.abs(H[count]-H[i]);

				if(tmp2 == 0 || tmp < tmp2){
					tmp2 = tmp;
				}
			}
			memo[count] = tmp2;
			dfs(N,K,H,count+1,memo);
		}

		return memo[N-1];
	}
}
