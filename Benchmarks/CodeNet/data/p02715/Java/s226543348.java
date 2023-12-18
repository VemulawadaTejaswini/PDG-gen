import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		final int mod = (int)Math.pow(10, 9) + 7;
		
		int n = scan.nextInt();
		int k = scan.nextInt();
		
		long[] gdc = new long[k+1]; //gdc[i]は最大公約数がiである数列の個数
		for(int i = k; i > 0; i--) {
			gdc[i] = pow(k/i, n, mod);
			for(int j = 2; (long)i*j < k+1 ;j++)
				gdc[i] = (gdc[i] - gdc[i*j] + mod) % mod;
		}
		
		long ans = 0;
		for(int i = 1; i < k+1; i++) {
			ans += (long)i*gdc[i];
			ans %= mod;
		}
		
		System.out.println((ans+mod)%mod);
	}
	
	static long pow(long a, long n,final int mod) {
		long ans = 1;
		while(n > 0) {
			if((n&1) == 1) ans = ans * a % mod;
			a = a*a%mod;
			n >>= 1;
		}
		return ans;
	}
}
