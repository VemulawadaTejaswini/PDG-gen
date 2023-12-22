import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			int N = scn.nextInt();
			int K = scn.nextInt();

			int[] A = new int[N];
			int[][] ak = new int[K][N+1];

			for(int i = 0; i < K; i++) {
				ak[i][0] = scn.nextInt();
				for(int j = 1; j <= ak[i][0]; j++) {
					ak[i][j] = scn.nextInt();
				}
			}

			for(int i = 0; i < K; i++) {
				for(int j = 1; j <= ak[i][0]; j++) {
					A[ak[i][j]-1] = 1;
				}
			}


			int cnt = 0;
			for(int i = 0; i < N; i++) {
				if(A[i] == 0) cnt++;
			}

			System.out.println(cnt);
		}
	}
}