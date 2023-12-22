import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextLong();
		boolean[] prime_check = new boolean[5000001];
		
		for(int i = 1; i < 5000001; i++) {
			prime_check[i] = true;

		}
		
		for(int i = 2; i < 5000001; i++) {
			if(prime_check[i]) {
				for(int k = 2*i,l = 0; l < (5000001/ i)-2; k+=i,l++) {
					prime_check[k] = false;
				}
			}
		}
		

		int self_check = -1;
		for(int i = 2; i < 500001; i++) {
			if(prime_check[i] && n % i == 0) {
				self_check = 0;
			}
		}
		if(n == 1) {
			self_check = 1;
		}
		
		int now_prime = 500000;
		int cnt = 0;
		
		while(true) {
			if(self_check == -1) {
				break;
			}
			long z = now_prime;
			int e = 1;
			long z_temp = z;
			
			
			while(true) {
				if(n < z || n == 1 || z == 0) {
					break;
				}
				
				if( n % z == 0) {
					cnt++;
					n /= z;
				}
				
				e++;
				z = (long)Math.pow((double)z_temp, (double)e);
			}
			
			
			while(true) {
				now_prime--;
				if(prime_check[now_prime] && now_prime <= n) {
					break;
				}
			}
			if(now_prime == 1) {
				break;
			}
		}
		
		if(self_check == -1) {
			System.out.println(1);
		}else {
			System.out.println(cnt);
		}	
	}
}