import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {

		//    	File file = new File("src/in.txt");

		//コード
		//    	Scanner sc = new Scanner(file);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		int K = sc.nextInt();
		int[] A = new int[N + 1];
		int[] B = new int[M + 1];
		long sum = 0;
		for (int i = 0; i < N; i++) {
			if (i == 0) {
				A[i] = 0;
			} else {
				A[i] = A[i - 1] + Integer.parseInt(sc.next());
			}
		}
		for (int i = 0; i < M; i++) {
			if (i == 0) {
				B[i] = 0;
			} else {
				B[i] = B[i - 1] + Integer.parseInt(sc.next());
			}
		}
		if (A[N] + B[M] <= K) {
			System.out.println(N + M);
		} else {
			int ans = 0;
			for (int i = 0; i <= N; i++) {
				long sumA = A[i];
				for (int j = 0; j <= M; j++) {
					if (sumA + B[j] <= K) {
						int x = i + j;
						if (x > ans) {
							ans = x;
						}
					} else {
						break;
					}
				}
			}
			System.out.println(ans);
		}
	}
}