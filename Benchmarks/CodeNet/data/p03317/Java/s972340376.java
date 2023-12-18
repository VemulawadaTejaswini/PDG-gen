import java.util.Scanner;

public class Main {
	static int N, K;
	static int[] A;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		K = sc.nextInt();
		A = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		System.out.println((N - 2) / (K - 1) + 1);
	}
}