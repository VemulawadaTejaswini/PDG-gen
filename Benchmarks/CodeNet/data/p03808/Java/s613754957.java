import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] A = new long[N];
		long[] d = new long[N];
		long sum = 0;
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
			sum += A[i];
			if (i > 0) {
				d[i] = A[i] - A[i - 1];
			}
			d[0] = A[0] - A[N - 1];
		}
		sc.close();

		long m = ((long) N) * ((long) (N + 1)) / 2L;
		String ans = "YES";
		if ((sum % m) != 0) {
			ans = "NO";
		} else {
			long cnt = sum / m;
			for (int i = 0; i < N; i++) {
				d[i] -= cnt;
				if (((-d[i]) % N) != 0) {
					ans = "NO";
					break;
				}
			}
		}
		System.out.println(ans);
	}
}
