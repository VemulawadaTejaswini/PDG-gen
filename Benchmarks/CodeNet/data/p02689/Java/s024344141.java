import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int M = scan.nextInt();
		int ans = 0;
		int[] H = new int[N];
		int[] A = new int[M];
		int[] B = new int[M];
		int[][] x = new int[N][N];
		for (int i = 0; i < N; i++) {
			H[i] = scan.nextInt();
		}
		for (int i = 0; i < M; i++) {
			A[i] = scan.nextInt();
			B[i] = scan.nextInt();

			if (H[A[i]-1] < H[B[i]-1]) {
				x[A[i]-1][B[i]-1]++;
			} else if (H[A[i]-1] > H[B[i]-1]) {
				x[B[i]-1][A[i]-1]++;
			} else if (H[A[i]-1] == H[B[i]-1]) {
				x[A[i]-1][B[i]-1]++;
				x[B[i]-1][A[i]-1]++;
			}
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (x[i][j] != 0) break;
				if (j == N-1) ans++;
			}
		}

		System.out.println(ans);
	}

}