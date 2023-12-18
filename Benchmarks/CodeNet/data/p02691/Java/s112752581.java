import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int[] A = new int[N];
		int ans = 0;
		for (int i = 0; i < N; i++) {
			A[i] = scan.nextInt();
		}
		int[] B = new int[N];

		for (int i = 0; i < N; i++) {
			if (i-A[i] >= 0) {
				ans += B[i-A[i]];
			}
			if (i+A[i] < N) {
				B[i+A[i]]++;
			}
		}

		System.out.println(ans);
	}

}