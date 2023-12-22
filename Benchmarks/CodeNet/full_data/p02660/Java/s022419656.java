import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextLong();
		boolean[] prime_check = new boolean[1000001];
		//long[] era = new long[1000001];
		
		for(int i = 1; i < 100001; i++) {
			prime_check[i] = true;
			//era[i] = i;
			//System.out.println(prime_check[i]);
		}
		
		for(int i = 2; i < 1000001; i++) {
			if(prime_check[i]) {
				for(int k = 2*i,l = 0; l < 100000 / i; k+=i,l++) {
					prime_check[k] = false;
				}
			}
		}
		
		/*for (int i = 1; i < 100001; i++) {
			//System.out.println(prime_check[i]);
			if(prime_check[i]) {
				System.out.println(era[i]);
			}
		}*/
		int self_check = -1;
		for(int i = 2; i < 100001; i++) {
			if(prime_check[i] && n % i == 0) {
				self_check = 0;
			}
		}
		
		int now_prime = 99991;
		int cnt = 0;
		//System.out.println(self_check);
		
		while(true) {
			//System.out.println(0);
			if(self_check == -1) {
				break;
			}
			long z = now_prime;
			int e = 1;
			long z_temp = z;
			//System.out.println(0);
			
			
			while(true) {
				//System.out.println(n + " " + z );
				if(n < z) {
					break;
				}
				if( n % z == 0) {
					cnt++;
					n /= z;
				}
				e++;
				z = (long)Math.pow(z_temp, e);
			}
			
			
			//System.out.println(1);
			while(true) {
				now_prime--;
				if(prime_check[now_prime] && now_prime <= n) {
					break;
				}
			}
			if(now_prime == 1) {
				break;
			}
			//System.out.println(2);
		}
		
		if(self_check == -1) {
			System.out.println(1);
		}else {
			System.out.println(cnt);
		}	
	}
}