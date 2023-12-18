
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int C = sc.nextInt();
		int[] B = new int[M];
		int[] A = new int[N];

		for (int i = 0; i < M; i++) {
			B[i] = sc.nextInt();
		}

		int check = C;
		int result = 0;
		for (int j = 0; j < N; j++) {
			check = C;
			for (int i = 0; i < M; i++) {
				check += sc.nextInt() * B[i];
			}
			if (check > 0) {
				result++;
			}
		}

		System.out.println(result);
	}
}
