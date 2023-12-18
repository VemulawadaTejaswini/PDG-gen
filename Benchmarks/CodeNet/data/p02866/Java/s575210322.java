
import java.util.Scanner;

public class Main {
	
	static long mod = 998244353L;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		
		int []d = new int [n];
		int []p = new int [100001];
		
		long ans = 1;
		int max = -1;
		
		for(int i = 0 ; i < n ;i++) {
			d[i] = Integer.parseInt(sc.next());
			p[d[i]]++;
			max = Math.max(d[i], max);
		}
		
		if(d[0] != 0 || p[0] != 1) {
			System.out.println(0);
			return;
		}
		
		for(int i = 1 ; i <= max ; i++) {
			ans = ans * Modpow((long)p[i-1],(long)p[i]) % mod ;
			System.out.println(ans);
		}
		
		System.out.println(ans);	
	}
	
	static long Modpow(long a, long n) {
		long res = 1;
		while(n > 0) {
			if((n & 1) == 1) {
				res = res * a % mod;
			}
			a = a * a % mod;
			n >>= 1;
		}
		return res;
	}
}
