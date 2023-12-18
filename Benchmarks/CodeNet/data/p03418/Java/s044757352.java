import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		final int K = sc.nextInt();
		int ans = 0;
		for(int i = 1; i <= N; i++) {
			ans += (N / i) *Math.max(i - K, 0) + Math.max(((N % i) + 1) - K, 0);
		}
		if(K == 0) ans --;
		System.out.println(ans);
	}
}
