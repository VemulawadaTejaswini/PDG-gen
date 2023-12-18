import java.util.Scanner;

public class Main {
	static long mod = 1000000007;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();		
		long ans = 0;

		if (Math.abs(n-m) >= 2) {
			System.out.println(0);
			return;
		}
		
		if (n == m) {
			ans = equal(n, m);
		} else {
			ans = notequal(n, m);
		}
		System.out.println(ans);
	}
	
	public static long equal(int n, int m) {
		long N = kai(n);
		long M = kai(m);
		long ans = (2*N*M)%mod;
		return ans;
	}
	
	public static long notequal(int n, int m) {
		long N = kai(n);
		long M = kai(m);
		long ans = (N*M)%mod;
		return ans;
	}
	
	public static long kai(int x) {
		long a = 1;
		for (int i = 1; i <= x; i++) {
			a = (a*i)%mod;
		}
		return a;
	}
}
