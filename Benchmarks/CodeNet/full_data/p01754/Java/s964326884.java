import java.util.*;

public class Main {
	public static void main(String[] args) {
		new Main().solver();
	}

	void solver() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int P = sc.nextInt();
		int Q = sc.nextInt();
		int[] C = new int[N];
		for (int i = 0; i < N; i++) {
			C[i] = sc.nextInt();
		}
		int[] a = new int[N];// ?£??????§????????????????????£??????
		for (int i = 0; i < N; i++) {
			a[i] = C[i] + i * P;
		}
		Arrays.sort(a);
		for (int i = 1; i < N; i++) {
			a[i] += a[i - 1];
		}
		long ans = -(1L << 60);
		long diff = N * (N - 1) * P / 2;
		// i:?£??????§?£??????????????????°???
		for (int i = 0; i < N; i++) {
			ans = Math.max(ans, a[i] + P * (N - i) * (Q + Q + N - i - 1) / 2 - diff);
		}
		System.out.println((ans-diff));
	}
}