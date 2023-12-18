import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
			sc.nextLine();
			Long A[] = new Long[N];
			Long B[] = new Long[N];
			for (int i = 0; i < N; i++) {
				A[i] = sc.nextLong();
				B[i] = sc.nextLong();
			}
			long cnt = 0;
			for (int i = N - 1; i >= 0; i--) {
				if (B[i] != 1) {
					long div = (A[i] + cnt) % B[i];
					if (div != 0) {
						cnt = cnt + (B[i] - div);
					} else if (div == 0 && A[i] < B[i]) {
						long tmp = lcm(A[i], B[i]);
						cnt = cnt + (tmp - A[i]);
					}
				}
			}
			System.out.println(cnt);
		}
	}

	static long gcd(long a, long b) {
		if (b == 0) {
			return a;
		}
		return gcd(b, a % b);
	}

	static long lcm(long a, long b) {
		return a * b / gcd(a, b);
	}

}
