import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 要素の入力、格納
		int N = sc.nextInt();
		int A[] = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}

		int ans = 0;
		int NN = (int) Math.pow(2, N);
		int B[] = new int[NN - 1];

		int Z = NN - 1;
		for (int i = 0; i < (NN - 1); i++) {
			B[i] = Aa(Z - i, 0, 0, A);
		}

		Arrays.sort(B);

		int num = 0;
		if ((NN - 1) % 2 == 1) {
			num = (NN - 1) / 2;
			ans = B[num];
		} else {
			num = (NN - 1) / 2;
			ans = (B[num] + B[num + 1]) / 2;
		}
		// 出力
		System.out.println(ans);
	}

	public static int Aa(int X, int Y, int Q, int W[]) {
		if (X % 2 == 1) {
			Y += W[Q];
		}
		if (X / 2 > 0) {
			Y = Aa(X / 2, Y, Q + 1, W);
		}
		return Y;
	}
}
