import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		for (int i = 0; i < N; i++) A[i] = sc.nextInt();

		long x2 = 0;
		for (int i = 0; i < N; i++) {
			if(i % 2 == 0) x2 += A[i];
			else x2 -= A[i];
		}
		long[] ans = new long[N];
		ans[0] = x2 / 2;
		for (int i = 0; i < N - 1; i++) ans[i + 1] = A[i] - ans[i];
		for (int i = 0; i < N; i++) ans[i] *= 2;
		for (int i = 0; i < N; i++) System.out.println(ans[i] + " ");
	}
}