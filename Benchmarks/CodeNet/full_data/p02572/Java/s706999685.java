import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a = new long[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextLong();
		}
		long ans = 0;
		long mod = 1000000007L;
		long loop = 0;
		for(int i = 0; i < n; i++) {
			for(int j = i + 1; j < n; j++) {
				for(int b = 0; b < a[i]; b++){
				ans = (ans + a[j]) % mod;
				}
				//ans += ((a[i] % mod) * (a[j] % mod)) % mod;
				//System.out.println((a[i] * a[j]) % mod);
			}
		}
		System.out.println(ans);
	}
}