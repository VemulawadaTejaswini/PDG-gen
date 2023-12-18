
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] A = new long[N+2];

		for(int i = 1 ; i <= N ; i++){
			A[i] = sc.nextLong();
		}
		A[0] = 0;
		A[N+1] = 0;

		sc.close();

		long maxgcd = 0;
		long maxgcd2 = 0;

		long[] memo = new long[N+2];
		memo[0] = 0;
		memo[1] = A[1];
		memo[N] = A[N];
		memo[N+1] = 0;

		for(int i = N-1 ; i>=2 ; i--){
			memo[i] = gcd(memo[i+1],A[i]);
		}
/*
		for(int i = 0 ; i <= N+1 ; i++){
			System.out.println(memo[i]);
		}
*/
		long ans = 0;
		for(int i = 1 ; i <= N ; i++){
			if( i == 1){
				maxgcd = 0;
				maxgcd2 = memo[i+1];
			}
			else if(i == N){
				maxgcd = memo[i-1];
				maxgcd2 = 0;
			}
			else{
				memo[i] = gcd(memo[i-1],A[i]);
				maxgcd = memo[i-1];
				maxgcd2 = memo[i+1];

			}
			if(ans < gcd(maxgcd,maxgcd2)){
				ans = gcd(maxgcd,maxgcd2);
			}
		}
		System.out.println(ans);
	}


	static long gcd(long m, long n) {
	    if(m < n) return gcd(n, m);
	    if(n == 0) return m;
	    return gcd(n, m % n);
	}
}
