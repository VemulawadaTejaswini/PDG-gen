import java.util.Scanner;

public class Main {
	public static final long MOD = 1_000_000_007L;
	public static void main(final String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long K = sc.nextLong();
		sc.close();
		long ans = 0L;
		for(long i = K; i <= N + 1; i++) {
			ans += i*(2*N+1-i)/2 - (i-1)*i/2 + 1;
			ans %= MOD;
			// System.out.println(i + "#" + (i*(2*N+1-i)/2 - (i-1)*i/2 + 1));
		}
		System.out.println(ans);
	}
}