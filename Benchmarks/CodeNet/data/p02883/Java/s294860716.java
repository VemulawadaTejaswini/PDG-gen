import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long K = sc.nextLong();
		int A[] = new int[N];
		int F[] = new int[N];
		long n = 0;
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		for(int i = 0; i < N; i++) {
			F[i] = sc.nextInt();
		}
		Arrays.sort(A);
		Arrays.sort(F);
		for(int i = 0; i < N; i++) {
			if(K - (A[i] - F[i]) >= 0) {
				K = K - (A[i] - F[i]);
			}else {
				n = (A[i] - K ) * F[i];
				break;
			}
		}
		System.out.println(n);
	}

}
