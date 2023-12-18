import java.util.Scanner;

public class Main {


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		long H = sc.nextLong();
		long W = sc.nextLong();

		long A[] = new long[N];
		long B[] = new long[N];

		for (int i = 0; i < N; i++) {
			A[i] = sc.nextLong();
			B[i] = sc.nextLong();
		}

		int ans = 0;

		for (int i = 0; i < N; i++) {
			if (A[i] >= H && B[i] >= W) {
				ans++;
			}
		}

		System.out.println(ans);
	}
}
