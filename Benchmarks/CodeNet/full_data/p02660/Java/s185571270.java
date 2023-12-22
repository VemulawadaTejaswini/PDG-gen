import java.util.Arrays;
import java.util.Scanner;

public class Main {
	//java11

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long N = sc.nextLong();

		int sqrt = (int)Math.sqrt(N);

		boolean[] isPrime = isPrimeN(sqrt);

		long ans = 0;
		for(int i=2; i<=sqrt; i++) {
			long n = N;

			if(isPrime[i]) {
				for(long j=i; j<=N; j*=i) {
					if(n >= 2 && n % j == 0) {
						ans++;
						n /= j;
					}else
						break;
				}
			}
		}

		if(ans == 0 && N >= 2)
			ans++;

		System.out.println(ans);

	}

	//n以下のすべての数の高速な素数判定(エラトステネスの篩)
	public static boolean[] isPrimeN(int n) {

		boolean[] isPrime = new boolean[n+1];
		Arrays.fill(isPrime, true);
		isPrime[0] = false;
		isPrime[1] = false;

		//割れる数はsqrt以下
		for(int i=2; i<=Math.sqrt(n); i++) {
			if(isPrime[i]) {
				for(int j=i*i; j<=n; j+=i) {
					isPrime[j] = false;
				}
			}
		}

		return isPrime;
	}
}
