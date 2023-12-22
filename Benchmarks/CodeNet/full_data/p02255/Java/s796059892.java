package Vol0;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	private static int N;
	private static int[] A;

	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(br.readLine());

		String[] arrays = br.readLine().split(" ");
		A = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(arrays[i]);
		}

		// 挿入ソート
		for (int i = 0; i < N; i++) {
			for (int j = i; j >= 1 && A[j] < A[j - 1]; j--) {
				int tmp = A[j];
				A[j] = A[j - 1];
				A[j - 1] = tmp;
			}
			System.out.print(A[0]);
			for (int j = 1; j < N; j++) {
				System.out.print(" " + A[j]);
			}
			System.out.println("");

		}
	}
}