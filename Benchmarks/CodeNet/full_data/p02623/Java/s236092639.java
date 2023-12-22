
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int K = sc.nextInt();
		int ans = 0;
		int[] A = new int[N];
		int[] B = new int[M];

		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		for (int i = 0; i < M; i++) {
			B[i] = sc.nextInt();
		}

		int j = 0;
		int k = 0;

		while (K >= 0) {
			if (A[j] <= B[k]) {
				K -= A[j];
				if(K>0) {
				j++;
				ans ++;
				}
			} else if (A[j] > B[k]) {
				K -= B[k];
				K -= A[j];
				if(K>0) {
				j++;
				ans ++;
				}
				k++;
				ans++;
			}
		}
		System.out.println(ans);
	}

}
