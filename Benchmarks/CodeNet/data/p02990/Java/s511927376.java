import java.util.*;
import java.math.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long K = sc.nextLong();
		long mod = 1000000007;
		for(int i = 1; i <= K; i++) {
			System.out.println((conv(N - K + 1, i, mod) * conv(K - 1, i - 1, mod)) % mod);
		}
	}
	
	public static long conv(long m, long n, long mod) {
		long num = 1;
		for(int i = (int)n + 1; i <= (int)m; i++) {
			num = num * i % mod;
		}
		
		long num2 = 1;
		for(int i = 1; i <= m - n; i++) {
			num2 = num2 * i % mod;
		}
		
		BigInteger big2 = new BigInteger(String.valueOf(num2));
		BigInteger modb = new BigInteger(String.valueOf(mod));
		long ans = num * Long.parseLong(big2.modInverse(modb).toString()) % mod;
		return ans;
	}
}
