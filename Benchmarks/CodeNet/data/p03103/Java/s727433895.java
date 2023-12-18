import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int M = in.nextInt();
		long[][] A = new long[N][2];
		for (int i = 0; i < N; i++) {
			A[i][0] = in.nextInt();
			A[i][1] = in.nextInt();
		}
		Arrays.sort(A, (a, b) -> Long.compare(a[0], b[0]));
		long ans = 0;
		int r = M;
		for (int i = 0; i < A.length; i++) {
			long n = Math.min(r, A[i][1]);
			ans += A[i][0] * n;
			r -= n;
			if (r == 0) {
				break;
			}
		}
		System.out.println(ans);
		in.close();
	}
}