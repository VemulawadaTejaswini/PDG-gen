import java.util.Scanner;

//AtCoder Beginner Contest 147
//D - Xor Sum 4
public class Main {

	static final int MOD = 1000000007;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		long[] A = new long[N];
		for (int i = 0; i < N; i++) {
			A[i] = Long.parseLong(sc.next());
		}
		sc.close();

		long ans = 0;
		for (int i = 0; i < N - 1; i++) {
			for (int j = i + 1; j < N; j++) {
				ans += A[i] ^ A[j];
				ans %= MOD;
			}
		}
		System.out.println(ans);
	}
}
