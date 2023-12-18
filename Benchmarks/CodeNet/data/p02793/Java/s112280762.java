

import java.util.Scanner;

public class Main {
	
	static int mod = 1000000007;
	static int []gcd ;
	
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		
		int []a = new int [n];
		long []b = new long [n];
		gcd = new int [1000001];
 		
		for(int i = 0 ; i < n ;i++) {
			a[i] = Integer.parseInt(sc.next());
			b[i] = Modpow(a[i], mod-2);
		}
		
		for(int i = 0 ; i < n ;i++) {
			gcd(a[i]);
		}
		
		
		long temp = 1;
		
		for(int i = 0 ; i <= 1000000 ;i++) { 
			if(gcd[i] > 0) {
				temp = Modpow(i, gcd[i]) * temp % mod;
			}
		}
		
		long ans = 0 ;
		
	
		for(int i = 0 ;i < n ; i++) {
			long q = (temp * b[i]) % mod;
			ans = (ans + q)% mod;
		}
		
		System.out.println(ans);
		
	
	
	}
	//a^n mod
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
		
	static boolean prime(int m) {
		if(m == 1) {
			return false;
		}
		
		for(int i = 2 ; i * i <= m ;i++) {
			if(m % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	static void gcd(int m) {
		if(m == 1) return;
		
		int temp = m;
		if(prime(temp)) {
			gcd[temp] = 1;
			return;
		} 
		for(int i = 2 ; i * i <= m ;i++) {
			if(m % i == 0) {
				int cnt = 0;
				while(temp % i == 0) {
					temp = temp / i;
					cnt++;
				}
				gcd[i] = Math.max(cnt, gcd[i]);
				gcd(temp);
			}
		}
	}
	
	

}
