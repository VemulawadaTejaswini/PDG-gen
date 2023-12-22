import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long K = sc.nextLong();
		int A[] = new int[N];
		int y = 1;
		int x = 0;
		K = K % 200000 + 200000;

		for (int i = 0; i<N; i++) {
			A[i] = sc.nextInt();
		}
		
		x = A[y-1];
		for (long j = 0; j<K-1; j++) {
			y = x;
			x = A[y-1];
		}

		System.out.println(x);

		sc.close();
	}
}