import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {

		//    	File file = new File("src/in.txt");
		//    	Scanner sc = new Scanner(file);

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		int[][] s = new int[M][N];

		for (int i = 0; i < M; i++) {
			int k = sc.nextInt();
			for (int j = 0; j < k; j++) {
				int num = sc.nextInt()-1;
				s[i][num] = 1;
			}
		}

		int[] p = new int[M];
		for (int i = 0; i < M; i++) {
			p[i] = sc.nextInt();
		}

		int ans = 0;
		for (int i = 0; i < 1 << N; i++) {
			boolean flg = true;
			// bit全探索の全通りのloop
			int[] A = new int[N];
			for (int j = 0; j < N; j++) {
				if ((1 & i >> j) == 1) {
					A[j] = 1;
				}
			}

			for (int k = 0; k < M; k++) {
				int sum = 0;
				for (int l = 0; l < N; l++) {
					sum = sum + s[k][l] * A[l];
				}
				if (sum%2 == p[k]) {
					flg = false;
				}
			}
			if (flg == true) {
				ans++;
			}
		}
		System.out.println(ans);

	}
}