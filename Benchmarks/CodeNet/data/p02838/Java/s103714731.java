import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] a = new int[N];
		
		for (int i = 0; i < N; ++i) {
			a[i] = in.nextInt();
		}
		int ans = 0;
		int m = 1000000007;
		// 2147483647
		// 1000000007
		// 9223372036854775807
		for (int i = 0; i < N - 1; ++i) {
			for (int j = i + 1; j < N; ++j) {
				int calc = (a[i] ^ a[j]);
				ans = (ans + calc) % m;
			}
		}
		System.out.println(ans);
	}

}