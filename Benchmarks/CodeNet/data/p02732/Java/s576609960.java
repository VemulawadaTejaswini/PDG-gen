import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int[] A = new int[N];
		int[] B = new int[N+1];
		int[] C = new int[N];
		int ans = 0;
		for (int i = 0; i < N; i++) {
			A[i] = scan.nextInt();
			B[A[i]]++;
		}

		for (int i = 1; i < N+1; i++) {
			ans += B[i]*(B[i]-1)/2;
		}

		for (int i = 0; i < N; i++) {

			ans -= B[A[i]]*(B[A[i]]-1)/2 - (B[A[i]]-1)*(B[A[i]]-2)/2;

			System.out.println(ans);

			ans += B[A[i]]*(B[A[i]]-1)/2 - (B[A[i]]-1)*(B[A[i]]-2)/2;

		}

	}

}