import java.util.Scanner;

public class Main{
	static long mod = 1000000000 + 7;
	static long fact(long n) {
		long ans = 1;
		for(int i = 1; i <= n; i++) {
			ans *= i;
			ans %= mod;
		}
		return ans;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong(), M = sc.nextLong();
		if(Math.abs(N - M) > 1) System.out.println(0);
		else if(Math.abs(N - M) == 1) System.out.println((fact(N) * fact(M)) % mod);
		else System.out.println((fact(N) * fact(M) * 2) % mod);
	}
}