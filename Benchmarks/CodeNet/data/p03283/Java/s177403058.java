import java.util.Scanner;

public class Main{
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

		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < Q; i++) {
			int p = scan.nextInt();
			int q = scan.nextInt();
			int cnt = 0;
			for(int j = p; j <= q; j++) {
				for(int l = p; l <= q; l++) {
					cnt += A[j][l];
				}
			}
			sb.append(cnt).append("\n");
		}
		scan.close();
		System.out.println(sb.toString());

//		for(int i = 1; i <= N; i++) {
//			for(int j = 1; j <= N; j++) {
//				System.out.print(A[i][j] + " ");
//			}
//			System.out.println();
//		}


	}
}