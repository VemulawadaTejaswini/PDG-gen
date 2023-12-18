import java.util.Scanner;

/**
 * https://arc091.contest.atcoder.jp/tasks/arc091_b
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		sc.close();
		
		long ans = 0;
		for(int b=N; b>0; b--){
			ans+=Math.max(0, (b-K)*(N/b));
			ans+=Math.max(0, N%b-K+1);
		}
		if(K==0) ans -= N;
		System.out.println(ans);
	}

}