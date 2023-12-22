import java.util.Scanner;

public class Main {
	static final long MOD = 1_000_000_000 + 7;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		long[] a = new long[n];
		long[] cs = new long[n];
		a[0] = sc.nextLong();
		cs[0] = a[0];
		for (int i = 1; i < n; i++) {
			a[i] = sc.nextLong();
			cs[i] = add(cs[i - 1], a[i]);
		}
		
		long sum = 0;
		for (int i = 0; i < n - 1; i++) {
			sum = (cs[n - 1] - cs[i]) * a[i] % MOD;
		}
		
		System.out.println(sum);
		
		sc.close();
	}
	
	static long add(long a, long b) {
		return (a + b) % MOD;
	}
	
	static long mul(long a, long b) {
		return ((a % MOD) * (b % MOD)) % MOD;
	}
	
	static long sub(long a, long b) {
		return (a - b) % MOD;
	}
}


