import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		int Q = scan.nextInt();
		int [][]A = new int[N + 1][N + 1];
		for(int i = 0; i < M; i++) {
			int L = scan.nextInt();
			int R = scan.nextInt();
			A[L][R] ++;
		}
		int [][]B = new int[N + 1][N + 1];
		for(int i = 1; i <= N; i++) {
			for(int j = 1; j <= N; j++) {
				B[i][j] += A[i][j] + B[i][j - 1];
			}
		}
		int [][]C = new int[N + 1][N + 1];
		for(int i = 1; i <= N; i++) {
			for(int j = 1; j <= N; j++) {
				C[j][i] += B[j][i] + C[j-1][i];
			}
		}
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < Q; i++) {
			int p = scan.nextInt();
			int q = scan.nextInt();
			int cnt = C[q][q] - C[q][p - 1] - C[p - 1][q] + C[p - 1][p - 1];
			sb.append(cnt).append("\n");
		}
		scan.close();
		System.out.println(sb.toString());

//		for(int i = 1; i <= N; i++) {
//			for(int j = 1; j <= N; j++) {
//				System.out.print(B[i][j] + " ");
//			}
//			System.out.println();
//		}
//
//
//		for(int i = 1; i <= N; i++) {
//			for(int j = 1; j <= N; j++) {
//				System.out.print(C[i][j] + " ");
//			}
//			System.out.println();
//		}

	}
}