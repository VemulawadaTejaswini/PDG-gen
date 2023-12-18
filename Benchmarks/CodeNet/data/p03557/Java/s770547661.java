import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		int n = sc.nextInt();
		int[] A = new int[n];
		int[] B = new int[n];
		int[] C = new int[n];
		int ans = 0;
		
		for (int i = 0; i < n; i++) {
			A[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			B[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			C[i] = sc.nextInt();
		}
		

		Arrays.sort(A);
		Arrays.sort(B);
		Arrays.sort(C);

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (A[i] < B[j]) {
					for (int k = 0; k < n; k++) {
						if (B[j] < C[k]) {
							ans ++;
						}
					}
				}
			}
		}

		System.out.println(ans);

		sc.close();
	}
}