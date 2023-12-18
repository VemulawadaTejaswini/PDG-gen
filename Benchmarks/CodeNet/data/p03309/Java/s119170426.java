import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt() - (i + 1);
		}

		int begin = sign(N, A);
		do {
			for (int i = 0; i < N; i++) {
				A[i] -= begin;
			}
		} while (begin == sign(N, A) && sign(N, A) != 0);

		int ansA = 0, ansB = 0;
		for (int i = 0; i < N; i++) {
			ansA += Math.abs(A[i]);
			ansB += Math.abs(A[i] + begin);
		}
		System.out.println(Math.min(ansA, ansB));
		sc.close();

	}

	public static int sign(int N, int[] A) {
		int plus = 0, minus = 0;
		for (int i = 0; i < N; i++) {
			if (A[i] > 0) {
				plus++;
			} else if (A[i] < 0) {
				minus++;
			}
		}
		return (int) Math.signum(plus - minus);
	}

}
