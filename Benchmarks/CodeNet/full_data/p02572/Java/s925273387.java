import java.util.Scanner;

public class Main {

	private static final long MOD = 1000000007;
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {

			int n = sc.nextInt();

			long sum = 0;
			long powSum = 0;

			for(int i = 0 ; i < n ; i++ ) {

				long ai = sc.nextLong();
				sum += ai;
				sum = sum % MOD;

				powSum += (ai * ai) % MOD;
				powSum = powSum % MOD;

			}

			long ans = ((sum * sum) % MOD - powSum) % MOD;
			if ( ans < 0 ) {
				ans += MOD;
			}

			System.out.println(ans * modpow(2, MOD-2) % MOD);
			
//			System.out.println(modpow(2, MOD-2));
		}
	}

	public static long modpow(long a, long n) {
		long ans = 1;
		long ac = a;
		while ( n > 0 ) {
			if ( n % 2 == 1 ) {
				ans = ans * ac % MOD;
			}
			ac = ac * ac % MOD;
			n >>= 1;
		}
		return ans;
	}
}