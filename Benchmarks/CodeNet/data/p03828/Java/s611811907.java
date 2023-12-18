
import java.util.Scanner;

public class Main {

	public static long count(int p, int n) {
		long count = 0;
		for(int i = 1; Math.pow(p,  i) <= n; ++i) {
			count += (n / Math.pow(p, i));
		}
		return (count + 1);
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		long ans = 1;
		int n;
		n = sc.nextInt();
		sc.close();
		
		int prime[];
		prime = new int[1001];
		
		prime[0] = -1;
		prime[1] = -1;
		for(int i = 2; i <= 1000; ++i) {
			if(prime[i] != -1) {
				prime[i] = 1;
				for(int j = 2; j * i <= 1000; ++j) {
					prime[i * j] = -1;
				}
			}
		}
		
		for(int i = 2; i <= n; ++i) {
			if(prime[i] == 1) {
				long tmp = count(i, n);
				ans *= (tmp % (long)(Math.pow(10,  9) + 7));
				ans %= (long)(Math.pow(10,  9) + 7);
			}
		}
		
		System.out.println(ans);
	}

}
