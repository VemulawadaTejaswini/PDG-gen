import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long K = sc.nextLong();
		Long A[] = new Long[N];
		Long F[] = new Long[N];
		for (int i = 0; i < N; i++) A[i] = sc.nextLong();
		for (int i = 0; i < N; i++) F[i] = sc.nextLong();
		Arrays.sort(A);
		Arrays.sort(F, Collections.reverseOrder());
		long l = 0, r = A[N - 1] * F[0];
		long ans = 0L;
		while (l < r) {
			long x = (l + r) / 2;
			long t = 0;
			for (int i = 0; i < N; i++) {
				t += Math.max(A[i] - x / F[i], 0);
			}
			if (t <= K) {
				ans = x;
				r = x;
			}
			else l = x + 1;
		}
		System.out.println(ans);
	}
}
