import java.util.Scanner;

/**
 * http://code-festival-2017-quala.contest.atcoder.jp/tasks/code_festival_2017_quala_b
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		final int M = sc.nextInt();
		final int K = sc.nextInt();
		sc.close();
		
		boolean[] dp = new boolean[N*M+1];
		
		for(int i=0; i<=N; i++){
			for(int j=0; j<=M; j++){
				dp[i*M+j*N-i*j*2]=true;
			}
		}		
		System.out.println(dp[K] ? "Yes" : "No");
	}

}
