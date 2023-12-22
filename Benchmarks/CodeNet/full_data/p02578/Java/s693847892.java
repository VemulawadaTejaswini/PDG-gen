import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// AtCoder_C
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		long A[] = new long[N];

		long ans = 0;
		for(int i=0; i<N; i++) {
			A[i] = sc.nextLong();
		}

		long HNow = A[0];

		for(int i=1; i<N; i++) {
			if(A[i] < HNow) {
				ans += HNow - A[i];
			} else {
				HNow = A[i];
			}
		}

		System.out.println(ans);

	    // Scannerクラスのインスタンスをクローズ
		sc.close();
	}
}