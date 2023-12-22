import java.util.*;
import java.io.*; 
class Main { 

	static void SieveOfEratosthenes(int n, boolean prime[],int a[]) 
	{ 
		
		for (int i = 2; i <= n; i++) 
			prime[i] = true; 

		
		prime[1] = false; 

		for (int p = 2; p * p <= n; p++) { 
			
			if (prime[p] == true) { 
			
				for (int i = p * 2; i <= n; i += p) 
					prime[i] = false; 
			} 
		} 

		int j = 0; 
		for (int p = 2; p <= n; p++) { 
			if (prime[p]) { 
			
				a[j] = p; 

			
				j++; 
			} 
		} 
	} 
	static int countDivisors(int n) 
	{ 	
		if (n == 1) 
			return 1; 
		boolean prime[] = new boolean[n + 1]; 
		int a[] = new int[n]; 
		SieveOfEratosthenes(n, prime,a); 
		int ans = 1; 
		for (int i = 0;; i++) { 
			if (a[i] * a[i] * a[i] > n) 
				break; 
			int cnt = 1; 
			while (n % a[i] == 0) { 
				n = n / a[i]; 
				cnt = cnt + 1; 
			} 
			ans = ans * cnt; 
		} 
		if (prime[n]) 
			ans = ans * 2;
		else if (isPerfect(n) && prime[(int)Math.sqrt(n)]) 
			ans = ans * 3; 
		else if (n != 1) 
			ans = ans * 4; 
		return ans; 
	} 

	
	public static void main(String args[]) 
	{ 
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long sum=0;
		int x=0;
		int m=0;
		for(int i=1;i<=n-1;i++){
			m = n-i;
			if(m!=1){
				x = countDivisors(m);
				sum+=x;
			}
			else if(m==1){
				sum+=1;
			}
		}
		System.out.println(sum); 
	} 
	public static boolean isPerfect(int n){
		if(Math.sqrt(n)==Math.floor(Math.sqrt(n))){
			return true;
		}
		return false;
	}
} 
