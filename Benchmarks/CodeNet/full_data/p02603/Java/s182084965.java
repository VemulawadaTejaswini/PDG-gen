import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// M-SOL_2020_D
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int A[] = new int[N];

		for(int i=0; i<N; i++) {
			A[i] = sc.nextInt();
		}

		int Yen = 1000;
		int Kabu = 0;

		for(int i=0; i<N-1; i++) {
			if(A[i] < A[i+1]) {
				Kabu = Yen / A[i];
				Yen -= Kabu * A[i];
			}
			if(A[i] > A[i+1]) {
				Yen += Kabu * A[i];
				Kabu = 0;
			}
		}

		// 最終日
		Yen += Kabu * A[N-1];
		Kabu = 0;

		System.out.println(Yen);

		// Scannerクラスのインスタンスをクローズ
		sc.close();
	}
}
