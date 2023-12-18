import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long K = sc.nextLong();
		int A[] = new int[N];
		int F[] = new int[N];
		int X[] = new int [N];
		long n = 0;
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		for(int i = 0; i < N; i++) {
			F[i] = sc.nextInt();
		}
		Arrays.sort(A);
		Arrays.sort(F);
		for(int i = N-1; i > -1; i--) {
			X[i] = A[i] * F[i];
		}
		for(long i = K;i == 0 || X[N-1] ==0; i--) {
			X[N-1] = (A[N-1] - 1) * F[N-1];
			Arrays.sort(X);
		}
		n = A[N-1] * F[N-1];
		System.out.println(n);
	}

}
