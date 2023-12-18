import java.util.*;

/**
 * Main
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		int M = sc.nextInt();
		int X;
		int S = 0;
		Integer A[] = new Integer[N];

		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}

		for (int i = 0; i < M; i++) {
			Arrays.sort(A);
			if (A[N - 1] == 0) {
				break;
			}
			A[N - 1] /= 2;
		}

		for (int i = 0; i < N; i++) {
			S += A[i];
		}

		sc.close();
		System.out.println(S);
	}
};