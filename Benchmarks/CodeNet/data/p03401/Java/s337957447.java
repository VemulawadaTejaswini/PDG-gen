import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] A = new int[N + 2];
		A[0] = 0;
		A[N + 1] = 0;
		for (int i = 1; i <= N; i++) {
			A[i] = in.nextInt();
		}
		int[] B = new int[N + 1];
		int sum = 0;
		for (int i = 0; i <= N; i++) {
			B[i] = Math.abs(A[i] - A[i + 1]);
			sum += B[i];
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= N; i++) {
			int ans = sum;
			ans = ans + Math.abs(A[i - 1] - A[i + 1]) - (B[i] + B[i - 1]);
			sb.append(ans);
			sb.append("\n");
		}
		System.out.println(sb.toString());
		in.close();
	}
}