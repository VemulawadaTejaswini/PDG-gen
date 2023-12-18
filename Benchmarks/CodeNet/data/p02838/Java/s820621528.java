import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		long[] a = new long[N];
		
		for (int i = 0; i < N; ++i) {
			a[i] = in.nextLong();
		}
		long ans = 0;
		long m = 1000000007;
		for (int i = 0; i < N - 1; ++i) {
			for (int j = i + 1; j < N; ++j) {
				long calc = (a[i] ^ a[j]);
				ans = (ans + calc) % m;
			}
		}
		System.out.println(ans);
	}

}
