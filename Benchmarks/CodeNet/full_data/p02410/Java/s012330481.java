import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[][] A = new int[N][M];
		int[]   b = new int[M];
		for(int i = 0; i < N; i++) {
			for(int j = 0; j< M; j++) {
				A[i][j] = sc.nextInt();
			}
		}
		for(int i = 0; i < M; i++) {
			b[i] = sc.nextInt();
		}
		int[] c = multiMV(A, b);
		for(int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
		sc.close();
	}

	// 行列とベクトルの掛け算
	public static int[] multiMV(int[][] A, int[] b) {
		int[] c = new int[A.length];
		for(int i = 0; i < A.length; i++) {
			int e = 0;
			for(int j = 0; j < A[i].length; j++) {
				e += A[i][j] * b[j];
			}
			c[i] = e;
		}
		return c;
	}
}
