import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] A = new int[N];
		int[] B = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = in.nextInt();
			B[i] = in.nextInt();
		}
		long ans = 0;
		for (int i = N - 1; i >= 0; i--) {
			ans += (A[i] + ans) % B[i] > 0 ? B[i] - (A[i] + ans) % B[i] : 0;
		}
		System.out.println(ans);
		in.close();
	}
}