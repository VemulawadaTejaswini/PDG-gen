import java.util.Scanner;
public class Main {
	
	static int mod = 1000000007;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int l = Math.abs(m - n);
		
		if(l > 1) {
			System.out.println(0);
		}
		long ans = 0;
		
		if(l == 1) {
			ans = (long)(fact(n)* fact(m))%mod;
			System.out.println(ans);
		}
		
		if(l == 0) {
			ans = (long)(2 * (fact(n) * fact(m))%mod)%mod;
			System.out.println(ans);
		}

	}
	
	private static long fact(int n){
		long p = 1;
		for(int i = 1; i <= n ; i++) {
			p = (p*i)%mod;
		}
		return p;
	}

}
